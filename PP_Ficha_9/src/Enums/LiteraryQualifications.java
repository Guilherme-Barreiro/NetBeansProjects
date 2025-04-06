package Enums;

public enum LiteraryQualifications {
    LICENCIATURA, MESTRADO, DOUTORAMENTO;
    
    public static String LiteraryQualificationsToString(LiteraryQualifications e) {
        switch (e) {
            case LICENCIATURA:
                return "o tipo de qualifications é LICENCIATURA.";
            case MESTRADO:
                return "o tipo de qualifications é MESTRADO.";
            case DOUTORAMENTO:
                return "o tipo de qualifications é DOUTORAMENTO.";
            default:
                return "Eriro";
        }
    }
}