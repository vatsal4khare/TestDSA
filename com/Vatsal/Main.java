package com.Vatsal;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        int a = 0;
//        int b = 0;
//        a=1/10; // Removes the last digit and gives us back the rest of the number
//        b=1%10; // Gives us the last digit of any number
//        System.out.println(a);
//        System.out.println(b);



        //1
        //1d array
//        int[] a = new int[10];
//        a[0]=1 ;
//        int[] b ={1,2,3,4,5};
//        System.out.println(b[0]);
         //2
        //2d array
//        Scanner scan =new Scanner(System.in);
//        int [][] arr=new int[3][2];

        //Taking input
//        for(int row = 0 ; row<arr.length ; row++)
//        {
//            for (int col = 0 ; col < arr[row].length ; col++)
//            {
//                arr[row][col]= scan.nextInt();
//            }
//        }
        // Printing output
//        for(int row = 0 ; row<arr.length ; row++)
//        {
//    for (int[] a : arr)
//    {System.out.println(Arrays.toString(a));
//            System.out.println();
//            for (int col = 0 ; col < arr[row].length ; col++)
//            {
//                System.out.print(arr[row][col]+" " );
//            }
//        }

        //Fibonacci Series
        //Q - Find the nth fibonacci series

//        0,1,    1,2,3,5,8,13
//
//        int firstnumber=0;
//        int secondnumber=1;
//        int ans=0;
//
//        for(int i = 0 ;i<=7;i ++) {
//            System.out.print(firstnumber + " ");
//            ans = firstnumber + secondnumber;
//            firstnumber = secondnumber;
//            secondnumber=ans;
//        }

        //Q - Find occurences of a digit in the number given
//        int a = 1234555678;
//        String target="5";
//        int count=0;
//        String x =Integer.toString(a);
//        for(int i = 0 ;i<x.length() ;i ++)
//        {
//            if(target.equals(Character.toString(x.charAt(i))))
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        //Second way to do the above question
//        int a = 1234555678;
//        int target=5;
//        int count=0;
//        int ans =0;
//
//        while(a>0)
//        {
//            ans=a%10;
//            if(ans==target)
//            {
//                count++;
//            }
//            a=a/10;
//
//        }
//        System.out.println(count);

        //Q - Reverse a number
//        int a = 79532;
//        int lastdigit=0;
//        int newnum=0;
//        for(int i = 0 ; i < a ; i++)
//        {
//            lastdigit=a%10;
//            newnum=newnum*10+lastdigit;
//            System.out.print(lastdigit);
//            a=a/10;
//        }
//        System.out.println();
//        System.out.println(newnum);

        //Q - Prime Number

//        int x = 83;
//        int count = 0;
//        for(int i = 1 ; i <= x ; i ++)
//        {
//            if(x%i==0)
//            {
//                count++;
//            }
//        }
//        if(count==2)
//        {
//            System.out.println(x+" is a PrimeNumber");
//        }
//        else {
//            System.out.println(x+" is not a PrimeNumber");
//        }

        //Q - Print all the 3 digits Armstrong number - Armstrong number is a number whose sum of the cubes of their digits is equal to the actual number
//        int target =153;
//        int x = 153;
//        int lastdigit = 0;
//        int sum = 0 ;
//        while(!(x==0)){
//            lastdigit=x%10;
//            sum = sum+ (lastdigit*lastdigit*lastdigit);
//            x=x/10;
//
//        }
//        if(sum==target)
//        {
//            System.out.println(target+" is an ArmstrongNumber");
//        }
//        else {
//            System.out.println(target+" is not an ArmstrongNumber");
//        }

         //3 Array Lists
//        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(25);
//        list.add(125);
//        list.add(225);
//        System.out.println(list.contains(2));
//        System.out.println(list);
//        list.set(0,2);
//        System.out.println(list.contains(2));
//        System.out.println(list);

        //Q - Find biggest element in an array
//        int[] arr={25,625,225};
//        int max= arr[0];
//        for (int i = 1 ; i < arr.length ; i ++)
//        {
//         if(arr[i]>max)
//         {
//             max=arr[i];
//         }
//        }
//        System.out.println(max);


        //Q - Reverse an array
//        int[] arr={25,625,225};
//        int start = 0;
//        int end = arr.length-1;
//        int temp ;
//
//        while (start<end)
//        {
//            temp = arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));

        //Q - Find an element in an array using Linear Search
//        int[] arr={25,4,5,7,10};
//        int target = 2;
//        for(int i = 0 ; i <= arr.length-1;i++)
//        {
//            if(target==arr[i])
//            {
//                System.out.println("Element found at index= " + i);
//                break;
//            }
//            else if(i+2>arr.length)
//            {
//                System.out.println("Element not found");
//            }
//        }

        //Q - Find min element in an array using Linear Search
//        int[] arr={25,625,2,225};
//        int min= arr[0];
//        for (int i = 1 ; i < arr.length ; i ++)
//        {
//         if(arr[i]<min)
//         {
//             min=arr[i];
//         }
//        }
//        System.out.println(min);

        //Q - Find an element in a 2d array
//        int[][] arr= {
//                {23,4,1},
//                {18,12,3,9},
//                {78,99,34,56},
//                {18,12}
//        };
//        int target = 12;
//
//        for(int i= 0 ; i < arr.length;i++)
//        {
//            for(int j = 0 ; j < arr[i].length;j++) {
//                if (target == arr[i][j]) {
//                    System.out.println("Element found at row = "+i+" and column = " + j);
//                    break;
//                }
//            }
//        }

        //Q - How many elements in an array contain even number of digits
