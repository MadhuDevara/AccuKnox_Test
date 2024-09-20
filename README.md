**OverView**  This project demonstrates the deployment of a web application using Minikube and the deployment verification using Java Selenium. 
It involves monitoring the integration between the frontend and backend services.

**Prerequisites**
   - [Minikube](https://minikube.sigs.k8s.io/docs/start/) installed on your local machine.
   - [kubectl](https://kubernetes.io/docs/tasks/tools/) is installed to interact with your Minikube cluster.
   - Docker installed for building images (optional).

**Steps to Deploy Using Minikube**

   1. Start Minikube:
      Open your terminal and start Minikube with the following command:
      ```bash
      minikube start
      ```

   2. Create Docker Images:
      Build your Docker images for both the frontend and backend services.
      ```bash
      docker build -t your-username/backend:v1 ./backend
      docker build -t your-username/frontend:v1 ./frontend
      ```

   3. Deploy to Kubernetes:
      Apply your Kubernetes deployment files:
      ```bash
      kubectl apply -f backend-deployment.yaml
      kubectl apply -f frontend-deployment.yaml
      ```

   4. Check Deployments:
      Verify that the pods are running:
      ```bash
      kubectl get pods
      ```

   5. Port Forwarding:
      Forward the service port to access the frontend:
      ```bash
      kubectl port-forward service/frontend-service 8081:80
      ```

   6. Access the Application:
      Open your web browser and navigate to `http://localhost:8081/`.


**Verification**
   1. Ensure the correct versions of selenium with java are installed. The Java code to trigger browser and to validate the text on the screen was updated in the FrontendBackendIntegration.java file

      
