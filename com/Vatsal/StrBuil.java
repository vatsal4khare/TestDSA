package com.Vatsal;

public class StrBuil {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder("Vatsal");
        System.out.println(build);
        build.append(" Khare");
        System.out.println(build);
//      String builder always changes in the existing object instead of creating a new one to avoid extra memory usage
        //In case above, the originally created SB Vatsal is appended with  Khare not no new memory usage is done, hence SB is more efficient than String
        //Strings are immutable (coz Strings do not allow modifications in the existing objects unlike SB)
        //String Builder is mutable (coz this can be changed)
        System.out.println(build.deleteCharAt(6)); // Deleting space in between the name
    }
}
