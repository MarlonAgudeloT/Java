public class RellenarMatriz {
    public static void main(String[] args) {
        
        
            double arreglo [][];
    
            arreglo = new double[5][5];
    
            
            for (int i = 0; i<arreglo.length; i++ ){
                arreglo[i][0] = i+1;
                for (int j = 0; j < arreglo[0].length; j++){
                    arreglo[i][j] = j+1;
                    System.out.print(" ["+arreglo[i][j]+"] ");

                }
               System.out.println();
                }
            }
        }
        
    
    

