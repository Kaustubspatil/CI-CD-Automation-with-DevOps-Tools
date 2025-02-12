# 🚀CI/CD Automation using DevOps tools

![DevOps](https://imgur.com/WcCpKVU.png)

## 🌟 End-to-End DevOps Pipeline Deployment

This guide outlines the **full implementation of an advanced CI/CD pipeline**, integrating major DevOps tools for seamless automation and deployment.

---

## 🔥 Step-by-Step Implementation

### 🏗 1. Infrastructure Setup with Terraform
- Provisioned **VPC, Security Groups, Ansible Controller, Jenkins Master & Agent Instances** using Terraform.

### 🔑 2. Secure Authentication Setup
- Configured **SSH key-based authentication** for passwordless access between Ansible Controller and Agent nodes.

### 🔧 3. Jenkins Setup & Agent Configuration
- Installed & configured **Jenkins Master and Agent nodes**.
- Set up **Maven as the Build Server** on Jenkins Agent.

### 🔗 4. Jenkins Master-Agent Connectivity
- Configured **Jenkins Master** with Agent node credentials to enable smooth communication.

### 📂 5. GitHub Integration with Jenkins
- Added **GitHub credentials** to Jenkins Master and created a **Multibranch Pipeline Job**.

### 🔄 6. Webhook Trigger for CI Automation
- Configured **Multibranch Pipeline Job** with a **GitHub Webhook Trigger** using the **Multibranch Scan Webhook Plugin**.

---

## 🔍 Quality Assurance with SonarQube

### 🛠 7. SonarQube Integration in CI Pipeline
- Generated **SonarCloud Access Token** and configured SonarQube credentials in Jenkins.
- Installed **SonarQube Scanner Plugin** and configured it in Jenkins UI.
- Created **sonar-project.properties** and linked the repository.
- Added **SonarQube & Unit Testing Stages** to `Jenkinsfile`.

---

## 🛢 Artifact Management with JFrog

### 📦 8. JFrog Artifactory Integration
- Configured **JFrog credentials** in Jenkins.
- Installed and integrated **Artifactory Plugin** in Jenkins Master.

### 🐳 9. Docker Image Build & Storage
- Built a **Docker Image** from the JAR file.
- Pushed the **Docker Image** to JFrog Artifactory using the **Docker Pipeline Plugin**.
- Added **Docker Build & Publish Stages** to `Jenkinsfile`.

---

## ☁️ Kubernetes Deployment with EKS

### 📌 10. Provisioning Amazon EKS Cluster
- Deployed **EKS Cluster** using Terraform.
- Installed `kubectl` and `AWS CLI v2` on Jenkins Agent.
- Configured Kubernetes authentication:
  ```sh
  aws eks update-kubeconfig --region <region_name> --name <cluster_name>
  ```

### 🚀 11. Deploying Application to Kubernetes
- Pulled the **Docker Image** from JFrog Artifactory.
- Deployed it in the **EKS Cluster** using **Kubernetes Deployment & Service Resources**.
- Added the **Deployment Stage** in `Jenkinsfile`.

---

## 📊 Monitoring with Prometheus & Grafana

### 🔎 12. Cluster Monitoring & Observability
- Configured **Prometheus & Grafana Helm Charts** for monitoring.
- Modified **service type** to `LoadBalancer` for browser access.

---

## 🎯 Conclusion

✅ Fully automated **CI/CD pipeline**
✅ Integrated **SonarQube, JFrog, Docker, Kubernetes, and Jenkins**
✅ Monitored with **Prometheus & Grafana**

🚀 **Optimize, Scale, and Innovate with DevOps!**

---

## ⭐ Support This Project!

🔹 Found this helpful? **Give this repository a star!** ⭐

#### 👨‍💻 Author: [Kaustubh Patil](https://github.com/Kaustubspatil)

