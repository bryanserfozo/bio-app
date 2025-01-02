pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'echo "Build Stage started"'
                sh 'mvn --version'
                sh 'mvn clean -D DB_URL=${DB_URL} -D DB_USERNAME=${DB_USERNAME} -D DB_PASSWORD=${DB_PASSWORD} package'

            }
        }
        stage('Test'){
            steps{
                sh 'echo "Test Stage started" '
            }

        }
        stage ('Deploy'){
            steps{
                sh 'echo "Deploy Stage started" '
                sh 'docker build -t bio-app .'
                sh 'docker run -d -p 80:8080 -e DB_URL=${DB_URL} -e DB_USERNAME=${DB_USERNAME} -e DB_PASSWORD=${DB_PASSWORD} bio-app'
            }

        }
    }
}