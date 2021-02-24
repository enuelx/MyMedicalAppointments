package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    public Doctor(String name, String email, String speciality) {
        super( name, email );
        setSpeciality( speciality );
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void  addAvailableAppointments(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private  String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " +
                    this.date + "\nTime: " + this.time;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + getSpeciality() +
                "\n" + getAvailableAppointments();
    }
}