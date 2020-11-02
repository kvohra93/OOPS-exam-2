package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;


public class UserArrays {
public static boolean equals(int[][] m1, int[][] m2){
   String a = Arrays.deepToString(m1);
   String b = Arrays.deepToString(m2);
   if (a.equals(b)){
       System.out.println("The two arrays are strictly identical");
       return true;
   }
   else {
       System.out.println("The two arrays are not strictly identical");
       return false;
   }
}
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int[][] m1 = new int[3][3];
        for (int i = 0;i<=2;i++){
            for (int j = 0; j<=2;j++){
                m1[i][j] = Integer.parseInt(scanner.next());
            }
        }
        System.out.print("Enter list2: ");
        int[][] m2 = new int [3][3];
            for (int i = 0;i<=2;i++){
                for (int j = 0; j<=2;j++){
                    m2[i][j] = Integer.parseInt(scanner.next());
            }
        }

           equals(m1,m2);
        
        
    }
    
}



    
     
     
      
     
    
    

