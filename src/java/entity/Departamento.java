package entity;
// Generated 25-09-2018 19:04:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departamento generated by hbm2java
 */
@Entity
@Table(name="DEPARTAMENTO"
    ,schema="SPRINGBD"
)
public class Departamento  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private Set<Profesor> profesors = new HashSet<Profesor>(0);

    public Departamento() {
    }

	
    public Departamento(BigDecimal id) {
        this.id = id;
    }
    public Departamento(BigDecimal id, String nombre, Set<Profesor> profesors) {
       this.id = id;
       this.nombre = nombre;
       this.profesors = profesors;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

    
    @Column(name="NOMBRE", length=80)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Profesor> getProfesors() {
        return this.profesors;
    }
    
    public void setProfesors(Set<Profesor> profesors) {
        this.profesors = profesors;
    }




}


