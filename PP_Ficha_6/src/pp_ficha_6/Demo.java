package pp_ficha_6;

import Enums.Tamanho;
import Enums.Origem;

public class Demo {

    public static void main(String[] args) {

        Ingrediente i1 = new Ingrediente("Azeitona", Origem.VEGETAL, 20);
        Ingrediente i2 = new Ingrediente("Queijo Mozzarella", Origem.ANIMAL, 280);
        Ingrediente i3 = new Ingrediente("Tomate", Origem.VEGETAL, 18);
        Ingrediente i4 = new Ingrediente("Fiambre", Origem.ANIMAL, 150);
        Ingrediente i5 = new Ingrediente("Cogumelos", Origem.VEGETAL, 22);
        Ingrediente i6 = new Ingrediente("Pimento", Origem.VEGETAL, 20);

        Ingrediente[] ing4Estacaos = {i1, i3, i6};
        Pizza p1 = new Pizza("4 Estacaos", "Especialidade da casa", 19.99, Tamanho.FAMILIAR, ing4Estacaos);

        Ingrediente[] ingMargarita = {i2, i3};
        Pizza p2 = new Pizza("Margarita", "Simples mas deliciosa", 14.99, Tamanho.MEDIA, ingMargarita);

        Ingrediente[] ingCarnivora = {i2, i4, i6};
        Pizza p3 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);

        Pizza[] ementaAtual = {p1, p2, p3};
        Ementa e1 = new Ementa("Designacao", "Descricao", "12/03/2025", ementaAtual);
        
        p1.addIngrediente(i2);
        p1.addIngrediente(i2);
        System.out.println(e1);
    }

}
