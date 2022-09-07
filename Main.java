package com.company;

import java.util.Arrays;

public class Main {
    static boolean fascinating(long n) {
        // code here
        String num = Long.toString(n);
        String m2 = Long.toString(n*2);
        String m3 = Long.toString(n*3);

        String f = n+m2+m3;

//        char arr[] = new char[9];



        char[] arr = new char[f.length()];

        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < f.length(); i++) {
            arr[i] = f.charAt(i);
        }

//        arr = f.toCharArray();
        Arrays.sort(arr);
//        f = Arrays.toString(arr);
        for (int i = 0; i < f.length(); i++) {
            arr[i] = f.charAt(i);
        }
        if(f=="123456789")
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(fascinating(192));

    }
}
