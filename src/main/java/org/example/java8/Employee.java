package org.example.java8;

public class Employee  {
    int empid;
    String ename;
    int age;

    public Employee(int empid, String ename, int age) {
        this.empid = empid;
        this.ename = ename;
        this.age = age;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }

    public int getAge() {
        return age;
    }
}
