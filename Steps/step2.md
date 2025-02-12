# 🔑 Step 02: Secure & Seamless SSH Authentication

To enable **passwordless authentication** between the **Ansible Controller** and **Agent nodes**, we set up **SSH key-based authentication**. This enhances security while enabling smooth automation.

### 🔹 **Setting Up Passwordless SSH Authentication**

1. **Generate SSH Key Pair on the Ansible Controller**:
   ```sh
   ssh-keygen
   ```
   - The private key is stored at `~/.ssh/id_rsa`
   - The public key is stored at `~/.ssh/id_rsa.pub`

2. **Distribute Public Key to Agent Nodes**:
   ```sh
   ssh-copy-id <username>@<agent_ip>
   ```
   - This adds the public key to `~/.ssh/authorized_keys` on the Agent node.

3. **Verify Passwordless Login**:
   ```sh
   ssh <username>@<agent_ip>
   ```
   - If successful, SSH should not ask for a password.

4. **Update Ansible Inventory**:
   Define Agent nodes in `/etc/ansible/hosts`:
   ```plaintext
   [agents]
   agent1 ansible_host=<agent_ip_1>
   agent2 ansible_host=<agent_ip_2>
   ```

5. **Run Ansible Playbook**:
   ```sh
   ansible-playbook playbook.yml
   ```
   - Ansible will now execute playbooks without requiring passwords.

💡 **Benefit**: Integrating **passwordless SSH authentication** allows for seamless execution of automation tasks, making it a crucial step in any DevOps workflow.

---


