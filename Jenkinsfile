node {
	echo 'Checkout from GitHub'
	checkout scm
	echo 'Building project'
	def mvnHome = tool 'Maven 3.3.3'
	bat "${mvnHome}\\bin\\mvn clean package"
	archive '**/target/*.jar'
	junit '**/target/surefire-reports/*.xml'
}
