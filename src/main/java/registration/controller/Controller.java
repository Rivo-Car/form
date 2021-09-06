package registration.controller;

import java.util.Scanner;

import registration.model.*;
import registration.view.*;

public class Controller {

    private Model model;
    private View view;
    String word;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    // this method boots application
    public void applicationBoot() {
        Scanner scannerInput = new Scanner(System.in);
        languagePack(scannerInput);
        View.localization(model.getLanguageCode());
        setInfo(
            scannerInput,
            View.getResourceBundle().getString(globalConstants.FIRST_NAME_REGEX),
            View.getResourceBundle().getString(globalConstants.FIRST_NAME_REQUEST),
            View.getResourceBundle().getString(globalConstants.FIRST_NAME_WARNING)
        );
        setInfo(
            scannerInput,
            View.getResourceBundle().getString(globalConstants.MIDDLE_NAME_REGEX),
            View.getResourceBundle().getString(globalConstants.MIDDLE_NAME_REQUEST),
            View.getResourceBundle().getString(globalConstants.MIDDLE_NAME_WARNING)
        );
        setInfo(
            scannerInput,
            View.getResourceBundle().getString(globalConstants.LAST_NAME_REGEX),
            View.getResourceBundle().getString(globalConstants.LAST_NAME_REQUEST),
            View.getResourceBundle().getString(globalConstants.LAST_NAME_WARNING)
        );
        setInfo(
            scannerInput,
            View.getResourceBundle().getString(globalConstants.NICK_NAME_REGEX),
            View.getResourceBundle().getString(globalConstants.NICK_NAME_REQUEST),
            View.getResourceBundle().getString(globalConstants.NICK_NAME_WARNING)
        );
    }

    private void languagePack(Scanner scannerInput) {
        view.printMessage(view.mergeStrings(
            String.format(globalConstants.LOCALISATION),
            String.format(globalConstants.SUPPORTED_LANGUAGES)
        ));
         while (!model.setLanguageCode(scannerInput.nextLine())) {
            view.printMessage(view.mergeStrings(
                String.format(globalConstants.LANGUAGE_CODE_ERROR),
                String.format(globalConstants.SUPPORTED_LANGUAGES)
            ));
        }
    }

    private void setInfo (Scanner scannerInput, String regulation, String variable_request, String variable_warning) {
        view.printMessage(view.mergeStrings(
            String.format(View.getResourceBundle().getString(globalConstants.INPUT_REQUEST) + " "),
            String.format(variable_request),
            String.format(globalConstants.ARROWS)
        ));
        while (!model.setInfo(scannerInput.next(), regulation)) {
            view.printMessage(view.mergeStrings(
            String.format(View.getResourceBundle().getString(globalConstants.INPUT_REQUEST) + " "),
            String.format(variable_request + "\n"),
            String.format(View.getResourceBundle().getString(globalConstants.WARNING_WARNING)),
            String.format(variable_warning + " "),
            String.format(globalConstants.ARROWS)
        ));
        }
    }
}
