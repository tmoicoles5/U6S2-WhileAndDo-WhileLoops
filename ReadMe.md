# U5S2- while and do-while loops

* Part A - Foundations 6.2
* Part B - Foundations Practice
* Part C - Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `SquareRootWhile`.

#### Step 02

In the package `partA.ex01` modify `SquareRootWhile` per the following:

        Use a while loop to repeatedly prompt users to type a number until they type a non negative number. 
        If they type a non negative number, then compute the square root.

#### Step 03
 * Use the value 11 and run the unit tests 

Your program is working correctly, if when run, the following is the output:
```
Type a non-negative integer: -5
Invalid number, try again: -1
Invalid number, try again: 11
The square root of 11 is 3.166
```

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `SumOfNums`.

#### Step 02

In the package `partA.ex02` observe `SumOfNums` which sums up a
sequence of 10 integers that are input by the user.

* Can you implement the same by using a do-while loop?
* If the answer is yes, try it out!

* Use the value 11 and run the unit tests

Your program is working correctly, if when run, the following is the output:
```

The square root of 11 is 3.166
```


## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `DoWhileLoopDemoExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `DoWhileLoop1` per the following:

    Create a program that has an array of integers with five unique values
    Utilize a do/while loop to print out each of the unique elements of the array

Your program is working correctly, if when run, the following is the output:
```
43
55
68
91
105
```
#### Step 03

In the package `partB.ex01` complete the `DoWhileLoop2` class so that you print out only the EVEN numbers from 0 to 20.

Your program is working correctly, if when run, the following is the output.

> Use DoWhileLoopExample for reference.

```
 1 3 5 7 9 11 13 15 17 19
```

> Use DoWhileLoopDemoExample for reference.

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `WhileLoopDemoExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `WhileLoop1` per the following:

    Create a program that loops through numbers - beginning at 1 and up to 1,000
    As the program loops through each number, it should print out all of the even values
    Be sure to use a while loop to perform the loop and printing
    HINT: Remember to use a certain operator to perform the logical check for whether or not the number is even

Your program is working correctly, if when run, the following is the output:
```
2 is even
4 is even
6 is even
8 is even
10 is even
...
...
...
992 is even
994 is even
996 is even
998 is even
1000 is even
```

#### Step 03

In the package `partB.ex03` complete the `WhileLoop2` class so that it accepts an input called stop, and counts from 0 to the value of stop.

Your program is working correctly, if when run, the following is the output.


```
Please enter a number to count to: 
8
The Current Number is :0
The Current Number is :1
The Current Number is :2
The Current Number is :3
The Current Number is :4
The Current Number is :5
The Current Number is :6
The Current Number is :7
We are done
```

> Use WhileLoopDemoExample for reference.

## Part C
### Problem 1
Looking at your math worksheet, your given 2 number values of either positive or negative.
Evaluate a problem and find out if one of those numbers is positive and the other is negative.

Return true if one is negative and one is positive.

An exception to this is if the parameter "negative" is true, then only return true if both are negative.

Example:
```java
checkPosOrNeg(1, -1, false) --> true
checkPosOrNeg(-1, 1, false) --> true
checkPosOrNeg(-4, -5, true) --> true
```
### Problem 2
With the provided string, you need to exchange the first and last characters to create a new string.

Return the new string.

Example:
```java
exchange("code") --> "eodc
exchange("a") --> "a"
exchange("ab") --> "ba"
```


