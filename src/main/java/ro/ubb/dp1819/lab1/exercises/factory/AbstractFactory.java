package ro.ubb.dp1819.lab1.exercises.factory;

import ro.ubb.dp1819.lab1.exercises.entity.Coffee;
import ro.ubb.dp1819.lab1.exercises.entity.Ingredient;

import java.util.List;

public interface AbstractFactory {

    Coffee brewCoffee(final List<Ingredient> ingredients);

}
