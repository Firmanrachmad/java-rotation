import java.util.Scanner;

public class App {
    public static void rotateArray(int[] arr, int count) {
        // make new array which is the every indexes contains 0 value
        int[] rotatedArray = new int[arr.length];
        
        // Fill the value, based on the inputted array value
        for (int i=0;i<arr.length;i++){
            // To prevent the excession of the inputted array index, it should modulo the length value
            int newIndex = (i + count) % arr.length;
            // Fill the value 
            rotatedArray[newIndex] = arr[i];
        }
        
        // Results
        for (int i=0;i<arr.length;i++){
            System.out.print(rotatedArray[i]+"-");
        }
        
        
    }
    public static void main(String[] args) {
        // Declare Array,Variables, and Input System
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int[] num = new int[5];
        int count = 0;
        
        // Input Array numbers
        for (int i=0;i<num.length;i++){
            System.out.print("Input Numbers = ");
            num[i] = sc.nextInt();
        }
        
        // Print Inputted Array numbers
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"-");
        }

        // Input the rotation count
        System.out.println("");
        System.out.print("Input Count Rotation = ");
        count = sc1.nextInt();
        
        // Call function rotateArray with the parameters of inputted array numbers and count numbers
        rotateArray(num, count);
        
    }
}
