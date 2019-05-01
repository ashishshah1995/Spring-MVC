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

*  Create @CourseCode annotation

* Create CourseCodeConstraintValidator

2. Add validation rule to customer class

3. Display error messsages on html form

4. Update confirmation page

# Output

# HomePage
![1](https://user-images.githubusercontent.com/26305085/57001837-eb5d5f00-6b88-11e9-8714-ef9548736a17.PNG)

# Hello World (Image 1)
![2](https://user-images.githubusercontent.com/26305085/57001838-eb5d5f00-6b88-11e9-9a79-4171ec55b6ab.PNG)
# Hello World (Image 2)
![3](https://user-images.githubusercontent.com/26305085/57001831-eac4c880-6b88-11e9-80e5-25b8ca29200f.PNG)
# Student (Image 1)
![4](https://user-images.githubusercontent.com/26305085/57001832-eac4c880-6b88-11e9-9608-ee35248c3e6e.PNG)
# Student (Image 2)
![5](https://user-images.githubusercontent.com/26305085/57001833-eac4c880-6b88-11e9-9316-144448b9ebcf.PNG)
# Customer (Image 1)
![6](https://user-images.githubusercontent.com/26305085/57001834-eac4c880-6b88-11e9-920f-214c2e997bac.PNG)
# Customer (Image 2)
![7](https://user-images.githubusercontent.com/26305085/57001835-eb5d5f00-6b88-11e9-8649-6bd1814511f8.PNG)
# Customer (Image 3)
![8](https://user-images.githubusercontent.com/26305085/57001836-eb5d5f00-6b88-11e9-8c36-811e2b28fa25.PNG)


