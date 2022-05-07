import java.util.Scanner;

class Run{
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        int size;
        System.out.println("Enter size");
        size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("fill array");
        for (int j=0; j<array.length; j++)
            array[j] = scanner.nextInt();
        Min_Max Minimum = new Min_Max();
        int min = Minimum.min(array);
        System.out.println("Min:" + min);
        Min_Max Maximum = new Min_Max();
        int max = Maximum.max(array);
        System.out.println("Max:" + max);
    }
}

public class Min_Max {
    public int max(int [] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}

