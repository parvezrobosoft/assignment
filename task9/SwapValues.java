package task9;

public class SwapValues{


    public static <T> void swap(T[] array, int i, int j)
    {

        T temp = array[i-1];
        array[i-1] = array[j-1];
        array[j-1] = temp;

    }
    public static <T> void print(T[] array)
    {
        for (T i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] iArray = {12, 21, 34,64, 75};
        System.out.println("Before swap: ");

        print(iArray);

        swap(iArray, 1, 3);
        System.out.println("After swap: ");

        print(iArray);

        String[] sArray = {"apple", "ball", "cat"};
        System.out.println("Before swap: ");

        print(sArray);

        swap(sArray, 1, 2);
        System.out.println("After swap: ");

        print(sArray);
    }

}