package testMyExpirience.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testMyExpirience.demo.model.Sale;
import testMyExpirience.demo.service.SaleService;

@RestController
@RequestMapping("/sale")
public class SaleController {

   private final SaleService saleService;

   @Autowired
   public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }
    @GetMapping("/create/{carId}/{managerId}/{quantity}")
    public Sale create(@PathVariable("carId") Long carId,
                       @PathVariable("managerId") Long managerId,
                       @PathVariable("quantity") int quantity
    ) {
        return saleService.createSale(carId,managerId,quantity);
    }

}
