package model.repository;

import controler.LaptopControler;
import model.entity.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopDAO implements InterfaceDAO {
    static List<Laptop> laptops = new ArrayList<>();

    @Override
    public void save(Laptop laptop) {
        laptops.add(laptop);
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    @Override
    public Laptop findById(long id) {
        for (Laptop eachLaptop : laptops) {
            if (eachLaptop.getId() == id) {
                return eachLaptop;
            }
        }
        return null;
    }

    public int sendIdToDAOForDelete(long id) {
        LaptopControler laptopControler = new LaptopControler();
        Laptop laptop = laptopControler.sendIdToServiceForSearch(id);
        if (laptop == null) {
            laptops.remove(laptop);
            return 1;
        }
        return 0;
    }

}
