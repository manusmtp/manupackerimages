pipeline {
  agent any


environment{
   AWS_ACCESS_KEY_ID = credentials('aws_access1')
   AWS_SECRET_ACCESS_KEY = credentials('secret_key1')
   
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
