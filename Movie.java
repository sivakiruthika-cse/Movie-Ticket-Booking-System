interface Payment {
    void pay(double amount);
}

abstract class Ticket {
    String showTime;

    Ticket(String showTime) {
        this.showTime = showTime;
    }

    abstract double getAmount(int seats);
}

class Movie {
    String name;

    Movie(String name) {
        this.name = name;
    }
}

class SimpleTicket extends Ticket {

    SimpleTicket(String showTime) {
        super(showTime);
    }

    double getAmount(int seats) {
        return seats * 10;
    }
}

class Booking {
    Movie movie;
    Ticket ticket;
    int seats;

    Booking(Movie movie, Ticket ticket, int seats) {
        this.movie = movie;
        this.ticket = ticket;
        this.seats = seats;
    }

    void book() {
        double amount = ticket.getAmount(seats);

        System.out.println("Movie Name   : " + movie.name);
        System.out.println("Show Time    : " + ticket.showTime);
        System.out.println("Amount       : $" + amount);

        Payment p = new CashPayment();
        p.pay(amount);
    }
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment Mode : Cash");
        System.out.println("Paid Amount  : $" + amount);
    }
}

public class SimpleMovieBooking {
    public static void main(String[] args) {

        Movie m = new Movie("Avatar");
        Ticket t = new SimpleTicket("6:00 PM");
        Booking b = new Booking(m, t, 3);

        b.book();
    }
}                      
