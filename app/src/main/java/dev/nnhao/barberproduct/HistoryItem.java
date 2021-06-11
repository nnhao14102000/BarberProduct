package dev.nnhao.barberproduct;

public class HistoryItem {
    private String DateBooking;
    private String SalonName;
    private String Address;
    private String AppointmentDate;
    private String BookingStylistName;

    public HistoryItem(String dateBooking, String salonName, String address, String appointmentDate, String bookingStylistName) {
        DateBooking = dateBooking;
        SalonName = salonName;
        Address = address;
        AppointmentDate = appointmentDate;
        BookingStylistName = bookingStylistName;
    }

    public String getDateBooking() {
        return DateBooking;
    }

    public void setDateBooking(String dateBooking) {
        DateBooking = dateBooking;
    }

    public String getSalonName() {
        return SalonName;
    }

    public void setSalonName(String salonName) {
        SalonName = salonName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        AppointmentDate = appointmentDate;
    }

    public String getBookingStylistName() {
        return BookingStylistName;
    }

    public void setBookingStylistName(String bookingStylistName) {
        BookingStylistName = bookingStylistName;
    }

    @Override
    public String toString() {
        return "HistoryItem{" +
                "DateBooking='" + DateBooking + '\'' +
                ", SalonName='" + SalonName + '\'' +
                ", Address='" + Address + '\'' +
                ", AppointmentDate='" + AppointmentDate + '\'' +
                ", BookingStylistName='" + BookingStylistName + '\'' +
                '}';
    }
}
