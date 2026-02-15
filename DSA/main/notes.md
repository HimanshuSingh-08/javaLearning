# Java Practice-Learning

Day : 10/05/25

- Difference use case for the length in java.

![image.png](Java%20Practice-Learning/image.png)

Day :24/05/25

- If we want to check if a particular char is present in a specific string then in that case we have :
    - :  → str.contains(”char”) : It will return yes if a char is present in the string.
    - : → str.indexOf(char)  ≠ -1  : This will also helps to check in this case we dont have to pass the char into “” this format.
    -

Day :07/06/25

- In java in System.out.println() what ever we mention in with “+” sign then. All values together get converted in to the string first then added to the string present in the first.
- We cant create a numberic literal in Java, that exceeds Integer.MAX_VALUE, without using the ‘L’ suffix, we always going to have the error in the compiler.
- Double data type is the default type for the decimal and precise about the numbers. So when we create any number then in that case if didnt indicated with the suffix f the it is going to give an error.
- Type cast converting a specific type of Data Type value into a different one eg :

  ![image.png](Java%20Practice-Learning/image%201.png)


Note : In java Double is more precise then the float value and java by default uses the double.

: float myotherValue = 5.25 ;

This will give error as 5.25 number is double 5.25 so assigning it to a float will raise the compiler error.

Strings :

Day:09/06/25

- Method : This are nothing but functions in which we use to make the code more modular.

eg : simplest way of declaring a method is

publikc static void methodName(){} → IT takes no data in and returns no data from the method which is what the special word void means in this declaration

Day : 19/06/2025

- Getter and setter functions : These are the most important functions in the class to set and get access to the values which are present in the class declartion.
- Use case : One of the most important use case for these function is that : we can set up all the rules related to that class which will help us to manage the edge cases.
- A constructor dont call any setter function.
- one constructor can call another consrturctor  to set values.
- IF we have created a constructor with some parameters and we try to create and default constructor again then sometimes it wont work properly.

Day :23/06/2025

- Imp : we dont use the static keywords while defining the data members of the class like this eg :

  public static String name;

  Reason being :- The instances created by using this class will use this same static member and every instance will point to same variable. If we change value for one of the instance then it will change the value for all the instances.

- Point to remember is that static variables are shared by all the instances therefore avoid to use them while creating the class. Use regular instances for creating classes.
- Within same class we dont need to use class name prefix for the methods we can directly use the methods.

Day : 24/05/26

- Concept of super in the child class.

![image.png](Java%20Practice-Learning/image%202.png)

![image.png](Java%20Practice-Learning/image%203.png)

Date : 29/06/25

- when we are dealing with the multidimension arrays in java we for this

  int[][] temp = new int[3][];

  we are initializing an  array with the 3 rows and now columns with specific values. So the point to keep in head is that they length of this array can be any thing and it not needed that it should be of 3 or something.


Great initiative, Himanshu! Java's `ArrayList` is a powerful and flexible alternative to arrays. Below are **examples of common `ArrayList` methods** along with their functions.

---

### ✅ **Importing & Basic Setup**

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits); // [Apple, Banana, Mango]
    }
}

```

---

### 🔧 **Common Methods with Examples**

### 1. **add()** – Add element to end

```java
fruits.add("Orange");  // [Apple, Banana, Mango, Orange]

```

### 2. **add(index, element)** – Insert at specific index

```java
fruits.add(1, "Grapes");  // [Apple, Grapes, Banana, Mango, Orange]

```

### 3. **get(index)** – Get element

```java
String fruit = fruits.get(2);  // Banana

```

### 4. **set(index, element)** – Update element

```java
fruits.set(0, "Pineapple");  // [Pineapple, Grapes, Banana, Mango, Orange]

```

### 5. **remove(index or object)** – Remove by index or value

```java
fruits.remove(2);          // Removes "Banana"
fruits.remove("Orange");   // Removes "Orange" by value

```

### 6. **size()** – Get number of elements

```java
int count = fruits.size();  // 3

```

### 7. **contains()** – Check if an element exists

```java
boolean hasMango = fruits.contains("Mango");  // true

```

### 8. **isEmpty()** – Check if list is empty

```java
boolean empty = fruits.isEmpty();  // false

```

### 9. **clear()** – Remove all elements

```java
fruits.clear();  // []

```

---

### 🔁 **Looping Through an ArrayList**

### For-each loop:

```java
for (String fruit : fruits) {
    System.out.println(fruit);
}

