pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2 -v /msettings:/usr/share/maven/ref' 
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
