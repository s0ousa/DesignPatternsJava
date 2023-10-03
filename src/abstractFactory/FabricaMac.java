package abstractFactory;

public class FabricaMac implements FabricaGUI{

    @Override
    public Botao criarBotao() {
        return new BotaoMac();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxMac();
    }
}