pipeline{
    agent none
    stages{
        stage('Build and Test Application') {
            steps{
                sh 'chmod +x mvnw'
                sh './mvnw clean install'
            }
        }
    }
}
