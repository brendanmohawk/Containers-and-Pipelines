
pipeline {
  agent any

  // Environment vars
  environment {
    MY_VAR = 'KEY'
  }

  stages {
    stage('Clean') {
      steps {
        deleteDir()
      }
    }

    stage('Checkout') {
      steps {
        checkout scm                                                                                            // Clone repo
        // git branch: 'main', url: 'https://github.com/brendanmohawk/Containers-and-Pipelines.git'    
      }
    }
    
    stage('Verify Workspace') {                                                                                // Verify directory and files in dir
      steps {
          sh 'pwd'  // Print the working directory
          sh 'ls -la'  // List files in the workspace
      }
    }

    stage('Verify Maven') {                                                                                      // Double check version for maven
      steps {
        sh 'mvn -v'                                                                                              // Print Maven version
      }
    }

    stage('Build') {
      steps {
        dir('/var/jenkins_home/workspace/MavenPipeline') {  
            sh 'mvn clean install'                                                                               // Run Maven build
        }
      }
    }

    stage('Build 2') {
        steps {
            dir('/var/jenkins_home/workspace/MavenPipeline') {
                sh 'mvn clean install' 
            }
        }
    }

    stage('Test Case') {
      steps {
        sh 'mvn test'                                                                                           // Run unit tests
      }
    }

    stage('Post Test') {
      steps {
        echo 'Test Case Completed Successfully!'
      }
    }

    stage('Greet') {
      steps {
        script {
          def name = 'Brendan'
          def age = 22
          echo "${name} is ${age} years old!"
        }
      }
    }
  }
}
