FROM adoptopenjdk/openjdk8:alpine-jre
ARG JAR_FILE=target/ConverterXML-0.0.1.jar
WORKDIR /opt/app
COPY ${JAR_FILE} converter-xml-0.0.1.jar
ENTRYPOINT ["java","-jar","converter-xml-0.0.1.jar"]