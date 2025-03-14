package invernadero;

public class Invernadero {
    private final SensorTemperatura sensor;
    
    public Invernadero() {
        this.sensor = new SensorTemperatura();
    }
    
    public double obtenerTemperatura() {
        return sensor.leerTemperatura();
    }

    public String determinarEstado(double temperatura) {
        if (temperatura < 10) {
            return "Calefactor ACTIVADO ❄️🔥";
        } else if (temperatura <= 25) {
            return "Sistema INACTIVO ✅";
        } else {
            return "Ventilador ACTIVADO 🌬️";
        }
    }
}
