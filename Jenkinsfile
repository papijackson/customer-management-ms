pipeline {
    agent any
     environment {
      //Environment variables définition

      SONARQUBE_URL = "http://192.168.99.100"
      SONARQUBE_PORT = "9000"
     }

     options {
       skipDefaultCheckout()
      }
      stages {
       stage('SCM') {
        steps {
         checkout scm
        }
       }
}