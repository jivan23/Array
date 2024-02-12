import java.util.*;

class ArrayInJava {
    public static void main(String[] args)
    {

//   INPUT ARRAY BY USER 

    //     int arr[] =  new int[5];
        
    //     Scanner in= new Scanner(System.in);

    //    for(int i=0;i<arr.length;i++)
    //    {
    //     arr[i] = in.nextInt();
    //    }

    //    for(int i=0; i<arr.length;i++)
    //    {
    //     System.out.print(arr[i] + " ");
    // }


    // REVERSE ARRAY PROGRAM :

    // int numArr[] =new int[5];

    // Scanner in = new Scanner(System.in);
    // System.out.println(" Enter your array : ");

    // for(int i=0;i<numArr.length;i++)
    // {
    //     numArr[i]=in.nextInt();
    // }
   

    // System.out.println("Your entered array is : " + Arrays.toString(numArr));

    // int start = 0;
    // int end = numArr.length-1;

    // while (start < end)
    // {
    //     int temp = numArr[end];
    //     numArr[end]= numArr[start];
    //     numArr[start]=temp;

    //     start++;
    //     end--;
    // }

    // System.out.println("Reversal of the given array is :  " + Arrays.toString(numArr));


    int numArr[] =  new int[6];
    Scanner in = new Scanner(System.in);

    for(int i=0;i<numArr.length;i++)
    {
       numArr[i]= in.nextInt();
    }
    System.out.println(" Your entered array is :  " + Arrays.toString(numArr));


    // Arrays.sort(numArr);

    // System.out.println(" Sorted array is  : " + Arrays.toString(numArr));


    //  FIND LARGEST ELEMENT IN THE ARRAY: 
    // int LarNum = numArr[0];

    // for(int i=0;i<numArr.length;i++)
    // {
    //     if(numArr[i] > LarNum)
    //     {
    //         LarNum = numArr[i];
    //     }
    // }


     //  FIND Smallest ELEMENT IN THE ARRAY: 

    //  int smallNum = numArr[0];

    //  for(int i=0;i<numArr.length;i++)
    //  {
    //     if( smallNum > numArr[i] ) 
    //     {
    //         smallNum = numArr[i];
    //     }
    //  }

    // System.out.println( "The Smallest number in the given array is : " + smallNum);

    // Sum of the given array : 


    int arrSum = 0;
     
    for(int i=0;i<numArr.length;i++)
    {
        arrSum = arrSum + numArr[i];

    }

  System.out.println(arrSum);

}
}
