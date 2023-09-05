package org.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Venky",23);
        Employee e2=new Employee(2,"Ram",24);
        Employee e3=new Employee(3,"Mohan",25);
        List<Employee>l= Arrays.asList(e1,e2,e3);
        System.out.println("before Sorting");
        for(Employee e:l)
            System.out.println(e.getEname());
        Collections.sort(l,(em1,em2)->em1.getEname().compareTo(em2.getEname()));
        System.out.println("After Sorting");
        for(Employee e:l)
            System.out.println(e.getEname());

    }




}
