pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                build
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