# Class 25 - August 16, 2018

## Agenda

* Servlets
  * https://drive.google.com/open?id=1yWq2kdyZgE6nnbDcu9tomRTq-Es1x-oWGYbhtfWQLUk
* JSP
  * https://drive.google.com/open?id=1NLeI0UKFgke43iHx4BXIE9EZluEGzlmK6k6XOkysACU

## Further Learning

* Video series on web development (we will not be focusing on javascript in this course)
  * https://www.youtube.com/watch?v=3JluqTojuME&list=PLoYCgNOIyGAB_8_iq1cL8MVeun7cB6eNc
* JSP and Servlets Tutorial
  * https://www.youtube.com/watch?v=Vvnliarkw48

## In-class Examples

(Not posted yet)

## Homework

Continuing from last class, take the pages that you've created for your website using html, and build on them to provide dynamic content:
* Convert your .html pages to .jsp pages and add them to your project
  * jsp pages will go under src/main/webapp/WEB-INF/views/
* Add any custom stylesheets you've created to your project
  * css files will go under src/main/webapp/styles/
* Create servlets to receive your requests and load any data.
  * Servlets are .java class files that will go under src/main/java/com/comit/ (assuming your package name is com.comit)
* Create service classes to provide data or functionality that your servlets will need.
* Use expression language to load your data from your servlet into your jsp page.
  * ${myAttributeName}