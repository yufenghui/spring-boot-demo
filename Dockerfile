FROM harbor.vchangyi.com/test/changyi-openjdk:8-jre-v1.0

VOLUME /tmp

# 应用路径
ENV APP_PATH=target/spring-boot-demo.jar

# 设置时区
ENV TZ=Asia/Shanghai
RUN set -eux; \
    ln -snf /usr/share/zoneinfo/$TZ /etc/localtime; \
    echo $TZ > /etc/timezone


# 添加应用jar
COPY $APP_PATH /app.jar

# 保证Java进程 PID=1，清除僵尸线程以及优雅退出，参考tini
CMD exec java $JAVA_OPTS -jar /app.jar