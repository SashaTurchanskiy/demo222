package testMyExpirience.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testMyExpirience.demo.model.Car;
import testMyExpirience.demo.repository.CarRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepo carRepo;

    @Autowired
    public CarServiceImpl(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @Override
    public List<Car> getAllCar() {
        return carRepo.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        Optional<Car> optionalCar = carRepo.findById(id);
        if (optionalCar.isEmpty()){
            throw new IllegalStateException("Car with id " + id + "does not exist");
        }
        return optionalCar.get();
    }

    @Override
    public Car createCar(Car car) {
        return carRepo.save(car);
    }

    @Override
    public void deleteCarById(Long id) {
        carRepo.deleteById(id);
    }
}
