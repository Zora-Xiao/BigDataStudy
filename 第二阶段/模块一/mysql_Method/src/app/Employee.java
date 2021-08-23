package app;

import java.io.Serializable;
import java.sql.Date;

/*
Employee类对应数据库中Employee表
*/
public class Employee implements Serializable{

private int id;
private String name;
private String gender;
private double salary;
private double bouns;
private Date join_date;

public Employee(){}
public Employee(int id,String name,String gender,double salary,double bouns,Date join_date)
{
    setId(id);
    setName(name);
    setGender(gender);
    setBouns(bouns);
    setSalary(salary);
    setJoinDate(join_date);
}

public int getId()
{
    return id;
}
public void setId(int id)
{
    this.id=id;
}

public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}

public String getGender()
{
    return gender;
}
public void setGender(String gender)
{
    this.gender=gender;
}

public double getSalary()
{
    return salary;
}
public void setSalary(double salary)
{
    this.salary=salary;
}

public double getBouns()
{
    return bouns;
}
public void setBouns(double bouns)
{
    this.bouns=bouns;
}

public Date getJoinDate()
{
    return join_date;
}
public void setJoinDate(Date join_date)
{
    this.join_date=join_date;
}

@Override
public String toString()
{
    return "Employee{"+
            "id="+id+
            ",name="+name+
            ",gender="+gender+
            ",salary="+salary+
            ",bouns="+bouns+
            ",join_date="+join_date+
            "}";
}

}