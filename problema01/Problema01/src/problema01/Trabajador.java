/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public void establecerCorreo(String correo) {
        this.correo = correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }

    public void establecerMesSueldo(String mesSueldo) {
        this.mesSueldo = mesSueldo;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Cedula: %s\n"
                + "nombres: %s\n correo: %s\nsueldo $%.2f\n   Mes del sueldo: %s\n ",
                obtenerCedula(),obtenerNombres(), obtenerCorreo(),obtenerSueldo(),
                obtenerMesSueldo());
        
        return cadena;
    }
            
}
