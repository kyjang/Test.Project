pipeline {
    agent any
    stages {
        stage('hellobuildtiger') {
            step {
                echo 'hello buildtiger'
            }
        }
    }
}   
