package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Tankkarte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;
    private int customerNr;
    private int nrOfCards;

    @ElementCollection
    private List<String> allowedProducts;

    private float limit;
    private int yearsOfValidityLeft;

    @ManyToOne
    @JoinColumn(name = "clID")
    private Kunde kunde;

    // Getters and setters
}

