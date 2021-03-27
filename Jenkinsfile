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
}
