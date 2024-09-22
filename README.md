# 🚀 Java DSA (Data Structures & Algorithms)

Welcome to the **Java DSA repository**, where you will find a comprehensive collection of data structures and algorithms implemented in **Java**. This repository is designed to solidify your understanding of DSA concepts while showcasing your proficiency in Java.

## 📖 About the Repository

This repository contains implementations of classic and advanced data structures and algorithms. Each algorithm or data structure is implemented with **optimal time and space complexity**, showcasing best practices in Java. The code is structured for readability, scalability, and performance.

### Key Features:
- **Efficient Implementations**: Focus on optimal solutions with minimal time and space complexity.
- **Test-Driven Development (TDD)**: Unit tests included for each algorithm and data structure.
- **Scalability**: Code is written with an emphasis on handling edge cases and scalability.
- **Code Readability**: Clean, well-commented, and modularized code for ease of understanding.

---

## 🛠️ Getting Started

### Prerequisites:
- **Java 8+**: The repository uses advanced Java features like Streams, Lambda Expressions, and the Collections Framework, so Java 8 or higher is required.
- **JUnit**: Testing framework used for validating the correctness of implementations.

### How to Run:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/java-dsa.git
   cd java-dsa
   ```

2. **Compile the Code**:
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Run Test Cases**:
   Execute the JUnit tests to validate the correctness of the algorithms.
   ```bash
   java -cp bin org.junit.runner.JUnitCore
   ```

---

## 📚 Data Structures Implemented

### Linear Data Structures:
- **Arrays**: Dynamic resizing, searching, sorting, and manipulation.
- **Linked Lists**:
  - Singly Linked List
  - Doubly Linked List
  - Circular Linked List
- **Stacks & Queues**:
  - Stack (Array-based, Linked List-based)
  - Queue (Array-based, Linked List-based)
  - Deque (Double-ended Queue)

### Hierarchical Data Structures:
- **Trees**:
  - Binary Trees (Traversal: Inorder, Preorder, Postorder)
  - Binary Search Trees (BST)
  - AVL Trees (Self-Balancing BST)
  - Heaps (Max and Min Heap)

### Graph Data Structures:
- **Graphs**:
  - Adjacency Matrix and Adjacency List Representation
  - DFS (Depth First Search)
  - BFS (Breadth First Search)
  - Dijkstra's Algorithm (Shortest Path)
  - Kruskal’s and Prim’s Algorithm (Minimum Spanning Tree)

### Hashing and Sets:
- **HashMap** and **HashSet**: Implemented with handling of collisions, custom hash functions.
- **Trie**: String-based prefix tree for efficient lookups.

---

## 🧠 Algorithms Implemented

### Sorting Algorithms:
- **Bubble Sort**
- **Selection Sort**
- **Merge Sort**
- **Quick Sort**
- **Heap Sort**
- **Radix Sort**

### Searching Algorithms:
- **Binary Search** (Recursive and Iterative)
- **Linear Search**
- **Interpolation Search**

### Dynamic Programming:
- **Knapsack Problem**
- **Longest Common Subsequence (LCS)**
- **Fibonacci Series (Memoization and Tabulation)**
- **Matrix Chain Multiplication**

### Greedy Algorithms:
- **Huffman Coding**
- **Job Scheduling**
- **Fractional Knapsack**

### Graph Algorithms:
- **Dijkstra’s Shortest Path**
- **Bellman-Ford Algorithm**
- **Floyd-Warshall Algorithm**
- **Kruskal’s Algorithm**
- **Prim’s Algorithm**

### Advanced Topics:
- **Backtracking**: N-Queens Problem, Sudoku Solver
- **Divide and Conquer**: Closest Pair of Points, Karatsuba Multiplication

---

## 📘 Intellectual Java Insights

### 1. **Advanced Java Constructs**:
- **Generics**: All data structures are implemented using Java generics to ensure type safety and flexibility.
  ```java
  public class BinarySearchTree<T extends Comparable<T>> {
      // Generic implementation to handle any comparable type
  }
  ```
- **Concurrency**: Certain algorithms like **parallel mergesort** or **multi-threaded matrix multiplication** are implemented to leverage Java's **ExecutorService** and **Fork/Join framework** for performance on large datasets.
  
### 2. **Immutable Objects in DSA**:
- Immutable objects are used in algorithms to ensure **thread-safety** and **predictable behavior**. This is especially useful in **functional-style programming** using Java Streams.
  ```java
  final class Node<T> {
      private final T value;
      private final Node<T> next;
      // Immutable node structure
  }
  ```

### 3. **Java Collections Framework**:
- Leverage built-in data structures like `HashMap`, `TreeMap`, and `PriorityQueue` but also implement **custom versions** of these for deeper understanding.

### 4. **Java 8 Functional Programming**:
- **Lambda Expressions** and **Streams** are used to improve the clarity and conciseness of code. Complex transformations and filtering operations are done in a functional style.
  ```java
  List<Integer> squares = numbers.stream()
      .map(x -> x * x)
      .collect(Collectors.toList());
  ```

### 5. **Memory Management and Optimization**:
- Special attention is given to memory usage. **Space complexity** is always calculated and noted, ensuring that implementations are memory efficient.
- Techniques like **lazy evaluation** and **tail-recursion optimization** are also employed when necessary.

---

## 🔍 How to Contribute

Feel free to fork this repository, submit pull requests, and improve the codebase. You can contribute by:
- Adding more advanced algorithms.
- Improving the efficiency of existing implementations.
- Writing additional unit tests for better coverage.

### Contribution Guide:
1. Fork the repository.
2. Create a new feature branch.
3. Commit your changes and submit a pull request.

---

## 🏆 Acknowledgments

Special thanks to all the online resources and communities that inspired the solutions provided in this repository. This project is intended to serve as both a learning resource and a platform for further enhancement of Java DSA skills.

---

## 🧑‍💻 Author
**Ritik Zambre**  
Master’s Student in Software Engineering  
Arizona State University  

Connect with me on [LinkedIn](https://www.linkedin.com/in/ritik-zambre) | [GitHub](https://github.com/ritik-zambre)

---

