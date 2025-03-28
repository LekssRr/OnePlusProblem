package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class Hippo {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "hippo", fetch = FetchType.LAZY)
    private List<Meal> meals = new ArrayList<>();

    public void addMeals(Meal newMeal)
    {
        meals.add(newMeal);
    }
}
