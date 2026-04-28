package org.relational;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project
{
    @Id
    private int Projid;
    private String Projname;
    @ManyToMany (mappedBy = "projects")
    private List<Emp>  emps;


    public Project()
    {}
    public Project(int projid, String projname, List<Emp> emps)
    {
        this.Projid = projid;
        this.Projname = projname;
        this.emps = emps;
    }

    //Projid
    public int getProjid()
    {
        return Projid;
    }
    public void setProjid(int projid)
    {
        this.Projid = projid;
    }

    //Projname
    public String getProjname()
    {
        return Projname;
    }
    public void setProjname(String projname)
    {
        this.Projname = projname;
    }

    // emps
    public List<Emp> getEmps()
    {
        return emps;
    }
    public void setEmps(List<Emp> emps)
    {
        this.emps = emps;
    }
}