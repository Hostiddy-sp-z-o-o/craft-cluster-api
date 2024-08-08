#!/bin/bash
kubectl apply -f postgres-configmap.yaml
kubectl apply -f psql-pv.yaml
kubectl apply -f psql-claim.yaml
kubectl apply -f ps-deployment.yaml
kubectl apply -f ps-service.yaml