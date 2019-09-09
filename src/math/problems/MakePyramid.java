package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int numberOfRows= 6;
        for (int i=1; i<=numberOfRows;i++){
            for (int j=numberOfRows-1; j>=i;j--){
                System.out.print(" ");
            }for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
  }
