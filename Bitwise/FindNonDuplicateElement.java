package Bitwise;

public class FindNonDuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3,3,4,5,5};
        System.out.println(nonDuplicate(arr));
    }

    private static int nonDuplicate(int[] arr) {
        int unique=0;
        for(int n : arr)
        {
            unique=unique^n;
        }
        return unique;
    }
    //Properties of Bitwise Operator XOR applied to solve this
    //a^a=0
    //0^a=a
}
