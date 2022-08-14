pipeline {
  agent any


environment{
   AWS_ACCESS_KEY_ID = credentials('aws_access')
   AWS_SECRET_ACCESS_KEY = credentials('secret_key')
   
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
