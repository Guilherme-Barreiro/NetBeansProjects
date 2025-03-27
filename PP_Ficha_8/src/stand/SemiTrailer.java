package stand;

public enum SemiTrailer {
    TIPPER, OPEN, CLOSED, FRIDGE;
    
    public static String SemiTrailerToString(SemiTrailer e) {
        switch (e) {
            case TIPPER:
                return "o tipo de SEMITRAILER é TIPPER.";
            case OPEN:
                return "o tipo de SEMITRAILER é OPEN.";
            case CLOSED:
                return "o tipo de SEMITRAILER é CLOSED.";
            case FRIDGE:
                return "o tipo de SEMITRAILER é FRIDGE.";
            default:
                return "Eriro";
        }
    }
}
