package eafit.dis.st0250;
import java.util.Random;
/**
 *
 * @author Cristobal
 */

public class main {
    
    /**
     * Método main, genera casas atraves de lightweight a partir de 4 materiales
     * predefinidos
     * @param args 
     */
    public static void main(String args[]){
        String mats[] = {"Carton","Plastico","Adobe","Oro"};
        

        for (int i = 0; i < mats.length; i++) {
            Random rand = new Random();
            int ran = rand.nextInt((500 - 27) + 1) + 27;
            Casa casa = (Casa)Barrio.getCasa(mats[i], ran);
            System.out.println("Material: "+mats[i]+"\n"+"Area: "+ran);
        }
        
    }
}
