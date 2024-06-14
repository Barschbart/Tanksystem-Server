package model;

import jakarta.persistence.*;

@Entity
public class Rabatteintragung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float totalDiscount;
    private float discountPerUnit;

    @ManyToOne
    @JoinColumn(name = "pID")
    private Produkt produkt;

    @ManyToOne
    @JoinColumn(name = "clID")
    private Kunde kunde;

    // Getters and setters
}

