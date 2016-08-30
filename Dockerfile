FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/hypster.jar /hypster/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hypster/app.jar"]
