pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    docker.build("erp-app")
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    docker.image("erp-app").inside {
                        sh 'mvn test'
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    docker.image("erp-app").inside {
                        sh 'mvn spring-boot:run -Dspring-boot.run.profiles=dev'
                    }
                }
            }
        }
    }
}
