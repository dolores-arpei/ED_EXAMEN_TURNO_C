/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoed_20836996p;

/**
 *
 * @author Administrator
 */
public class EmpleadoED_20836996P {

   static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    public EmpleadoED_20836996P(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA        
        EmpleadoED_20836996P emp = new EmpleadoED_20836996P("DOLORES ARGANDOÑA", "20836996P");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
    
}
