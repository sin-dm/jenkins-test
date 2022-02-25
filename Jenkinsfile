pipeline {
    agent any

    tools {
        gradle 'Gradle 7.4'
        allure 'Allure 2'
    }

    stages {
        stage('Test') {
            steps {
                git 'https://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@github.com/sin-dm/jenkins-test.git'

                sh "gradle clean test"
            }
        }
        stage('Reports') {
            steps {
                allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
            }
        }
    }
}
