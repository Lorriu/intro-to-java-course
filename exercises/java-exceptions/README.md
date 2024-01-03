# Exception Handling

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this exercise is to practise:
- Creating custom exceptions
- Handling exceptions

For the exercises below, we've provided the starter project above.

## :pushpin: Exceptions

### Question 1

Is the following code legal?

```java
try {

} finally {

}
```

ANSWER: Yes this is legal code. 

### Question 2

What exception types can be caught by the following handler?
```java
catch (Exception e) {
    
}
```

ANSWER: 
ArrayIndexOutOfBoundsException: when attempting to access an array element outside the array's bounds/invalid index.

NullPointerException: when you try to access or call a method on an object that is currently null.

IOException: exception for input/output operations. Can occur when working with files, streams, or other input/output-related e.g FileNotFoundException(attempting to access a file that doesn't exist).

ArithmeticException: Occurs due to division by zero.

ClassNotFoundException: Thrown when an application tries to load a class but can't find it during runtime.

RuntimeException: A broad category of exceptions that encompass various unchecked exceptions. These exceptions usually occur at runtime and may signal errors such as logical errors in the code, illegal arguments, or violations of certain assumptions

SQLException: represents an error in the SQL database access or operations.




What is wrong with using this type of exception handler?

ANSWER: It's better to handle the exceptions in a more specific way, rather than using the broad catcher, as when you do find an error/exception it may be harder to pinpoint the issue with the root cause of the code thats causing the issue because its all bundled into one place, and there may be multple issues from different places. Breaking the code into specific errors/exceptions helps you to target those specific pieces of code much easier. 



### Question 3

Is there anything wrong with the following exception handler as written? Will this code compile?

```java
try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}
```

ANSWER: This issue with this code is that you have placed the broader exception above the more specific exception, so the program will never reach the ArithmeticException because all the exceptions would be caught in the first block, you would need to place the ArthmeticExeception first, so those can be caught, then all others would be searched for afterwards. 

### Question 4

```java
int[] A; 
A[0] = 0;
```

The above code produces (choose 1):

- [ ] an error
- [ ] a checked exception
- [x] an unchecked exception
- [ ] a compile error
- [ ] no exception

ANSWER: an unchecked exepcetion (ArrayIndexOutOfBoundsException), because the Array has been declared but it has not been instatiated with a size, so you can't allocate a value to an array that does exist yet. 

### Question 5

The JVM starts running your program, but the JVM can't find the Java platform classes. 
(The Java platform classes reside in classes.zip or rt.jar.)

What happens (choose 1):

- [x] an error
- [ ] a checked exception
- [ ] an unchecked exception
- [ ] a compile error
- [ ] no exception

ANSWER: This is an error that happens at runtime as the class cannot be found.

## :pushpin: Custom Exceptions

Create a custom (checked) exception class called `FilenameException`.

Create a class called `FileExtension` with the following methods:

- `boolean check(String filename)`
- `Map<String, int> map(List<String> filenames)`

The `check` method should:
- return `true` when the file extension is `.java`
- return `false` when the file extension is not `.java`
- throw a custom checked exception called `FilenameException` (that you must create) when the file name is `null` or an empty string.

The `map` method should:
- check each provided file's extension and map the returned value as 1 if true or 0 if false
- map `-1` when an exception occurs

**Example**

For the following list of file names: `Arrays.asList("App.java", "App.txt", null, "App.md")`, the `map` method should return a map with the following entries:

```txt
{"App.java", 1},
{"App.txt", 0},
{null, -1},
{"App.md", 0}
```

[1]: https://docs.oracle.com/javase/17/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/