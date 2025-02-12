# 🔗 Step 04: Connecting Jenkins Master & Agents Securely

To ensure **Jenkins Agents** can authenticate with **Jenkins Master**, follow these steps:

### 🔹 **Adding Jenkins Agent Credentials**

1. **Navigate to Jenkins Credentials**:
   - **Manage Jenkins** → **Manage Credentials** → **Global** → **Add Credentials**

2. **Choose Authentication Method**:
   - **SSH Username with Private Key** *(for SSH-based connections)*
   - **Secret Text** *(for token-based authentication)*

3. **Provide Required Details**:
   - **Username** (Agent username)
   - **Private Key / Secret Token**
   - **Description** *(to identify the credentials easily)*

4. **Apply & Save Credentials**

### 🔹 **Registering Jenkins Agents**

1. **Go to Manage Nodes & Clouds**
   - **Manage Jenkins** → **Manage Nodes & Clouds** → **New Node**

2. **Configure Agent Node**:
   - **Node Name**: Unique identifier for Agent
   - **Remote Root Directory**: Path where Jenkins runs builds
   - **Launch Method**: Choose `Launch agent via SSH`
   - **Use the Credentials Added Previously**

3. **Save & Start Agent**
   - The agent should now be successfully connected.

💡 **Benefit**: Establishing a **secure and automated connection** between Jenkins Master and Agents ensures efficient workload distribution and optimized CI/CD execution.

---

🚀 **By completing these steps, we've established a secure, automated, and scalable DevOps pipeline!**