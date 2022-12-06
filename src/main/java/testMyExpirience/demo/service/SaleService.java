package testMyExpirience.demo.service;

import org.springframework.stereotype.Service;
import testMyExpirience.demo.model.Sale;

@Service
public interface SaleService {

    Sale createSale(Long carId, Long managerId, int quantity);
}
