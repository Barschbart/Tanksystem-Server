package model;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pID;

    private String prodName;
    private String description;
    private String unit;

    @OneToMany(mappedBy = "produkt")
    private Set<Rabatteintragung> rabatteintrags;

    @OneToMany(mappedBy = "produkt")
    private Set<Tankung> tankungs;

    // Getters and setters
}
