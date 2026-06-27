// 1. Write a program to check if a given string is a palindrome (without using built-in reverse methods).
// import java.util.Scanner;
// public class practice_one {
     
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Enter the String : ");
//         String str = sc.nextLine(); 
//         int i = str.length()-1;
//         String rev = "";
//         while(i != -1){
         
//         char letter =str.charAt(i);
//         rev=rev + letter;
//         i--;
//         }
//         System.out.println("Reverse String is : " +rev);
        
//     }

// }

// Q2. Find the duplicate element in an array.

// Input: [1, 3, 4, 2, 2] → Output: 2

// public class practice_one{
//     public static void main(String[] args) {
//         int arr[] = {1,3,4,2,3};
//         int len = arr.length;
//         for(int i = 0 ; i < len;i++){
//             for(int j = i+1 ; j <len;j++ ){
//                    if(arr[i]==arr[j]){
//                     System.out.println("Duplicate element is : " + arr[i]);
//                    return;
//                    }
//                 }
            
//         }
//         System.out.println("NO duplicate Exists");
        
//     }
// }


// Q3. Check if a number is prime.

// Input: 7 → Output: true


 import java.util.Scanner;

 
public class practice_one {
      static boolean  prime(int a){
               
              for(int i = 2 ; i <= Math.sqrt(a);i++ )   {
                if(a%i == 0){
                    System.out.println("flase");
                    return false ;
                }
                
              } 
              return true;           
        }
    public static void main (String[] args){
        System.out.println("Enter a number ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println( prime(num) );

       
            
        
        
    }
}