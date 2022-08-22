pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                checkout scm
                echo 'Building..'
                call build.bat
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}