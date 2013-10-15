#MSTU 4031
##Intro To Object Oriented Programming


<div class="label">
<p>Teachers College Columbia University</p>
<p><strong>Methods, Test I/O, Exception Handling</strong></p>
<p>Jessica T-Skeete Education Product Manager @ General Assembly</p>
</div>

---

##Agenda

*	Recap
	*	Quick Fire
	*	Assignment 2		
*	Methods
*	Text I/O
*	Exception Handling
	
---


##Syllabus

Changes

---

##Recap


Quick Fire

---


##Recap

Assignment 2

---

#Methods

<div class="label">
<p>Methods, Functions, Subroutines</p>
</div>

---

##Methods

jCards => Grading Algorithm

<aside class="notes"> 

Two sets of cards that executed a small/ particular function in a larger program.

Assignment Grader, LetterGrade Converter
</aside>

---

##Methods

<blockquote>"A construct for grouping statements together to perform a function"</blockquote> - Liang, 2008, p. 142

---


##Methods

You need two things: 

*	Method Call
*	Method Definition

---

##Method Example

SimpleMethod.java

---

##Vocab Words Refactor

Your job is to create an application for English teachers.

<table>
<tr>
<td><b>Type</b></td>
<td>Paired</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>15 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>
	Create method that prints "Enter (1) to add a word (0) to quit." in the VocabWords.java exercise.
</td>
</tr>
</table>

---

##Method Calls

We've seen them before:

---

##Method Calls

![](../images/nextLineMethod.png)

---


##Method Calls

![](../images/equalsIgnoreCaseMethod.png)

---

##Method Calls

![](../images/addMethod.png)

---

##Method Definition

We've seen this:

![](../images/mainMethod.png)

---


##Method Breakdown

![](../images/methodBreakDown1.png)

---


##Method Header

![](../images/methodBreakDown2.png)

---


##Method Header

![](../images/methodBreakDown4.png)

---


##Method Header

*	Method declarations, the header of a method, contain:

---


##Method Declarations: Access Modifiers 

The three types of access for methods are:

---


##Method Declarations: Return Types 

*	When a method returns nothing, then it is of type __void__
---


##Method Body

![](../images/methodBreakDown3.png)

<aside class="notes">
This method includes a return statement. 


</aside>

---

##Method

AreaCalculator.java

---

##Area Of A Triangle and Circle



<table>
<tr>
<td><b>Type</b></td>
<td>Paired</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>25 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>
	<ul>
		<li>Add a method to calculate the area of a triangle and circle.</li>
	</ul>
</td>
</tr>
</table>

---

##Instance vs Class Methods


What's up with the dot? 

---


##Instance vs Class Methods


There are two main ways to differentiate between methods in Java (or any OOP language):
---

##Instance vs Class Methods


1.	Instance Methods:


<aside class="notes"> 

An Instance Method is associated with a particular instance of an object.  When we get to classes and objects we will be creating instance methods.

</aside>

---



##Instance vs Class Methods

Instance Method

*	petNames.add(2,"Rover");  

---

##Instance vs Class Methods




---


#Text i/o

<div class="label">
<p>Input Output</p>
</div>

---

##BirthdayWriter.java

---

##BirthdayReader.java

---


##Saving Data To A File



---

##The File Class

*	Provides an abstraction for dealing with the machine-dependent complexities of files and path names in a machine-independent manner



##The PrintWriter Class

*	Used to write data to a text file ```java.io.PrintWriter```

</aside>

##The Scanner Class




#Exceptions

<div class="label">
<p>Try and Catch</p>
</div>

---

##Exceptions

Less Severe

<aside class="notes">

<blockquote>An exception is an unexpected or error condition” </blockquote> - Farrell, 2008


</aside>

---

##Types of Errors

```
public class MathError
```
---

##Types of Errors

computer:desktop user$ java MathError
at MathError.main(MathError.java:6)
```

---


##Exceptions

Java has three basic classes of errors:

*	__Error__ - internal system errors

---

<section data-background="../imagescolumbia_alma.jpg">
</section>

#MidTerm

<div class="label">
<p>Everything Up Until This Point</p>
</div>

---


##Midterm Project

Due: __October 23rd, 2013__

*	Design, develop, and demonstrate a proposed Java programming project to the class.

<aside class="notes"> 


</aside>

---

##Midterm Presentations

Present your project with five slides:


---

##Technical Requirements

Create a program of your choice that: 

*	Utilizes arrays (arrayslist)
*	Loops
*	Conditionals
*	Text i/o
*	Exception Handling

3 points awarded for level of complexity.


---


##Assignment

<table>
<tr>
<td><b>Type</b></td>
<td>Paired</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>Remainder Of Class</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>
	Find areas where you can utilize methods in VocabList and assignment 3
</td>
</tr>
</table>

*	Ask yourself, what needs to be returned?

*	What should be passed as arguments?

---

##References

Cameron Fadjo MSTU 4031 Fall 2010 slides.