```

### Index-based loop:

```java
for (int i = 0; i < fruits.size(); i++) {
    System.out.println(fruits.get(i));
}

```

---

### 🔄 Example: Integer List Sorting

```java
import java.util.*;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(2);
numbers.add(8);

Collections.sort(numbers);  // Sort ascending
Collections.reverse(numbers); // Descending

System.out.println(numbers);  // [8, 5, 2]

```

---

Would you like a [cheat sheet of ArrayList methods](https://chatgpt.com/c/f), or a small assignment to practice with them?

## DSA - Learning

### Strings and StringBuilder in Java

- Strings are immutable which means object created by an object can not be modified.
  For ex ➖

```jsx
String a = "Himanshu" ;
a = "Singh";
```

In the above case it the “Himanshu” is not get changed what happened is that new reference is created for “singh” object and assigned to “a”

- StringPool : It is a special memory in heap where strings are stored so when ever we try to create any object and point it to a reference it checks if it is present in memory in case it is present is assigns it to the variable. It never happens that the current object is getting modified or changed.

What happens with the string remains in the memory then ?

- For those we have a garbage collector so for every run it checks whether a specific string is assigned with any reference or not. In case if it is not assigned to any of the reference it automatically get deleted from the memory.

## Concept of “==” and .equals.

- “==” method basically checks the references. If two or more variables are pointing to same variable then it gives true else it gives false.

when do we create a new object with same value in it ?

- For this “**new” keyword** helps us to create different objects with same value but different references.

```jsx
String a = new String("Himanshu");
String b = new String("Himanshu");  
```

These above two are different objects in a memory with same values but with different references.

- “.equals” method : whenever we  want we want to check if the underlining values are same in that case we use the .equals method.

Note : println() - whatever data type u give through this method it always going to give you the string as output so remember this.

### Concept of toString while printing

- While we want to print anything we use the println() function with the plus operator

```jsx
println('a' + 1);
println("himanshu" + new ArrayList());
```

Note : Thing to keep in mind is that to use the + sign or any thig with the plus operator one operand should be the string in case we want to do the concatenation.

Note : Java doesnt allow to overload the operators but it has a exception for the plus operator. It has exception for the string as it supports for the concatenation for the string.

## Concept of StringBuilder

- If we want to construct a string considering using the for loop what actually happens is it uses the existing string then take the sub part that we are going to add to the current string and then it creates an other object or string with the addition of two.
- The problem is that for every operation it is creating a new string and using it for the further operation which is waste of memory as we are aware ki we string are immutable.

```jsx
StringBuilder builder = new StringBuilder();
// This actually helps us to  perform the operation on the current string itself instead
// creating a new string ojbect everytime
```

Note : Always remember if we have class for anything in java for anytype of datatype then keep in mind it is going to have some sort of helper function to manipulate that datatype. For ex here in stringbuilder we do have certain type of java function like deleteCharAt() etc.

## Concept of recursion

- When a function calls itself again and again till it reaches to a specific condition then it is called recursion. The condition it tries to reach is called as the base condition. without base condition or any restricting condition the function will go in a infinite loop.
- Some important point to keep in mind while dealing with the recursion.
    - Identify if you can break the problem into smaller one :- Because agar wo smaller problem me breakable hai to waha pe ham recursion ko use akre sakte hai.
    - Write the recurrence relation for the problem if needed
    - Draw the recursive tree  if needed.

  About the tree :

    - See if the flow of function how is the value passing and how they are getting stored in the stack.
    - Identify and focus on left tree calls and the right tree calls.Use debugger to get in depth understanding
    - See how the values are and what types of values (int, string,) are getting used by the function and returned at each step
- Types of recurrence relation
    - Linear relation - fibo
    - Divide and Conquer relation( Search Space reduced by a factor) - Binary Search

  Example of fibonacci series for -

    ```jsx
                                  fib(4)
                                 /      \
                            fib(3)        fib(2)
                           /      \        /      \
                      fib(2)     fib(1)  fib(1)  fib(0)
                     /      \
                fib(1)     fib(0)
    
    ```


Note :- Yaha pe ek cheez hai if you notice you will find that ki we are doing some calculation repeatedly which we should avoid. Iski liye hi ham karte hai dynamic programming using different techniques which helps us to optimise our code memory wise.

- Vairables [imp] -
    - Arguments : Which get passed in every future function call.
    - Return Type :
    - Body function :

Modulo Properties and Concept : 
