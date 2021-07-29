import java.util.Arrays;

public class OrdenarSort {
    public static void main(String[] args) {
        
        int datos [] = {8,54,3,23,2,1,-55};

        System.out.println(Arrays.toString(datos) );
        Arrays.sort(datos);
        System.out.println(Arrays.toString(datos));

        System.out.println(Arrays.binarySearch(datos,8));
    }
}
