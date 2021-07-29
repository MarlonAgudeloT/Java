public class Bandera {
    public static void main(String[] args) {
        boolean bandera = true;

        int i = 0;
        while(bandera){
            System.out.println(i+ ": Hola");
            if (i>20)
            {
                bandera = false;
            }
            i++;
        }
    System.out.println("Bandera" +bandera);
    }
}
