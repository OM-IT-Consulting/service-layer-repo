# service-layer-repo
All application business logics are applied in this layer. Built using SpringBoot and Java 8.

## Build 

mvn clean install -Dmaven.test.skip=true

In the workspace run the below command

java -jar target/services-0.0.1-SNAPSHOT.jar

Now test the application using the below command

curl localhost:8080/test/testapi
