package ek.ianb.coffeethyme.service;

import ek.ianb.coffeethyme.model.CoffeeOrder;
import ek.ianb.coffeethyme.repository.CoffeeOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class CoffeeOrderService {
    private CoffeeOrderRepository coffeeOrderRepository;

    public CoffeeOrderService(CoffeeOrderRepository coffeeOrderRepository) {
        this.coffeeOrderRepository = coffeeOrderRepository;
    }

    public CoffeeOrder placeOrder(CoffeeOrder order) {
        return coffeeOrderRepository.save(order);
    }
}
