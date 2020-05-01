# jmeter-elastic-apm

https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.2.6.RELEASE&packaging=jar&jvmVersion=11&groupId=sk.matusko.tutorial&artifactId=jmeter-elastic-apm&name=jmeter-elastic-apm&description=Example%20of%20performance%20testing%20using%20jmeter%20and%20elastic%20stack&packageName=sk.matusko.tutorial.jmeter-elastic-apm&dependencies=devtools,web,actuator,data-redis-reactive,lombok,data-jpa,h2

    ./gradlew build
    ./gradlew bootRun
    
actuator works
redis connection issue in logs
    
     docker-compose up -d postgres
     docker-compose up -d redis
     docker ps
     
add aplication.yml
add postgres dependency
    
    ./gradlew bootRun

no redis connection issue