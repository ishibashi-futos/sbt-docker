FROM adoptopenjdk/openjdk8:alpine

ENV PROXY_HOST proxy.host.com
ENV PROXY_PORT 8080
ENV PROXY_USERNAME username
ENV PROXY_PASSWORD password
ENV HTTP_PROXY http://${PROXY_USERNAME}:${PROXY_PASSWORD}@${PROXY_HOST}:${PROXY_PORT}
ENV HTTPS_PROXY http://${PROXY_USERNAME}:${PROXY_PASSWORD}@${PROXY_HOST}:${PROXY_PORT}

ENV SBT_HOME /usr/lib/sbt
ADD assets/sbt-1.3.5.tgz /usr/lib

RUN apk add --no-cache bash

RUN echo "-Dhttp.proxyHost=${PROXY_HOST}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttp.proxyPort=${PROXY_PORT}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttp.proxyUser=${PROXY_USERNAME}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttp.proxyPassword=${PROXY_PASSWORD}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttps.proxyHost=${PROXY_HOST}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttps.proxyPort=${PROXY_PORT}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttps.proxyUser=${PROXY_USERNAME}" >> ${SBT_HOME}/conf/sbtopts \
 && echo "-Dhttps.proxyPassword=${PROXY_PASSWORD}" >> ${SBT_HOME}/conf/sbtopts

ENV PATH ${PATH}:${SBT_HOME}/bin