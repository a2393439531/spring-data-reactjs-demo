1、
```
npm run-script watch
./mvnw spring-boot:run
```
2、When you fetch a resource, there is risk is that it might go stale if someone else updates it. To deal with this, Spring Data REST integrates two technologies: versioning of resources and ETags.

  By versioning resources on the backend and using ETags in the frontend, it is possible to conditially PUT a change. In other words, you can detect if a resource has changed and prevent a PUT (or a PATCH) from stomping on someone else’s update. Let’s check it out.


3、
Versioning REST resources

To support versioning of resources, define a version attribute for your domain objects that need this type of protection.

The version field is annotated with javax.persistence.Version. It causes a value to be automatically stored and updated everytime a row is inserted and updated.

When fetching an individual resource (not a collection resource), Spring Data REST will automatically add an ETag response header with the value of this field.

4、PUT with an If-Match request header causes Spring Data REST to check the value against the current version. If the incoming If-Match value doesn’t match the data store’s version value, Spring Data REST will fail with an HTTP 412 Precondition Failed.