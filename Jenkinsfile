pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Get the source code from version control (e.g., Git).'
                git 'https://github.com/shovishu/DockersDemo.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Compile the maven project...'
                bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn clean test'
            }
        }
        stage('Deploy') {
            steps {
                def deployEnv = 'staging'
                echo "Deploying to ${deployEnv} environment..."
            }
        }
    }
}
