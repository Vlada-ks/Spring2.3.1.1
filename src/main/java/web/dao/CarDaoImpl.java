package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
@Component
public class CarDaoImpl implements CarDao {

    private static int countCars;
    private List<Cars> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Cars(++countCars, "BMW", "white", 2000));
        cars.add(new Cars(++countCars, "Audi", "blue", 2020));
        cars.add(new Cars(++countCars, "Mersedes", "black", 2019));
        cars.add(new Cars(++countCars, "Citroen", "red", 2016));
        cars.add(new Cars(++countCars, "Honda", "yellow", 2023));
    }

    @Override
    public List<Cars> indexCars() {
        return cars;
    }

    @Override
    public List<Cars> showCars(int count) {
        return count > 0 && count < 5 ? IntStream.range(0, cars.size())
                .limit(count)
                .mapToObj(cars::get)
                .collect(Collectors.toList())
                : cars;
    }
}
