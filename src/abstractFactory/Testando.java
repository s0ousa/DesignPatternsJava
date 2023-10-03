package abstractFactory;

public class Testando {
    public static void main(String[] args) {
        //FabricaGUI fabrica = new FabricaWindows();
        FabricaGUI fabrica = new FabricaMac();

        Botao meuBotao = fabrica.criarBotao();
        Checkbox minhaCheckbox = fabrica.criarCheckbox();
        meuBotao.imprimirBotao();
        minhaCheckbox.imprimirCheckbox();
    }
}
