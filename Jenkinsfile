pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2 -v /home:/settings' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -s /settings/settings.xml -B clean install' 
            }
        }
    }
	post {
        always {
            archiveArtifacts artifacts: 'target/**/*.jar', fingerprint: true
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}
