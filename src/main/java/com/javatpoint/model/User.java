package com.javatpoint.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userdata")
public class User 
{
@Id
private int id;
private String name;

public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getname() 
{
return name;
}
public void setname(String name) 
{
this.name = name;
}
}
