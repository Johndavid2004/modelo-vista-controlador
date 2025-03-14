package controlaire;

public class SensorAmbiente {
    private double temperatura;
    private double humedad;
    
    public SensorAmbiente() {
        this.temperatura = 25.0;
        this.humedad = 50.0;
    }
    
    public void leerSensores() {
        this.temperatura = 25 + Math.random() * 10;
        this.humedad = 40 + Math.random() * 40;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public double getHumedad() {
        return humedad;
    }
}

