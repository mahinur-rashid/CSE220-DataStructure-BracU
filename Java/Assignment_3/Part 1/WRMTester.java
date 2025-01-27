import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WRM wrm = new WRM();
        while (true){
            System.out.println("** Welcome to Waiting Room Management System **");
        
            System.out.println("0. Register Patient\n" +
                    "1. Serve Patient\n" +
                    "2. Show All Patient\n" +
                    "3. Can Doctor go Home\n" +
                    "4. Cancel All Appointments\n" +
                    "5. Reverse the line\n" +
                    "6. Exit Program");
            
            String input = sc.nextLine();
            if (input.equals("0")){
                    System.out.println("Enter Patient details: ");
                    System.out.print("enter Patient Id: ");
                    int id = sc.nextInt();
                    
                    System.out.print("Name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    
                    System.out.print("Enter Blood group: ");
                    sc.nextLine(); 
                    String blood = sc.nextLine();
                    wrm.registerPatient(id, name, age, blood);
            }
            else if(input.equals("1")){wrm.servePatient();}
            else if(input.equals("2")){wrm.showAllPatient();}
            else if(input.equals("3")){
                Boolean  isTrue = wrm.canDoctorGoHome();   
                if (isTrue == true){
                    System.out.println("Doctor can go Home.");
                } 
                else{
                    System.out.println("Doctor can not go Home.");
                }
            }
            else if(input.equals("4")){wrm.cancelAll();}
            else if(input.equals("5")){wrm.reverseTheLine();}
            else if(input.equals("6")){break;}
            else{
                System.out.println("Invalid option. Try Again!");
            }
            System.out.println();
   
        }
 
        sc.close();
    }
}
