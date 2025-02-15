package Enums;
public class Enums {
    public enum Suspension{
         SIMPLES, 
         DUPLA,
         SEM_SUSPENSÃO;
         
        public String toString(Suspension Suspension) {
            switch (Suspension) {
                case SIMPLES:
                    return "simples";
                case DUPLA:
                    return "dupla";
                case SEM_SUSPENSÃO:
                    return "sem suspensão";
                default:
                    return "problem returning string!";
            }
        }
    }
}
