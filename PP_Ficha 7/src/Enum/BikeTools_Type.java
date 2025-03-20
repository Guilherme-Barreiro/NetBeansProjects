package Enum;

public enum BikeTools_Type {
    GARRAFA_DE_AGUA, KIT, REPARACAO_PNEU, CONTA_QUILOMETROS, ALFORGE, SUPORTE_TELEMOVEL;
    public static String BikeTools_TypeToString(BikeTools_Type a) {
        switch (a) {
            case GARRAFA_DE_AGUA:
                return "O tipo da tool é GARRAFA_DE_AGUA.";
            case KIT:
                return "O tipo da tool é KIT.";
            case REPARACAO_PNEU:
                return "O tipo da tool é REPARACAO_PNEU.";
            case CONTA_QUILOMETROS:
                return "O tipo da tool é CONTA_QUILOMETROS.";
            case ALFORGE:
                return "O tipo da tool é ALFORGE.";
            case SUPORTE_TELEMOVEL:
                return "O tipo da tool é SUPORTE_TELEMOVEL.";
            default:
                return "Eriro";
        }
    }
}
