
pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        checkout scm
        // git branch: 'main', url: 'https://github.com/brendanmohawk/Containers-and-Pipelines.git'    // Clone repo
      }
    }
    stage('Verify Workspace') {
      steps {
          sh 'pwd'  // Print the working directory
          sh 'ls -la'  // List files in the workspace
      }
    }
  }
}
