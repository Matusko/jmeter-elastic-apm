# jmeter-elastic-apm

https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.2.6.RELEASE&packaging=jar&jvmVersion=11&groupId=sk.matusko.tutorial&artifactId=jmeter-elastic-apm&name=jmeter-elastic-apm&description=Example%20of%20performance%20testing%20using%20jmeter%20and%20elastic%20stack&packageName=sk.matusko.tutorial.jmeter-elastic-apm&dependencies=devtools,web,actuator,data-redis-reactive,lombok,data-jpa,h2

    ./gradlew build
    ./gradlew bootRun
    ./gradlew bootRun -PjvmArgs="-javaagent:/home/matus/Work/jmeter-elastic-apm/elastic/apm/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/home/matus/Work/jmeter-elastic-apm/spring-boot-app/elasticapm.properties"
    
actuator works
redis connection issue in logs
    
     docker-compose up -d postgres
     docker-compose up -d redis
     docker ps
     
add aplication.yml
add postgres dependency
    
    ./gradlew bootRun

no redis connection issue

        modified:   README.md
        modified:   jmeter-elastic-apm/build.gradle
        new file:   jmeter-elastic-apm/docker-compose.yml
        modified:   jmeter-elastic-apm/src/main/java/sk/matusko/tutorial/jmeterelasticapm/JmeterElasticApmApplication.java
        new file:   jmeter-elastic-apm/src/main/java/sk/matusko/tutorial/jmeterelasticapm/JmeterElasticApmController.java
        new file:   jmeter-elastic-apm/src/main/java/sk/matusko/tutorial/jmeterelasticapm/JmeterElasticApmService.java
        new file:   jmeter-elastic-apm/src/main/java/sk/matusko/tutorial/jmeterelasticapm/PetsRepository.java
        new file:   jmeter-elastic-apm/src/main/java/sk/matusko/tutorial/jmeterelasticapm/models/Pet.java
        deleted:    jmeter-elastic-apm/src/main/resources/application.properties
        new file:   jmeter-elastic-apm/src/main/resources/application.yml
        new file:   jmeter-elastic-apm/src/main/resources/data.sql
