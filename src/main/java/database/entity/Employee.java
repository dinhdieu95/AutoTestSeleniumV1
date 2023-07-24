package database.entity;

import org.hibernate.Session;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.sql.PreparedStatement;

@Entity // 1 entity trong DB
@Table(name = "EMPLOYEE") // mapping với bản
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE) // layer thứ 2
public class Employee {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
//    @SequenceGenerator(name = "employee_seq", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)

    private int id;
    private String first_name;
    private String last_name;
    private int salary;

    public Employee() {}
    public Employee(String fname, String lname, int salary) {
        this.first_name = fname;
        this.last_name = lname;
        this.salary = salary;
    }

    public Employee(int id, String first_name, String last_name, int salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
