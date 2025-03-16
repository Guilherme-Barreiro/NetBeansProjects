package Enums;

public enum Origem {
    ANIMAL, VEGETAL, MINERAL;

    public static String OrigemToString(Origem size) {
        switch (size) {

            case ANIMAL:
                return "O ingrediente é de origem ANIMAL.";
            case VEGETAL:
                return "O ingrediente é de origem VEGETAL.";
            case MINERAL:
                return "O ingrediente é de origem MINERAL.";
            default:
                return "Eriro";
        }
    }
}
