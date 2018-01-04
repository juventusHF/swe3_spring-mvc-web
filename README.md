# Übung zu Spring MVC

Sieh nach im `pom.xml` nach, welche Abhängigkeiten definiert sind.

Kompiliere das Projekt:

    mvn package
    
Als Ergebnis wird ein `.war`-File im `target` Ordner erzeugt. 
Inspiziere den Ordner `target/spring-mvc-web-1.0-SNAPSHOT`, um die Anatomie des Spring-MVC-`.war`-Files zu sehen.

Starte nun Tomcat:

    mvn tomcat7:run
    
Du kannst nun die Applikation unter folgender URL aufrufen: http://localhost:8080/spring-mvc-web/app/hello

## Spring-Konfiguration

Inspiziere die Spring-Konfigurationen

- `ch.juventus.example.AppInitializer`, um die Konfiguration des Spring-Context und des Spring MVC Dispatcher Servlets zu sehen, und
- `ch.juventus.example.WebConfiguration`, um die Konfiguration von Spring MVC zu sehen.

## GET Parameter 

Lies den folgenden Abschnitt über Requestparameter: https://docs.spring.io/spring/docs/5.0.2.RELEASE/spring-framework-reference/web.html#mvc-ann-requestparam.

Erweitere `HelloController` um eine neue Methode `helloWithParam`, welche beim Aufruf der URL
http://localhost:8080/spring-mvc-web/app/hello?name=Bob mit einer HTML-Seite mit Grüssen an Bob antwortet.

Schau Dir dazu das Freemarker-Template `src/main/webapp/WEB-INF/views/hello.html` an. 
In der neuen Methode `helloWithParam` muss das Model `model` nun mit dem neuen Parameter befüllt werden, 
so dass dieser über das bestehende Freemarker-Template ausgegeben wird.

Teste den neuen Service mit http://localhost:8080/spring-mvc-web/app/hello?name=Bob.

## RESTful Service

Lies im Guide zu RESTful Web Services mit Spring Boot die beiden Abschnitte "Create a resource representation class" und "Create a resource controller".
Den Guide findest Du hier: http://spring.io/guides/gs/rest-service/.

Erzeuge wie im Guide beschrieben eine Resource `Greeting` und einen neuen Controller `GreetingController`, 
allerdings im Package `ch.juventus.example.web`.

Teste den neuen Service mit: http://localhost:8080/spring-mvc-web/app/greeting?name=Bob

Der Service wird eine Exception erzeugen. Kannst Du den Fehler finden und korrigieren?