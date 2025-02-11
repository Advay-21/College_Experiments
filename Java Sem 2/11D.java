class Reservation {
private static int availableSeats = 10;
synchronized void SeatReservation(int requestedSeats) {
System.out.println(Thread.currentThread().getName() + " Entered.");
System.out.println( "Available seats : " + availableSeats + " Requested Seats : " + requestedSeats );
if (availableSeats >= requestedSeats) {
System.out.println("Seat Available.");
System.out.println( requestedSeats + " seats reserved." );
availableSeats = availableSeats - requestedSeats;
try {
Thread.sleep(5000);
} catch (InterruptedException e) {
System.out.println("Thread interrupted");
}
} else {
System.out.println("Requested seats not available :(");
}
System.out.println(Thread.currentThread().getName() + "leaving.");
System.out.println("----------------------------------------------");
}
}
class Person extends Thread {
private Reservation reserve;
private int requestedSeats;
public Person(Reservation reserve, int requestedSeats) {
this.reserve = reserve;
this.requestedSeats = requestedSeats;
}
public void run() {
reserve.SeatReservation(requestedSeats);
}
}
class Main {
public static void main(String[] args) {
Reservation reserve = new Reservation();
Person t1 = new Person(reserve, 5);
t1.start();
Person t2 = new Person(reserve, 4);
t2.start();
Person t3 = new Person(reserve, 2);
t3.start();
}
}