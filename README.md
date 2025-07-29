## Maze Solver

**Maze Solver** is an interactive **Java-based tool** designed to **visualize and compare** the performance of various pathfinding algorithms.

---

# 🎯 Problem Statement

The core objective is:

> **To find the most efficient path from a start point to an end point in a randomly generated maze using different algorithms.**

---

## 💻 Tech Stack

- **Programming Language:** Java  
- **GUI Framework:** Java Swing  
- **Data Structures Used:** Arrays, Lists, Queues, Priority Queues  
- **IDE Used:** VSCode  
- **Java Version:** JDK 17  

---

## 🔄 Workflow

1. Maze is generated using **Recursive DFS** algorithm.  
2. Difficulty can be adjusted dynamically using a slider.  
3. Select one of the algorithms: **DFS, BFS, Dijkstra, or A\***  
4. Click **"Generate Maze"** to create a new randomized layout.  
5. Click **"Solve"** to visualize how the selected algorithm finds the path.

---

## 🎨 Visualization

- The pathfinding process is **animated step-by-step** using timers.  
- **Start point:** 🟦 Blue  
- **End point:** 🟥 Red  
- **Path traced:** 🟩 Green  

---

## 📊 Algorithms Involved

### 🔹 DFS (Depth-First Search)
- Explores in depth-first manner.
- **Not guaranteed** to find the shortest path.

### 🔹 BFS (Breadth-First Search)
- Finds the **shortest path** in unweighted graphs.
- Can be **slower** due to wider exploration.

### 🔹 Dijkstra's Algorithm
- Guarantees the **shortest path**.
- Explores many nodes to ensure optimality.

### 🔹 A\* (A-Star Algorithm)
- Uses formula: **F = G + H** (cost + heuristic).
- Efficient and **guarantees optimal** path using heuristics (Manhattan distance).

---

## 👥 About the Team

| Name        | Role                    |
|-------------|-------------------------|
| Akshay      | Designer & Documentation |
| Hemanth     | Frontend Developer       |
| Raghu       | Frontend Developer       |
| Suresh      | Frontend Developer       |
| Sai Teja    | DFS Algorithm            |
| Veera Babu  | BFS Algorithm            |
| Bala Raju   | Dijkstra Algorithm       |
| Vinay       | A* Algorithm (Team Lead) |

