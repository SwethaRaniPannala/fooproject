pipeline {
  agent any 
  stages {

   stage('Checkout') {
            steps {
                            git 'https://github.com/SwethaRaniPannala/fooproject/'
                   }
                 }
  	  stage ('Code Analysis') {
                steps {
                       sh "mvn pmd:pmd"
  					 sh "mvn checkstyle:checkstyle"
  					 sh "mvn findbugs:findbugs"
                  }
              }

    stage('Build') {
      steps {
        sh "mvn compile"
      }
    }  
    stage('Test') {
      steps {
        sh "mvn test"
      }
    }

     stage('newman') {
                steps {
                    sh 'newman run Swetha_Postman_Lab.postman_collection.json --environment Swetha_Postman_Lab.postman_environment.json --reporters junit'
                }
                post {
                    always {
                            junit '**/*xml'
                        }
                    }
            }

     stage('Robot Framework System tests with Selenium') {
                 steps {
                     sh 'robot --variable BROWSER:headlesschrome new.robot'
                 }
                 post {
                     always {
                         script {
                               step(
                                     [
                                       $class              : 'RobotPublisher',
                                       outputPath          : 'results',
                                       outputFileName      : '**/output.xml',
                                       reportFileName      : '**/report.html',
                                       logFileName         : '**/log.html',
                                       disableArchiveOutput: false,
                                       passThreshold       : 50,
                                       unstableThreshold   : 40,
                                       otherFiles          : "**/*.png,**/*.jpg",
                                     ]
                               )
                         }
                     }
                 }
             }


 }
  post {
         always {
             junit '**/TEST*.xml'
             emailext attachLog: true, attachmentsPattern: '**/TEST*xml', body: '', recipientProviders: [culprits()], subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!'

         }
     }
}
