package entities;

public class Employees{ 
    private Integer id;
    private String name;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Employees(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}