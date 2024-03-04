class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println(name + " is " + age + " old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Patient extends Person {

    private String condition;


    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


}

class Doctor extends Person {

    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}

class Hospital {


    public static void main(String[] args) {
        Doctor doctor = new Doctor("", 0, "");
        Patient patient = new Patient("", 0, "");

        doctor.setName("Dr Humphrey");
        doctor.setAge(40);
        doctor.setSpecialization("Orthopaedic Surgery");

        patient.setName("Mr Peter");
        patient.setAge(30);
        patient.setCondition("Headache");

        System.out.println(doctor.getName() + " of age " + doctor.getAge() + " has specialized in " + doctor.getSpecialization());
        System.out.println(patient.getName() + " of age " + patient.getAge() + " has been admitted because of a " + patient.getCondition());


    }
}
