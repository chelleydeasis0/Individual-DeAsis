package com.joysistvi.stage1.day9;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 10;  i++) {
                for (int j = 1; j <= 10; j++) {
                    int product = i * j;
                    System.out.println(i + " * " + j + " = " + product);
                }

                System.out.println();
            }

    }
}


//for (int i = 0; i <= 3; i++) {
//            System.out.println(i); // outer for loop
//                        //j 1<=3
//            for (int j = 0; j <= 3; j++) { // inner for loop
//                System.out.println("\t" + j);
//            }


// for (int i = 8; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();


// for (int i = 1; i <= 10; i++) {

        // for (int j = 1; j <= 10; j++) {
      //  if (j == 5) {
     //   break;
     //   }

     //   System.out.println(i + " " + j);
      //      }

      //              System.out.println();
      //  }

        /*

         */