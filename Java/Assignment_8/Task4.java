import java.util.Arrays;

public class Task4{
  public static void main(String[] args){
    int[][] adjMat = new int[7][7];
    
    //A
    adjMat[0][1] = 11;
    adjMat[0][3] = 13;
    adjMat[0][6] = 80;
    
    //B
    adjMat[1][2] = 4;
    adjMat[1][3] = 9;
    adjMat[1][4] = 50;
    adjMat[1][6] = 20;
    
    //C
    
    //D   
    adjMat[3][3] = 3;
    adjMat[3][4] = 7;
    
    //E
    adjMat[4][2] = 30;
    adjMat[4][4] = 5;
    adjMat[4][5] = 9;
    
    //F
    adjMat[5][2] = 6;
    adjMat[5][5] = 20;
    
    //G
    adjMat[6][2] = 18;
    adjMat[6][6] = 2;
    Edge[] adjList = adjMatToAdjList(adjMat);
    
    printMatrix(adjMat);
    System.out.println();
    convertToUndirected(adjMat);
    printMatrix(adjMat);
    
    System.out.println();
    
    printList(adjList);
    System.out.println();
    convertToUndirected(adjList);
    printList(adjList);
  }
  
  public static void convertToUndirected(int[][] adjMat){
    for (int i = 0; i < adjMat.length; i++){
      for (int j = i; j < adjMat[0].length; j++){
        if (adjMat[i][j] != 0 && adjMat[j][i] == 0){
          adjMat[j][i] = adjMat[i][j];
        }
        if (adjMat[i][j] == 0 && adjMat[j][i] != 0){
          adjMat[i][j] = adjMat[j][i];
        }
      }
    }
  }
  
  public static void convertToUndirected(Edge[] adjList){
    for (int i = 0; i < adjList.length; i++){
      Edge e = adjList[i];
      while (e != null){
        Character source = (Character)e.source;
        Character destination = (Character)e.destination;
        
        int destinationIndex = (int)destination - 'A';
        Edge d = adjList[destinationIndex];
        boolean sourceFound = false;
          while (d != null){
          if (d.destination == source){
            sourceFound = true;
            break;
          }
          d = d.next;
        }
        if (!sourceFound){
          Edge newNode = new Edge(destination, source, e.weight, adjList[destinationIndex]);
          adjList[destinationIndex] = newNode;
        }
        e = e.next;
      }
      
    }
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
  
  public static void printMatrix(int[][] adjMat){
    for (int[] i : adjMat)
      System.out.println(Arrays.toString(i));
  }
  
  public static void printList(Edge[] adjList){
    for (int i = 0; i < adjList.length; i++){
      Edge e = adjList[i];
      System.out.print((char)(i + 'A')+ ": ");
      while (e != null){
        if (e.next == null) {
          System.out.print(e.destination + "("+ e.weight+")");
          break;
        }
        System.out.print(e.destination + "("+ e.weight+")" + " -> ");
        e = e.next;
      }
      System.out.println();
    }    
  }
  
}