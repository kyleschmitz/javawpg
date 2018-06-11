# Environment Setup and Tools

[<- Go Back](../README.md)

## Intro

As part of the course, you will need to download, install, and configure the necessary tools so that you can develop in Java on your computer.


## JDK

The JDK (Java Development Kit) includes both the Java Runtime Environment (JRE) that lets you run Java applications on your machine, as well as the tools that let you build your own Java applications. You can download the latest version of Java at the following link. Ensure that you select the correct environment for your operating system.

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html


## Apache Maven

Maven is a build management tool that will allow us to easily use different libraries for our code, which will come in use later on in the course. You can download the binaries for Maven at the following link:

http://maven.apache.org/download.cgi

* Select the option for "Binary zip archive" (apache-maven-3.5.3-bin.zip) and download to your PC. Extract the files into the following location "C:\Program Files\Apache\apache-maven-3.5.3".


## Environment Variables

If you are running a Windows based PC, you will need to set a couple different environment variables once you have the JDK installed on your system, as well as Maven. To set the environment variables, use the following steps:

* Hit the Windows key, search for "System", and select "System".
* Click on the "Advanced system settings" link.
* Click "Environment Variables"
* If it does not already exist, add a new system variable called JAVA_HOME. This will depend on the installation directory of your JDK, but should be similar to "C:\Program Files\Java\jdk1.8.0_171\bin"
  * For more information, see https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/
* If it does not already exist, edit your path to include a new entry for Java. This will depend on the installation directory of your JDK, but should be similar to "C:\Program Files\Java\jdk1.8.0_171\bin"
* If it does not already exist, edit your path to include a new entry for Maven. If you followed the steps above, the installation directory should be "C:\Program Files\Apache\apache-maven-3.5.3\bin"
  * For more information on installing Maven, see the following link: http://maven.apache.org/install.html


## Verifying Installation

We can verify the installation of both the JDK as well as Maven by using the command prompt.

* Hit the Windows key, and search for "cmd" to open up a command prompt.
* To verify if Java is installed correctly on your machine, type "javac -version".
  * The installed version of the Java compiler should be returned.
* To verify if Maven is installed correctly on your machine, type "mvn -version".
  * The installed version of Apache Maven should be returned.
  * For more information on installing Maven, see the following link: http://maven.apache.org/install.html


## Eclipse

Eclipse is an IDE (Integrated Development Environment) that will let us build applications in Java. And IDE allows us to create new projects, copile and run our applications, and also has useful development tools like debuggers and code completion that help us when writing code. You can download Eclipse at the following link:

https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R2/eclipse-inst-win64.exe


## Sublime

Sublime is a useful text editor that makes getting started with Java very easy. You can download Sublime at the following link:

https://www.sublimetext.com/