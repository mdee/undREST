undREST
========

A skeleton REST endpoint

Technologies used:
* Jersey for JAX-RS
* Guice for dependency injection
* Hibernate for ORM
* Maven for dependency mgmt
* Jetty for servlet container & HTTP server

Details to fill:

<table>
  <tr>
    <th>Filename</th><th>Value to override</th>
  </tr>
  <tr>
    <td>pom.xml</td><td>'artifactId' value</td>
  </tr>
  <tr>
    <td></td><td>'finalName' value</td>
  </tr>
  <tr>
    <td>log4j.properties</td><td>log4j.appender.file.File value (absolute path to file)</td>
  </tr>
  <tr>
    <td>persistence.xml</td><td>hibernate.connection.url (default values for MySQL, requires host, port & DB name)</td>
  </tr>
  <tr>
    <td></td><td>'persistence-unit' name attribute</td>
  </tr>
</table>

To compile:
```
mvn clean package
```
To run (an embedded Jetty instance):
```
mvn exec:java -Dexec.mainClass="Main"
```
To debug (w/remote debugger):
```
mvnDebug exec:java -Dexec.mainClass="Main"
```
When running on embedded Jetty, open this address in your browser:

[http://localhost:8080/msg](http://localhost:8080/msg)

Otherwise, copy the .war to your /webapps directory and go to whatever your standard Jetty deployment address is, appended with */undREST/msg*

This was pieced together mostly from the [Guice Wiki][(http://code.google.com/p/google-guice/wiki/Servlets) and [this Randomized Sort posting](http://randomizedsort.blogspot.in/2011/05/using-guice-ified-jersey-in-embedded.html).
