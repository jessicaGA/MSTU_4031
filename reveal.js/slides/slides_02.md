<section data-background="images/teachers_college.jpg">
</section>

#MSTU 4031
##Intro To Object Oriented Programming


<div class="label">
<p>Teachers College Columbia University</p>
<p><strong>Basic Elements of Computer Programming cont</strong></p>
<p>(<strong>Variables, Data Types, Operators, Sequence, and Input</strong>)</p>
<p>Jessica T-Skeete Education Product Manager @ General Assembly</p>
</div>

---


##Agenda

*	Recap
*	Using The Command Line / Terminal
*	Intro to Java Programming
	*	.java files	
	*	"HelloJava.java"
	*	Variables & Data Types
	*	Operator Sequence
	*	User Input

---

##Recap

###In Class Tools (GitHub, Moodle & tlk.io)

<aside class="notes"> <ul>
	<li>You can view slides and all exercise materials on <a href="https://github.com/jessicaGA/MSTU_4031">GitHub</a></li>
	
<li>Moodle is where you will submit your assignments</li>

<li>tlk.io will be used for attendance and informal chat. (Kenny will monitor during the class.)</li>
</ul>
</aside>


---

###Recap

###What is Programming?

<aside class="notes"> 
__Programming__ is the task of writing instructions in a language that the computer can understand.
</aside>

---

###Recap

###What is Pseudo Code?

<aside class="notes">
Pseudocode is the process of writing a program without using the syntax of a programming language.
</aside>

---

<section data-background="images/Columbia.jpg">
</section>

#Command Line Basics

<div class="label">
<p>Working In The Terminal</p>
</div>

---

##Command Line Basics

*	A way to navigate your computer file system without using the mouse. 

*	How we compile and run Java programs.

*	Some commands differ depending on your operating system.


<aside class="notes"> 
For the first 4 weeks we won't use an IDE (integrated development environment) instead we will compile and run files from the terminal. So we need to learn some commands
</aside>

---

##To The Terminal!


<aside class="notes"> 
Open your terminal by clicking on the magnifying glass on the upper right hand corner in your computer screen. Type "terminal" and press enter.
</aside>

---

##Recap - Terminal

	cd = > "change directory"
	mkdir => "make a new directory"
	rm -r => "remove a directory"
	rm => "remove a file"
	touch => "create a file"
	ls => "List contents of a directory"

<aside class="notes"> 
Note: Directory = Folder

Ask the students to create a MyJava.java file.
</aside>

---

<section data-background="images/Columbia_sign.jpg">
</section>

#Intro To Java Programming

<div class="label">
<p>A high-level explanation of how Java works</p>
</div>

---

##High-level programming language


<aside class="notes"> 

Draw encapsulation / abstraction 

set expectation about the level of understanding required for the course.

High-level programming languages, are written using “english like” words to code. This code is then translate into a language the computer can read.Java, Objective-C, C, C++, C#, Visual Basic, FORTRAN, and Cobol, among others are examples of high-level programming languages.Low-level programming languages, such as an Assembly Language, is a machine-dependent language that uses an assembler to translate  assembly language instructions (mnemonics) into machine code (Liang, 2008)

</aside>

---

##```HelloJava.java```

![](images/no_coffee.jpg)

```javac HelloJava.java```

```java HelloJava```

<aside class="notes"> 
Java source code is compiled “into a special type of machine-language code known as bytecode” (ibid).  This bytecode is then interpreted by the Java Virtual Machine (JVM).  By using the JVM, Java can be run on any computer with this software installedJava programs are written using a combination of reserved keywords and syntactical structures Our goal this semester is, in part, to learn what these keywords and structures are and how they are used to create a program. - Cameron Fadjo MSTU 4031 slides.
</aside>

---


##How Does Java Work?

The Java Development Kit includes all the pieces required to develop java applications. 

<aside class="notes"> 
Mac OSX 10.5 comes with the JDK already installed. YAY!!!
</aside>

---


##How Does Java Work?

Some important parts of the __JDK__ include:

__javac__ (the java compiler)

__JVM__ (Java Virtual Machine)

<hr>
We will talk about these later.

__JRE__ (Java Runtime Environment) 

__Java packages__ and framework classes - We will talk about this later too.

<aside class="notes"> 
Mac OSX 10.5 comes with the JDK already installed. YAY!!!
</aside>

---


##How Does Java Work?

###```javac MyJavaFile.java```

###```java MyJavaFile```


<aside class="notes"> 
<blockquote>
Once the program is completed the programmer would compile the java source code using the java compiler. The output of the compiler is a .class file.

Your Test.java is a Java source text file while the Test.class file is in an intermediate Java-byte code file, this file is actually the machine independent intermediate code that can be executed on any computer with the JRE installed.
<p> - Simon Slangen in What Is The Java Virtual Machine & How Does It Work?</p>
</blockquote> 

The JDK includes pieces that bring our code closer and closer to machine language.

