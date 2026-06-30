// int[][] matrix = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };

// Print the sum of elements of the rows
// public class day1 {

//     public static void main(String args[]) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
        
//         for(int i = 0 ; i<3;i++){
//             int sum=0;
//             for(int j=0;j<3;j++){
//                sum=sum+ matrix[i][j];
//             }
//             System.out.printf("Sum of Row %d : %d%n", i,sum);
            

//         }
//     }
// }


import java.util.ArrayList;

public class day1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1,9);
        list.set(1,6);
        list.addFirst(25);
        list.addLast(26);
        System.out.println(list);
    }
}