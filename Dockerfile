FROM maven:latest
COPY target/piorodemo-0.0.1-SNAPSHOT.war /home/app/

ENTRYPOINT ["java","-jar","/home/app/piorodemo-0.0.1-SNAPSHOT.war"]
