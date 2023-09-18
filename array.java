public class array{
  public static void main(String args[])
  {
//assignig a varaible to an array and allocating the memory to it dynamically
   int arr []=new int[5];
    arr[0]=5;
    arr[1]=1;
    arr[2]=4;
    arr[3]=7;
    arr[4]=9;

    for(int i =0 ;i<arr.length ;i++){
      System.out.println("elements of an array is "+ i +":" +arr[i]);
    }
  }
}

