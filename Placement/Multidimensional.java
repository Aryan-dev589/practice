

import java.util.Scanner;
public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        int[][] arr =new int[3][3];

        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                arr[row][col]=sc.nextInt();
            }
        }
            for(int row=0;row<3;row++ ){
                for( int col=0;col<3;col++){
                    System.out.print(arr[row][col]+" ");

                }
                System.out.println();
            }
            sc.close();
            
        }
    }


    

