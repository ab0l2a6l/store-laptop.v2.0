package model.service;

import model.entity.Laptop;
import model.repository.LaptopDAO;

public class LaptopService implements InterfaceService {
    public void sentDataTpDB(Laptop laptop){
        LaptopDAO laptopDAO = new LaptopDAO();
        laptopDAO.save(laptop);
    }
}
