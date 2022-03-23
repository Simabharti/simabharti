package com.sima;

import java.util.Arrays;

public class reversthe_array {
    public static void main(String[] args) {
        int arr2[] = {12, 34, 54, 3, 4, 22, 55};
        System.out.print("print the orignal array befor reverse:--");
        System.out.print(Arrays.toString(arr2));
        {
            System.out.println( );
        }
        int i;
        for (i = 0; i <= arr2.length / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
        }
        System.out.println(" Print the array after reverse  :---"+ Arrays.toString(arr2));

        //   }

    }
}
