package Ficha_2;
public class ex4 {
    public static void main(String[] args) {
        /*System.out.println("Alínea A");
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        char[] novoNome = new char[nome.length];
        int i = 0, j = 0;

        for (i = 0; i < novoNome.length; i++) 
            novoNome[i] = '\0';

        
        for (i = 0; i < nome.length; i++){
            if(nome[i] == ' '){
                for (j = 0; nome[i + 1] != '\n'; j++, i++){
                    novoNome[j] = nome[i + 1];
                }
                break;
            }
        }
        
        novoNome[j++] = ' ';
        
        for (i = 0; nome[j] != '\n'; i++, j++)
            novoNome[j] = nome[i];
        
        for (i = 0; i < nome.length; i++)
            System.out.println("" + novoNome[i] + "   " + nome[i]);
        
        
        
        System.out.println("Alínea B");
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', '\n'};
        int nVogais = 0;
        for (i = 0; i < nome.length - 1; i++)
            for (j = 0; j < vogais.length - 1; j++)
                if(nome[i] == vogais[j])
                    nVogais++;
        
        System.out.println("Número de vogais: " + nVogais);
        
        
        System.out.println("\nAlínea C");
        int nConsoantes = nome.length - 1 - nVogais;
        
        for (i = 0; i < nome.length; i++)
            if(nome[i] == ' ')
                nConsoantes--;
        
        System.out.println("Número de consoantes: " + nConsoantes);

        */
//         NOVA RESOLUÇÃO
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's'};
        int i = 0, j = 0, index = 0;
        
        for (i = 0; i < nome.length; i++){
            if(nome[i] == ' '){
                index = nome[i];
                for (j = i; j < nome.length - 1; j++){
                    System.out.print(nome[j + 1]);
                }
            break;
            }
        }
        
        System.out.print(", ");
        
        for(i = 0; nome[i] != ' '; i++)
            System.out.print(nome[i]);
        System.out.print("\n");

    }
}
