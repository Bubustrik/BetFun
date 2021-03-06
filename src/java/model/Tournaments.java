package model;
// Generated 3 juin 2016 13:43:02 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tournaments generated by hbm2java
 */
public class Tournaments  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Date startDate;
     private Date endDate;
     private Date resultDate;
     private Set<Groups> groupses = new HashSet<Groups>(0);

    public Tournaments() {
    }

	
    public Tournaments(String name, Date startDate, Date endDate, Date resultDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resultDate = resultDate;
    }
    public Tournaments(String name, String description, Date startDate, Date endDate, Date resultDate, Set<Groups> groupses) {
       this.name = name;
       this.description = description;
       this.startDate = startDate;
       this.endDate = endDate;
       this.resultDate = resultDate;
       this.groupses = groupses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getResultDate() {
        return this.resultDate;
    }
    
    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }
    public Set<Groups> getGroupses() {
        return this.groupses;
    }
    
    public void setGroupses(Set<Groups> groupses) {
        this.groupses = groupses;
    }




}


