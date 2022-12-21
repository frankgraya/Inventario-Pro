package com.inventpro.invent.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table( name= "ciudades")
public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ciudad" ,  nullable = false)
    private String ciudad;

}
