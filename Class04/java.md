# Your first Java application

[<- Go Back](../README.md)

To help solidify some of the coding concepts that we've been going over, we're going to start writing some simple programs in Java that use those same concepts.

## Coding tools / IDE

* By now you should have your JDK installed on your machine. If you have not, please see the Environment Setup Guide in the Class01 folder.
* You are free to use any IDE you prefer. The three most popular IDEs are:
* IntelliJ - https://www.jetbrains.com/idea/ (the preferred choice for this course)
* Eclipse - https://www.eclipse.org/ide/
* Netbeans - https://netbeans.org/
  * For most simple examples in this course, I will be using a simple text editor called Sublime. Note that different companies will use different tools, and the ability to learn a new tool is more important that which tools you currently know how to use.

## Your application template

* Our class material is still focusing on introductory concepts, so some of the code that you will see in the Java examples will still be new and will not make sense yet. For now, you can use a template that must appear in all your applications. As your skills develop, you will begin to understand what the different parts of the template mean and what they are for.
* Create a new project in your IDE, and add a new Java file called `HelloWorld.java`

```java
public class HelloWorld{
	public static void main(String[] args){

		//Your code goes here

	}
}
```

* In java, we use the '//' marker to denote a "comment". This is a line that does not affect the program in any way, can is used by developers to write notes in their program to explain pieces of code to other developers.
* In java, your filename must match the name of your class. In the above example, our class name is `HelloWorld`, so our filename must be `HelloWorld.java`


## Useful lines

### Output

* To print output to the console, you can use the following command:

```java
System.out.println("This is some output");
```

### Input

* To read in data from the cosole, the commands are slightly more complicated for Java. 
* When using `Scanner` for input, you need the following line at the top of your application:

```java
import java.util.Scanner;
```

* To read in a number from the console, you need to use the `nextInt()` command, similar to the following:

```java
int firstNumber;

Scanner in = new Scanner(System.in);
firstNumber = in.nextInt();
```

* To read in text data from the console, you need to use the `next()` command, similar to the following:

```java
String userName;

Scanner in = new Scanner(System.in);
username = in.next();
```

### Numerical variables

* To declare a variable that accepts whole numbers, can use the `int` keyword, similar to the following:

```java
int numberOfUsers = 10;
```

* To declare a variable that accepts numbers with decimal places, can use the `float` keyword, similar to the following:

```java
float pi = 10;
```

### Text-based variables

* To declare a variable that accepts text, you can use the `String` keyword, similar to the following:

```java
String username = "Kyle";
```

### Example

* An example application that uses several of these concepts combined is the following:

```java
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String username;
        int age;

        System.out.print("Please enter your name: ");
        username = in.next();

        System.out.print("Please enter your age: ");
        age = in.nextInt();

        System.out.println("User " + username + " is " + age + " years old.");
    }
}
```

## Compiling your application

* If you are using an IDE for your application, there will typically be a "Build" option that will compile your application. If there are any errors in your application when you build it, the compiler will list those errors. You must fix all errors with your application before you can run it.
  * Once your application has been built successfully, your IDE will have an option to run it.
* If you are developing your application without an IDE, you compile it via the command `javac` in the command line, similar to the following:

```bash
javac HelloWorld.java
```

* Compiling your application will result in a new file `HelloWorld.class` being created in the same directory. This is a bytecode file, which the JVM interprets in order to run your application.
* Once your application has been built successfully, you can run it using the `java` command, similar to the followingL

```bash
java HelloWorld
```

## Java & IDE Resources
* [Writing an application using Eclipse](https://www.youtube.com/watch?v=J9lkAK0L16I)
* [Writing an application using IntelliJ](https://www.youtube.com/watch?v=cXkMxDgBKPE)
* [Writing an application using Netbeans](https://www.youtube.com/watch?v=XNeKPwGLR2I)