package model.service;

import model.entity.Laptop;

public interface InterfaceService {
    void sentDataTpDB(Laptop laptop);

    Laptop findById(long id);

    boolean sendIdToServiceForDelete(long id);
}
