package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class MultiDimentionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // {Section} Syntax on how to declare a Multi-dimensional array

        // datatype [][] object = { {} {} {} };

        int [][] numbers = {

                {1, 2, 3}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9}  // 2
        };

        //[Section ] Get the length

        // System.out.println(numbers.length);
        //System.out.println(numbers[0].length);

        // Invoke Element
       // System.out.println(numbers[0][1]);

        //[Section] Nested for loop -> Traversing a multi-dimensional array
      //  for(int i = 0; i < numbers.length; i++){ //outer loop (i -> rows)
        //    for(int j = 0; j < numbers[i].length; j++){
        //        System.out.println(numbers[i][j] + " ");
        //    }
        //    System.out.println(); //newline

      //  }

        // [Enchanced Nested for loop/for each loop

     //   for (int[]rows : numbers){
     //       for(int column : rows) {
      //          System.out.println(column);
      //      }
     //       System.out.println();

       // }

        //Syntax Multi-dimensional array with specified size only
        //datatype [][] array object = new datatype [rows] [column]

       // String [][] planets = new String[2][3];
       // planets[0][0] = "Mercury";
       // planets[0][1] = "Venus";
       // planets[0][2] = "Earth";

      //  planets[1][0] = "Mars";
      //  planets[1][1] = "Jupiter";
      //  planets[1][2] = "Saturn";

        //Multi dimensional array using Scanncer


        String[][] planets = new String[2][3];
        for(int i = 0; i < planets.length; i++){
            for(int j = 0; j < planets[i].length; j++){
                System.out.print("Enter planet [" + i + "][" + j + "]: ");
                planets[i][j] = scanner.nextLine();
            }
        }

        for (String[] rows : planets){
            for(String column : rows){
                System.out.println(column);
            }
            System.out.println();
        }
    }
}
