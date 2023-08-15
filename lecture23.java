import java.util.*;
public class StringStudy
{
    public static void main(String[] args)
    {
        String name = "CipherSchools";
        String name2 = "CipherSchools";

        String name3 = new String("CipherSchools");
        String name4 = new String("CipherSchools");
       
        System.out.println(name==name2);
        System.out.println(name3==name4);
        System.out.println(name==name3);

        
        System.out.println("*****************************************");
        System.out.println("1. CONCATENATION");
        String s1 = "Hello";
        s1 = s1+" Peeps";
        System.out.println(s1);
        System.out.println(s1 + " How are you doing");
        System.out.println(s1); 
   
//      Another way to concatenate    
        String s2 = new String("Hello");
        String s3 = new String(" People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);

        System.out.println("*****************************************");
        System.out.println("2. CHECKING IF STRINGS ARE EQUAL IN VALUE");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        System.out.println("*****************************************");
        System.out.println("3. CREATING NEW STRING OBJECT FROM CHARACTER ARRAY");
        char arr[] = {'C','I','P','H','E','R'};
        String strFromArr = new String(arr);
        System.out.println(strFromArr);

        System.out.println("*****************************************");
        System.out.println("4. CREATING AN PARTIAL STRING OBJECT FROM CHARACTER ARRAY");
        String partialStrFromArr = new String(arr,1,3);
        System.out.println(partialStrFromArr);
        String partialStrFromArr2 = new String(arr,2,3);
        System.out.println(partialStrFromArr2);

        System.out.println("*****************************************");
        System.out.println("5. CHANGING THE CASE");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);

        System.out.println("*****************************************");
        System.out.println("6. SPLITTING");
        System.out.println("Please enter your full name: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String strArr[] = fullName.split(" ");
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
        }
        System.out.println("Please enter something separated by commas: ");
        String csvText = sc.nextLine();
        String csvArr[] = csvText.split(",");
        for(int i=0;i<csvArr.length;i++)
        {
            System.out.println(csvArr[i]);
        }
       System.out.println("Please enter something separated by dots: ");
        String dotText = sc.nextLine();
        String dotArr[] = dotText.split("[.]");//a dot is a meta char in regex,so we need to use it inside a square bracetes
        for(int i=0;i<dotArr.length;i++)
        {
            System.out.println(dotArr[i]);
        }
        String backSlashText = "Hello,I attend \"Java\"class";
        String backSlashArr[] = backSlashText.split("\"");
        for(int i=0;i<backSlashArr.length;i++)
        {
            System.out.println(backSlashArr[i]);
        }

System.out.println("*****************************************");
        System.out.println("7. LENGTH OF A STRING");
        int len = name.length();
        System.out.println("Length of : "+ name +" is: "+len);

System.out.println("*****************************************");
        System.out.println("8. FINDING INDEX OF A CHAR IN A STRING");
        int index = name.indexOf('e');
        System.out.println("Index of 'e' in "+name+" is: "+index);
        int index2 = name.indexOf('E');
        System.out.println("Index of 'E' in "+name+" is: "+index2);
        int index3 = name.indexOf('School');
        System.out.println("Index of School in "+name+" is: "+index3)
        int index4 = name.indexOf('o',10);
        System.out.println("Index of 'o' in "+name+" is: "+index4);
        int index5 = name.indexOf('o');
        System.out.println("Index of 'o' in "+name+" is: "+index5);
        int indexOfO;
        while(true)
        {
            indexOfO = name.indexOfO('o',0);
            if(indexOfO == -1) break;
            System.out.println("'O' found at: "+indexOfO);   
        }

        
   }
}