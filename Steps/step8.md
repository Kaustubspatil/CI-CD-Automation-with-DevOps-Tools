# 📦 Step 08: Integrating JFrog Artifactory with Jenkins

To streamline artifact management, integrate **JFrog Artifactory** with **Jenkins** by adding credentials and configuring the Artifactory plugin.

### 🔹 **Adding JFrog Credentials in Jenkins**

1. **Manage Jenkins** → **Manage Credentials**.
2. **Add New Credentials**:
   - Choose **Secret Text**.
   - Provide the **JFrog API Key or Access Token**.
   - Save the credentials.

### 🔹 **Installing & Configuring the JFrog Plugin**

1. **Manage Jenkins** → **Manage Plugins**.
2. Search for **JFrog Artifactory Plugin**, install it.
3. **Manage Jenkins** → **Configure System** → Locate **Artifactory**.
4. **Add Artifactory Server**:
   - Provide **Artifactory URL**.
   - Select the credentials added earlier.
   - Save configuration.

💡 **Benefit**: Automates artifact storage, retrieval, and dependency management in CI/CD workflows.

---



