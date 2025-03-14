package seguridad;

public class SistemaSeguridad {
    private final SensorMovimiento sensor1;
    private final SensorMovimiento sensor2;
    private final SensorMovimiento sensor3;
    private boolean esDeNoche;
    private boolean alarmaActivada;
    
    public SistemaSeguridad() {
        this.sensor1 = new SensorMovimiento();
        this.sensor2 = new SensorMovimiento();
        this.sensor3 = new SensorMovimiento();
        this.esDeNoche = true; 
        this.alarmaActivada = false;
    }
    
    public void verificarSensores() {
        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();
        sensor3.detectarMovimiento();
        
        int sensoresActivos = 0;
        if (sensor1.hayMovimiento()) sensoresActivos++;
        if (sensor2.hayMovimiento()) sensoresActivos++;
        if (sensor3.hayMovimiento()) sensoresActivos++;
        
        alarmaActivada = esDeNoche && sensoresActivos >= 2;
    }

    public void alternarDiaNoche() {
        esDeNoche = !esDeNoche;
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    public boolean isEsDeNoche() {
        return esDeNoche;
    }

    public boolean getEstadoSensor1() {
        return sensor1.hayMovimiento();
    }

    public boolean getEstadoSensor2() {
        return sensor2.hayMovimiento();
    }

    public boolean getEstadoSensor3() {
        return sensor3.hayMovimiento();
    }
}

