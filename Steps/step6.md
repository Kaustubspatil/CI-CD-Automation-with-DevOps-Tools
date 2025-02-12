# 🔄 Step 06: Configuring GitHub Webhooks for Auto-Triggers

To automatically trigger Jenkins jobs when new commits are pushed, follow these steps:

### 🔹 **Install Required Plugin**
- Navigate to **Manage Jenkins** → **Manage Plugins**.
- Install **Multibranch Scan Webhook Trigger**.

### 🔹 **Set Up GitHub Webhook**

1. Go to **GitHub Repository** → **Settings** → **Webhooks**.
2. Click **Add Webhook**.
3. Set **Payload URL**:
   ```plaintext
   https://your-jenkins-domain/github-webhook/
   ```
4. Choose **application/json** as content type.
5. Select **Push Events** (or others as needed).
6. Save the webhook.

### 🔹 **Configure Jenkins to Listen to Webhook Events**

1. Open your **Multibranch Pipeline Job**.
2. Enable **Build whenever a webhook is received**.
3. Adjust **scan intervals** to ensure timely builds.

### 🔹 **Test Webhook Trigger**
- Push a minor change to GitHub.
- Observe Jenkins automatically triggering a build.

💡 **Benefit**: Ensures **continuous integration**, reducing manual intervention.

---