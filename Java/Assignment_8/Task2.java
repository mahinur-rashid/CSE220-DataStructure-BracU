public class Task2{
  public static void main(String[] args){
    int[][] adjMat = new int[7][7];
    
    //A
    adjMat[0][1] = 11;
    adjMat[0][3] = 13;
    adjMat[0][6] = 80;
    
    //B
    adjMat[1][0] = 11;
    adjMat[1][2] = 4;
    adjMat[1][3] = 9;
    adjMat[1][4] = 50;
    adjMat[1][6] = 20;
    
    //C
    adjMat[2][1] = 4;
    adjMat[2][4] = 30;
    adjMat[2][5] = 6;
    adjMat[2][6] = 18;
    
    //D
    adjMat[3][0] = 13;
    adjMat[3][1] = 9;    
    adjMat[3][3] = 3;
    adjMat[3][4] = 7;
    
    //E
    adjMat[4][1] = 50;
    adjMat[4][2] = 30;
    adjMat[4][3] = 7;
    adjMat[4][4] = 5;
    adjMat[4][5] = 9;
    
    //F
    adjMat[5][2] = 6;
    adjMat[5][4] = 9;
    adjMat[5][5] = 20;
    
    //G
    adjMat[6][0] = 80;
    adjMat[6][1] = 20;
    adjMat[6][2] = 18;
    adjMat[6][6] = 2;
    
    Edge[] adjList = adjMatToAdjList(adjMat);
    
    System.out.println("Vertex with maximum sum of weight(Matrix): "+maxWeightVertex(adjMat));
    System.out.println("Vertex with maximum sum of weight(List): "+maxWeightVertex(adjList));
  }
  
  public static Character maxWeightVertex(int[][] adjMat){
    int rows = adjMat.length;
    int cols = adjMat[0].length;
    int maxSum = 0;
    int maxWeightVertex = 0;
    
    for (int r = 0; r < rows; r++){
      int sum = 0;
      for (int c = 0; c < cols; c++){
        sum += adjMat[r][c];
      }
      
      if (sum > maxSum|| r == 0){
        maxSum = sum;
        maxWeightVertex = r;
      }
    }
    return (char)(maxWeightVertex+'A');
  }
  
  public static Character maxWeightVertex(Edge[] adjList){
    int maxSum = 0;
    int maxWeightVertex = 0;
    
    for (int i = 0; i < adjList.length; i++){
      int sum = 0;
      Edge e = adjList[i];
      
      while (e != null){
        sum += e.weight;
        e = e.next;
      }
      
      if (sum > maxSum || i == 0){
        maxSum = sum;
        maxWeightVertex = i;
      }
    }
    return (char)(maxWeightVertex+'A');
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