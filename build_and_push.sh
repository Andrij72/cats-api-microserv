#!/usr/bin/env bash
docker build . -t andr72/cats-api-microserv:1.0.0

docker push andr72/cats-api-microserv:1.0.0

docker run -ti --rm -e DATASOURCE_HOST=192.168.56.1 -p 8081:8095  andr72/cats-api-microserv:1.0.0


