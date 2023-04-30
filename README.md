# Kubernetes Spring Boot and MySQL CRUD App

This repository contains a sample CRUD (Create, Read, Update, Delete) application built with Spring Boot and MySQL that is ready to be deployed to Kubernetes. The app allows you to manage User entities by creating, reading, updating, and deleting them through a RESTful API.

## Getting Started

### Prerequisites

To run this app locally, you need to have the following installed:

- Docker
- Kubernetes
- Minikube (optional, for running a local Kubernetes cluster)

### Running the App Locally

1. Clone the repository:

```shell
git clone https://github.com/JasonShuyinta/k8s-demo.git
```
2. Change directory to the app:

```shell
cd k8s-demo
```
3. Build the Docker image:
```shell
docker build -t jason9722/k8s-demo .
```
4. Start Minikube (if you haven't already):

```shell
minikube start
```

5. Change directory to k8s
```shell
cd k8s
```

7. Deploy the app to Kubernetes:

```shell
kubectl apply -f kubernetes/deployment.yaml
```
7. Get the URL to access the app:
```shell
minikube service k8s-spring-boot-mysql-crud --url
```

8. Open the URL in your browser to access the app.

## API Endpoints

The following endpoints are available for managing User entities:

- `GET /users`: Get all users
- `GET /users/{id}`: Get a user by ID
- `POST /users`: Create a new user
- `PUT /users/{id}`: Update an existing user
- `DELETE /users/{id}`: Delete a user by ID

All requests and responses are in JSON format.

## Technologies Used

This app uses the following technologies:

- Spring Boot: A Java framework for building web applications.
- MySQL: A popular open-source relational database.
- Kubernetes: An open-source container orchestration platform.
- Docker: An open source platform that enables developers to build, deploy, run, update and manage containers


## Kubernetes useful commands
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

To get more information about a pod you can run
```shell
kubectl describe pod [POD_NAME]

```


To view logs for a specific pod

```shell
kubectl logs [POD_NAME]
```

To run a specific pod in your terminal, for example a mysql terminal, get the pod name (mysql-123) and run:

```shell
kubectl exec -it [POD_NAME] bin/bash
```

You can use namespaces to group resources together
```shell
kubectl get namespaces
kubectl get ns
kubectl delete namespace [NAMESPACE]

```

After you successfull enter into integrated mode in the mysql pod, to access your database run:
```powershell
mysql -h <db_host> -u <user> -p <password> 
```

To view the running app on your browser, giving that the app is running on service service-123, run the command:

```shell
minikube service [SERVICE_NAME] --url
```

To enable the minikube dashboard run:

```shell
minikube dashboard
```