//        int[] arr={12,345,2,6,7896};
//        int evencount=0;
//        int count=1;
//        for(int i = 0 ; i < arr.length ; i ++)
//        {
//            while(!(arr[i]==0)) {
//                arr[i] = arr[i] / 10;
//                if (!(arr[i] == 0)) {
//                    count++;
//                }
//                if (arr[i] == 0 && count%2==0) {
//                    evencount++;
//                }
//            }
//        }
//        System.out.println(evencount);

        //Q - Richest customer wealth - Find the sum of wealth of a person in all his accounts combined
        //{{account1 of person 1,a2p1,a3p1},{a1p2,a2p2,a3p3}}
//        int[][] arr={{1,2,9},{3,2,3}};
//        int sum=0;
//        int Richest=0;
//        for(int i = 0 ; i < arr.length ; i ++)
//        {
//            for (int j = 0 ; j <arr[i].length ; j ++)
//            {
//                sum=sum+arr[i][j];
//            }
//            System.out.println("Wealth of customer number "+ (i+1) + " is " +sum);
//            if(Richest<sum)
//            {
//                Richest=sum;
//            }
//            sum=0;
//        }
//        System.out.println("Richest customer wealth is " + Richest);

        //Q - Binary Search
//        int[] arr={2,4,6,9,11,12,14,20,36,48};
//        int target = 888;
//        int start = 0;
//        int end = arr.length-1;
//        int mid = 0;
//        for (int i = start ; i < end ; i ++) {
//            mid = Math.round((start + end) / 2);
//            if (arr[mid] == target) {
//                System.out.println("Element found " + mid);
//                break;
//            } else {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                }
//            }
//        }

        //Another way - using while loop
//        int[] arr={2,4,6,9,11,12,14,20,36,48};
//        int target = 48;
//        int start = 0;
//        int end = arr.length-1;
//        int mid = 0;
//
//        while(start<=end)
//        {
//            mid =Math.round((start+end)/2);
//            if(target>arr[mid])
//            {
//                start=mid+1;
//            } else if (target<arr[mid]) {
//                end=mid-1;
//            }
//            else
//            {
//                System.out.println("Element found at " + mid);
//                break;
//            }
//        }

        //Q - Find the first number in an array which is bigger than the target element - Cieling of a number

//        int[] arr ={2,4,8,10,12,14,15,16,17,20,22};
//        int start = 0 ;
//        int end = arr.length-1;
//        int mid;
//        int target = 13;
//        while(start<=end)
//        {
//            mid = Math.round((start+end)/2);
//
//            if(target>arr[mid])
//            {
//                start=mid+1;
//            }
//            else if (target<arr[mid])
//            {
//                end=mid-1;
//            }
//            else
//            {
//                System.out.println("Element found at "+mid);
//                break;
//            }
//        }
//        System.out.println(arr[start]); //ans - When we are looking for cieling of a number, we revert the start when while loop breaks i.e start =end+1
        //Explanantion written in DSA notebook below green pen

        //Q - Find the largest smaller element than the target element in an array- Floor of a number

//        int[] arr ={2,4,8,11,15,16,17,20,22};
//        int start = 0 ;
//        int end = arr.length-1;
//        int mid;
//        int target = 19;
//        while(start<=end)
//        {
//            mid = Math.round((start+end)/2);
//
//            if(target>arr[mid])
//            {
//                start=mid+1;
//            }
//            else if (target<arr[mid])
//            {
//                end=mid-1;
//            }
//            else
//            {
//                System.out.println("Element found at "+mid);
//                break;
//            }
//        }
//        System.out.println(arr[end]); // Changed this last statement of the previous cieling question code, and the answer of the floor question is found

        //Q - Find smallest letter greater than the target - Cieling of a letter
        //P.S. - The array is a wrapped arrya - Meaning in circular type. After last element, first element will come again
//        char[] arr ={'a','b','f','h'};
//        int start = 0 ;
//        int end = arr.length-1;
//        int mid;
//        int target = 'c';
//        while(start<=end)
//        {
//            mid = Math.round((start+end)/2);
//
//            if(target>arr[mid])
//            {
//                start=mid+1;
//            }
//            else if (target<arr[mid])
//            {
//                end=mid-1;
//            }
//        }
//        System.out.println(arr[start%arr.length]);
        //This (arr[start%arr.length]) depicts that whenever the answer is not found from within the array, we will end up going beyond the array and at that time we want to return the first element, so dividing the
        // element when the loop has ended (which is end+1 i.e start) with the length of array will give us 1(index) and that element can then be returned

        //Q - Find first and last position of a target element in an array

//        int[] arr={5,7,7,8,8,8,10};
//        int start = 0 ;
//        int end = arr.length-1;
//        int target = 8 ;
//        int[] ans={-1,-1};
//
//        while(start<end)
//        {
//            if(arr[start]==target && ans[0]==-1)
//            {
//                ans[0]=start;
//                start=start+1;
//
//            }
//            else if (arr[end]==target && ans[1]==-1)
//            {
//                ans[1]=end;
//                end=end-1;
//
//            }
//                start=start+1;
//                end=end-1;
//
//        }
//        System.out.println(Arrays.toString(ans));




//        String data="15.990";
//        String str = Double.toString(Double.parseDouble(data));
//        if (str.contains(".")) {
//            str = str.replaceAll("0*$", "").replaceAll("\\.$", "");
//        }
//        System.out.println(str);























    }
    }
