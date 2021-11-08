#
# Build stage
#
FROM maven:3.6.0-jdk-8-slim AS build
COPY src /src
COPY pom.xml .
RUN mvn -f /pom.xml clean package
#
# Run stage
#
FROM openjdk:8-jre-slim
COPY --from=build /target/ConverterXML-0.0.1.jar converter-xml-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","converter-xml-0.0.1.jar"]
