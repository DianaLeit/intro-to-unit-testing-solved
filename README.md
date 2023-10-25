Building Unit Tests with JUnit
==============================
This is a first assignment of **Introduction to Software Testing** Course from University of Minnesota. 
In this assignment, I got some practice at building effective unit tests. Using the example from course videos, I developed tests for the Demo class, including the isTriangle() and main() methods.

Task was to create a file, DemoTest.java, which properly tests the Demo class to ensure it is working properly. The correct Demo.java file is provided for use.

Score 9/10: mutants 1, 2, 10 and 21 didn't passed.


### Deliverable
Deliverable is the `DemoTest.java` which tests the Demo class.

### Evaluation
In order to measure the adequacy of tests mutation analysis is used. Faults (mutations) include things like swapping a binary operator for another (e.g., '+' instead of '-'), or changing the variable used for another variable of the same type (e.g., 'a' substituted for 'b').


Package Prerequisites
---------------------
Java 8 JDK

### Installing Java 8
#### Windows / macOS / Linux
To install Java, download the **JDK** installer from: 
  http://www.oracle.com/technetwork/java/javase/downloads/index.html

#### Ubuntu
On Ubuntu 16.04 and up, to install Java (OpenJDK) run:

    sudo apt update
    sudo apt install default-jdk
    
If you'd rather run Oracle Java, run:

    sudo add-apt-repository ppa:webupd8team/java
    sudo apt update
    sudo apt install oracle-java8-installer
   
### Eclipse (recommended)
To install eclipse, visit https://www.eclipse.org/downloads/ and download the installer.  This is the most reliable method to get the latest version of eclipse.
   
    
Known Issues
------------
### Java 9
Currently, Java 9 is not supported for this project.  
