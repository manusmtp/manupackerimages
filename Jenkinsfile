pipeline {
  agent any


environment{
   AWS_ACCESS_KEY_ID = credentials('acc key')
   AWS_SECRET_ACCESS_KEY = credentials('sec key')
   
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
