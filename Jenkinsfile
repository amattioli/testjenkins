pipeline {
    agent {
        docker {
            image 'mymaven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B clean install' 
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
