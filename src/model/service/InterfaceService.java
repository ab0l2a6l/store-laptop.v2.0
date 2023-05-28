package model.service;

import model.entity.Laptop;

public interface InterfaceService {
    void sentDataTpDB(Laptop laptop);
    int findById(long id);
}
