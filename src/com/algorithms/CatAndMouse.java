package com.algorithms;

/*
    Hackerrank link:
        https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
*/
public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
       return  (Math.abs(x - z) < Math.abs(y - z)) ? "Cat A" : (Math.abs(y - z) < Math.abs(x - z)) ? "Cat B" : "Mouse C";

    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 4;

        System.out.println(CatAndMouse.catAndMouse(x,y,z));
    }
}
