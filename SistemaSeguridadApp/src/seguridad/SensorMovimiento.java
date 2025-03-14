package seguridad;

public class SensorMovimiento {
    private boolean estado;
    
    public SensorMovimiento() {
        this.estado = false;
    }
    
    public void detectarMovimiento() {
        this.estado = Math.random() > 0.5;
    }
    
    public boolean hayMovimiento() {
        return estado;
    }
}

