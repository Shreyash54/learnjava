public class reverse{
  static void reversearray(int arr[],int start,int end){
    int temp ;// a local temp varaible unassigned

    //swapping of start and ends
    while(start<end){
      temp =arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
    
  }
  static void printarray(int arr[],int size){
    for(int i=0;i<size;i++){
      System.out.println("elememnst are :" + arr[i]);
      
    }
  }


  
  public static void main (String args[]){
    int arr[]={1,2,4,5,5,6,0};
    printarray(arr,7);
    reversearray(arr,0,6);
    System.out.println("elemets after reversal are:");
    printarray(arr,7);
    
  }
  
}