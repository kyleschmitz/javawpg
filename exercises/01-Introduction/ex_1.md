# Your First Application - Hello World

[<- Go Back](../exercises.md)

## Intro

The first application that any developer typically writes when learning a new programming language is Hello World. This will help ensure that the necessary tools are installed correctly, and to show how easy it is to write a simple program.

## Writing your application

* In your code directory (for example, `C:/proj/git/`), create a new folder for your application, called HelloWorld.
* Navigate to your new directory, which should look like:
  * `C:/proj/git/HelloWorld`
* Create a new file called `HelloWorld.java`
* Open your new file, and paste the following contents into it:
```java
public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello, World!");
	}
}
```
* Save the file.
* You will not understand the code itself yet, but after a couple weeks, everything you see here will start to make sense! For now, please consider this code a template that you can copy anad we will learn what each part means during the course.

## Compiling your application

* Open a command prompt, and navigate to the location of your new file.
* Type the following command to compile your application:
`javac HelloWorld.java`

The java compiler will take your java source code, and compile it into bytecode. This will create a new file called `HelloWorld.class` in your directory, which can be executed on the JVM (Java Virtual Machine).


## Running your application

* Once you have compiled your application, you can run it using the following command:
`java HelloWorld`
* Your application will be executed, and you should see the following result in your command prompt:
`Hello, World!`