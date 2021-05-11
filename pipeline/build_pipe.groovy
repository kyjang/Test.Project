pipeline {
    agent any
    stages {
        stage('hellobuildtiger') {
            steps {
                echo 'hello buildtiger'
            }
        }
    }
}   
