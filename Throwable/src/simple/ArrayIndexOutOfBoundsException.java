package simple;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsException {
    public static void main(String []args)
    {
        int[] array= new int[5];
        Arrays.fill(array,8);
        for(int i=0;i<6;i++)
        {
            System.out.println("array["+ i + "]=" + array[i]);
        }
    }
}
