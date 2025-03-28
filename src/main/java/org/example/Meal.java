package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Meal {
    @Id
    private Long id;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hippo hippo;

    Meal(String newType)
    {
        type = newType;
    }

    public Meal() {

    }
}
