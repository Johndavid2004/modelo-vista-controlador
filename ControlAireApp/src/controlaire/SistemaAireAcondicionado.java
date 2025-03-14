package controlaire;

public class SistemaAireAcondicionado {
    private boolean aireEncendido;
    private final SensorAmbiente sensor;
    
    public SistemaAireAcondicionado() {
        this.aireEncendido = false;
        this.sensor = new SensorAmbiente();
    }
    
    public void actualizarEstado() {
        sensor.leerSensores();
        double temperatura = sensor.getTemperatura();
        double humedad = sensor.getHumedad();
        
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            aireEncendido = true;
        } else {
            aireEncendido = false;
        }
    }

    public boolean isAireEncendido() {
        return aireEncendido;
    }

    public double getTemperatura() {
        return sensor.getTemperatura();
    }

    public double getHumedad() {
        return sensor.getHumedad();
    }
}
