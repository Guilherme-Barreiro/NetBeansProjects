package Enums;
public class Enums {
    public enum ContractType {
        PARTIAL, INTEGRAL;
        
        public String toString(ContractType ContractType) {
            switch (ContractType) {
                case PARTIAL:
                    return "partial";
                case INTEGRAL:
                    return "integral";
                default:
                    return "erro tostring";
            }
        }
    }  
    
    public enum HabilitacoesLiterarias {
        LICENCIATURA, MESTRADO, DOUTORAMENTO;
        
        public String toString(HabilitacoesLiterarias HabilitacoesLiterarias) {
            switch (HabilitacoesLiterarias) {
                case LICENCIATURA:
                    return "licenciatura";
                case MESTRADO:
                    return "mestrado";
                case DOUTORAMENTO:
                    return "doutoramento";
                default:
                    return "erro tostring";
            }
        }
    }
    
    public enum ProgrammerType {
        JUNIOR, SENIOR;
        
        public String toString(ProgrammerType ProgrammerType) {
            switch (ProgrammerType) {
                case JUNIOR:
                    return "junior";
                case SENIOR:
                    return "senior";
                default:
                    return "erro tostring";
            }
        }
    }  
}