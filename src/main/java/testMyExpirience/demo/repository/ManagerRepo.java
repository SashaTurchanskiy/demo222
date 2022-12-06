package testMyExpirience.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testMyExpirience.demo.model.Manager;

public interface ManagerRepo extends JpaRepository<Manager, Long> {
}
