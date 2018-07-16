# Class 15 - July 16, 2018

## Agenda

* Overview of flowcharts and how to create them.

https://drive.google.com/open?id=12cF6qcLz46KwKbuwV76Du_-BQSCN83AioIMLuJhALno

* In class assignment of how to analyze a problem, design classes, and write a solution.

https://drive.google.com/open?id=1C3nVyn7HCRf9dMixneTTe916YGNOucDZLKjvLbstmDU

### Step 1 - Analysing the problem

When looking at a complicated assignment, the first step is making sure you fully understand the requirements.

* What is the assignment asking you to do?
* What is the input needed?
* What is the output needed?
* Is there any parts that are unclear?
  * In a business setting, you will often receive requirements that may be unclear or missing details. Always ask questions!


### Step 2 - Identifying the classes involved

Before we start even thinking about coding our application, we should look at what classes we can identify in the problem.

* Which data can be grouped together? What would those classed be called?
  * The data members needed in your classes may not always be listed in one place. You may need to make decisions based on the requirements of the assignment.
* Which functionality can be grouped together? Remember that a class doesn't always model a collection of data. It could model related functionality.
  * For example, a calculator doesn't store data, but it provides functionality for add, subtract, multiply, divide, etc


### Step 3 - Designing the interactions in your application

When you have the classes you think you'll need for your application, it can be helpful to draw them out, and map the interactions between them.

* Which classes will contain references to other classes?
* Which functionality will live in which classes?
* How will the classes interact with each other?


### Step 4 - Breaking down the flow of the program

If you have a particularly complicated flow in your application, it can help to draw out a flow chart to help you understand how your program will behave.

* Flow charts are mostly useful for knowing the control structures (conditions and loops) that need to be in your application.
* This will be particularly helpful when coding the main control loop of your application.
* See the notes at the top for more information on flowcharts.


### Step 5 - Coding your application

You can start coding your application at any point, however it is a good idea to do the previous planning stages first, to make sure what you are coding is in the right direction. When you code your application, you can start with any class or function you prefer. It is a good idea though to write small pieces that you can test as you write your application.

* Compile your application often to help find issues sooner.
* Run your application often to test the functionality you have written so far.
* It is okay to write code that helps you test your application, even if you end up deleting it later.


### Step 6 - Testing your application

You should be testing your application as you develop it, so that you know that changes to you make and new functionality you introduce, doesn't break existing functionality. Once your application is complete, you should also put it through a more rigorous set of tests to ensure it is working correctly.

* Test your application using different sets of inputs, and verify the results to ensure that it is producing the correct response.
* What happens if you enter incorrect input into your application?
  * Blank input
  * Invalid numbers (negative, when it expects a positive)
  * The wrong type of input

### Step 7 - Cleanup

You should be writing clean code as you develop your application, rather than as a separate step. Here are some things to watch out for:

* Are all the names easy to understand, and accurately describe what the code does or what it represents?
* Is your output easy for the user to understand?
  * Prompts for all input
  * Data is formatted in an easy to read way.
* Are there any complicated parts of your code that can use comments for clarity?


### Step 8 - Refactoring

There are always ways to improve upon the code that we've written. While you're writing your application, or even once it's complete, there may be areas of your code that you can improve upon. Always make sure to test your changes so that you don't break any of your functionality.

* Are there functions that are very long, and should be broken down into smaller functions?
* Is there code that is repeated many times, and can be turned into a single function?
* Is there code that is very similar but with one small difference, which can be turned into a function with a parameter?
* Is there data that can be grouped together into a class?
* Do all data members and functions have the appropriate accessibility modifier set?
  * Private when it shouldn't be used outside of the class.
  * Public when it should be used outside of the class.
* Are there any literals that can be moved to a constant?
* Are there any variables at a class level scope, which could instead be a local scope?


## Homework

* Completing the in class assignment.