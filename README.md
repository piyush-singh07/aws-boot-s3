# aws-boot-s3
deployment of a sample spring boot application in linux ec2 instance and S3.
## Install java on linux EC2
  **In order to install java 11:**
  sudo amazon-linux-extras install java-openjdk11

  **For java 8 you can try:**
  sudo yum install java-1.8.0-openjdk

  **Finally, if you want to switch between java versions run:**
  sudo alternatives --config java

## Refer to the jar present in S3 Bucket 
 Create a directory and get inside it and hit wget <URL OF OBJECT>
  
## Start the boot app
 java -jar <app.jar>
