package Enums;

public enum ProgrammerType {
    JUNIOR, SENIOR;
    
    public static String ProgrammerTypeToString(ProgrammerType e) {
        switch (e) {
            case JUNIOR:
                return "o tipo de prgramador é JUNIOR.";
            case SENIOR:
                return "o tipo de prgramador é SENIOR.";
            default:
                return "Eriro";
        }
    }
}