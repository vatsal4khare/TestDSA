package com.Vatsal;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter a String to check for palindrome ");
//        String a = obj.nextLine();
        String a ="abccya";
        System.out.println(palindrome(String.valueOf(a)));
    }
    public static boolean palindrome(String a){
        a=a.toLowerCase();
        int start =0;
        int end =a.length()-1;
        while(start<end)
        {
            if (a.charAt(start)!=a.charAt(end))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }
}
