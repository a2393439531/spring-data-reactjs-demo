1、
```
npm run-script watch
./mvnw spring-boot:run
```
2、
```shell
 curl localhost:8080/api/employees?size=2
```
3、grab some JSON Schema metadata
```shell
curl http://localhost:8080/api/profile/employees -H "Accept:application/schema+json"
```

4、promise：
The secret thing to remember with promises is that then() functions need to return something, whether it’s a value or another promise. done() functions do NOT return anything, and you don’t chain anything after it. In case you haven’t noticed yet, client (which is an instance of rest from rest.js) as well as the follow function return promises.










