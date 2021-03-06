package model;
// Generated 3 juin 2016 13:43:02 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Groups generated by hbm2java
 */
public class Groups  implements java.io.Serializable {


     private Integer id;
     private Tournaments tournaments;
     private String name;
     private Date dateCreation;
     private String description;
     private Set<Matchs> matchses = new HashSet<Matchs>(0);

    public Groups() {
    }

	
    public Groups(Tournaments tournaments, String name, Date dateCreation) {
        this.tournaments = tournaments;
        this.name = name;
        this.dateCreation = dateCreation;
    }
    public Groups(Tournaments tournaments, String name, Date dateCreation, String description, Set<Matchs> matchses) {
       this.tournaments = tournaments;
       this.name = name;
       this.dateCreation = dateCreation;
       this.description = description;
       this.matchses = matchses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tournaments getTournaments() {
        return this.tournaments;
    }
    
    public void setTournaments(Tournaments tournaments) {
        this.tournaments = tournaments;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }
    
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<Matchs> getMatchses() {
        return this.matchses;
    }
    
    public void setMatchses(Set<Matchs> matchses) {
        this.matchses = matchses;
    }




}


