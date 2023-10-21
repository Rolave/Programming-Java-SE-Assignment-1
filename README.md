# Java - Assignment 1
Write a Geometry program that allows the user to create an array of at least three
triangles by entering the coordinates (x, y) of the vertices of a triangle. The program
then displays the perimeter of each triangle and a message indicating whether they are
an isosceles triangle. Your program must be object oriented and modular.

### indications:
- A triangle is isosceles if at least two sides have the same length.
- The formula for calculating the distance between two points (x1, y1) and (x2, y2)
is: square root of (x1 – x2)2 + (y1 – y2)2.
- Java provides the Math.sqrt () method to calculate the square root. This method
takes a non-negative number as a parameter.

### Example:
```
double var = Math.sqrt(9.0);
```
Example of displaying the program for an isosceles triangle:
```
Construction of a new point Please enter x: 0 Please enter y: 0
Construction of a new point Please enter x: 2.5 Please enter y: 2.5
Construction of a new point Please enter x: 0 Please enter y: 5
Perimeter: 12.071067811865476 The triangle is isosceles
```

### Notes:
- Think about the objects you would like to use in the program. For example, you
could represent the triangle with a Triangle class and its points with a Point class.
A third class Geometry could host the main method.
- Think about the variables (attributes) and instance methods that would be useful
for the Triangle and Point classes.
- An object of type Point typically has the coordinates x and y. An object of type
Triangle has three vertices that can be represented by Point objects.
- For example, the coordinates of the points can be entered in the main program
using the method scanner.nextDouble ().
- The perimeter of a triangle can be calculated as the sum of the distances
between the three vertices.

### Extra mark (15%)
- Take a point from the user and display a message if the point is inside the
triangle or not