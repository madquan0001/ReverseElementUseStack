package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack stack = new Stack();
        int[] array = {54, 12, 36, 97, 77};

        System.out.println("Your array : ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        for(int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }

        System.out.println("After reverse : ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}