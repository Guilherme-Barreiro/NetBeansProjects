package Enums;

public enum TruckType {
    TRUCK, TIR;
    public static String TruckTypeToString(TruckType e) {
        switch (e) {
            case TRUCK:
                return "o tipo de truck é TRUCK.";
            case TIR:
                return "o tipo de truck é TIR.";
            default:
                return "Eriro";
        }
    }
}
