package testMyExpirience.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testMyExpirience.demo.model.Car;
import testMyExpirience.demo.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<Car> getAllCar(){
        return carService.getAllCar();
    }

    @PostMapping("/create")
    public Car create(@RequestBody Car car){
        return carService.createCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        carService.deleteCarById(id);
    }
}
