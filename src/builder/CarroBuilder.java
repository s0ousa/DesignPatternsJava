package builder;

public class CarroBuilder implements Builder{
    Carro carro;
    @Override
    public CarroBuilder reset() {
        carro = new Carro();
        return this;
    }

    @Override
    public CarroBuilder assentos(int numeroDeAssentos) {
        carro.setAssentos(numeroDeAssentos);
        return this;
    }

    @Override
    public CarroBuilder motor(String motor) {
        carro.setMotor(motor);
        return this;
    }

    @Override
    public CarroBuilder computadorBordo(Boolean temComputadorDeBordo) {
        carro.setComputadorDeBordo(temComputadorDeBordo);
        return this;
    }

    @Override
    public CarroBuilder GPS(Boolean temGPS) {
        carro.setGps(temGPS);
        return this;
    }

    public Carro build() {
        return carro;
    }
}
