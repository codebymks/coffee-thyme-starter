package ek.ianb.coffeethyme.repository;

import ek.ianb.coffeethyme.model.CoffeeOrder;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CoffeeOrderRepository {
    private final List<CoffeeOrder> orders = new ArrayList<>();

    public CoffeeOrder save(CoffeeOrder order) {
        orders.add(0,order);
        return orders.getFirst();
    }
}
