class Table extends Thread {
private int n;
public Table(int n) {
this.n = n;
}
public void run() {
for (int i = 1; i <= 10; i++) {
System.out.println(+n + "*" + i + "=" + (n * i));
}
System.out.println("________________");
}
}
class Main{
public static void main(String args[]) {
Table t1 = new Table(5);
Table t2 = new Table(6);
Table t3 = new Table(13);
t1.start();
try {
Thread.sleep(100);
} catch (InterruptedException e) {
e.printStackTrace();
}
t2.start();
try {
Thread.sleep(100);
} catch (InterruptedException e) {
e.printStackTrace();
}
t3.start();
}
}