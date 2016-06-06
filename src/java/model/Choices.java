package model;
// Generated 3 juin 2016 13:43:02 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Choices generated by hbm2java
 */
public class Choices  implements java.io.Serializable {


     private Integer id;
     private TypesChoices typesChoices;
     private String value;
     private Set<Bet> bets = new HashSet<Bet>(0);

    public Choices() {
    }

	
    public Choices(TypesChoices typesChoices, String value) {
        this.typesChoices = typesChoices;
        this.value = value;
    }
    public Choices(TypesChoices typesChoices, String value, Set<Bet> bets) {
       this.typesChoices = typesChoices;
       this.value = value;
       this.bets = bets;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TypesChoices getTypesChoices() {
        return this.typesChoices;
    }
    
    public void setTypesChoices(TypesChoices typesChoices) {
        this.typesChoices = typesChoices;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public Set<Bet> getBets() {
        return this.bets;
    }
    
    public void setBets(Set<Bet> bets) {
        this.bets = bets;
    }




}


