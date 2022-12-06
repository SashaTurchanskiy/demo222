package testMyExpirience.demo.service;

import org.springframework.stereotype.Service;
import testMyExpirience.demo.model.Car;

import java.util.List;

@Service
public interface CarService {

    List<Car> getAllCar();
    Car getCarById(Long id);
    Car createCar(Car car);
    void deleteCarById(Long id);
}
