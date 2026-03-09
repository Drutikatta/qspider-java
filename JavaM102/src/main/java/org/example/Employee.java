package org.example;

public class Employee extends Person{

    static String compname= "TCS"  ;
    int eid;
    double sal;
    String desg;

    Employee(String name,int age,String gender,int eid,double sal,String desg){
        super(name,age,gender);
        this.eid=eid;
        this.sal=sal;
        this.desg=desg;
    }
    public void PrintDetails(){
        System.out.println("Employee id "+eid);
        System.out.println("Employee name: "+name);
        System.out.println("Empliyee age "+age);
        System.out.println("employee gender "+gender);
        System.out.println("employee sal "+sal);
        System.out.println("employee designation "+desg);
        System.out.println("========================");
    }
}
