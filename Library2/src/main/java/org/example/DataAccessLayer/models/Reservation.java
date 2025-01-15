package org.example.DataAccessLayer.models;

public class Reservation {

    private String customerName, dateOfReservation;
    private Integer numberOfSeats;

    public Reservation(String dateOfReservation, String customerName, Integer numberOfSeats) {
        this.dateOfReservation = dateOfReservation;
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(String dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
