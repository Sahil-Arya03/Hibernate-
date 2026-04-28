package org.relational;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Emp
{
    @Id
    private int id;
    private String empname;
    @ManyToMany
    private List<Project> projects;

    // Default constructor
    public Emp()
    {}

    // Parameterized constructor
    public Emp(int id, String empname, List<Project> projects)
    {
        this.id = id;
        this.empname = empname;
        this.projects = projects;
    }

    // id
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    //empname
    public String getEmpname()
    {
        return empname;
    }
    public void setEmpname(String empname)
    {
        this.empname = empname;
    }

    // projects
    public List<Project> getProjects()
    {
        return projects;
    }
    public void setProjects(List<Project> projects)
    {
        this.projects = projects;
    }
}