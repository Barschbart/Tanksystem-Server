package model;

import jakarta.persistence.*;

@Entity
public class Zahlung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isPaid;
    private float totalAmount;

    @OneToOne(mappedBy = "zahlung")
    private Tankung tankung;

    // Getters and setters
}

