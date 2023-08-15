---------------Jagged Aarray--------------
 public class JaggedArrays
{
    static void printJaggedArray(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
             for(int j=0;j<arr[i].length;j++)
             {
                 System.out.print(arr[i][j]+" ");
             } 
             System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

        printJaggedArray(arr);

        int arr2[][] = new int[3][];
//      arr2[0]={1,2,3};
//      arr2[1]={2,3};
//      arr2[2]={4,5,6};

        arr2[0]=new int[] {1,2,3};
        arr2[1]=new int[] {2,3};
        arr2[2]=new int[] {4,5,6};
        System.out.println("****************************");
        printJaggedArray(arr2);
    }
}

-----------------Scanner----------------------
import java.util.*;

public class ScannerStudy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstname = sc.next();
        String lastname = sc.next();
        System.out.println("Please enter your profession: ");      
        String profession = sc.next();
        System.out.println("Please enter your profession: "); 
        sc.nextLine();     
        String address = sc.nextLine();
        System.out.println("Please enter your number: ");
        int number = sc.nextInt(); 

        


        System.out.println("First Name: "+firstname);  
        System.out.println("Last Name: "+lastname);  
        System.out.println("Profession: "+profession); 
        System.out.println("Address: "+address); 
        System.out.println("Number: "+number); 
         
    }
}

----------------Scanner2----------------
import java.util.*;

public class ScannerStudy2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstname = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastname = sc.nextLine();
        System.out.println("Please enter your profession: ");      
        String profession = sc.nextLine();
        System.out.println("Please enter your profession: ");     
        String address = sc.nextLine();
        System.out.println("Please enter your number: ");
        int number = sc.nextInt(); 

        


        System.out.println("First Name: "+firstname);  
        System.out.println("Last Name: "+lastname);  
        System.out.println("Profession: "+profession); 
        System.out.println("Address: "+address); 
        System.out.println("Number: "+number); 
         
    }
}