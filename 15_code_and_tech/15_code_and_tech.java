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
                        item):  // 我選 2

                        // Project id(6~30字元): 
                        // $ gcloud projects create js-project-2020-04-19T00

                        選1的話:
                        Your current project has been set to: [endless-codex-274615]

$ gcloud auth application-default login
遇到 zsh: command not found: gcloud
https://stackoverflow.com/questions/31037279/gcloud-command-not-found-while-installing-google-cloud-sdk
$ cd
$ source ~/.zshrc     ($ source ~/.bashrc)

$ gcloud auth application-default login

若看到 You are now authenticated with the Google Cloud SDK!    https://cloud.google.com/sdk/auth_success
就是成功啦！




---------------------------------------------------


*/