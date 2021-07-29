public class PromedioCajaBlanca {

    public static void calcularPromedio(double datos[]){
        double ans = 0;
        if(datos.length >0)
        {
            for (double numero:datos){
                ans+=numero;
            }
            ans= ans/datos.length;
            System.out.println(" El promedio es" + ans);
            }
            else
            {
            System.out.println("No hay numeros");
            }
    }


    public static void main(String[] args) {
        
        calcularPromedio(new double[]{1,2,3,4,5,6,7,8,9,10});
    }
}

