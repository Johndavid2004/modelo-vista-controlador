package luces;

public class SensorMovimiento {
    private boolean movimiento;
    
    public SensorMovimiento() {
        this.movimiento = false;
    }
    
    public void detectarMovimiento() {
        this.movimiento = Math.random() > 0.5;
    }
    
    public boolean hayMovimiento() {
        return movimiento;
    }
}
