##Pom.xml 
1.Pom.XML dependency Injection
```shell
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>3.8.1</version>
<scope>test</scope>
</dependency>
```

##ApplicationContext ->It use for for Spring Schema
1.Pom.XML dependency Injection
```shell
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://www.springframework.org/schema/beans
  https://www.springframework.org/schema/beans/spring-beans.xsd">
  <!-- services -->
  <bean id="petStore"
class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
  <property name="accountDao" ref="accountDao"/>
  <property name="itemDao" ref="itemDao"/>
  <!-- additional collaborators and configuration for this bean go here -->
  </bean>
  <!-- more bean definitions for services go here -->
</beans>
```
