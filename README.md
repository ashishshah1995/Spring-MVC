# Spring-MVC

1. Framework for building web application.
2. Based on Model view controller design
3. It leverages features of core spring framework (IOC,DI)

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

1. Model objects- Contains your data, is like container to ship data between various part of MVC application

2. View templates are JSP pages or view page to render data- Common view template are JSP(Java Server pages) + JSTL(JSP standard tag library)

3. Controller classes are business/ processing logic - Handle the request, store/retrieve data, place data in model 

# Creating controller
1. Create controller class (@Controller)
2. Define controller method
3. Add request mapping to controller method (@RequestMapping)
4. Return view name
5. Develop view page


# Read Form data with Spring MVC
1. Create student class 
2. Create student controller class
3. Create html form
4. Create from processing code
5. Create confirmation page
HelloWorld Controller has 2 request mapping /showForm /processForm

# Adding Validation
## Developmnet process
1. Add validation rule to customer class
2. Display error message to html forms
3. Perform validation to controller class
4. Update confirmation page

To validate customer last name without white spaces we use @InitBiner annotation works as a pre processor
It will pre process each web request to our controller. We will use this to trim out string, removing leading and trailing white space, if string has whitespace  we trim it to null object

custom validation
