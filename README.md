# Simple Geometry Application

## Project Description
This Java application models geometric shapes using abstract classes and inheritance. It demonstrates calculating area and perimeter for Circle, Rectangle, and Triangle using appropriate formulas.

### Features
- Abstract class `Shape` with concrete and abstract methods.
- Subclasses `Circle`, `Rectangle`, and `Triangle` implementing abstract methods.
- Demonstrates inheritance, polymorphism, and abstraction principles.

## How to Run
#### Compile the program:
javac -d build src/main/*.java

#### Run the program:
java -cp build main.GeometryApp


## Test Cases
- 3 Normal test cases:
- Circle: Radius 5 (Expected Area: ~78.54, Perimeter: ~31.42)
- Rectangle: Length 4, Width 7 (Expected Area: 28, Perimeter: 22)
- Triangle: Sides 3, 4, 5 (Expected Area: 6, Perimeter: 12)
- 3 Edge test cases:
- Tiny circle with radius 0.001.
- Flat triangle with sides 1, 2, 3.
- Rectangle with equal sides (square).
