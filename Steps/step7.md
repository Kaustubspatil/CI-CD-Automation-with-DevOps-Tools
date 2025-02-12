# 🔍 Step 07: SonarQube Integration for Code Quality Analysis

### 🔹 **Generating a SonarCloud Access Token**

1. **Log in to SonarCloud** → Navigate to **My Account**.
2. Under **Security**, generate a **new access token**.
3. Copy and store this token securely.

### 🔹 **Adding SonarQube Credentials to Jenkins**

1. **Manage Jenkins** → **Manage Credentials**.
2. **Add New Credentials**:
   - **Secret Text** → Paste the **SonarCloud token**.
   - Save credentials.

### 🔹 **Installing SonarQube Scanner Plugin**

1. **Manage Jenkins** → **Manage Plugins**.
2. Search for **SonarQube Scanner**.
3. Install **without restart**.

### 🔹 **Configuring SonarQube Server in Jenkins**

1. **Manage Jenkins** → **Configure System**.
2. Locate **SonarQube Servers** section.
3. Add:
   - **Server Name & URL**.
   - Choose the **SonarQube credentials** added earlier.
   - Save.

### 🔹 **Adding SonarQube Scanner in Jenkins Tools Section**

1. **Manage Jenkins** → **Global Tool Configuration**.
2. Locate **SonarQube Scanner**.
3. Add:
   - **Name & Automatic Installation Option**.
   - Select preferred **SonarQube version**.
   - Save settings.

### 🔹 **Configuring Jenkins Pipeline for SonarQube Analysis**

Modify the `Jenkinsfile` to include **SonarQube scanning, unit tests, and builds**:

```groovy
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeServer') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
```

💡 **Benefit**: Enables **continuous code quality analysis**, catching issues early in development.

---

🚀 **By completing these steps, your Jenkins pipeline now integrates GitHub, auto-triggers builds, and ensures high code quality with SonarQube!**