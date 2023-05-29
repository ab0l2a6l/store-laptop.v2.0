package model.service;

import model.entity.Laptop;
import model.repository.InterfaceDAO;
import model.repository.LaptopDAO;

import java.util.List;

public class LaptopService implements InterfaceService {
    private InterfaceDAO laptopDAO = new LaptopDAO();
    public void sentDataTpDB(Laptop laptop) {
        laptopDAO.save(laptop);
    }

    public Laptop findById(long id) {
        return laptopDAO.findById(id);
    }

    public boolean sendIdToServiceForDelete(long id) {
        return laptopDAO.sendIdToDAOForDelete(id);
    }
}
