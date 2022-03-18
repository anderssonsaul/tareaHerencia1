/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia1;

public class Staff extends Person {

    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff() {
    }

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String toString() {
        String cadena;

        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos del Personal\n\n";
        cadena = cadena + "Nombre: " + getName() + "\n";
        cadena = cadena + "Direccion: " + getAddress() + "\n";
        cadena = cadena + "Colegio: " + getSchool() + "\n";
        cadena = cadena + "Pagar: " + getPay() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
        return cadena;
    }

}
