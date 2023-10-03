package abstractFactory;

public class FabricaWindows implements FabricaGUI{

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }
}
