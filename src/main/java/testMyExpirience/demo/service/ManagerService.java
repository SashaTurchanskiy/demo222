package testMyExpirience.demo.service;

import org.springframework.stereotype.Service;
import testMyExpirience.demo.model.Manager;

import java.util.List;

@Service
public interface ManagerService {

    List<Manager> getAllManager();
    Manager getManagerById(Long id);
    Manager createManager(Manager manager);
    void deleteManagerById(Long id);
}
