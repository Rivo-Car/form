package registration.view;

public class globalConstants {
    //! SQL
    public static final String USER_TABLE = "users";
    public static final String USER_ID_TABLE = "idusers";
    public static final String USER_FIRSTNAME_TABLE = "firstName";
    public static final String USER_MIDDLENAME_TABLE = "middleName";
    public static final String USER_LASTNAME_TABLE = "lastName";
    public static final String USER_NICKNAME_TABLE = "nickName";
    //! REQUESTS
    public static final String INPUT_REQUEST = "string.input.request";
    public static final String FIRST_NAME_REQUEST = "string.firstName.request";
    public static final String MIDDLE_NAME_REQUEST = "string.middleName.request";
    public static final String LAST_NAME_REQUEST = "string.lastName.request";
    public static final String NICK_NAME_REQUEST = "string.nickName.request";
    //! WARNINGS
    public static final String FIRST_NAME_WARNING = "string.firstName.warning";
    public static final String MIDDLE_NAME_WARNING = "string.middleName.warning";
    public static final String LAST_NAME_WARNING = "string.lastName.warning";
    public static final String NICK_NAME_WARNING = "string.nickName.warning";
    public static final String WARNING_WARNING = "string.warning.warning";


    public static final String FIRST_NAME_REGEX = "string.firstName.regex";
    public static final String MIDDLE_NAME_REGEX = "string.middleName.regex";
    public static final String LAST_NAME_REGEX = "string.lastName.regex";
    public static final String NICK_NAME_REGEX = "string.nickName.regex";

    public static final String LOCALISATION =
        "Greetings!\n" +
        "You are to choose localization pack for registration form.\n" +
        "You will be asked for language code.\n" ;

    public static final String SUPPORTED_LANGUAGES =
        "\n" +
        "Available options:\n" +
        ">>>> en-US - English layout, localized for the United States.(language code - en)\n" +
        ">>>> uk-UA - Українська розкладка, локалізована під Україну.(language code - uk)\n" +
        "\n" +
        "Language code " +
        ">>>> ";

    public static final String LANGUAGE_CODE_ERROR =
        "\n" +
        "This language is not supported yet!\n" +
        "Try to pick a supported one.\n";

    public static final String ARROWS =
    "\n" +
    ">>>> ";
}
