package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Cars;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Cars> indexCars() {
        return carDao.indexCars();
    }

    @Override
    public List<Cars> showCars(int count) {
        return carDao.showCars(count);
    }
}
