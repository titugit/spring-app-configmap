#!/usr/bin/env bash
mvn clean package -DskipTests
docker build -t biswabhusan/spring-app-configmap:v2 .
kubectl delete -f deployment-with-configmap.yml
kubectl delete -f app-config.yml
kubectl create -f deployment-with-configmap.yml
kubectl create -f app-config.yml
kubeclt get pods
kubectl expose deployment springboot-configmap-k8s --type="NodePort" --port 5959