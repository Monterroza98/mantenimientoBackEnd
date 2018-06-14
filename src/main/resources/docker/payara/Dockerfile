ARG registry="private:5000/"
ARG image="payara/micro"
ARG tag=":4.181"
FROM ${registry}${image}${tag}
COPY postgresql-42.2.2.jar $PAYARA_PATH/
COPY asadmin.txt $PAYARA_PATH/
COPY MantenimientoWebApp-1.0-SNAPSHOT.war $PAYARA_PATH/
ENTRYPOINT ["java", "-jar", "payara-micro.jar", "--addLibs", "postgresql-42.2.2.jar", "--postbootcommandfile", "asadmin.txt","--deploy", "MantenimientoWebApp-1.0-SNAPSHOT.war"]