package avaliacao1;

public interface ArmazemNutrientes {
    public Nutriente create(String nome, String unidade, Double caloriaPorUnidade);
    public Nutriente create(String nome) throws NutrienteNaoEncontradoException;
}
