import java.util.* ;
class Main {
public static void main(String[] args) {
int sum=0;
int arr1[] =new int[4];
int arr2[] = new int[4];
Scanner input = new Scanner(System.in);
System.out.println("Name-Advay Sharma" + "\n" + "Sap Id-60009220147");
System.out.print("Enter the values for array : " );
for(int i=0 ; i<arr1.length ; i++) {
arr1[i]=input.nextInt(); 
}
System.out.println("The  values are  : " );
for(int i=0 ; i<arr1.length ; i++) {
System.out.println(arr1[i]); 
}
for(int i=0 ; i<arr1.length ; i++) {
sum+=arr1[i]; 
}
System.out.println("The sum of elements of first array is : " + sum );
for(int i=0 ;  i<arr2.length ;  i++) {
arr2[i]=sum-arr1[i];
}
System.out.println("The new array is :  ");
for(int i=0 ;  i<arr2.length ;  i++) {
System.out.println(arr2[i]);
}
 }
}