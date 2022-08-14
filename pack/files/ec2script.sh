#!/bin/bash

echo "manuprasad888" | passwd --stdin ec2-user

#repo get install

wget https://dl.fedoraproject.org/pub/epel/epel-release-latest-7.noarch.rpm && sudo yum install ./epel-release-latest-7.noarch.rpm -y \
 && sudo yum update -y && sudo yum install git python python-devel python-pip openssl ansible -y && ansible --version


