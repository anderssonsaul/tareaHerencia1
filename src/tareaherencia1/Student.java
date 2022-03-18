/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia1;

public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Student() {
    }

    public Student(String program, int year, double fee, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String toString() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos Estudiante\n\n";
        cadena = cadena + "Nombre: " + getName() + "\n";
        cadena = cadena + "Direccion: " + getAddress() + "\n";
        cadena = cadena + "Programa: " + getProgram() + "\n";
        cadena = cadena + "Anio: " + getYear() + "\n";
        cadena = cadena + "Tarifa: " + getFee() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
        return cadena;
    }
}
