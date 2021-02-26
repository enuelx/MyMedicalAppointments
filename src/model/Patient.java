package model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient (String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + getBirthday() +
                "\nWeight: " + getWeight() +
                "\nHeight " + getHeight();
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
    }
}
