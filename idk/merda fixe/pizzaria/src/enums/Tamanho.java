package enums;
public enum Tamanho {
    Pequena, Media, Familiar;

    public static String pizzaToString(Tamanho size) {
        switch (size) {
            case Pequena:
                return "A pizza é pequena";
            case Media:
                return "A pizza é média";
            case Familiar:
                return "A pizza é familiar";
        }
        return "Erro";
    }
}
