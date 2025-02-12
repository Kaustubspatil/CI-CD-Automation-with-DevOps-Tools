# ☁️ Step 10: Provisioning Amazon EKS Cluster with Terraform

Automate **Amazon EKS** deployment using **Terraform** for scalable Kubernetes management.

### 🔹 **Terraform Steps to Provision EKS**

1. **Initialize Terraform**:
   ```sh
   terraform init
   ```
2. **Define EKS Configuration (`eks.tf`)**:
   ```hcl
   provider "aws" {
     region = "us-west-2"
   }

   module "eks" {
     source         = "terraform-aws-modules/eks/aws"
     cluster_name   = "my-eks-cluster"
     vpc_id        = "vpc-xxxxx"
     subnets       = ["subnet-xxxxx", "subnet-yyyyy"]
   }
   ```
3. **Deploy the Cluster**:
   ```sh
   terraform apply
   ```
4. **Configure kubectl**:
   ```sh
   aws eks update-kubeconfig --name my-eks-cluster
   ```

💡 **Benefit**: Ensures a repeatable, scalable, and automated EKS cluster provisioning process.

---