package luces;

public class SistemaLuces {
    private boolean esDeNoche;
    private boolean lucesEncendidas;
    private final SensorMovimiento sensor;
    
    public SistemaLuces() {
        this.esDeNoche = true; 
        this.lucesEncendidas = false;
        this.sensor = new SensorMovimiento();
    }
    
    public void actualizarEstado() {
        sensor.detectarMovimiento();
        
        if (esDeNoche && sensor.hayMovimiento()) {
            lucesEncendidas = true;
        } else {
            lucesEncendidas = false;
        }
    }
    
    public boolean esDeNoche() {
        return esDeNoche;
    }
    
    public boolean hayMovimiento() {
        return sensor.hayMovimiento();
    }
    
    public boolean lucesEncendidas() {
        return lucesEncendidas;
    }
    
    public void alternarDiaNoche() {
        esDeNoche = !esDeNoche;
    }
}
