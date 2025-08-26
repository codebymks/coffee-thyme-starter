package ek.ianb.coffeethyme.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component // Singleton bean
public class CoffeeOptions {

    private List<String> coffeeTypes;
    private List<String> coffeeSizes;
    private List<String> milkTypes;

    public CoffeeOptions() {
        this.coffeeTypes = new ArrayList<>(
                List.of("Espresso", "Americano", "Latte", "Cappuccino", "Flat White"));
        this.coffeeSizes = new ArrayList<>(
                List.of("Small", "Medium", "Large"));
        this.milkTypes = new ArrayList<>(
                List.of("No", "Whole", "Skim", "Soy", "Oat"));
    }

    public List<String> getCoffeeTypes() {
        return Collections.unmodifiableList(coffeeTypes);
    }

    public List<String> getCoffeeSizes() {
        return Collections.unmodifiableList(coffeeSizes);
    }

    public List<String> getMilkTypes() {
        return Collections.unmodifiableList(milkTypes);
    }
}