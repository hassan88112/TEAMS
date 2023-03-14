package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int counter=0;

        while ( size != 0){
            int t1 =input.nextInt();
            int t2 =input.nextInt();
            int t3 =input.nextInt();
            if (t1+t2+t3 >= 2){
                counter++;
            }
            size--;
        }
        System.out.println(counter);
    }
}