</aside> 

---

##Write once, run everywhere.

Your Java application runs on the __JVM__ not your hardware.

<aside class="notes"> 
	<blockquote>
		Since your applications run in a virtual machine instead of directly on your 		hardware, the developer can program and build their application once, which can then 		be executed on every device with an implementation of the Java Virtual Machine.
		<p> - Simon Slangen in What Is The Java Virtual Machine & How Does It Work?</p>
	</blockquote> 
</aside>

---


##Hello Kenny

<table>
<tr>
<td><b>Type</b></td>
<td>Individual</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>10 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>Change HelloJava program so it prints Hello Kenny</td>
</tr>
</table>

Hint open the Java file with Sublimetext.

---

##HelloJava Deconstructed

We make the program function as we want based on a series of statements.
<aside class="notes"> 

</aside>

---

##HelloJava __class__

	public class HelloJava {

	}

<aside class="notes"> 
This is the class declaration. Every we write a Java Application, we will start by writing this line.
HelloJava is the name of the file and can be anything so long as the class name and file are the same.
</aside>

---

## HelloJava __main__ Method

		public static void main (String[] args){
		 
		}

*	Every Java program we make in this course will utilize a "main method"*	A main method is the primary method used for creating statements and expressions.

<aside class="notes"> 
We will talk more about methods in lesson 5. For now, know that every program you write must have a main method.  
</aside>

---

##HelloJava __Comments__

	//This is my first Java Program.
	
The program will ignore anything that is preceded by two forward slashes ```//```

<aside class="notes">
Another type of text that we want to add to our program, but do not want Java to interpret during compilation, are called ‘comments’.Java uses three types of comments// (Two forward slashes denote a line comment)/* and */ (forward slash-asterisk then asterisk-forward slash are used to enclose a block comment (or multi-line comment))
</aside>
	
---


##HelloJava __Functionality__

	System.out.println("Print whats in here!");
	
Don't forget your ```" "``` quotation marks. Without them Java thinks that this it is a keyword or reference.
	
<aside class="notes"> 
<p>What does HelloJava do? It <strong>prints</strong> a message to the console.</p>
<p>The command to print to the command line is <code>System.out.println.</code></p>
<p>When creating source code we distinguish between words that Java (and, by direct association, the compiler and Java Virtual Machine) recognizes and words we want to display in our program.For this session we will manipulate simple string statements.Strings are lines of text placed between double quotes (“ “)</p>
</aside>

---

##HelloJava __Semicolon__

![semicolon](images/SemiColon.png)

<aside class="notes"> 
EVERY statement of code must end with a semicolon. Trust me there will be times that you forget it and your program will not run.
</aside>

---

##```My Print Statements```

<table border="1">
<tr>
<td><b>Type</b></td>
<td>Individual</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>15 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>
	<ul>
		<li>Launch ‘Sublime Text’</li>
		<li>Save the file to the desktop as ‘MyPrintStatements.java’ (Case-Sensitive)</li>
		<li>Write code to print your name, program, degree, and your favorite T.V show.</li>
	</ul>
</td>
</tr>
</table>

---

##Recap - MyPrintStatements


Sublime Text


<aside class="notes"> 
Do you like this style of code along?
</aside>

---

<section data-background="images/arial_columbia.jpg">
</section>

#Variables & Data Types

<div class="label">
<p>Strings, Integers and Floats... Oh My!</p>
</div>

---

##Variable Declaration & Assignment

	int age; //Declaration
	
	age = 20; //Assignment
	
	int age = 20; //Declaration and assignment on the same line.
	
<aside class="notes"> 

Java is a statically typed language, so you must first declare a a variable before you assign it a value. Both declaration and assignment can happen on the same line.
White board the cup demo.


A variable can be thought of as a ‘container’ for valuesA variable name is created to reference this valueWhen a variable is created in your program memory is allocated to the program to hold this information (stored in RAM) and we refer to this information by name -- the variable name

</aside>

---

##Variables - The Rules
*	Begins with a lowercase letter for the first word and use a capital letter for each word thereafter.  
*	Make sure your variable names are descriptive. 

<hr>Variable Examples: 
```counter, firstName, lastName, nameOfDog```	
![No Spaces](images/noSpaces.png)
<aside class="notes"> 

Java, just like any programming language, has a series of naming conventions that are used for creating clean, readable code.

</aside>

---


##Primitive Data Types
<table>
<tr>
<td>Type</td>
<td>Description</td>
<td>Size</td></tr>

