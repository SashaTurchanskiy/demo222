package testMyExpirience.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testMyExpirience.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
}
