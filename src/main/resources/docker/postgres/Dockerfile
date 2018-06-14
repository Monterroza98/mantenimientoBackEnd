ARG registry="private:5000/"

ARG image="postgres"

ARG tag=":9.6.3-alpine"

FROM ${registry}${image}${tag}

ADD mantenimiento.sql /docker-entrypoint-initdb.d/mantenimiento.sql