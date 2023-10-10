package avaliacao1;

import java.util.Map;

public class Armazem implements ArmazemNutrientes{

    private Map<String,Nutriente> nutrientesCadastrados;
    private static Armazem instance;
    public static Armazem getInstance() {
        if(instance==null) {
            instance = new Armazem();
        }
        return  instance;
    }

    @Override
    public Nutriente create(String nome, String unidade, Double caloriaPorUnidade) {
        Nutriente nutriente = this.nutrientesCadastrados.get(nome);
        if(nutriente ==null) {
            nutriente = new Nutriente(nome);
        }
        nutriente.setCaloriaPorUnidade(caloriaPorUnidade);
        nutriente.setUnidade(unidade);
        nutrientesCadastrados.put(nome,nutriente);
        return nutriente;
    }

    @Override
    public Nutriente create(String nome) throws NutrienteNaoEncontradoException {
        Nutriente nutriente = this.nutrientesCadastrados.get(nome);
        if(nutriente ==null) {
           throw new NutrienteNaoEncontradoException();
        }
        return nutriente;
    }
}
