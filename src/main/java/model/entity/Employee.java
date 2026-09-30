package model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
        private Long id;
        private String empName;
        private String empEmail;
        private String enpCode;
        private String companyName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEnpCode() {
        return enpCode;
    }

    public void setEnpCode(String enpCode) {
        this.enpCode = enpCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(Long id, String empName, String empEmail, String enpCode, String companyName) {
        this.id = id;
        this.empName = empName;
        this.empEmail = empEmail;
        this.enpCode = enpCode;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", enpCode='" + enpCode + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

