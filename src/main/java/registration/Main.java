package registration;

import registration.controller.*;
import registration.model.*;
import registration.view.*;

public class Main {
    public static void main(String[] args) {
        // initialization of MVC elements
        Model Model = new Model();
        View View = new View();
        Controller Controller = new Controller(Model, View);
        // registrationForm startUp
        Controller.applicationBoot();
    }
}
