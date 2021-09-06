package registration.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Model {

    List<String> list = new ArrayList<String>();

    private String languageCode;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickName;

    public boolean setLanguageCode(String languageCode) {
        if (languageCode.equals("en")) {
            this.languageCode = "en";
            return true;
        } else if (languageCode.equals("uk")) {
            this.languageCode = "uk";
            return true;
        } else {
            return false;
        }
    }

    public String getLanguageCode () {
        return languageCode;
    }

    public boolean setInfo(String userInput, String regulation) {
        System.out.println(userInput);
        if (Pattern.matches(regulation, userInput)) {
            System.out.println("1");
            list.add(new String(userInput));
            return true;
        } else {
            System.out.println("2");
            return false;
        }
    }
}
