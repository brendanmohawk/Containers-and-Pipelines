// varPipeline.groovy
// Brendan Dileo Educational


def call(body) {

  def pipelineParams = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()

  // Define Jenkins pipeline
  pipeline {
    agent any

    stages {
      stage('Params') {
        steps {
          echo "Running with parameters: ${pipelineParams}"
        }
      }
    }
  }
}
