package com.mycompany.app;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }
    
    public static boolean searchAndSum(ArrayList<Integer> array, int e, ArrayList<Integer> array2, int e2) {

        System.out.println("inside searchAndSum");

        boolean islem1 = false;
        boolean islem2 = false;
        int sum = 0;

        if (array != null)
            for (int elt : array)
                if (elt == e * e * e)
                    islem1 = true;

        if (array2 != null)
            for (int elt : array2)
                sum += elt * e;

        if (sum == e2)
            islem2 = true;

        return islem1 && islem2;

    }

}