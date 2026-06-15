# Online Food Delivery Simulation System

## Project Title

Online Food Delivery Simulation Using Graphs, Dijkstra Algorithm, and Queue

## Overview

The Online Food Delivery Simulation System is a Data Structures and Algorithms (DSA) project that simulates the workflow of an online food delivery service. The system manages customer orders, calculates the shortest delivery routes, and tracks deliveries efficiently using fundamental DSA concepts.

The project demonstrates the practical application of Graphs, Dijkstra's Algorithm, and Queue data structures in solving real-world delivery and logistics problems.

---

## Objectives

* Simulate an online food delivery environment.
* Manage customer orders using Queue.
* Find the shortest delivery path using Dijkstra's Algorithm.
* Represent delivery locations using Graphs.
* Track pending and completed deliveries.
* Analyze the efficiency of DSA techniques in logistics systems.

---

## DSA Concepts Used

### 1. Queue

The Queue data structure is used to manage customer orders in a First-In-First-Out (FIFO) manner.

Operations:

* Add Order
* Process Order
* View Pending Orders

### 2. Graph

The delivery network is represented using a Graph where:

* Vertices represent locations.
* Edges represent roads between locations.
* Weights represent distances.

### 3. Dijkstra Algorithm

Dijkstra's Algorithm is used to calculate the shortest path from the restaurant to customer locations.

Benefits:

* Faster deliveries
* Reduced travel distance
* Improved route optimization

---

## Features

### Order Management

* Add new customer orders.
* Store orders in a queue.
* Process orders sequentially.

### Delivery Tracking

* Track pending deliveries.
* Track completed deliveries.
* Display delivery status.

### Shortest Path Calculation

* Calculate shortest routes from restaurant to delivery locations.
* Display minimum distance to each location.

### Menu Driven System

* User-friendly console interface.
* Easy navigation through different operations.

---

## System Workflow

1. Customer places an order.
2. Order is added to the queue.
3. Delivery system calculates shortest route.
4. Delivery person processes order.
5. Order status is updated.
6. Delivery is completed.

---

## Classes Used

### Order Class

Stores:

* Order ID
* Customer Name
* Food Item
* Destination

### FoodDeliverySystem Class

Handles:

* Order Queue
* Graph Management
* Dijkstra Algorithm
* Delivery Tracking

---

## Time Complexity Analysis

| Operation          | Complexity |
| ------------------ | ---------- |
| Add Order          | O(1)       |
| Process Order      | O(1)       |
| View Orders        | O(n)       |
| Delivery Tracking  | O(n)       |
| Dijkstra Algorithm | O(V²)      |

Where:

* n = Number of Orders
* V = Number of Locations

---

## Advantages

* Fast order processing.
* Efficient route optimization.
* Easy delivery tracking.
* Demonstrates real-world DSA applications.
* Scalable for larger delivery networks.

---

## Limitations

* Console-based interface.
* Fixed graph size.
* No database integration.
* Limited to predefined locations.

---

## Future Enhancements

* GUI using Java Swing or JavaFX.
* Database integration using MySQL.
* Real-time GPS tracking.
* Multiple restaurants support.
* Dynamic route updates.
* Mobile application integration.

---

## Conclusion

The Online Food Delivery Simulation System successfully demonstrates the implementation of Queue, Graphs, and Dijkstra's Algorithm in a real-world scenario. The project efficiently manages orders, calculates optimal delivery routes, and tracks deliveries. It highlights how Data Structures and Algorithms can be applied to solve logistics and transportation problems in modern food delivery platforms.

## Technologies Used

* Java
* Queue (LinkedList)
* Graph (Adjacency Matrix)
* Dijkstra Algorithm
* Object-Oriented Programming (OOP)

## Learning Outcomes

After completing this project, students can understand:

* Queue implementation and management.
* Graph representation techniques.
* Dijkstra shortest path algorithm.
* Real-world applications of DSA.
* Time complexity analysis.
* Route optimization concepts.
* Delivery management systems.
