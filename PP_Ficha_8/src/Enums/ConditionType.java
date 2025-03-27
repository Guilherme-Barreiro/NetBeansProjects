package Enums;

public enum ConditionType {
    NEW, USED;
    
    public static String ConditionTypeToString(ConditionType e) {
        switch (e) {
            case NEW:
                return "o tipo de condicao é NEW.";
            case USED:
                return "o tipo de condicao é USED.";
            default:
                return "Eriro";
        }
    }
}
