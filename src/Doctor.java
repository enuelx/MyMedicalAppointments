public class Doctor {
    private static int id = 0;
    private String name;
    private String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        setId(getId() + 1);
    }

    Doctor(String name, String speciality) {
        this.setName(name);
        this.setSpeciality(speciality);
        System.out.println("El nombre del doctor asignado es: " + this.getName());
        setId(getId() + 1);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public void showName() {
        System.out.println(getName());
    }

    public  void showID() {
        System.out.println("El ID del doctor es: " + getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}