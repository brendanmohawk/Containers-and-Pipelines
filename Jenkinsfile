
pipeline {
  agent any

  stages {
    stage('Clean') {
      steps {
        deleteDir()                                    // Delete all files in current directory
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean compile'                          // Runs Maven to clean old build files and compile the Java code
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'                                  // Run Maven tests
      }
    }
  }
}
