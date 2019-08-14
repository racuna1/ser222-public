# Introduction
This repository contains public files for use in SER222 (Design & Analysis: Data Structures & Algorithms) taught by Lecturer Ruben Acuña at Arizona State University. This repository primarily stores sample source code used in the course. Much of the material comes from samples in *Algorithms* 4th edition by Sedgewick and Wayne.

Within each module, files are ordered alphabetically.

## Fundamentals (modules 1.1, 1.2, 1.3, 1.4)

### 1.1 Programming Model
* Cone.java - class for representing a 3d geometric cone shape.
* LinearNode.java - class for representing a node in a singly linked list.
* LinearSearchExample.java - implementation of the linear search algorithm.
* RecursiveSamples.java - recursive methods that compute a factorial, compute a Fibonacci number, and display a list.
* RoundShape.java - class for representing a geometric shape with radial symmetry.
* Sphere.java - class for representing a 3d geometric sphere shape.
* Thing.java - simple example of a recursive data structure.

### 1.2 Data Abstraction
* Counter.java - ADT for representing a counter.
* CounterTester1.java - tests the counter class for reference behavior.
* CounterTester2.java - tests the counter class for reference behavior.
* IncrementCounter.java - interface for a counter.
* Point2D.java - ADT for representing a 2D point.
* Point2DTester.java - tests the Point2D class.

### 1.3 Bags, Stacks, and Queues (deprecated)
* Queue.java - interface for queue ADT.
* Stack.java - interface for stack ADT.
* FixedCapacityStringStack.java - initial array implementation of stack. limited to a fixed number of strings.
* FixedCapacityStack.java - second array implementation of stack. limited to a fixed number of elements.
* UnsafeExpandableStack.java - third array implementation of stack. 
* ArrayStack.java - forth array implementation of stack. adds default constructor and makes pop() safe.
* IterableArrayStack.java - fifth array implementation of stack. adds iterable support.
* LinearNode.java - generic singly linked list node.
* LinkedStack.java - linked list implementation of stack.
* IterableLinkedStack.java - linked list implementation of stack. adds iterable support.
* LinkedQueue.java - linked list implementation of queue. (not in slides.)
* ContactNode.java - singly linked list node with contact information.
* ContactBook.java - linked list implementation of a contact book.

### 1.4 Analysis of Algorithms
* Stopwatch.java - ADT for taking a time measurement.
* ThreeSum.java - algorithm that counts triples that sum to zero.

## Sorting (modules 2.1, 2.2, 2.4)

### 2.1 Elementary Sorts
* Date.java - example of implementing Comparable for a complex type.
* SortPlatform.java - basic helper methods for implementing and testing a sorting algorithm.
* SelectionSort.java - selection sort implementation.
* InsertionSort.java - insertion sort implementation.
* ShellSort.java - shellsort implementation.

### 2.2 Mergesort
* Mergesort.java - topdown mergesort implementation.

### 2.4 Priority Queues
* Date.java - see 2.1 Elementary Sorts.
* MaxPQ.java - implementation of maximum priority queue.
* MinPQ.java - implementation of minimum priority queue.
* TopM.java - finds the top M transactions in an input.
* Transaction.java - ADT for representing financial transactions.

## Searching (modules 3.1, 3.2, 3.4)

### 3.4 Hash Tables
* LinearProbingHashST - implementation of a ST using probing. 
* SeparateChainingHashST - implementation of ST using separate chainning.
* SequentialSearchST - implementation of ST using a list.
* SymbolTable`- interface for symbol table ADT.

# Field Guide
The folder called SER222_FieldGuide contains a field guide written by UGTA Wezley Sherman in Spring 2019. It serves as a guide to the course from the student perspective with FAQs, suggestions, references, and more, on several modules. Contributions by UGTAs and students taking the course are strongly encouraged.