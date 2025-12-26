import java.util.Scanner;

class CountOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of the Array:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0; i<n; i++){
            if(arr[i] % 2 == 0) {
                count ++;
            }
        }
        System.out.println("Count of Even Numbers in the Array is: " + count);
    }    
}
