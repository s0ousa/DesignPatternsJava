package builder;

public class ManualBuilder implements Builder{
    Manual manual;
    @Override
    public CarroBuilder reset() {
        manual = new Manual();
        return null;
    }

    @Override
    public CarroBuilder assentos(int numeroDeAssentos) {
        manual.setAssentos(numeroDeAssentos);
        return null;
    }

    @Override
    public CarroBuilder motor(String motor) {
        manual.setMotor(motor);
        return null;
    }

    @Override
    public CarroBuilder computadorBordo(Boolean temComputadorDeBordo) {
        manual.setComputadorDeBordo(temComputadorDeBordo);
        return null;
    }

    @Override
    public CarroBuilder GPS(Boolean temGPS) {
        manual.setGps(temGPS);
        return null;
    }

    public Manual build() {
        return manual;
    }
}