<tr>
<td><strong>int</strong></td>
<td>Whole numbers, range of about 2 billion</td>
<td>4 bytes</td></tr>
<tr>
<td>byte</td>
<td>Single byte</td>
<td>1 bit</td></tr>
<tr>
<td>short</td>
<td>Short integer type, range</td>
<td>2 bytes</td></tr>
<tr>
<td>long</td>
<td>Long integer type</td>
<td>8 bytes</td></tr>
<tr>
<td><strong>double</strong></td>
<td>Double-precision floating-point, about 15 significant decimal digits</td>
<td>4 bytes</td></tr>
<tr>
<td>float</td>
<td>Single-precision floating-point type, about 7 significant decimal digits</td>
<td>2 bytes</td></tr>
<tr>
<td><strong>boolean</strong></td>
<td>Truth values of true or false</td>
<td>1 bit</td></tr>
<tr>
<td>char</td>
<td>Character type</td>
<td>2 bytes</td></tr>
</table>
<aside class="notes"> 
A data type is simply a Java keyword that denotes the type of data that can be stored in a variable.These types are called primitive data types and there are a total of 8 primitive data types (six numeric, one alphabetic, and one logical data type) in Java.

</aside>

---

##__Reference__ Variables

For now lets just focus on  __Strings__

	String firstName = "Jessica";
	String lastName = "Skeete";	
<aside class="notes"> 

Show intro to understanding references. Draw picture of memory and points.

When using strings we need to wrap literal text in quotation marks.
</aside>

---


##```Variables.java```

Practice with ```String```, ```int``` and ```float```. 

---


##My Variables

<table>
<tr>
<td><b>Type</b></td>
<td>Individual</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>20 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>Write a Java application that uses 3 variables to print your name, department, major and phone number. Name the file MyVariables.java</td>
</tr>
</table>
Make sure you choose descriptive variable names.


---

##MyVariables - Recap
	
<aside class="notes"> 

Have one students share what they did.

</aside>

---


<section data-background="images/Columbia_sign.jpg">
</section>

#Operators

<div class="label">
<p>addition(+), subtraction(-), multiplication(*), division(/), and remainder/modulus(%).</p>
</div>

---

##Operators
*	We can use traditional math operators to have our program do math :
###__+__ , __-__, __*__, __/__ , __%__

---

##Operator as __Arithmetic__

What is i?
<hr>

```
int i;
i = 10 * 5;
```<aside class="notes">The resulting value will be 50 and this value will be stored in the variable ‘i’ (assuming we’ve declared it of the appropriate type)</aside>

---

##Operator as __Arithmetic__

i = 50 

What is j?

<hr>
```j = i + 5;```<aside class="notes">The resulting value will be 55</aside>

---

##Operator as __Concatenation__
	firstName = "Floyd"
	lastName = "Mayweather"
	suffix = "jr"	
	fullName = firstName + " " + lastName;How would be concatenate "jr"?
<aside class="notes">	The resulting value will be the literal string of text stored in the fullName variable (which, in my example, would be Floyd Mayweather).</aside>

---


<section data-background="images/columbia_alma.jpg">
</section>

#User Input

<div class="label">
<p>The Scanner Class</p>
</div>

---


##```HelloScanner.java```

---

##Hello Scanner Recap

```
import java.util.Scanner;
Scanner myScanner = new Scanner(System.in);
String userAnswerOne = myScanner.nextLine();
```


*	Java needs for us to explicitly tell it that we’re going to use a new class and that it is from the Utility library. 
	
*	Create an instance of this Scanner class to use it in our program. 
	
*	Place the value from our user into a new variable. 	<aside class="notes">
We will not go over what a class or object is for a few weeks, but we’re going to utilize them starting today. Notice that we’re now using ‘System.in’ in our program.  This is how we’re going to take in user input.
</aside>
---

## Homework

*	[Lab Assignment 1](https://github.com/jessicaGA/MSTU_4031/tree/master/Lesson_01)

*	Read [What is The Java Virtual Machine & How Does It Work](http://www.makeuseof.com/tag/java-virtual-machine-work-makeuseof-explains/) by Simon Slangen

---


##Tip Calculator

<table>
<tr>
<td><b>Type</b></td>
<td>Individual</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>30 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>Create a Java application (TipCalculator.java). 
	<ul>
		<li>Your application should prompt the user for the total amount of their restaurant bill.</li> 
		<li>Your application should take the total amount and calculate 20% tip. </li>
		<li>Display to the user the amount of tip to be paid and the total including the tip.</li>
	</td>
</tr>
</table>

---


##References

*	Cameron Fadjo MSTU 4031 FALL 2010 slides
*	Slangen, S. What Is The Java Virtual Machine & How Does It Work? Retrieved September 12, 2013, from [http://www.makeuseof.com/tag/java-virtual-machine-work-makeuseof-explains/]()
*	Wikijunior. Programming for Kids/What is Programming? Retrieved September 12, 2013, from [http://en.wikibooks.org/wiki/Wikijunior:Programming_for_Kids/What_is_Programming%3F]()
*	Kashif, M.. The Common Language Runtime (CLR) and Java Runtime Environment (JRE) Retrieved September 12, 2013, from [http://www.codeproject.com/Articles/1825/The-Common-Language-Runtime-CLR-and-Java-Runtime-E]()

---

