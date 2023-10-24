#!/bin/bash

docker buildx build --platform linux/amd64 -t rjain/sample-k8s-app:latest-amd64 --push .
docker buildx build --platform linux/arm64 -t rjain/sample-k8s-app:latest-arm64 --push .

docker manifest create \
    rjain/sample-k8s-app:latest \
    --amend rjain/sample-k8s-app:latest-amd64 \
    --amend rjain/sample-k8s-app:latest-arm64

docker manifest push rjain/sample-k8s-app:latest