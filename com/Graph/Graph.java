package com.Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Graph{

  private int nVertices;
  private int nEdges;
  private ArrayList<ArrayList<Integer>> adjList;
  
  public void printAdjList(){
      if (this.adjList == null) return;
      for (int i=1; i<this.adjList.size(); i++){
          System.out.printf("%d -> ", i);
          for (int j=0; j<this.adjList.get(i).size(); j++){
              System.out.printf("%d ",   this.adjList.get(i).get(j));
          }
          System.out.println();
      }
  }

  // constructor
  public Graph (int nVertices, int nEdges){
      this.nVertices = nVertices;
      this.nEdges = nEdges;
      this.adjList = new ArrayList();
      
      // filling adjList with empty ArrayLists
      for (int i=0; i<nVertices+1; i++){
          this.adjList.add(new ArrayList());
      }
      
      Scanner scan = new Scanner(System.in);
      
      // filling the adjList
      for (int i=0; i<nEdges; i++){
          int x = scan.nextInt();
          int y = scan.nextInt();
          this.adjList.get(x).add(y);
          this.adjList.get(y).add(x);
      }
      
    // printing the adjList
      this.printAdjList();

  }

  // bfs region
  private void _bfs(int value, int[] visited){
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(value);
    while (queue.size()!=0){
      int currItem = queue.poll();
      // if not visited, visit and add neighbours to queue
      if (visited[currItem]!=1){
        visited[currItem] = 1;
        System.out.println(currItem);
        for (int relative: this.adjList.get(currItem)){
          if (visited[relative]!=1){
            queue.add(relative);
          }
        }
      }
    }
  }

  public void bfs(int value){
    int[] visited = new int[this.nVertices+1];
    this._bfs(value, visited);
    for (int i=1; i<visited.length; i++){
      if (visited[i]==0){
        this._bfs(i, visited);
      }
    }
  }

  // dfs region

  private void _dfs_recursive(int value, int[] visited){
    visited[value] = 1;
    System.out.println(value);
    for (int relative: this.adjList.get(value)){
      if (visited[relative]==0) this._dfs_recursive(relative, visited);
    }
  }
  public void dfs_recursive( int value ){
    int[] visited = new int[this.nVertices+1];
    for (int i=1; i<this.nVertices+1; i++){
      if (visited[i]==0)
    this._dfs_recursive(i, visited);
    }
  }
  
}
