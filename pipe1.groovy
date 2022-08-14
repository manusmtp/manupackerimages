pipeline {
  agent any

  environment {
        aws_access_key_id     = credentials('aws_access_key_id')
        aws_secret_access_key = credentials('secret_key')
    }

  stages {
    stage('Packer - Build Customized images') {
      steps {
        sh """
        #!/bin/bash
        cd pack
        packer init .
        packer build awspack.json 
        """
      }
    }
  }
}
