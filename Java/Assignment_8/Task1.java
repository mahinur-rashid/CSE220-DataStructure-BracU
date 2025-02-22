public class Task1{
  public static void main(String[] args){
    int[][] adjMat = new int[7][7];
    
    //A
    adjMat[0][1] = 1;
    adjMat[0][3] = 1;
    adjMat[0][6] = 1;
    
    //B
    adjMat[1][0] = 1;
    adjMat[1][2] = 1;
    adjMat[1][3] = 1;
    adjMat[1][4] = 1;
    adjMat[1][6] = 1;
    
    //C
    adjMat[2][1] = 1;
    adjMat[2][4] = 1;
    adjMat[2][5] = 1;
    adjMat[2][6] = 1;
    
    //D
    adjMat[3][0] = 1;
    adjMat[3][1] = 1;    
    adjMat[3][3] = 1;
    adjMat[3][4] = 1;
    
    //E
    adjMat[4][1] = 1;
    adjMat[4][2] = 1;
    adjMat[4][3] = 1;
    adjMat[4][4] = 1;
    adjMat[4][5] = 1;
    
    //F
    adjMat[5][2] = 1;
    adjMat[5][4] = 1;
    adjMat[5][5] = 1;
    
    //G
    adjMat[6][0] = 1;
    adjMat[6][1] = 1;
    adjMat[6][2] = 1;
    adjMat[6][6] = 1;
    
    Edge[] adjList = adjMatToAdjList(adjMat);
    
    System.out.println("Max degree from Adjacency Matrix: "+maxDegree(adjMat));
    System.out.println("Max degree from Adjacency List: "+maxDegree(adjList));
  }
  
  public static int maxDegree(int[][] adjMat){
    int rows = adjMat.length;
    int cols = adjMat[0].length;
    int maxDegree = 0;
    
    for (int r = 0; r < rows; r++){
      int degree = 0;
      for (int c = 0; c < cols; c++){
        if (adjMat[r][c] != 0) degree++;
      }
      
      if (degree > maxDegree) maxDegree = degree;
    }
    return maxDegree;
  }
  
  public static int maxDegree(Edge[] adjList){
    int maxDegree = 0;
    for (int i = 0; i < adjList.length; i++){
      Edge e = adjList[i];
      int degree = 0;
      
      while (e != null){
        degree++;
        e = e.next;
      }
      if (degree > maxDegree) maxDegree = degree;
    }
    return maxDegree;
  }
  
  public static Edge[] adjMatToAdjList(int[][] adjMat){
    Edge[] adjList = new Edge[adjMat.length];
    
    for (int r = 0; r < adjMat.length; r++){
      Edge head = null, tail = head;
      for (int c = 0; c < adjMat[r].length; c++){
        if (adjMat[r][c] != 0){
          if (adjList[r] == null){
            head = new Edge((char)(r+'A'), (char)(c+'A'), adjMat[r][c], null);
            tail = head;
            adjList[r] = head;
          }
          else{
            Edge e = new Edge((char)(r+'A'), (char)(c+'A'), adjMat[r][c], null);
            tail.next = e;
            tail = e;
          }
        }        
      }      
    }
    return adjList;
  }
}

class Edge{
  Object source = null;
  Object destination = null;
  int weight = 1;
  Edge next = null;
  
  public Edge(Object source, Object destination, int weight, Edge next){
    this.source = source;
    this.destination = destination;
    this.weight = weight;
    this.next = next;
  }
  public Edge(Object source, Object destination, Edge next){
    this.source = source;
    this.destination = destination;
    this.next = next;
  }  
}