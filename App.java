import controller.KendaraanController;
import model.KendaraanRepository;
import view.*;

public class App {

    public static void main(String[] args) {
        KendaraanRepository kendaraanRepository = new KendaraanRepository();
        KendaraanView kendaraanView = new KendaraanView();
        KendaraanController controller = new KendaraanController(kendaraanRepository, kendaraanView);
        kendaraanView.setController(controller);
        kendaraanView.render();
    }
}