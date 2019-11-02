pipeline{
    agent none
    stages{
        stage('Build and Test Application') {
            agent{
                steps{
                    sh 'chmod +x mvnw'
                    sh './mvnw clean install'
                }
            }
        }
    }
}