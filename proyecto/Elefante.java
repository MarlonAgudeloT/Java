public class Elefante {
    
    private int edad;
    private String origen;
    private float peso;
    private String nombre;
    private float estatura;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void alimentarse(String comida){
        System.out.println("Esta comiendo " + comida);

    }

    public void beber (String liquido){
        System.out.println("Esta tomando " + liquido);

    }
    public String emitirSonido(){
        return "sonido";
    }

}
