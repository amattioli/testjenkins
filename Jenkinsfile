node {
	echo 'Checkout from GitHub'
	checkout([$class: 'GitSCM', 
	          branches: [[name: '*/master']], 
	          doGenerateSubmoduleConfigurations: false, 
	          extensions: [], 
	          submoduleCfg: [], 
	          userRemoteConfigs: [[url: 'https://github.com/amattioli/testjenkins.git']]])
	echo 'Building project'
	def mvnHome = tool 'Maven 3.3.3'
	bat "${mvnHome}\\bin\\mvn clean package"
	archive 'target/*.jar'
	archive 'target/surefire-reports/*.*'
}