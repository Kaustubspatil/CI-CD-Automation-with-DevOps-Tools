# ⚙️ Step 03: Automating Jenkins Master & Agent Setup with Ansible

### 🔹 **Jenkins Master Installation & Configuration**

1. **Create Ansible Playbook (`jenkins-master.yml`)**:
   ```yaml
   - name: Install & Configure Jenkins Master
     hosts: jenkins-master
     tasks:
       - name: Install Java
         apt:
           name: openjdk-11-jdk
           state: present
       - name: Install Jenkins
         apt:
           name: jenkins
           state: present
       - name: Start Jenkins service
         systemd:
           name: jenkins
           enabled: yes
           state: started
   ```

2. **Create Jenkins Agent Playbook (`jenkins-agents.yml`)**:
   ```yaml
   - name: Configure Jenkins Agent
     hosts: jenkins-agents
     tasks:
       - name: Install Java
         apt:
           name: openjdk-11-jdk
           state: present
       - name: Download Agent JAR
         get_url:
           url: http://<jenkins-master>:<jenkins-port>/jnlpJars/agent.jar
           dest: /home/{{ ansible_user }}/agent.jar
   ```

3. **Run Playbooks**:
   ```sh
   ansible-playbook -i inventory.ini jenkins-master.yml
   ansible-playbook -i inventory.ini jenkins-agents.yml
   ```

4. **Configure Jenkins Master & Agent**:
   - Access **Jenkins UI** (`http://jenkins-master:8080`)
   - Create and configure **Jenkins Agents**
   - Set up **Maven Build Server** for efficient CI/CD execution

💡 **Benefit**: Using **Ansible** to automate Jenkins deployment eliminates manual configurations, ensuring consistency and repeatability.

---