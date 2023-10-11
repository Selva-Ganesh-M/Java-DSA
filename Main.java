import com.Graph.Graph;

import java.util.Scanner;

public class Main
{

  static void tryGraphBfs(){
    Scanner scan = new Scanner(System.in);
		int nVertices = scan.nextInt();
		int nEdges = scan.nextInt();
		Graph g = new Graph(nVertices, nEdges);
    g.bfs(1);
  }
  
  // actual
  static void actual(){
    // tryGraphBfs();
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

