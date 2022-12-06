package testMyExpirience.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testMyExpirience.demo.model.Manager;
import testMyExpirience.demo.repository.ManagerRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService{

    private final ManagerRepo managerRepo;

    @Autowired
    public ManagerServiceImpl(ManagerRepo managerRepo) {
        this.managerRepo = managerRepo;
    }

    @Override
    public List<Manager> getAllManager() {
        return managerRepo.findAll();
    }

    @Override
    public Manager getManagerById(Long id) {
        Optional<Manager> optionalManager = managerRepo.findById(id);
        if (optionalManager.isEmpty()){
            throw new IllegalStateException("Manager with id: " + id + "does not exist ");
        }

        return optionalManager.get();
    }

    @Override
    public Manager createManager(Manager manager) {
        return managerRepo.save(manager);
    }

    @Override
    public void deleteManagerById(Long id) {
        managerRepo.deleteById(id);
    }
}
