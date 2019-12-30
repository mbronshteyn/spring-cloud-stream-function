# spring-cloud-stream-function
Demo repository to show latest changes to Spring Cloud Stream Functions with Kafka. 

This is the latest changes to Spring Cloud Stream project.  The change is switching from Annotations to Functional approach.

1. Start Kafka cluster using docker-compose in docker directory
2. Run applicaiton
3. Put a message on `functionRouter-in-0` topic in Kafka.  
4. Verify with console that the router sends the message either to 'odd' or 'even' function
```
   2019-12-30 10:49:09.072  INFO 36086 --- [container-0-C-1] c.f.c.c.BeanFactoryAwareFunctionRegistry : Looking up function 'odd' with acceptedOutputTypes: []
   2019-12-30 10:49:09.073  INFO 36086 --- [container-0-C-1] o.s.c.f.context.config.RoutingFunction   : Resolved function from provided [routing-expression]  T(java.lang.System).nanoTime() % 2 == 0 ? 'even' : 'odd'
   ODD: test
   2019-12-30 10:49:09.285  INFO 36086 --- [container-0-C-1] c.f.c.c.BeanFactoryAwareFunctionRegistry : Looking up function 'even' with acceptedOutputTypes: []
   2019-12-30 10:49:09.285  INFO 36086 --- [container-0-C-1] o.s.c.f.context.config.RoutingFunction   : Resolved function from provided [routing-expression]  T(java.lang.System).nanoTime() % 2 == 0 ? 'even' : 'odd'
   EVEN: test
```

