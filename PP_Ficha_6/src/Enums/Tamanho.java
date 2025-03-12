package Enums;

public enum Tamanho {
     PEQUENA, MEDIA, FAMILIAR;
     
     
    public static String TamanhoToString(Tamanho size) {
        switch (size) {
            case PEQUENA:
                return "O tamanho da pizza é PEQUENA.";
            case MEDIA:
                return "O tamanho da pizza é MEDIA.";
            case FAMILIAR:
                return "O tamanho da pizza é FAMILIAR.";
            default:
                return "Erro";
        }
    }
}
