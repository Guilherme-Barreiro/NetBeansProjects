package Enums;

public enum ContractType {
    PARTIAL, INTEGRAL;
    
    public static String ContractTypeToString(ContractType e) {
        switch (e) {
            case PARTIAL:
                return "o tipo de contrato é PARTIAL.";
            case INTEGRAL:
                return "o tipo de contrato é INTEGRAL.";
            default:
                return "Eriro";
        }
    }
}
