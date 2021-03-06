package model;
// Generated 3 juin 2016 13:43:02 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Matchs generated by hbm2java
 */
public class Matchs  implements java.io.Serializable {


     private Integer id;
     private Groups groups;
     private Users users;
     private String name;
     private String description;
     private Date startDate;
     private Date endDate;
     private Date resultDate;
     private Set<MatchComment> matchComments = new HashSet<MatchComment>(0);
     private Set<Bet> bets = new HashSet<Bet>(0);

    public Matchs() {
    }

	
    public Matchs(Groups groups, Users users, String name, Date startDate, Date endDate, Date resultDate) {
        this.groups = groups;
        this.users = users;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resultDate = resultDate;
    }
    public Matchs(Groups groups, Users users, String name, String description, Date startDate, Date endDate, Date resultDate, Set<MatchComment> matchComments, Set<Bet> bets) {
       this.groups = groups;
       this.users = users;
       this.name = name;
       this.description = description;
       this.startDate = startDate;
       this.endDate = endDate;
       this.resultDate = resultDate;
       this.matchComments = matchComments;
       this.bets = bets;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Groups getGroups() {
        return this.groups;
    }
    
    public void setGroups(Groups groups) {
        this.groups = groups;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
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
    public Set<MatchComment> getMatchComments() {
        return this.matchComments;
    }
    
    public void setMatchComments(Set<MatchComment> matchComments) {
        this.matchComments = matchComments;
    }
    public Set<Bet> getBets() {
        return this.bets;
    }
    
    public void setBets(Set<Bet> bets) {
        this.bets = bets;
    }




}


