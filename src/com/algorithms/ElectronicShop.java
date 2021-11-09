package com.algorithms;

/*
    Hackerrank challenge:
                    https://www.hackerrank.com/challenges/electronics-shop/problem?h_r=internal-search
 */

public class ElectronicShop {
    public static int getMoneySpent(){
        int b = 60;
        int[] keyboards = {40,60,50};
        int[] drives = {5,8,12};
        int cost = 0;

        for (int drive : drives){
            for (int keyboard : keyboards) {
                if (keyboard + drive <= b && keyboard + drive > cost){
                   cost =  keyboard + drive;
                }
            }
        }
        if (cost != 0) {
            return cost;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("ELECTRONIC SHOP:\n" + ElectronicShop.getMoneySpent());
    }
}