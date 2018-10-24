package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[]{2, 55, 67, 33, 12, 78};
        int max = array [0];
        int  min = array[0];
        int sum;

        for (int i = 0; i < array.length; i++)
        {

            if (array[i] > max)
                max = array [i];
            if (array [i]< min)
                min = array[i];

        }
        sum = min+max;
        System.out.println ( "amount min+max = " + sum);




    }
}

