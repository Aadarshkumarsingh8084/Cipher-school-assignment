----------------------Array----------------------
public class ArrayStudy
{
   static void print(int arr[])
   {
      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
   
   public static void main(String[] args)
   {

//  1.Array Creation Expression
      int size = 5;
      int arr[] = new int[size];
      System.out.println(arr[0]);
      System.out.println(arr[1]);
      System.out.println(arr[2]);
      System.out.println(arr[3]);
      System.out.println(arr[4]);

      print(arr);

      for(int i=0;i<size;i++)
      {
          arr[i] = i+1;
      }
      print(arr);


//  2.Array Initializers List
      int arr2[] = {1,2,3};
      print(arr2);

//    If we want to increase size of an Array?
      int copyArray[] = new int[2*size];
      for(int i=0;i<size;i++)
      {
          copyArray[i] = arr[i];
      }
      copyArray[5] = 6;
      copyArray[6] = 7;
      print(copyArray);
   }    
}


------------PassingArray--------------------
public class PassingArray
{
    static void addOne(int x)
    {
        x = x+1;
    }

    static void addOne(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]++;
        }
    }

    public static void main(String[] args)
    {
        int x = 10;
        addOne(x);
        System.out.pritnln(x);
 
        int arr[] = {1,2,3,4,5};

        addOne(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.pritnln(arr[i]+" ");
        }
        System.out.pritnln();
    }
}