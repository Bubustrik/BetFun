package model;
// Generated 10 mai 2016 11:15:02 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Matchs generated by hbm2java
 */
@Entity
@Table(name="Matchs"
    ,catalog="betfun"
)
public class Matchs  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Date startDate;
     private Date endDate;
     private Date resultDate;

    public Matchs() {
    }

	
    public Matchs(String name, Date startDate, Date endDate, Date resultDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resultDate = resultDate;
    }
    public Matchs(String name, String description, Date startDate, Date endDate, Date resultDate) {
       this.name = name;
       this.description = description;
       this.startDate = startDate;
       this.endDate = endDate;
       this.resultDate = resultDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="startDate", nullable=false, length=19)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="endDate", nullable=false, length=19)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="resultDate", nullable=false, length=19)
    public Date getResultDate() {
        return this.resultDate;
    }
    
    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }




}


