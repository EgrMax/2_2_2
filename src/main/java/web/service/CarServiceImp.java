package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList;
    // public int count;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "black", 2020));
        carList.add(new Car("Mercedes", "black", 2021));
        carList.add(new Car("Kia", "blue", 2015));
        carList.add(new Car("Dodge", "white", 2018));
        carList.add(new Car("Lada", "baklazhan", 2010));
        //int count = carList.size();
    }

    public List<Car> getCarList() {
        return carList;
    }
    @Override
    public List<Car> getCarList(int count) {
        if(count>=5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
