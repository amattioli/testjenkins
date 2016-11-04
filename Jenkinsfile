node {
	echo 'Checkout from GitHub'
	git url: 'https://github.com/amattioli/testjenkins.git'
	echo 'Building project'
	def mvnHome = tool 'Maven 3.3.3'
	bat "${mvnHome}\\bin\\mvn clean package"
	archive '**/target/*.jar'
	junit '**/target/surefire-reports/*.xml'
}
