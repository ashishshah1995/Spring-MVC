# Spring-MVC

1. Framework for building web application.
2. Based on Model view controller design
3. It leverages features of core spring framework (Inversion of Control, Dependency Injection)

## Spring MVC benefits
1. The spring way of building web application UI's in java
2. Leverage a set of reusable UI components
3. Help manage application state for web requests
4. Process form data : validation, convresion
5. Flexible configuration for view layer

## Components of Spring MVC application
1. A set of web pages to layout UI compoenents
2. A collectin of spring beans(services)
3. Spring config(XML,annotation,java)

## MVC

1. **Model objects** contains your data, is like container to ship data between various part of MVC application

2. **View** templates are JSP pages or view page to render data- Common view template are JSP(Java Server pages) + JSTL(JSP standard tag library)

3. **Controller** classes are business/ processing logic - Handle the request, store/retrieve data, place data in model 

# Classes

## Hello World class

1. Created Spring home controller and view
2. Reading html form data (using *@RequestParam)*  which will read request parameter and binds to variable name
3. Added data to spring model

### Creating controller
1. Create controller class (@Controller)
2. Define controller method
3. Add request mapping to controller method (@RequestMapping)
4. Return view name
5. Develop view page

### Reading Form data with Spring MVC
1. Create student class 
2. Create student controller class
3. Create html form
4. Create from processing code
5. Create confirmation page

## Student class

1. Used form tags which support data binding

2. **@ModelAttribute** is bean object to bind form data to java objects

3. Understanding **path tag** 
In jsp page if there is *path="firstName";*  then when form is loaded Spring MVC will call student.getFirstName() to populate form field, if null then field will be empty,  when form is submitted spring will call setter method student.setFirstName()

### Following Spring MVC form tags are used 

1. Drop down list

2. Radio buttons

3. Checkbox 

## Customer class

### Following Hibernate form validation are used

1. Required fields
2. Validation number range (Min , Max)
3. Validation using regular expression
4. Custom validation


### Adding Validation
#### Development process
1. Add validation rule to customer class
2. Display error message to html forms
3. Perform validation to controller class
4. Update confirmation page

In case of Free passes field if the user enters String instead of integer then by using **@InitBinder** I created custom error message

**@InitBinder** works as pre processor. Every web request that process through controller this code will execute first. We will use this to trim out string, removing leading and trailing white space, if string has whitespace  we trim it to null object

#### Development process for custom Validation
1. Create custom validation rule

a - Create @CourseCode annotation

b- Create CourseCodeConstraintValidator

2. Add validation rule to customer class

3. Display error messsages on html form

4. Update confirmation page

