package controler;

import model.entity.Laptop;
import model.service.LaptopService;

public class LaptopControler {
    public void sendDataToService(Laptop laptop) {
        LaptopService laptopService = new LaptopService();
        laptopService.sentDataTpDB(laptop);

    }
}
