package com.Vatsal;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class PrettyPrint {
    public static void main(String[] args) {
        float a=1.222f;
        System.out.println(a);
        System.out.printf(String.valueOf(a));
        //Printing always calls toString function hence wrapped inside String
        System.out.println();//newline
        System.out.printf( "%.2f" , a); //also rounds off the values
        System.out.println();
        a=1.227f;
        System.out.printf( "%.2f" , a); //also rounds off the values
        System.out.println();
        //Operator +
        System.out.println("1" + 1);
        System.out.println(1 + 1);
        System.out.println("a"+ 'a');
        System.out.println('b'+'c'); //Uses ASCII values
        System.out.println('a'+4);
        System.out.println(new int[] {} +""+ new ArrayList<>()); //Not using "" in between will give us error because for operator + one of the variable needs to be a string

        System.out.printf("Learning placeholders with name %s %s", "Vatsal", "Khare");
        //placeholders list

//        %c - Character
//        %d - Decimal number (base 10)
//        %e - Exponential floating-point number
//        %f - Floating-point number
//        %i - Integer (base 10)
//        %o - Octal number (base 8)
//        %s - String
//        %u - Unsigned decimal (integer) number
//        %x - Hexadecimal number (base 16)
//        %t - Date/time
//        %n - Newline

    }
}
