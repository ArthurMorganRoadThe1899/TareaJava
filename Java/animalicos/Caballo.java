package Programacion.Java.animalicos;

public class Caballo extends Animal{
    public void relinchar(){
        System.out.print("Hiiii");
    }

    public static int edadC(int edadC){
        edadC = 25;
        return edadC;
    }
    public Caballo(int edad, String nombre, String tipo_alimentacion, String patas) {
        super(edad, nombre, tipo_alimentacion);
        this.patas=patas;
    }
    private String patas;
}