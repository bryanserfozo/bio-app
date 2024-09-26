# This file is called a Dockerfile, it's a blueprint for how the image of the container will look and operate
# When we build the image it'll use this as a set of instructions of what to do once the container gets started

# As a reminder, Docker's whole goal is to allow you to spin up an instance quickly and reliably regardless of what
# the host has for it's own OS or various different applications

# First we need a starting point or a base image to build our container from
# Since we need Java 17 for our application, why don't we use a java base image
FROM amazoncorretto:17

# After pulling in our base image we want the JAR file for this application
# Why do we want the JAR file? This is a Java executable file so since we have access to Java commands (from the base
# image), we can run JAR files with no problem

# Copy is going to copy the file that we specify from this class path and copy it to the container's app.jar file
COPY target/app.jar app.jar

# In this case that you're running a web application, you'll likely need to make a port on the container available for
# web traffic, we do this by using EXPOSE and specifying the port number
EXPOSE 8080

# The final command that you'll run inside of your Dockerfile will be the command that starts the application
CMD ["java", "-jar", "app.jar"]
#java -jar app.jar will start our application