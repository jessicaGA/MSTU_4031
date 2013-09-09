<section data-background="images/teachers_college.jpg">
</section>

#MSTU 4031
##Intro To Object Oriented Programming


<div class="label">
<p>Teachers College Columbia University</p>
<p><strong>Basic Elements of Computer Programming cont</strong></p>
<p><strong>Variables, Data Types, Operators, Sequence, and Input</strong></p>
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

*	Pseudo Code
*	Thinking In Steps (Step by Step)<aside class="notes"> 

</aside>

---

<section data-background="images/Columbia.jpg">
</section>

#Command Line Basics

<div class="label">
<p>Working In The Terminal</p>
</div>

---

##Command Line

*	A way to navigate your computer file system with out using the mouse. 

*	How we compile and  run Java programs.

*	Some commands differ depending on your operating system.


<aside class="notes"> 
We are using the command line because we will be running Java application from text files. 
</aside>

---

##To The Terminal!


<aside class="notes"> 
Open you terminal by clicking on the magnifying glass on the upper right hand corner in your computer screen. Type "terminal" and press enter.

Complete the following commands while the finder window is open.
</aside>

---

##Recap - Terminal

	cd = > change directory
	mkdir => make a new directory
	rm -r => remove a directory
	rm => remove a file
	touch => create a file
	ls => List containts of a directory

<aside class="notes"> 
Note: Directory = Folder
</aside>

---

<section data-background="images/Columbia_sign.jpg">
</section>

#Intro To Java Programming

<div class="label">
<p> </p>
</div>

---

##What is Java?

*	Java is a high-level programming language*	Learning Java is just like learning a second language__YOU MUST PRACTICE__ your new language to become fluent in programming.

![](images/no_coffee.jpg)

<aside class="notes"> 

High-level programming languages, are written using “english like” words to code. This code is then translate into a language the computer can read.Java, Objective-C, C, C++, C#, Visual Basic, FORTRAN, and Cobol, among others are examples of high-level programming languages.Low-level programming languages, such as an Assembly Language, is a machine-dependent language that uses an assembler to translate  assembly language instructions (mnemonics) into machine code (Liang, 2008)

</aside>

---

##Pros Of Using Java
*	Universal language that can be used on any machine (i.e a microwave or a cell phone).
*	Java is a high-level language that is very similar to other languages. Learning java makes learning other programming languages easier. 
*	Lots of online resources to reference for ideas, and to learn more.

![](images/android-logo.png)

<aside class="notes"> 
In my personal experience learning Java has helped me jump into other language with a less steep learning curve. I <3 Java.
</aside>

---

##How Does Java Work?

```javac HelloJava.java```

```java HelloJava```

<aside class="notes"> 
Java source code is compiled “into a special type of machine-language code known as bytecode” (ibid).  This bytecode is then interpreted by the Java Virtual Machine (JVM).  By using the JVM, Java can be run on any computer with this software installedJava programs are written using a combination of reserved keywords and syntactical structures Our goal this semester is, in part, to learn what these keywords and structures are and how they are used to create a program.
</aside>

---

##Hello Kenny

<table>
<tr>
<td><b>Type</b></td>
<td>individual</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>5 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>Change the program to say hello Kenny</td>
</tr>
</table>

Hint open the Java file with Sublimetext.

---

##HelloJava Deconstructed

We make the program function as we want based on a series of statements.
<aside class="notes"> 

</aside>

---

##HelloJava Class

	public class HelloJava {

	}

<aside class="notes"> 
This is the class declaration. Every we write will start with this line.
HelloJava is the name of the file and can be anything so long as the name of the file. Is the same.
</aside>

---

##HelloJava ```main``` Method

		public static void main (String[] args){
		 
		}

*	Every Java program we will make in this course will utilize a ‘main method’*	A main method is the primary method used for creating statements and expressions.

<aside class="notes"> 
We will talk more about method in lesson 5. For now, know that every program you write must have a main method.  
</aside>

---

##HelloJava Comments

	//This is my first Java Program.
	
The program will ignore anything that is preceeded by two foward slashes ```//```

<aside class="notes">
Another type of text that we want to add to our program, but do not want Java to interpret during compilation, are called ‘comments’.Java uses three types of comments// (Two forward slashes denote a line comment)/* and */ (forward slash-asterisk then asterisk-forward slash are used to enclose a block comment (or multi-line comment))
</aside>
	
---


##HelloJava Functionality

	System.out.println("Print whats in here!");
	
Don't forget your ```" "``` qutation marks. Without them Java thinks that this it is a keyword or reference.
	
<aside class="notes"> 
What does HelloJava do? It <strong>prints</strong> a message to the console. 
The command to print to the command line is <code>System.out.println.</code>

A string is a line of literal textWhen creating source code we distinguish between words that Java (and, by direct association, the compiler and Java Virtual Machine) recognizes and words we want to display in our program.For this session we will manipulate simple string statementsStrings are lines of text placed between double quotes (“ “)
</aside>

---

##HelloJava Semicolon

![semicolon](images/SemiColon.png)

<aside class="notes"> 
EVERY statement of code must end with a semicolon. Trust me there will be times that you forget it and your program will not run.
</aside>

---

##In Class Lab

<table>
<tr>
<td><b>Type</b></td>
<td>Grous 3 - 4</td>
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

* We will share the answers at the end of class.

---

