pipeline{
    agent none
    stages{
        stage('Build and Test Application') {
            agent{
                label 'docker'
            }
            steps{
                sh 'chmod +x mvnw'
                sh './mvnw clean install'
            }
        }
    }
}