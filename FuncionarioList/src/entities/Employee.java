package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public void increaseSalary(double percentage){

        if(id != null){
            salary = salary + (salary * percentage/100);
        } else {
            System.out.print("This id does not exists.");
        }



    }

    public Employee(Integer id, Double salary){
        this.id = id;
        this.salary = salary;
    }

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
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

    public String toString(){
        return String.format(id + ", " + name + ", " + salary + "\n");
    }

}