##Recap - MyPrintStatements


Sublime Text

<aside class="notes"> 

</aside>

---


##.java

<aside class="notes"> 
.java is the Java file extension. All code must be saved in a .java file.
</aside>

---

##In Class Lab

<table>
<tr>
<td><b>Type</b></td>
<td>  </td>
</tr>
<tr>
<td><b>Time</b></td>
<td> </td>
</tr>
<tr>
<td><b>Task</b></td>
<td> </td>
</tr>
</table>

* We will share the answers at the end of class.

---


<section data-background="images/arial_columbia.jpg">
</section>

#Variables & Data Types

<div class="label">
<p>Strings, Integers and Floats... Oh My!</p>
</div>

---


##Variables

	firstName = "Jessica";
	lastName = "Skeete";

<aside class="notes"> 
A variable can be thought of as a ‘container’ for valuesA variable name is created to reference this valueWhen a variable is created in your program memory is allocated to the program to hold this information (stored in RAM) and we refer to this information by name -- the variable name
</aside>

---



##Variable Declaration & Assignment

	String firstName; //Declaration
	
	firstName = "Jessica"; //Assignment
	
	String firstNAme = "Jessica"; //Declaration and assignment on the same line.
	
<aside class="notes"> 

Draw a picture of a cup here. 

Java is a strongly typed language, so you must first declare a a variable before you assign it a value. Both declaration and assignment can happen on the same line.
</aside>

---

##Varialbes - The Rules
*	Begins with a lowercase letter for the first word and use a capital letter for each word thereafter.  
*	Make sure your variable names are descriptive. 
Variable Examples: counter, firstName, lastName, nameOfDog	
![No Spaces](images/noSpaces.png)
<aside class="notes"> 

Java, just like any programming language, has a series of naming conventions that are used for creating clean, readable code.

</aside>

---


##Primitive Data Types
The type of data. 
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
<td>Single byte, range -128…127</td>
<td>1 bit</td></tr>
<tr>
<td>short</td>
<td>Short integer type, range -32768…32767</td>
<td>2 bytes</td></tr>
<tr>
<td>long</td>
<td>Long integer type</td>
<td>8 bytes</td></tr>
<tr>
<td><strong>double</strong></td>
<td>Double-precision floating-point type, about 15 significant decimal digits</td>
<td>4 bytes</td></tr>
<tr>
<td>float</td>
<td>Single-precision floating-point type, about 7 significant decimal digits</td>
<td>2 bytes</td></tr>
<tr>
<td>char</td>
<td>Character type</td>
<td>2 bytes</td></tr>
<tr>
<td><strong>boolean</strong></td>
<td>Truth values of true or false</td>
<td>1 bit</td></tr></table>
<aside class="notes"> 
A data type is simply a Java keyword that denotes the type of data that can be stored in a variableThese types are called primitive data types and there are six numeric, one alphabetic, and one logical data type in Java

</aside>

---

##Reference Data Types

For now lets just focus on strings!

	String name;	
<aside class="notes"> 
In Java, any class can be used as as a reference data typeAs we get into objects it will be important to know that any class, and by association any object, can be used as a reference typeFor now we are simply going to declare a variable of type ‘String’ and, later this class, use numerical operators to concatenate two or more variables or literal strings of text.

</aside>

---
##Variables.java


---


##MyVariables

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
<td>Write a Java application that uses 3 variables to print your name, department, major and years at TCC.</td>
</tr>
</table>
Make sure you choose descriptive names for variables.


---

##MyVariables - Recap
	
<aside class="notes"> 



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
My Computer Can Do __Math__We can use traditional math operators to have our program do math (+, -, *, /). 
and Java has given us a bonus %.

---

##Operator as Arithmetic

	i = 10 * 5;
	
What is i?<aside class="notes">The resulting value will be 50 and this value will be stored in the variable ‘i’ (assuming we’ve declared it of the appropriate type)</aside>
	j = i + 5;What is j?<aside class="notes">The resulting value will be 55</aside>

---

##Operator as Concatenation
	fullName = firstName + " " + lastName;<aside class="notes"> The resulting value will be the literal string of text stored in the firstName variable (which, in my example, would be Cameron), a space (denoted by an empty string), and the lastName variable value 
</aside>

---


<section data-background="images/columbia_alma.jpg">
</section>

#User Input

<div class="label">
<p>The Scanner Class</p>
</div>

---


##HelloScanner
When using the Scanner you must
*	Import the class.  ```import java.util.Scanner;``` 
<aside class="notes"> Java needs for us to explicitly tell it that we’re going to use a new class and that it is from the Utility library.  We do this with by putting the import statement at the top of our program.</aside>*	Create an instance of this Scanner class to use it in our program.  ```Scanner myScanner = new Scanner(System.in);```
<aside class="notes"> We will not go over what a class or object is for a few weeks, but we’re going to utilize them starting today. Notice that we’re now using ‘System.in’ in our program.  This is how we’re going to take in user input.
* Place the value from our user into a new variable.  This is done with the ‘next()’ method. ```String userAnswerOne = myScanner.nextLine();```
---

##TipCalculator

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
<td>Create an application that asks a user to enter the total amount of a restaurant bill and calculates 20% tip and returns the full amount to be paid.</td>
</tr>
</table>

## Homework


---

http://www.sublimetext.com/docs/2/osx_command_line.html