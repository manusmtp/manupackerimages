pipeline {
  agent any

parameters{
password(name: 'AKEY', defaultValue: 'SECRET', description: 'Enter A key')
password(name: 'SKEY', defaultValue: 'SECRET', description: 'Enter SKEY ')
}

environment{
   aws_access_key_id = "${params.AKEY}"
   aws_secret_access_key = "${params.SKEY}"  
   
}
  stages {
    stage('Packer - Build Customized images') {
      steps {
        sh """
        #!/bin/bash
        cd pack
        packer init .
        packer build awsuiwuewpack.json 
        """
      }
    }
  }
}
