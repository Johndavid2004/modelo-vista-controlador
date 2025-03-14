package invernadero;

public class SensorTemperatura {
    private double temperatura;
    
    public SensorTemperatura() {
        this.temperatura = 20.0; 
    }
    
    public double leerTemperatura() {
        temperatura += (Math.random() * 10 - 5);
        return Math.round(temperatura * 100.0) / 100.0;
    }
}
