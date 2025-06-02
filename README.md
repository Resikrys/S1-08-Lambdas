# SPRINT 1
## TASK 8: Lambdas

### LEVEL 1 - EXERCISE 1
Given a list of Strings, write a method that returns a 
list of all strings that contain the letter ‘o’. Print 
the result.

### LEVEL 1 - EXERCISE 2
You have to do the same as in the previous point, but now, 
the method must return a list with the Strings that in 
addition to containing the letter ‘o’ also have more than 
5 letters. Print the result.

### LEVEL 1 - EXERCISE 3
Create a list with the names of the months of the year. 
Print all the elements of the list with a lambda.

### LEVEL 1 - EXERCISE 4
Make the same print as the previous point, but using 
method reference.

### LEVEL 1 - EXERCISE 5
Create a Functional Interface with a method called 
getPiValue() that must return a double. From the main() 
of the main class, instantiate the interface and assign 
it the value 3.1415. Call the getPiValue() method and print 
the result.

### LEVEL 1 - EXERCISE 6
Create a list with numbers and text strings and sort 
the list with the strings from shortest to longest.

### LEVEL 1 - EXERCISE 7
With the list from the previous exercise, now sort it in 
reverse, from the longest chain to shortest.

### LEVEL 1 - EXERCISE 8
Create a Functional Interface that contains a method 
called reverse(). This method must receive and return a 
String. In the main() of the main class, inject the body 
of the method into the interface created using a lambda, 
so that it returns the same string that it receives as a 
parameter but in reverse. Invoke the interface instance 
by passing it a string and check if the result is correct.

### TECHNOLOGIES
| Package                    | Version | Description                |
|----------------------------|---------|----------------------------|
| `java`                     | ^24.0.1 | Principal project language |
| `java.util`                | ^24.0.1 | Java standard library      |
| `Apache maven`             | ^4.0.0  | Project management tool    |

### REQUIREMENTS
- Local environment: `IntelliJ or Eclipse`
- JDK 8 or superior
- Compatible file system (Windows, Linux, etc.)
###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

- Step 1: Create program's font code
- Step 2: Compile & Run the program

```bash
cd C:\Users\elyri\IdeaProjects\S1_08_Lambdas   # Go to root file directory
javac -d out src\s1_08_alambdas\*.java   # -d out indicates that the compiled .classes will be placed in an out folder
java -cp out s1_08_alambdas.Task8  # -cp out tells Java where to look for the .class
```