/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ejercicio01;

/**
 *
 * @author alond
 */
public class Administrativo {
    extends Empleado {
    
    private String cargo;

    public Administrativo( String name, String direccion, String telefono, String email,
            int oficina, double sueldo, String cargo) {
        super(name, direccion, telefono, email, oficina, sueldo);
        this.cargo = cargo;
    }

    Administrativo(String tom, String _Country_Road, String string, String tomcatemailcom, int i, int i0, String asistente_Ejecutivo) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCargo: " + cargo;
    }           
}

