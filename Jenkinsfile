pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                git branch: 'dev', url: 'https://github.com/MPernandes/Service-Backend.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application...'
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Contoh: Deploy ke server
                sh '''
                    # Misalnya, copy JAR ke server menggunakan scp
                    scp target/demo-0.0.1-SNAPSHOT.jar user@server:/path/to/deploy
                '''
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
