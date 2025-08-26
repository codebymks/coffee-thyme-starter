package ek.ianb.coffeethyme.controller;

import ek.ianb.coffeethyme.model.CoffeeOptions;
import ek.ianb.coffeethyme.model.CoffeeOrder;
import ek.ianb.coffeethyme.service.CoffeeOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/coffee")
public class CoffeeOrderController {
    private  CoffeeOrderService coffeeOrderService;

    public CoffeeOrderController(CoffeeOrderService coffeeOrderService) {
        this.coffeeOrderService = coffeeOrderService;
    }

    @GetMapping
    public String showOrderForm(Model model, CoffeeOptions coffeeOptions) {
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.setCoffeeSize(coffeeOptions.getCoffeeSizes().getLast());
        model.addAttribute("coffeeOrder", coffeeOrder);
        model.addAttribute("coffeeTypes", coffeeOptions.getCoffeeTypes());
        model.addAttribute("milkTypes", coffeeOptions.getMilkTypes());
        model.addAttribute("coffeeSizes", coffeeOptions.getCoffeeSizes());
        return "order-form";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute CoffeeOrder coffeeOrder, RedirectAttributes redirectAttributes) {
        CoffeeOrder placedOrder = coffeeOrderService.placeOrder(coffeeOrder);
        redirectAttributes.addFlashAttribute("coffeeOrder", placedOrder);
        return "redirect:/coffee/show-order";
    }

    @GetMapping("/show-order")
    public String showOrderConfirmation() {
        return "order-confirmation";
    }
}
