package com.cognixia.jump.springcloud.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stateId;

    @Column(name = "State_Name", columnDefinition = "varchar(45) not null")
    private String name;

    @Transient
    @OneToMany
    @JoinColumn(name = "City_Id")
    private Set<City> cities;

    public State() {
        this(-1L, "N/A");
    }

    public State(Long stateId, String name) {
        this.stateId = stateId;
        this.name = name;
    }

    public Long getStateId() {
        return this.stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " stateId='" + getStateId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}
