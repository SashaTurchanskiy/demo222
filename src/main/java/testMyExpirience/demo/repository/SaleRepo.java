package testMyExpirience.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testMyExpirience.demo.model.Sale;

public interface SaleRepo extends JpaRepository<Sale, Long> {
}
