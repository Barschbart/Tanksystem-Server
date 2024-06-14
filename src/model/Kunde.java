package model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clID;

    private String name;

    @OneToMany(mappedBy = "kunde")
    private Set<Tankung> tankungs;

    @OneToMany(mappedBy = "kunde")
    private Set<Rabatteintragung> rabatteintrags;

    @OneToMany(mappedBy = "kunde")
    private Set<Tankkarte> tankkartes;

    // Getters and setters
}
