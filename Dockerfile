FROM openjdk:15
COPY ./ /myapp/
WORKDIR /myapp/
RUN javac src/Main.java 
