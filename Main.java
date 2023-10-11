import com.Graph.Graph;

import java.util.Scanner;

public class Main
{

  static Graph createGraph(){
    Scanner scan = new Scanner(System.in);
		int nVertices = scan.nextInt();
		int nEdges = scan.nextInt();
		return new Graph(nVertices, nEdges);
  }
  
  static void tryGraphBfs(){
    Graph g = createGraph();
    g.bfs(1);
  }

  static void tryGraph_Dfs_recusive(){
    Graph g = createGraph();
    g.dfs_recursive(1);
  }
  
  // actual
  static void actual(){
    // tryGraphBfs();
    tryGraph_Dfs_recusive();
  }

  // play ground
  static void playGround(){
    int[] visited = new int[3+1];
    for (int i: visited){
      System.out.println(i);
    }
  }
  
  // psvm
	public static void main(String[] args) {
    actual();
    // playGround();
	}
	
}

