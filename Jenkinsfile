pipeline {
	agent any

	stages {
		stage('1-Build') {
		 steps{
			echo "Start of Stage Build"
			echo "Building............"
			build job: 'Build-Job'
			echo "End of Stage Build"
			}
		}
		stage('2-Test') {
		 steps{
			echo "Start of Stage Test"
			echo "Testing............"
			build job: 'Test-Job'
			echo "End of Stage Test"
			}
		}
		stage('3-Publish&Deploy') {
		 steps{
			echo "Start of Stage Publish&Deploy"
			echo "Deploying............"
			build job: 'Publish-Deploy-Job'
			echo "End of Stage Publish&Deploy"
			}
		}
	}

}