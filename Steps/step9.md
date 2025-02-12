# 🐳 Step 09: Building & Publishing Docker Images to JFrog Artifactory

Leverage Jenkins to **build a Docker image from a JAR file** and push it to **Artifactory**.

### 🔹 **Jenkins Pipeline for Docker Build & Push**

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
        stage('Docker Build and Publish') {
            steps {
                script {
                    def dockerImage = docker.build("your-image:${BUILD_NUMBER}")
                    docker.withRegistry('https://your-artifactory-url', 'your-artifactory-credentials') {
                        dockerImage.push()
                    }
                }
            }
        }
    }
    post {
        success { echo 'Pipeline succeeded!' }
        failure { echo 'Pipeline failed!' }
    }
}
```

💡 **Benefit**: Automates containerization and deployment of applications to Kubernetes or cloud environments.

---