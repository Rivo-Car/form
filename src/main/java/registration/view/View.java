package registration.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static final String DEFAULT_LANGUAGE_PACK = "languagePack";
    static ResourceBundle resourceBundle;

    public static void localization (String language) {
        Locale LanguageLocalization = new Locale(language);
        resourceBundle = ResourceBundle.getBundle("languagePack", LanguageLocalization);
    }
    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public void printMessage(String message) {
        System.out.print(message);
    }

    public String mergeStrings(String...strings) {
        String finalString = "";

        for (String input: strings) {
            finalString += input;
        }
        return finalString;
    }
}
