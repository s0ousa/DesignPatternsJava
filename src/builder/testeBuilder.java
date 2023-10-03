package builder;

public class testeBuilder {
    public static void main(String[] args) {
        Director meuGerente = new Director();

        CarroBuilder builderCarro = new CarroBuilder();
        ManualBuilder builderManual = new ManualBuilder();

        meuGerente.criarSUV(builderCarro);
        Carro renegade = builderCarro.build();

        meuGerente.criarSUV(builderManual);
        Manual manualRenegade = builderManual.build();

        System.out.println(manualRenegade);
        System.out.println(renegade);


        Carro kombiTunada = builderCarro.reset()
                            .assentos(8)
                            .GPS(false)
                            .computadorBordo(false)
                            .motor("3.0 cavalo")
                            .build();

        System.out.println(kombiTunada);
    }
}
