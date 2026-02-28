# Simple Movie Booking System (Java)

## Description
This project is a Simple Movie Booking System developed using Java. It demonstrates key Object-Oriented Programming (OOP) concepts such as abstraction, interface implementation, inheritance, and composition. The program simulates booking movie tickets and processing payment through a cash payment method.

## Features
- Movie details management
- Ticket price calculation based on number of seats
- Abstract class for ticket structure
- Interface-based payment system
- Cash payment implementation
- Clean and structured output

## Technologies Used
- Java
- OOP Concepts

## Concepts Demonstrated
- Interface (Payment)
- Abstract Class (Ticket)
- Inheritance (SimpleTicket extends Ticket)
- Polymorphism (Payment reference)
- Composition (Booking has Movie and Ticket)
- Method Overriding
- Constructor Usage

## How It Works
1. A Movie object is created with a movie name.
2. A Ticket object is created with show time.
3. A Booking object combines movie, ticket, and number of seats.
4. The total amount is calculated using `getAmount()`.
5. Payment is processed using the `CashPayment` class.
6. Booking details and payment information are displayed.

## How to Run
1. Save the file as `SimpleMovieBooking.java`.
2. Open Command Prompt or Terminal.
3. Compile the program:
