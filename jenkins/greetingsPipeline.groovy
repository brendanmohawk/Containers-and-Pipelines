// greetings.groovy
// Brendan Dileo Educational

// TODO: Need to setup Global Trusted Pipeline Libraries / Shared Libraries

def call(body) {
  def pipelineParams = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()


  // Define the Jenkins pipeline
  pipeline {
    agent any 

    stages {
      stage('Greeting') {
        steps {
          script {
            echo "Hello, ${pipelineParams.name}!"
          }
        }
      }
    }
  }
}

return this
