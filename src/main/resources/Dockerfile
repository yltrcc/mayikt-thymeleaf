# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER yltrcc
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
# 将jar包添加到容器中并更名为mayikt.jar
ADD mayikt-thymeleaf-1.0-SNAPSHOT.jar mayikt.jar
# 运行jar包
RUN bash -c 'touch /mayikt.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mayikt.jar"]
#暴露8080端口
EXPOSE 8080