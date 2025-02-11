import java.util.* ; 
class Main {
    public static void main(String[] args) {
        int arr[][] = new int[5][];
        int count=1;
        System.out.println("Name-Advay" + "\n" + "Sap Id-60009220147");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count+j;
            }
        }
        System.out.println("The contents of jagged array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}
