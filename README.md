# Java Basics Learning Journey

This repository contains a collection of Java programs designed to illustrate fundamental concepts in Java programming. The code is structured in a way that facilitates learning, starting from the very basics and gradually progressing to more advanced topics.

## Project Structure and Learning Path

The files in this repository are organized to follow a logical learning sequence. Each file focuses on one or more related concepts. Here's the suggested order in which you should explore the code:


**Phase 1: The Fundamentals (Building Blocks)**

1.  **`Hello.java` (Conceptual)**
    *   **Concept:** The absolute basics. Writing your first Java program to print "Hello, World!". This sets up the foundation for the basic structure of a Java program.
    *   *Implied - Start Here*

2.  **`variables.java` (Conceptual)**
    *   **Concept:** Understanding variables, data types (int, double, String, char, boolean, etc.), variable declaration, initialization, and assignment.
    *   *Implied as Second Step*

3.  **`Primitive.java`**
    *   **Concept:**  In-depth study of primitive data types, their ranges, default values, and how they are stored in memory.
    *   *Follows after `variables.java`*

4.  **`type_casting.java`**
    *   **Concept:**  Widening (implicit) and narrowing (explicit) type casting, and understanding data loss when casting.
    * *Follows after `Primitive.java`*

5.  **`operators.java`**
    *   **Concept:** Arithmetic, relational, logical, assignment, and bitwise operators, operator precedence, and associativity.
    * *Follows after `type_casting.java`*

6. **`input.java`**
    * **Concept:** how to take input from the user.
    * *Follows after `operators.java`*

7.  **`string_learn.java`**
    *   **Concept:** String class, String immutability, String methods (`length()`, `charAt()`, `substring()`, `toUpperCase()`, `toLowerCase()`, `concat()`, `equals()`, `compareTo()`, `hashCode()`, `indexOf()`, etc.), `StringBuffer` and `StringBuilder`.
    *   *Follows after `input.java`*

8.  **`string_method.java`**
    * **Concept:** More advanced string methods like `split()`, `replace()`, `trim()`, `contains()`, and understanding regular expressions.
    * *Follows after `string_learn.java`*

9. **`stringbuilder_and_stringbuffer.java`**
    * **Concept:** Detailed study of mutability using string buffer and string builder.
    * *Follows after `string_method.java`*

10. **`if_else.java`**
    * **Concept:** if else, nested if else, ladder if else in java.
    * *Follows after `stringbuilder_and_stringbuffer.java`*

11. **`switch_case.java`**
    * **Concept:** switch case statement in java.
    * *Follows after `if_else.java`*

12. **`break_continue.java`**
    * **Concept:** Break and continue statement in loops.
    * *Follows after `switch_case.java`*
13. **`for_loops.java`**
    * **Concept:** for loop, enhanced for loop.
    * *Follows after `break_continue.java`*

14. **`while_loop.java`**
    * **Concept:** While loop, do-while loop.
    * *Follows after `for_loops.java`*

15.  **`one_d_array.java`**
    *   **Concept:** Introduction to one-dimensional arrays, array declaration, initialization, accessing array elements, array length, traversing arrays using loops.
    *   *Follows after `while_loop.java`*

16.  **`multidimensional_array.java`**
    *   **Concept:** Multidimensional arrays, 2D arrays, declaration, initialization, nested loops for traversing multidimensional arrays.
    *   *Follows after `one_d_array.java`*

17.  **`jagged_array.java`**
    *   **Concept:** Jagged arrays (arrays of arrays with varying row lengths), declaration, initialization, and traversing jagged arrays.
    *   *Follows after `multidimensional_array.java`*

18.  **`array_method.java`**
    *   **Concept:**  `Arrays` class methods like `sort()`, `binarySearch()`, `copyOf()`, `equals()` etc.
    *   *Follows after `jagged_array.java`*

**Phase 2: Object-Oriented Programming (OOP)**

19.  **`method.java`**
    *   **Concept:** Defining and calling methods, method parameters, return types, void methods.
    *   *Starts the OOP section*

20.  **`method_overloading.java`**
    *   **Concept:** Method overloading, compile-time polymorphism, overloading based on method name and parameter types.
    * *Follows after `method.java`*

