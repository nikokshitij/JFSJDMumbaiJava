1.For loop:
-The for loop runs a specific number of times.
-It has three parts:
-Initialization (starts the loop),
-Condition (checks if it should keep going),
-Update (moves to the next step after each run).

Syntax:
for (initialization; condition; update) {
    // code to be executed
}

Example:
// Example: 
Print numbers from 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

*************************************

2.While loop:
-The while loop runs as long as the condition is true.
-It checks the condition before running the code.

Syntax:
while (condition) {
    // code to be executed
}

Example:
// Example: Print numbers from 1 to 5
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

*************************************

3.Do-while loop:
-Similar to the while loop, but it runs the code at least once before checking the condition.

Syntax:
do {
    // code to be executed
} while (condition);

Example:
// Example: Print numbers from 1 to 5
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);

***************************************

4.Enhanced for loop (for-each loop):
-The for-each loop is used to go through each item in a collection (like an array).

Syntax:
for (type variable : collection) {
    // code to be executed
}

Example:
// Example: Print elements of an array
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
*****************************************