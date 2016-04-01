FROM java:8
VOLUME /tmp
ADD clh-consul*.jar app.jar
RUN bash -c 'touch /app.jar'
#EXPOSE 8000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
