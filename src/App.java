import java.util.Scanner;

public class App {
    public static void rotateArray(int[] arr, int count) {
        int[] rotatedArray = new int[arr.length];
        
        for (int i=0;i<arr.length;i++){
            int newIndex = (i + count) % arr.length;
            rotatedArray[newIndex] = arr[i];
        }
        
        for (int i=0;i<arr.length;i++){
            System.out.print(rotatedArray[i]+"-");
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int[] num = new int[5];
        int count = 0;
        
        for (int i=0;i<num.length;i++){
            System.out.print("Input Numbers = ");
            num[i] = sc.nextInt();
        }
        
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"-");
        }
        System.out.println("");
        System.out.print("Input Count Rotation = ");
        count = sc1.nextInt();
        
        rotateArray(num, count);
        
    }
}
