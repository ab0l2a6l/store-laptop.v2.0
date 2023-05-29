package controler;

import model.entity.Laptop;
import model.service.InterfaceService;
import model.service.LaptopService;

public class LaptopControler {
    private InterfaceService laptopService = new LaptopService();

    public void sendDataToService(Laptop laptop) {
        laptopService.sentDataTpDB(laptop);

    }

    public Laptop sendIdToServiceForSearch(long id) {
        return laptopService.findById(id);

    }

    public boolean sendIdToServiceForDelete(long id) {
        return laptopService.sendIdToServiceForDelete(id);
    }
}
