package builder;

public class Director {
    public void criarSUV(Builder builder) {
        builder.reset();
        builder.assentos(4);
        builder.computadorBordo(true);
        builder.motor("2.0");
        builder.GPS(true);

    }

    public void criarKombi(Builder builder) {
        builder.reset();
        builder.assentos(8);
        builder.computadorBordo(false);
        builder.motor("1.0");
        builder.GPS(false);
    }
}
