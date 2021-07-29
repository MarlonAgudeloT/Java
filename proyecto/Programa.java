class Programa {
    public static void main(String[] args) {
        Elefante e; //Declaracion
        e = new Elefante (); //Incialización.
        e.setEdad(10); //Asignacion
        e.alimentarse("manzana");
        e.beber("agua");
        System.out.println("La edad del elefante es "+e.getEdad()+" años");    
    }
}
