# Cheat Sheet 

This cheat sheet contains the most important takeaways that lead up to section six.

## 1. Getting Started
    - class: contains all of your code.

    - main(): entry point of your app.

    - javac <file-name>.java: compiles your code.

    - java <file-name>: runs the compiled code.

_____

## 2. Variables
Data types

There are 6 main data types.

| Data Type     | Value                     |
| ------------- | ------------------------- |
| int           | Whole numbers             |
| long          | Very large whole numbers  |
| double        | Decimals                  |
| String        | Text                      |
| char          | A single character        |
| boolean       | true or false             |

`long` can store very big numbers. But, int is faster and takes less memory.

| Variable Type | Amount of Memory (Bytes)  | Valid Range of Values             | 
| ------------- | ------------------------- | --------------------------------- |
| int           | 4                         | from: -2147483648                 |
|               |                           | to: 2147483647                    |
| long          | 4                         | from: -92233720336854775808       |
|               |                           | to: 92233720336854775807          |

**Math Operators**

| Operator | Operator Name    | Operator Function                   | 
| -------- | ---------------- | ----------------------------------- |
| +        | Plus             | Adds numbers and strings together   |
| -        | Minus            | Subtracts numbers                   |
| *        | Multiplication   | Multiplies numbers                  |
| /        | Division         | Divides numbers                     |
| %        | Modulus          | Returns the remainder of a division |
| ++       | Add One          | Increases a value by 1              |
| --       | Subtract One     | Decreases a value by 1              |
| +=       | Add By           | Increases the value by the          |
|          |                  |       number on the right           |
| -=       | Subtract By      | Decreases the value by the          |
|          |                  |       number on the right           |

Put math operations in brackets if you wish to embed them inside a String.

Example:  `"Five is not smaller than one. I'm certain this is " + (5 < 1);`
 

_____

## 3. Booleans and Conditionals

**Comparison Operators**

| Comparison | Comparison Name           |
| ---------- | ------------------------- |
| >          | greater than              |
| <          | less than                 |
| >=         | greater than or equal to  |
| <=         | less than or equal to     |
| ==         | equal to                  |
| !=         | not equal to              |
| equals     | equal to (String)         |
| !equals    | not equal to (String)     |

Put comparison operations in brackets if you wish to embed them inside a String.

Example: `"Five is not smaller than one. I'm certain this is " + (5 < 1);`


**Rules of thumb**

When controlling how your code runs:

use `switch` to compare one value against a list of values.

in any other scenario, use `if-else`.

Do not confuse `=` with `==`

use `=` to set a value equal to another.

use `==` to compare two values and return a `boolean`.
_____

## 4. Functions

Function Parts

Level of access: `private, public`.

Return type: `double, int, boolean, char, String, long`.

Function name: `lowerCamelCase (singChorus, kickBall)`.

Parameter: value received by the function.

Argument: value passed into the function.

Code: performs your task.

`return` breaks the entire function. Nothing after it can run.
Rule of thumb: if a function calculates a value, return it.

_____

## 6. Arrays

### 6.1 Defining an array

You can define an array and its values in one line.

`Type[] array = { element1, element2, element3 };`

You can also define the length of the array and populate it later.

```
Type[] array = new Type[3]; 
array[0] = element1;
array[1] = element2;
array[2] = element3;
```

In both cases:

    - The variable does not store the array directly.

    - It stores a **reference** that points to it.

### 6.2 Accessing values from an array

You can access values from an array by referring to its index, such that:

    - The first index is 0.

    - The last index is one less the length of the array.

### 6.3 Looping an array
```
for (int i = 0﻿; i < array.length; i++﻿) {

}
```

### 6.4 Reference Trap

***Trap***  Setting an array variable equal to another.<br>
***Pitfall***   Both variables point to the same array.<br>
***Solution***  Set it equal to a copy of the array (Arrays.copyOf).<br>


### 6.5 Defining a 2D array

Method 1:
```
Type[][] array = {
 {element1, element2},
 {element3, element4},
};
```

Method 2:
```
Type[][] array = new Type[2][2];
array[0][0] = element1;
array[0][1] = element2;
array[1][0] = element3;
array[1][1] = element4;
```

### 6.6 Accessing values from a 2D array

- The first bracket indexes the row.

- The second bracket indexes the element in that row.

6.7 Looping a 2D array

for (int i = 0﻿; i < array.length; i++﻿) {
   for (int j = 0﻿; j < array[i]﻿.length; j++﻿) {

   }
}
