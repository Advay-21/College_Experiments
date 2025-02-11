import java.util.Scanner;
class Pattern extends Thread {
private int n;
private char c;
public Pattern(int n, char c) {
this.n = n;
this.c = c;
}
public void run() {
for (int i = 0; i <= n; i++) {
System.out.print(c + "");
try {
Thread.sleep(100);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
 class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of Charecters for pattern: ");
int temp = sc.nextInt();
Pattern p1 = new Pattern(temp, '*');
Pattern p2 = new Pattern(temp, '/');
p1.start();
try {
Thread.sleep(5);
} catch (InterruptedException e) {
e.printStackTrace();
}
p2.start();

}
}