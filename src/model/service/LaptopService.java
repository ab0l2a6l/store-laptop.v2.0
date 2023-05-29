package model.service;

import model.entity.Laptop;
import model.repository.InterfaceDAO;
import model.repository.LaptopDAO;

import java.util.List;

public class LaptopService implements InterfaceService {
    public void sentDataTpDB(Laptop laptop) {
        InterfaceDAO laptopDAO = new LaptopDAO();
        laptopDAO.save(laptop);
    }
    public Laptop findById(long id){
        InterfaceDAO interfaceDAO = new LaptopDAO();
         return interfaceDAO.findById(id);
    }
}
