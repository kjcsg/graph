Objective:

Represent a map of a city subway system using a Graph data structure and calculate the distance from one station to another following a specified path. You must use the adjacency list approach in your Graph class. The Metro Station Map that you'll use for this assignment is in the Assignment 9 folder.

Requirements:

You must have the following three classes: Main.java, Graph.java, Edge.java.
Start with the provided template files for Graph.java and Edge.java that are in the Assignment 9 folder. You can add any additional methods you need to these classes.
Create your own Main.java
You must use the adjacency list approach in your Graph class.
Your graph must be undirected, so your method that creates connections must create them in both directions.
Flow of the main method:

Create an instance of the Graph class and add the connections (with edge weights) from the provided subway map.

Using your Graph object, determine the travel time from station 6 to station 2 when taking the following path: 6,3,1,2

For the travel time part, do not just manually sum up the travel times from the Map that was provided. Create a method in the Graph class that can calculate the distance of a path by using the adjacency list that exists inside the Graph. This method should take the desired path as an input argument and return the total distance.