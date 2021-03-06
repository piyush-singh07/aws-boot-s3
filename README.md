# aws-boot-s3

## 1. Deployment of a sample spring boot application in linux ec2 instance and S3 .
### Install java on linux EC2
  **In order to install java 11:**
  sudo amazon-linux-extras install java-openjdk11

  **For java 8 you can try:**
  sudo yum install java-1.8.0-openjdk

  **Finally, if you want to switch between java versions run:**
  sudo alternatives --config java

### Refer to the jar present in S3 Bucket 
 Create a directory and get inside it and hit wget <URL OF OBJECT>
  
### Start the boot app
 java -jar <app.jar>
 
 -------------------------------------------------------------------
 
 ## 2. Deployment of a sample spring boot application in linux ec2 instance with RDS and S3 .
 
 1. Create and RDS and make it accessible either publicly or IP based.
 2. Copy the endpoint and provide in the yaml/properties file
 3. Deploy the Spring Boot Application in an EC2 instance
 4. Hit REST endpoints and check for the enteries in DB.
 
 
 
