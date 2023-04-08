# Kubernetes Demo App with Spring and MySQL

In this app we demonstrate how to simply run a basic CRUD application with Spring and MySQL in Kubernetes cluster.

## Kubernetes commands
(You need Docker Desktop up and running)

To start Kubernetes run this command
```shell
minikube start --driver docker
```
To create a pod with the configuration file named: app-deployment.yaml
```shell
kubectl apply -f app-deployment.yaml
```

To view your services, deployments and pods:

```shell
kubectl get svc
kubectl get deployment
kubectl get pod
```

To view logs for a specific pod, given that the pod name is app-123

```shell
kubectl logs app-123
```

To run a specific pod in your terminal, for example a mysql terminal, get the pod name (mysql-123) and run:

```shell
kubectl exec -it mysql-123 bin/bash
```


To view the running app on your browser, giving that the app is running on service service-123, run the command:

minikube service service-123 --url
