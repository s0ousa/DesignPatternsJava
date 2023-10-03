package builder;

public interface Builder {


    public CarroBuilder reset();
    public CarroBuilder assentos(int numeroDeAssentos);
    public CarroBuilder motor(String motor);
    public CarroBuilder computadorBordo(Boolean temComputadorDeBordo);
    public CarroBuilder GPS(Boolean temGPS);


}
