package pp_ficha_6;

public class Ementa {

    private static final int MAX_PIZZAS = 10;
    private static int nextId = 1;

    private int id;
    private String designacao;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private Pizza pizzas[];
    private int nPizzas;

    public Ementa(String designacao, String descricao, String dataInicio, String dataFim, Pizza[] pizzas) {
        System.out.println(pizzas.length);
        this.designacao = designacao;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nPizzas = pizzas.length;
        this.pizzas = new Pizza[MAX_PIZZAS];
        this.id = nextId++;

        for (int i = 0; i < pizzas.length; i++) {
            this.pizzas[i] = pizzas[i];
        }
    }

    public Ementa(String designacao, String descricao, String dataInicio, Pizza[] pizzas) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.nPizzas = pizzas.length;
        this.pizzas = new Pizza[MAX_PIZZAS];
        this.id = nextId++;

        for (int i = 0; i < pizzas.length; i++) {
            this.pizzas[i] = pizzas[i];
        }
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public int getnPizzas() {
        return nPizzas;
    }

    public void setnPizzas(int nPizzas) {
        this.nPizzas = nPizzas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String pizzasStr = "";
        for (int i = 0; i < pizzas.length; i++) {
            pizzasStr += pizzas[i];
            if (i < pizzas.length - 1) {
                pizzasStr += "\n ";
            }
        }

        return "Ementa{"
                + "\n\tid=" + id
                + "\n\t designacao=" + designacao
                + "\n\t descricao=" + descricao
                + "\n\t dataInicio=" + dataInicio
                + "\n\t dataFim=" + dataFim
                + "\n\t nPizzas=" + nPizzas
                + "\n\t pizzas=[" + pizzasStr + "]"
                + '}';
    }

}