21.  **`constructor.java`**
    *   **Concept:** Constructors, default constructor, parameterized constructors, constructor overloading.
    *   *Follows after `method_overloading.java`*

22.  **`static_variable.java`**
    *   **Concept:** Static variables, class variables, their scope, how they are shared among objects, and how to access them using the class name.
    *   *Follows after `constructor.java`*

23.  **`static_method.java`**
    *   **Concept:** Static methods, their uses, calling static methods, static vs. instance methods.
    *   *Follows after `static_variable.java`*

24.  **`static_block.java`**
    *   **Concept:** Static blocks, their purpose (initializing static members), when they are executed (class loading), and how they differ from constructors.
    *   *Follows after `static_method.java`*

25. **`this_keyword.java`**
    * **Concept:** this keyword, its purpose, calling constructor, method and variables using this.
    * *Follows after `static_block.java`*

26.  **`object_class.java`**
    *   **Concept:** The `Object` class, `toString()`, `equals()`, and `hashCode()` methods, overriding these methods for custom behavior.
    *   *Follows after `this_keyword.java`*

27. **`super_method_and_this.java`**
    * **concept:** Super keyword and this keyword, calling the parameterized constructor in the super class.
    * *Follows after `object_class.java`*

28. **`need_of_inheritence.java`**
    * **Concept:** Need of inheritance, advantage of inheritence.
    * *Follows after `super_method_and_this.java`*

29.  **`inheritence.java`**
    *   **Concept:** Inheritance, `extends` keyword, single-level inheritance, multi-level inheritance, hierarchical inheritance.
    *   *Follows after `need_of_inheritence.java`*

30.  **`method_overriding.java`**
    *   **Concept:** Method overriding, parent-child class relationships, how method calls are resolved at runtime.
    *   *Follows after `inheritence.java`*

31. **`up_down_casting.java`**
    * **Concept:** upcasting and downcasting in the java with example.
    * *Follows after `method_overriding.java`*

32. **`final_keyword.java`**
    * **Concept:** final keyword, final variable, final method, final class.
    * *Follows after `up_down_casting.java`*
33. **`abstract_class.java`**
    * **Concept:** abstract class and its need in java.
    * *Follows after `final_keyword.java`*

34. **`interface1.java`**
    *   **Concept:** Interfaces, abstract methods, `implements` keyword, multiple interface implementation, extending interfaces, default,static and final nature.
    *   *Follows after `abstract_class.java`*

35.  **`inner_class.java`**
    *   **Concept:** Inner classes, nested classes, static inner classes, how to create inner class objects, accessing outer class members.
    *   *Follows after `interface1.java`*

36. **`polymorphism.java`**
    *   **Concept:** Polymorphism (many forms), compile-time vs. run-time polymorphism, method overloading vs. method overriding, dynamic method dispatch.
    *   *Follows after `inner_class.java`*

**Phase 3: Exception Handling and I/O**

37. **`exception_handling.java`**
    * **Concept:** try-catch block, exception handling mechanism.
    * *Starts the Exception Handling and I/O section.*

38. **`throws_exception.java`**
    *   **Concept:** Checked exceptions, `throws` keyword, declaring that a method might throw an exception.
    *   *Follows after `exception_handling.java`*

39. **`throw_keyword.java`**
    * **Concept:** throw keyword, custom exceptions.
    * *Follows after `throws_exception.java`*

40. **`input_finally.java`**
    *   **Concept:** Using `BufferedReader` for input, `try-with-resources`, `finally` block for resource cleanup.
    *   *Follows after `throw_keyword.java`*

**Phase 4: Multithreading**

41. **`thread_class1.java`**
    *   **Concept:** Introduction to threads, `Thread` class, `run()` and `start()` methods, thread priorities, `sleep()`.
    *   *Starts the Multithreading section.*

42. **`thread_2.java`**
    *   **Concept:** Implementing `Runnable` interface, anonymous classes, lambda expressions for creating threads.
    *   *Follows after `thread_class1.java`*

