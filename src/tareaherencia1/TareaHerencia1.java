/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaherencia1;

public class TareaHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        Staff staff = new Staff();
        
        student.setAddress("Casa hogar");
        student.setName("Nombre del estudiante");
        student.setFee(100);
        student.setYear(2020);
        student.setProgram("programa programa");
        student.toString();
        
        staff.setAddress("casa del personal");
        staff.setName("Nombre del personal");
        staff.setPay(125);
        staff.setSchool("la casita del saber");
        staff.toString();
        
    }
    
}
