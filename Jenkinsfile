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

     post {
      always {
        junit '**/TEST*.xml'
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
