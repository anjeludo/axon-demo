FROM adoptopenjdk:11-jre-hotspot
#EXPOSE 8080
#RUN apk --no-cache add curl
RUN curl -sfL $(curl -s https://api.github.com/repos/powerman/dockerize/releases/latest | grep -i /dockerize-$(uname -s)-$(uname -m)\" | cut -d\" -f4) | install /dev/stdin /usr/local/bin/dockerize
VOLUME /tmp
ARG JAR_FILE=target/axon-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

