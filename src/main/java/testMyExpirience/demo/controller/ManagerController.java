package testMyExpirience.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testMyExpirience.demo.model.Manager;
import testMyExpirience.demo.service.ManagerService;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }


    @GetMapping("/all")
    public List<Manager> getAllManager(){
        return managerService.getAllManager();
    }

    @PostMapping("/create")
    public Manager createManager(@RequestBody Manager manager){
        return managerService.createManager(manager);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        managerService.deleteManagerById(id);
    }



}
