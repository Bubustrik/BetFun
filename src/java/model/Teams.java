package model;
// Generated 3 juin 2016 13:43:02 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Teams generated by hbm2java
 */
public class Teams  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Date dateCreation;
     private Set<Users> userses = new HashSet<Users>(0);

    public Teams() {
    }

	
    public Teams(String name, Date dateCreation) {
        this.name = name;
        this.dateCreation = dateCreation;
    }
    public Teams(String name, String description, Date dateCreation, Set<Users> userses) {
       this.name = name;
       this.description = description;
       this.dateCreation = dateCreation;
       this.userses = userses;
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
    public Date getDateCreation() {
        return this.dateCreation;
    }
    
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public Set<Users> getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set<Users> userses) {
        this.userses = userses;
    }




}


