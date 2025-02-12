# 🔗 Step 05: Integrating GitHub with Jenkins for CI/CD

To enable seamless interaction between **Jenkins** and **GitHub**, follow these steps to add **GitHub credentials** and configure a **Multibranch Pipeline Job**.

### 🔹 **Adding GitHub Credentials in Jenkins**

1. **Access Jenkins Credentials**:
   - Navigate to **Manage Jenkins** → **Manage Credentials**.

2. **Add New GitHub Credentials**:
   - Choose **Global (or another domain)** → Click **Add Credentials**.
   - Select **Username with Password**.
   - Enter your **GitHub username** and **Personal Access Token** (from GitHub settings).
   - Save the credentials.

### 🔹 **Creating a Multibranch Pipeline Job**

1. **New Item** → Select **Multibranch Pipeline**.
2. **Configure GitHub Repository**:
   - Add the **GitHub repository URL**.
   - Choose the credentials added in previous steps.
3. **Define Branch Discovery & Triggers**:
   - Configure **branch discovery settings**.
   - Save & Apply.
4. **Automatic Branch Detection**:
   - The pipeline will now detect **all active branches & PRs** from GitHub.

💡 **Benefit**: This setup enables **automated builds & testing** whenever code changes in GitHub.

---





