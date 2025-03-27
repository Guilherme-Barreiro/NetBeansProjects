package Enums;

public enum OrigemType {
    NATIONAL, IMPORTED;
    
    public static String OrigemTypeToString(OrigemType e) {
        switch (e) {
            case NATIONAL:
                return "o tipo de origem é NATIONAL.";
            case IMPORTED:
                return "o tipo de origem é IMPORTED.";
            default:
                return "Eriro";
        }
    }
}
