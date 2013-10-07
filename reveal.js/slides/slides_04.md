<section data-background="images/teachers_college.jpg">
</section>

#MSTU 4031
##Intro To Object Oriented Programming


<div class="label">
<p>Teachers College Columbia University</p>
<p><strong>Collections</strong></p>
<p>(Arrays & Array List)</p>
<p>Jessica T-Skeete Education Product Manager @ General Assembly</p>
</div>

---

##Agenda

*	Review
*	Quick Fire
*	More About Strings
*	Collections
	*	Arrays
	*	Array List
	*	Traversing Collections	
	
---

##Recap

[BottlesOfBeer.java](../Lesson_03/solution/BottlesOfBeer.java)

---

<h2><strong>QuickFire<strong></h2>

---


##QuickFire
###30min

"Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz". 

---

##QuickFire

###FizzBuzz OutPut
1

2

Fizz

4

Buzz

Fizz

7

8

Fizz

Buzz

11

Fizz

13

14

FizzBuzz

16

17

..

<aside class="notes"> 

<a href ="http://imranontech.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/"> Using FizzBuzz to Find Developers who Grok Coding</a>
</aside>

---


<section data-background="images/take_break.jpeg">
</section>

<div class="label"> 
<h1>10 min</h1>
</div>

---

<section data-background="images/Columbia.jpg">
</section>

#More About Strings

<div class="label">
<p>Strings; what are they really?</p>
</div>

---

##Strings

String university = "Columbia";

![strings as array](images/string_charArray.png)

<aside class="notes"> 

</aside>

---


##Strings

StringAsArray.java

<aside class="notes"> 

Highlight that just like with .equalIgnoreCase this is a method given to us by Java.
The strings acts like an "array of characters."

Show StringAsArray.java
</aside>

---

##Array Indexes

![array indexes](images/string_index.png)


```
	university.charAt(0);
	university.charAt(3);
```

<aside class="notes"> 
Also draw what this looks like in memory. Each element points to a place in memory.

</aside>

---


<section data-background="images/columbia_alma.jpg">
</section>

#Introduction To Data Structures

<div class="label">
<p>Brief Intro</p>
</div>

---


##Data Structures

Today we're going to expand the concept of data types to include the computer science-related term 'Data Structures'

<aside class="notes"> 

Notes

</aside>

---


##Data Structures

<blockquote>a collection of data organized in some fashion. [This] structure not only stores data but also supports operations for accessing and manipulating the data</blockquote> 

(Liang, 2008, p. 706)

<aside class="notes"> 

So, its not one piece of data, for example a String name, it is a collection of String names.

</aside>

---


##Data Structures

<blockquote>a particular way of storing and organizing data in a computer so that it can be used efficiently</blockquote> 

[Wikipedia](http://en.wikipedia.org/wiki/Data_structure), retrieved on 10/10/2009)

---


##Data Structures

*	__Linear Data Structures__

---

<aside class="notes"> 

Note: Please Note: Not all types will be covered in this course, but are presented here for illustrative purposes.

</aside>

---

<section data-background="images/Columbia_sign.jpg">
</section>

#Arrays

<div class="label">
<p>Immutable Arrays</p>
</div>

---

##Arrays

MyFirstArray.java


<aside class="notes"> 

Code along from scratch.

</aside>

---


##MyFirstArray

![Array Illustration](images/array_breakdown.png)


<aside class="notes"> 

write how to access specific elements on the board. 

arrayWithValues[3];

</aside>

---


##Arrays

*	Fixed Size
	1.	When you create an array you can initialize it with a set of values

<aside class="notes"> 

</aside>

---

##Exercise

<table>
<tr>
<td><b>Type</b></td>
<td>Paired</td>
</tr>
<tr>
<td><b>Time</b></td>
<td>10 min</td>
</tr>
<tr>
<td><b>Task</b></td>
<td>
	<ol>
		<li>Create and array with 3 elements.</li>
	</ol>
</tr>
</table>

---


##Quick Answer

```java
	public class SimpleArray{

<aside class="notes"> 


</aside>

---

##Looping Through Arrays

ArrayForLoop.java

<aside class="notes"> 


</aside>

---


##Looping Through Arrays

With the for loop we can utilize one System.out.println to successively execute a similar statement while assigning input to the array:

```java
```

<aside class="notes"> 

What is happening here?

</aside>

---


##Array Class

<blockquote>The Arrays class contains various static methods for sorting and searching arrays, comparing arrays, and filling array elements</blockquote> 


(Liang, 2008, p. 202)
<aside class="notes"> 

</aside>

---

##Array Class

The Arrays class is in the java.util package, so we need to import it in order to use it in our program.

<aside class="notes"> 
We've seen this package before, remember java.util.Scanner? For simplicity sake lets bring in the whole package.

</aside>

---

##Google It

.sort

```

<aside class="notes"> 
What happens in this method?
.sort: sort a whole array or a partial array
</aside>

---


##Google It

. equals

	int[] list1 = {6, 8, 3, 2, 10};
```

<aside class="notes"> 

Which statement will evaluate to true?

Equals: checks whether two arrays are equal
</aside>

---



##Google It

.fill

int[] list1 = {6, 8, 3};

<aside class="notes"> 

Identify the method that fills values to the whole array?

Fill: used to fill in all or part of the array

</aside>

---


<section data-background="images/arial_columbia.jpg">
</section>

#ArrayList

<div class="label">
<p>Mutable Arrays</p>
</div>

---

##ArrayList

ArrayListAnswer.java

---


##ArrayList

*	add("what you are adding")



<aside class="notes"> 

Draw diagram on the board.

see <a href="http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html">Java API</a> for more info

</aside>

---


## Assignment

Create a program that allows a school Education Technologist to keep track of the computers in the building. 

---


## Assignment

---

## Assignment Bonus



##Lab / Exercise

Your job is to create an application for English teachers.

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
<td><b></b></td>
<td>
	<ul>
		<li>This application should allow teachers to create a list of words that will be used in this weeks vocabulary test. </li>
		<li>There is no fixed amount of words in any vocabulary list. Let the user add until they wish to stop.</li>
		<li>The application should handle word duplication in a list.</li>
		<li>When complete, let the instructor know what their vocab list looks like, print a list of the words to the terminal. </li>
	</ul>
</td>
</tr>
</table>

---

##References

Cameron Fadjo MSTU 4031 Fall 2010 slides.



