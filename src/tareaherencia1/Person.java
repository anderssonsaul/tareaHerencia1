/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia1;

public class Person {

    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String cadena;
cadena = "*******************************************\n";
        cadena = cadena + "\nDatos de la persona\n\n";
        cadena = cadena+"Nombre: " + getName() + "\n";
        cadena = cadena + "Direccion: " + getAddress() + "\n";
        System.out.println(cadena);
        return cadena;
    }

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
