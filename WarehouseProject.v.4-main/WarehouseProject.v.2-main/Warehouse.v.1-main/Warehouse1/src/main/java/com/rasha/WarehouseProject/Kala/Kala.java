
package com.rasha.WarehouseProject.Kala;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RASHA
 */
@Entity
@Table(name="KALA")
public class Kala {
//id=codeKala   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    
 private Long id;
 @Column(name="NameKala")
 private String nameKala;
 @Column(name="TadadKala")
private Integer tadadKala;

 
 public Kala(){
     
     
 }
    public Kala(String nameKala, Integer tadadKala) {
        this.nameKala = nameKala;
        this.tadadKala = tadadKala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameKala() {
        return nameKala;
    }

    public void setNameKala(String nameKala) {
        this.nameKala = nameKala;
    }

    public Integer getTadadKala() {
        return tadadKala;
    }

    public void setTadadKala(Integer tadadKala) {
        this.tadadKala = tadadKala;
    }
 
 
 
 
}
