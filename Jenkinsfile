pipeline {
    agent any

    stages {
        stage('Git Checkout Repositorio') {
            steps {
 				git branch: 'develop',
                url: 'https://github.com/packsendme/pcks-roadbrewa-roadway-lib.git'
            }
        }
        stage('Java Build') {
          steps {
                sh 'mvn clean install'
            }
        }
    }
}