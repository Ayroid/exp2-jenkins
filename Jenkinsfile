pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
            stage('Stage 1 : Clean Stage'){
                steps{
                    sh 'mvn clean'
                }
            }
            stage('Stage 2 : test Stage'){
                steps{
                    sh 'mvn test'
                }
            }
            stage('Stage 3 : Install stage'){
                steps{
                    sh 'mvn install'
                }
            }
            stage('Stage Final : Build Sucess'){
                steps{
                    echo 'Build Sucessfull'
                }
            }
    }
}