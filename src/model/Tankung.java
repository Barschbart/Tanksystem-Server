package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Tankung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fuelingID;

    private float amountOfLiters;
    private float priceAmount;
    private boolean isPaid;
    private Date fuelingDate;

    @ManyToOne
    @JoinColumn(name = "pID")
    private Produkt produkt;

    @ManyToOne
    @JoinColumn(name = "clID")
    private Kunde kunde;

    @OneToOne
    @JoinColumn(name = "zahlung_id")
    private Zahlung zahlung;

    public float calculatePrice() {
        // Calculation logic
        return 0.0f;
    }

    // Getters and setters
}
