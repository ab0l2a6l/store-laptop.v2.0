package model.repository;

import model.entity.Laptop;

import java.util.List;

public interface InterfaceDAO {
    void save(Laptop laptop);

    List<Laptop> getLaptops();

    Laptop findById(long id);

    int sendIdToDAOForDelete(long id);
}
