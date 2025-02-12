# 📊 Step 12: Implementing Cluster Monitoring with Prometheus & Grafana

To monitor the **Kubernetes cluster**, integrate **Prometheus** and **Grafana** using Helm.

### 🔹 **Install Helm & Add Prometheus Repository**

```sh
helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
helm repo update
```

### 🔹 **Deploy Prometheus & Grafana**

```sh
helm install prometheus prometheus-community/prometheus
helm install grafana prometheus-community/grafana
```

### 🔹 **Access Grafana Dashboard**

```sh
kubectl port-forward svc/grafana 3000:80
```

Access Grafana at **http://localhost:3000** and log in using default credentials (`admin/admin`).

### 🔹 **Configure Prometheus as Data Source in Grafana**

1. Log in to **Grafana** → Navigate to **Configuration > Data Sources**.
2. Click **Add Data Source** → Select **Prometheus**.
3. Enter **http://prometheus-server** as the data source URL.
4. Click **Save & Test**.

### 🔹 **Import Prebuilt Dashboards**

1. Click **"+"** → **Import**.
2. Enter **Prometheus Dashboard ID** from Grafana.com.
3. Click **Load & Save**.

💡 **Benefit**: Enables real-time cluster performance monitoring with powerful visualizations.

---

🚀 **With these steps, your CI/CD pipeline now supports artifact management, containerization, automated Kubernetes deployments, and comprehensive monitoring using Prometheus & Grafana!**