43. **`thread_safe.java`**
    * **Concept:** Thread states, synchronized keyword for thread safety, join(), methods and states.
    * *Follows after `thread_2.java`*

**Phase 5: Packages and Collections**

44. **`package1.java`**
    *   **Concept:** Packages, `import` statements, organizing code into packages, using classes from other packages, built-in packages.
    *   *Starts the Packages and Collections section.*

45. **`access_modifier.java`**
    * **Concept:** Access modifier in java.
    * *Follows after `package1.java`*

46. **`list_interface.java`**
    * **Concept:** List interface, Arraylist, Linkedlist.
    * *Follows after `access_modifier.java`*

47. **`set_interface.java`**
    * **Concept:** Set interface, HashSet, LinkedHashSet, TreeSet.
    * *Follows after `list_interface.java`*

48. **`queue_interface.java`**
    * **Concept:** Queue interface, PriorityQueue.
    * *Follows after `set_interface.java`*

49. **`map_interface.java`**
    * **Concept:** Map interface, HashMap, LinkedHashMap, TreeMap.
    * *Follows after `queue_interface.java`*

50. **`iterator.java`**
    * **Concept:** Iterator, ListIterator.
    * *Follows after `map_interface.java`*

51. **`sort_Collections_Compare.java`**
    *   **Concept:** Sorting collections, `Comparator` interface, `Comparable` interface, lambda expressions for custom sorting logic.
    *   *Follows after `iterator.java`*

**Phase 6: Java Streams**

52. **`stream1.java`**
    *   **Concept:** Java Streams, `stream()` method, functional interfaces (`Consumer`, `Predicate`, `Function`), `filter()`, `map()`, `forEach()`, `reduce()`, `sorted()`, `parallelStream()`.
    *   *Starts the Java Streams section.*

**Phase 7: Advanced Topics**

53. **`marker_interface.java`**
    * **Concept:** marker interface in java.
    * *Starts the Advance Topics section.*

54. **`enum_class.java`**
    * **Concept:** enum class and its use in java.
    * *Follows after `marker_interface.java`*

55. **`garbage_collector.java`**
    * **Concept:** Garbage collector and its working in java.
    * *Follows after `enum_class.java`*

56. **`finalise.java`**
    * **Concept:** Finalize method in java.
    * *Follows after `garbage_collector.java`*
57. **`date_and_time.java`**
    * **Concept:** date and time in java.
    * *Follows after `finalise.java`*

**Other Files (Utilities/Examples)**

58. **`calc1.java` and `advcalc1.java`**
    *   **Concept:** basic calculator and advance calculator, examples of classes and methods, also used in `package1.java`.
    * *used in packages and others*

59. `wrapper_class.java`
    * Concept: wrapper classes in java.
    * *for deep understanding of primitive datatypes.*

60. **`clone_method.java`**
    * **concept:** deep and shallow copying.
    * *Advanced topic.*

61. **`run_time_poly.java`**
    * **concept:** method overriding, run time polymorphism.
    * *for clear understanding of run time polymorphism.*

62. **`method_overloading_const.java`**
    * **concept:** method and constructor overloading.
    * *example of method and constructor overloading.*


**Note:**
* *Implied means not present in the folder but they are basic of java.*
* some files may not be in that sequence but you can go through that file.

## Running the Code

1.  **Ensure Java is Installed:** Make sure you have a Java Development Kit (JDK) installed on your system.
2.  **Navigate to the Directory:** Open your terminal or command prompt and navigate to the directory containing the Java files.
3.  **Compile:** Compile each Java file using the Java compiler (`javac`). For example:
    ```bash
    javac string_learn.java
    ```
4.  **Run:** Run the compiled code using the Java Virtual Machine (`java`). For example:
    ```bash
    java string_learn
    ```

## Notes

*   The order of the files is important for learning purposes. Some files build upon concepts introduced in previous files.
*   Focus on understanding the concepts, not just memorizing code.
*   The code snippets are intended to be illustrative and may not represent production-ready code.
*   Feel free to experiment, modify, and enhance the code as you learn.

## Contributing

If you have any suggestions for improvements, corrections, or additions to this learning resource, please feel free to contribute.

## Author

Shashidhar

