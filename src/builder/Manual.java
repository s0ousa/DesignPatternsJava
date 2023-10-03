package builder;

public class Manual {
        int assentos ;
        String motor;
        Boolean computadorDeBordo;
        Boolean gps;

        public int getAssentos() {
            return assentos;
        }

        public void setAssentos(int assentos) {
            this.assentos = assentos;
        }

        public String getMotor() {
            return motor;
        }

        public void setMotor(String motor) {
            this.motor = motor;
        }

        public Boolean getComputadorDeBordo() {
            return computadorDeBordo;
        }

        public void setComputadorDeBordo(Boolean computadorDeBordo) {
            this.computadorDeBordo = computadorDeBordo;
        }

        public Boolean getGps() {
            return gps;
        }

        public void setGps(Boolean gps) {
            this.gps = gps;
        }

    @Override
    public String toString() {
        return "Manual{" +
                "assentos=" + assentos +
                ", motor='" + motor + '\'' +
                ", computadorDeBordo=" + computadorDeBordo +
                ", gps=" + gps +
                '}';
    }
}

