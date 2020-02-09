pipeline{
    agent any
    stages{
        stage('Build and Test Application') {
            steps{
                sh 'chmod +x mvnw'
                sh './mvnw clean install'
            }
        }
        stage('Sonar Analysis') {
            steps{
                echo 'Sonar analysis need to be added'
            }
        }
        stage('Docker Build and push step') {
            steps{
                sh 'docker build . -t tgit/configtest'
            }
        }
    }
}
