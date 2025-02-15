package enums;

public enum Origem {
    animal, vegetal, mineral;

    public static String origemToString(Origem origem) {
        switch (origem) {
            case animal:
                return "A origem é animal";
            case vegetal:
                return "A origem é vegetal";
            case mineral:
                return "A origem é mineral";
        }
        return "Erro";
    }
}
