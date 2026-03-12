package entities;

public class Func {
    private String name;
    private String email;
    private Double salary;

    public Func(String[] fields) {
        this.name = fields[0];
        this.email = fields[1];
        this.salary = Double.parseDouble(fields[2]);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Func(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Func [email=" + email + "]";
    }
}
