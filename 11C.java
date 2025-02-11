import java.util.Scanner;
class Input extends Thread {
private int total;
private int[] array;
public void run() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of Fibonacci numbers to generate: ");
total = sc.nextInt();
sc.close();
array = new int[total];
Fibonacci fib = new Fibonacci(total, array);
fib.start();
try {
fib.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Fibonacci Sequence:");
for (int i = 0; i <= array.length - 1; i++) {
System.out.print(array[i] + " ");
}
}
}
class Fibonacci extends Thread {
private int total;
private int[] array;
public Fibonacci(int total, int[] array) {
this.total = total;
this.array = array;
}
public void run() {
int n1 = 0, n2 = 1, temp;
for (int i = 0; i < total; i++) {
array[i] = n1;
temp = n1 + n2;
n1 = n2;
n2 = temp;
}
}
}
class Main{
public static void main(String[] args) {
Input input = new Input();
input.start();
}
}