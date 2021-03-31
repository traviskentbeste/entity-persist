package com.thevendingrobot.com.entities.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    private Entity1 entity1;
    @OneToOne(cascade = {CascadeType.ALL})
    private Entity2 entity2;

}
