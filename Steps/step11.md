# 🚀 Step 11: Deploying Application to EKS from JFrog Artifactory

Use **Kubernetes** to pull Docker images from **Artifactory** and deploy applications to **EKS**.

### 🔹 **Create a Kubernetes Secret for Artifactory**

```sh
kubectl create secret docker-registry artifactory-secret \
  --docker-server=<ARTIFACTORY_URL> \
  --docker-username=<USERNAME> \
  --docker-password=<PASSWORD> \
  --namespace=my-namespace
```

### 🔹 **Define Kubernetes Deployment**

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: my-app
  namespace: my-namespace
spec:
  replicas: 2
  selector:
    matchLabels:
      app: my-app
  template:
    metadata:
      labels:
        app: my-app
    spec:
      containers:
        - name: my-container
          image: <ARTIFACTORY_URL>/my-app:latest
          ports:
            - containerPort: 80
      imagePullSecrets:
        - name: artifactory-secret
```

### 🔹 **Expose Application via Service**

```yaml
apiVersion: v1
kind: Service
metadata:
  name: my-service
  namespace: my-namespace
spec:
  selector:
    app: my-app
  ports:
    - protocol: TCP
      port: 80
      targetPort: 80
  type: LoadBalancer
```

### 🔹 **Apply Kubernetes Configurations via Jenkins**

Modify the `Jenkinsfile` to deploy the application to **EKS**:

```groovy
stage('Deploy to EKS') {
    steps {
        sh 'kubectl apply -f deployment.yaml -f service.yaml'
    }
}
```

💡 **Benefit**: Enables a fully automated Kubernetes deployment pipeline with Jenkins, Docker, and JFrog Artifactory.

---

🚀 **With these steps, your CI/CD pipeline now supports artifact management, containerization, cloud-based Kubernetes deployments, and fully automated provisioning!**

