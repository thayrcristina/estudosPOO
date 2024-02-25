package relacionamento;

public enum CategoriaEnum {

    INVALIDO("Inválido!"),
    LEVE("Leve!"),
    MEDIO("Médio!"),
    PESADO("Pesado");

    private String descricao;

    CategoriaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static CategoriaEnum getCategoria(double peso) {
        if (peso < 52.2) {
            return INVALIDO;
        } else if (peso <= 70.3) {
            return LEVE;
        } else if (peso <= 83.9) {
            return MEDIO;
        } else if (peso <= 120.2) {
            return PESADO;
        } else {
            return INVALIDO;
        }
    }
}
