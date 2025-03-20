package Enum;

public enum Suspension_Type {
    SIMPLES, DUPLA, SEM_SUSPENSAO;

    public static String Suspension_TypeToString(Suspension_Type a) {
        switch (a) {
            case SIMPLES:
                return "A suspensão é SIMPLES.";
            case DUPLA:
                return "A suspensão é DUPLA.";
            case SEM_SUSPENSAO:
                return "A suspensão é SEM_SUSPENSAO.";
            default:
                return "Eriro";
        }
    }
}
