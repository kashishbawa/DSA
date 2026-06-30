
// Bubble Sorting 
import java.util.Arrays;
public class BubbleSort {
    public static void main (String args[]){
        int arr[] = {4,1,5,3,2};

      for(int i = arr.length ; i>0 ; i-- ){  
        for(int j = 0 ; j <  - 1 ; j++){
               
            if(arr[j] > arr[j+1]){
                    arr[j] = arr[j+1] +arr[j];
                    arr[j+1] = arr[j] -arr[j+1];
                    arr[j] = arr[j] -arr[j+1];
            }
            

} 
      }
System.out.println("Sorted array is : " + Arrays.toString(arr));   }
}
