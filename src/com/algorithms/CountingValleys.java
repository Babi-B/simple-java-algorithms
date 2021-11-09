package com.algorithms;
/*
    Hackerrank: https://www.hackerrank.com/challenges/counting-valleys/
*/
public class CountingValleys {
    public static int countingValleys(String path) {
        int valleys = 0;
        int level = 0;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'U'){
                level++;
                if (level == 0){
                    valleys++;
                }
            }
            else
                level--;
        }
        return valleys;

    }

    public static void main(String[] args) {
        System.out.println(CountingValleys.countingValleys("UDDDUDUU"));
    }
}
