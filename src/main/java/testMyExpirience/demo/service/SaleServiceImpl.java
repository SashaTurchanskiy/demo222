package testMyExpirience.demo.service;

import org.springframework.stereotype.Service;
import testMyExpirience.demo.model.Sale;
import testMyExpirience.demo.repository.CarRepo;
import testMyExpirience.demo.repository.ManagerRepo;
import testMyExpirience.demo.repository.SaleRepo;

@Service
public class SaleServiceImpl implements SaleService{

    private final SaleRepo saleRepo;
    private final CarRepo carRepo;
    private final ManagerRepo managerRepo;

    public SaleServiceImpl(SaleRepo saleRepo, CarRepo carRepo, ManagerRepo managerRepo) {
        this.saleRepo = saleRepo;
        this.carRepo = carRepo;
        this.managerRepo = managerRepo;
    }

    @Override
    public Sale createSale(Long carId, Long managerId, int quantity) {
        return null;
    }
}
