pipeline {
    agent any

     stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
             agent {
              docker {
               image 'maven:3.6.0-jdk-8-alpine'
               args '-v /root/.m2/repository:/root/.m2/repository'
               // to use the same node and workdir defined on top-level pipeline for all docker agents
               reuseNode true
              }
             }
             steps {
              sh ' mvn clean package -DskipTests=true'
             }
             post {
                 always {
                   stash(name: 'artifact', includes: 'target/*.jar')
                   stash(name: 'pom', includes: 'pom.xml')
                   // to add artifacts in jenkins pipeline tab (UI)
                   archiveArtifacts 'target/*.jar'
                  }
               }

         }

        stage('Unit Tests') {
            agent {
             docker {
              image 'maven:3.6.0-jdk-8-alpine'
              args '-v /root/.m2/repository:/root/.m2/repository'
              reuseNode true
             }
            }
            steps {
             sh 'mvn test'
            }
            post {
             always {
              junit 'target/surefire-reports/**/*.xml'
             }
            }
        }

        stage('Run container') {
            step {
                script {
                     def dockerImage = docker.build("pj/customer-service:0.0.2")
                      dockerImage.run()
                 }
            }
        }

    }
}