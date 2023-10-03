package abstractFactory;

public class BotaoWindows implements Botao{
    @Override
    public void imprimirBotao() {
        System.out.println("Isso é um botao estilo Windows");
    }
}
