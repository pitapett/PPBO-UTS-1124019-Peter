import controller.MainController;
import view.*;
public class App {

    public static void main(String[] args) {
        MainController controller = new MainController();
        MainView mainView = new MainView(controller);
        mainView.render();
    }
}