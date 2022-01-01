package Lesson_5;

public class Employee {

    public String fio;
    public String post;
    public String email;
    public String phoneNumber;
    public int salaryPayment;
    public int age;

    public Employee (String fio, String post, String email, String phoneNumber, int salaryPayment, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salaryPayment = salaryPayment;
        this.age = age;
    }

    public void info() {
        System.out.println("fio: " + fio + "; post: " + post + "; email: " + email + "; phoneNumber: " + phoneNumber + "; salaryPayment: " + salaryPayment + "; age: " + age);
    }

}
