implemented with
-->docker-compose
-->multi module
<<<<<<< HEAD
 added the parent pom with common dependencies
=======
  added the parent pom with common dependencies
>>>>>>> fb0cc1e35ff976eda1d49345e80e4103145a3405
-->api gateway(zuul service)
intercept all the request then route the request to actual services.
-->eureka server
  one dedicated server is responsible to maintain the registry of all the Microservice that has been deployed and removed.
-->config server
Config server is where all configurable parameters of microservices are written and maintained. 

