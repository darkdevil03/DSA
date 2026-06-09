# Java Data Structures & Algorithms (DSA) Series 🚀

# (Status: DSA in progress...)

Welcome to the **Java DSA Series** repository! This project is a curated collection of Data Structures, Algorithms, Pattern Programs, and LeetCode problem solutions, all implemented from scratch using **Java**.

Whether you are preparing for technical interviews, brushing up on computer science fundamentals, or practicing problem-solving on platforms like LeetCode, this repository serves as a structured guide to mastering DSA.

---

## 📁 Repository Structure

The codebase is organized into modular directories based on topics and problem categories:

| Folder / File | Description |
| :--- | :--- |
| 📁 `Recursion` | Core concepts, string manipulations, and divide-and-conquer problems using recursion. |
| 📁 `Sorting` | Implementations of standard sorting algorithms (Bubble, Selection, Insertion, Merge, Quick, etc.). |
| 📁 `BinarySearchBasedPatternAnswers` | Binary Search implementations and pattern-based problem variations. |
| 📁 `CollectionsBuild/LinkedList` | Custom implementations of Linked Lists and built-in Java Collections Framework usage. |
| 📁 `PatternPrograms` | Logical pattern printing questions frequently asked in foundation and exam patterns. |
| 📁 `LeetcodeProb` | Curated solutions to popular LeetCode problems (optimized for runtime and space complexity). |
| 📄 `HelloWorld.java` | Smoke test file to verify your Java environment setup. |

---

## 🗺️ Roadmap: How to Learn DSA effectively

If you are a beginner or looking for a structured approach to study this repository, follow this learning path:

### 1. Fundamentals & Logic Building
* Start with basic syntax, loops, and conditional statements.
* Practice logical thinking by implementing programs in the `PatternPrograms` directory.

### 2. Time & Space Complexity ($O(n)$)
* Before writing complex algorithms, learn how to measure code efficiency using Big O notation.

### 3. Divide & Conquer (Recursion)
* Master `Recursion` early. It acts as the backbone for advanced topics like Trees, Graphs, and Dynamic Programming.

### 4. Linear Data Structures & Sorting
* Learn how data is stored sequentially. Dive into `Sorting` algorithms and understand the mechanics of custom implementations like `CollectionsBuild/LinkedList`.

### 5. Searching Algorithms
* Move on to optimized searching. Explore the `BinarySearchBasedPatternAnswers` folder to understand how to reduce time complexity from $O(n)$ to $O(\log n)$.

### 6. LeetCode Problem Solving
* Apply your foundational knowledge to real-world interview questions located in the `LeetcodeProb` directory.

---

## 💡 LeetCode Problem Solving Guide

When solving problems in the `LeetcodeProb` folder, follow this 4-step framework to maximize your learning:

> 🟩 **Step 1: Understand the Constraints** > Read the problem carefully. Look at the constraints (e.g., $N \le 10^5$). This tells you whether an $O(n^2)$ solution will pass or if you need an optimized $O(n)$ or $O(n \log n)$ approach.
>
> 🟨 **Step 2: Brute Force First** > Write down the most intuitive solution first. Even if it is inefficient, it helps you understand the problem's edge cases.
>
> 🟧 **Step 3: Optimize (Time & Space)** > Look for bottlenecks, unnecessary loops, or duplicate calculations. Utilize HashMap, Two-Pointers, or Slidings Windows to optimize your code.
>
> 🟦 **Step 4: Dry Run** > Manually trace your Java code with a sample input on paper to ensure your loops and pointer updates behave correctly before submitting.

---

## 🛠️ How to Run the Programs Locally

You can run these programs either using the traditional Command Line Interface (CLI) or through an Integrated Development Environment (IDE) like Eclipse, IntelliJ IDEA.

### Option 1: Using the Terminal / Command Line

#### Prerequisites
Make sure you have the Java Development Kit (JDK 7 or higher) installed on your system.

### Steps
1. **Clone the repository:**
   ```bash
    git clone [https://github.com/darkdevil03/DSA.git](https://github.com/darkdevil03/DSA.git)

2. **Navigate to the source directory:**
    ```bash
    cd DSA/src

3. **Compile a specific Java file:**
    ```bash
    javac HelloWorld.java
    
4. **Run the compiled class:**
    ```bash
    java HelloWorld


### Option 2: Using IntelliJ IDEA (Recommended for Debugging & Dry Runs)
Using IntelliJ IDEA allows you to visually execute code line-by-line, inspect variable values in real-time, and dry-run logic seamlessly.

### Setup & Installation
  1. Download and install IntelliJ IDEA Community or Ultimate Edition.

  2. Open IntelliJ IDEA and select Get from VCS (or Clone Repository).

  3. Paste the repository URL: https://github.com/darkdevil03/DSA.git and click Clone.

  4. IntelliJ will automatically detect the project structure. If prompted to configure the SDK, select your installed JDK version (JDK 11+ recommended).

### Running Code
  1. Expand the src folder in the project sidebar and locate the file you want to run.

  2. Right-click inside the file or on the class name and click Run 'Filename.main()' (or press Shift + F10).

### How to "Dry Run" / Debug Code in IntelliJ
Instead of guessing how values change in a loop, you can execute a visual dry run:

  1. Set a Breakpoint: Click on the blank space next to the line number where your core algorithm starts (e.g., inside a loop or at the start of a function). A red dot will appear.

  2. Start Debugger: Instead of clicking "Run", right-click and choose Debug 'Filename.main()' (or press Shift + F9).

  3. Step Through: The execution will pause at your red dot. Use the debugger control panel to control the flow:
        * Step Over (F8): Executes the current line and goes to the next line.
        * Step Into (F7): Dives inside a function call (like a recursive function) to see its execution.

  4. Inspect Variables: Watch the Variables pane at the bottom of the screen update values dynamically as your code executes line-by-line.

---

**🤝 Contributing**
    
Contributions are always welcome! If you have a more optimized solution to a LeetCode problem or want to add a new data structure implementation:
    
  1. Fork the project.
   
  2. Create your Feature Branch (git checkout -b feature/OptimizedSolution).

  3. Commit your changes (git commit -m 'Add optimized solution for LeetCode XYZ').

  4. Push to the Branch (git push origin feature / OptimizedSolution).

  5. Open a Pull Request.