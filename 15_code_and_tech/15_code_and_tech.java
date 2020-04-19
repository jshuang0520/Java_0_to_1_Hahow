/**

Learning java code:
1. Engineer
2. AI
    GCP (Google Cloud Platform)    https://cloud.google.com/products/
    - AI and Machine Learning
        - cloud vision api    https://cloud.google.com/vision/docs
3. AR (Augmented Reality)
    - NyARToolkit    http://nyatla.jp/nyartoolkit/wp/?page_id=14
    - wikitude       https://www.wikitude.com/products/wikitude-sdk/
4. API / SDK
    - Facebook API, SDK    https://developers.facebook.com/docs/apis-and-sdks
                           https://developers.facebook.com/docs/apis-and-sdks?locale=en_US
    - AWS Lambda (serverless environment)    https://aws.amazon.com/tw/lambda/details/



---------------------------------------------------
-------------------------
Google Cloud SDK
-------------------------

Setup (for Mac) - Install the latest Cloud Tools version
1. Install Python 3    http://www.python.org/
2. Download SDK        https://cloud.google.com/sdk/docs/#mac
3. Install SDK         
    - Developer Tools  > Cloud SDK: Command Line Interface  > Documentation
    Installing from versioned archives
    macOS 64-bit (x86_64)    https://cloud.google.com/sdk/docs/downloads-versioned-archives
    
    command line:
    $ cd Downloads/                   (cd to your file path)
    $ ./google-cloud-sdk/install.sh

4. Activate SDK        $ ./google-cloud-sdk/bin/gcloud init
                       -----> You are now authenticated with the Google Cloud SDK!    https://cloud.google.com/sdk/auth_success

                        Pick cloud project to use:
                        [1] endless-codex-274615
                        [2] Create a new project
                        Please enter numeric choice or text value (must exactly match list
                        item):  // I chose 2

                        // Project id(6~30 characters): 
                        // $ gcloud projects create js-project-2020-04-19T00

                        If I choose 1:
                        Your current project has been set to: [endless-codex-274615]

5. Login SDK
$ gcloud auth application-default login
> Error message:    zsh: command not found: gcloud
https://stackoverflow.com/questions/31037279/gcloud-command-not-found-while-installing-google-cloud-sdk
    maybe just for the first time:
    $ cd
    $ source ~/.zshrc     ($ source ~/.bashrc)

$ gcloud auth application-default login
> If you see message "You are now authenticated with the Google Cloud SDK!"    https://cloud.google.com/sdk/auth_success
Then, you login successfully! Congrads~


---------------------------------------------------
-------------------------
New a Maven project
-------------------------

---
new-maven-project:
    Fiding:
        group_id:    org.apache.maven.archetypes
        artifact_id: maven-archetype-quickstart
    Naming:
        group_id:    codegym.tech
        artifact_id: google-cloud-vision-api



AI & Machine Learning Products > Cloud Vision API > Documentation > 
> Quickstarts
  > Using client libraries
    > Java
      > copy the dependency
https://cloud.google.com/vision/docs/quickstart-client-libraries#client-libraries-install-java

Find pom.xml
> go to xml mode
  > paste the denpendency you just copied (in <dependencies> ...... </dependencies>)
    // <dependency>
    //     <groupId>com.google.cloud</groupId>
    //     <artifactId>libraries-bom</artifactId>
    //     <version>5.1.0</version>
    //     <type>pom</type>
    //     <scope>import</scope>
    // </dependency>

    !!!!!!!!!!!!!!!!!!!!!
    !! There was something wrong, so I finally paste the <dependency> down below.
    [Testing Google Cloud Vision with Java in Eclipse](https://stackoverflow.com/questions/48690047/testing-google-cloud-vision-with-java-in-eclipse)
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>google-cloud-vision</artifactId>
      <version>1.14.0</version>
    </dependency>

-------------------------------------------
Here's my version of pom.xml:
-------------------------------------------
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>codegym.tech</groupId>
  <artifactId>google-cloud-vision-api</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>google-cloud-vision-api</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>google-cloud-vision</artifactId>
      <version>1.14.0</version>
    </dependency>
  </dependencies>
</project>




-------------------------------------------
Before you start
https://cloud.google.com/vision/docs/quickstart-client-libraries
-------------------------------------------
Quickstart: Using Client Libraries
This page shows you how to get started with the Vision API in your favorite programming language.
Before you begin
1. In the Cloud Console, on the project selector page, select or create a Cloud project.
> Go to the project selector page

2. Make sure that billing is enabled for your Google Cloud project. Learn how to confirm billing is enabled for your project.
3. Enable your api
https://console.cloud.google.com/apis/api/vision.googleapis.com/overview?project=endless-codex-274615&folder=&organizationId=
4. Set up authentication:
Service account ID: js-vision-api
  - Private key saved to your computer,
    My First Project-5f39db99f663.json allows access to your cloud resources, so store it securely
5. Set the environment variable GOOGLE_APPLICATION_CREDENTIALS to the path of the JSON file that contains your service account key. This variable only applies to your current shell session, so if you open a new session, set the variable again.
<<pattern>> $ export GOOGLE_APPLICATION_CREDENTIALS="[PATH]"
$ export GOOGLE_APPLICATION_CREDENTIALS="/Users/johnson.huang/Documents/My First Project-5f39db99f663.json"
($ set GOOGLE_APPLICATION_CREDENTIALS="/Users/johnson.huang/Documents/My First Project-5f39db99f663.json")

-


// PERMISSION_DENIED: Your application has authenticated using end user credentials from the Google Cloud SDK
// https://stackoverflow.com/questions/56823383/your-application-has-authenticated-using-end-user-credentials-from-the-google-cl
// > Method 1:
//   Create a service account and set up the Cloud SDK to use the service account.
//   <<pattern>> gcloud auth activate-service-account test@development-123456.iam.gserviceaccount.com --key-file=/fullpath/service-account.json
//   $ gcloud auth activate-service-account js-vision-api@endless-codex-274615.iam.gserviceaccount.com --key-file="/Users/johnson.huang/Documents/My First Project-5f39db99f663.json"
// 
// > Method 2:
// $ set GOOGLE_APPLICATION_CREDENTIALS="/Users/johnson.huang/Documents/My First Project-5f39db99f663.json"


-

Google Cloud Service Account VS. End User Account
https://stackoverflow.com/questions/55174882/google-cloud-service-account-vs-end-user-account

For the Google Cloud SDK and the CLI you should be using service account credentials.

Step 1: Create a service account and download

1. Login to the Google Cloud Console.
  > https://cloud.google.com/vision/docs/quickstart-client-libraries
    > Go to the project selector page
2. Go to IAM & admin -> Service accounts
3. Click CREATE SERVICE ACCOUNT
4. Enter a Service account name and Service account description
5. Click CREATE
6. In the next screen Service account permissions, select a role.
7. Add desired roles.
8. Click CONTINUE
9. Click Create key
10. Check the JSON radio button for the Key type
11. Save the json file to your computer.
12. Since you are running in a VM, upload to the VM.
Step 2: Configure gcloud and the SDKs to use the service account.

You will need the email address of the service account (which is also stored in the Json file) and the service account file name.

Run this command from a shell in your VM:

<<pattern>> gcloud auth activate-service-account SERVICE_ACCOUNT_EMAIL_ADDRESS --key-file=service_account_filename.json
$ gcloud auth activate-service-account js-vision-api@endless-codex-274615.iam.gserviceaccount.com --key-file="/Users/johnson.huang/Documents/My First Project-5f39db99f663.json"



Step 3: Verify that your credentials are working:

$ gcloud auth list

You should see your service account listed with an asterisk in the left column (which desigates the account account).

Note: Since you are running inside a Google virtual machine (GCE) instance, an advanced user will often use the Compute Engine Default Service Account for credentials. I recommend learning how to use a service account Json file first.

Step 4: Specify the service account

Set the environment variable GOOGLE_APPLICATION_CREDENTIALS to point to your service account json file. This is an example, change the path to your path.

For Linux:

<<pattern>> export GOOGLE_APPLICATION_CREDENTIALS="/home/username/[FILE_NAME].json"
$ export GOOGLE_APPLICATION_CREDENTIALS="/Users/johnson.huang/Documents/My First Project-5f39db99f663.json"

Step 5: Optionally specify the service account when creating the service client:

from google.cloud import datastore 

def create_client(project_id):
     return datastore.Client(project_id).from_service_account_json('service_account_filename.json')

---------------------------------------------------
















---------------------------------------------------


*/