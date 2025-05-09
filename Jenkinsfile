
pipeline {
  agent any

  stages {
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
        dir('/var/jenkins_home/workspace/MavenPipeline') {  // Ensure the directory is correct
            sh 'mvn clean compile'  // Run Maven build
        }
      }
    }

    stage('Build 2') {
        steps {
            dir('/var/jenkins_home/workspace/MavenPipeline') {
                sh 'mvn clean install'  // Try 'install' to also handle dependencies
            }
        }
    }
  }
}
