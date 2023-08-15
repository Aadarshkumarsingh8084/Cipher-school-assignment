--------------------------------CarStudy-------------------------------
  
class Car
{
    String name;
    String color;
    int year;
    int maxSpeed;
    void accelerate()
    {
        System.out.println("Car is accelerating");
    }
}


public class CarStudy
{
    public static void main(String[] args)
    {
        Car polo = new Car();
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
          
        polo.name="Polo";
        polo.color="Red";
        polo.year=2016;
        polo.maxSpeed=120;

        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
     
     }
}




-------------------------------ControlFlow-------------------------------

import java.util.*;
class Student
{
    String name;
    int marks;
    boolean checkPass()
    {
//        if(marks>40)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }

          if(marks>=40) return true;
          return false;
    }
}


public class ControlFlow
{
    int findMax(int a,int b,int c)
    {
        if(a>b)   //NESTED IF-ELSE
        {
            if(a>c)
            {
                return a;
            }
            else
            {
                return c;
            }
         }
         else
         {
             if(b>c)
             {
                 return b;
             }
             else
             {
                 return c;
             }
         }

    }
    public static void main(String[] args)
    {
         Student s1 = new Student();
         s1.name = "Ram";
         s1.marks = 80;

         Student s2 = new Student();
         s2.name = "Sham";
         s2.marks = 30;
    
         System.out.println(s1.name);
         System.out.println(s1.marks);
         System.out.println(s1.checkPass());
         System.out.println(s2.name);
         System.out.println(s2.marks);
         System.out.println(s2.checkPass());
           
         ControlFlow cf = new ControlFlow();
         System.out.println(cf.findMax(10, 7, 15));

         char c = 'a';

         switch(c)
         {
         case 'a':
             System.out.println("Hi, I'm A"); 
             break;  
         case 'b':
             System.out.println("Hi, I'm B");  
             break; 
         case 'c':
             System.out.println("Hi, I'm C");  
             break;
         default:
             System.out.println("I'm not A, B or C");    
         }
    }
}