package eafit.dis.st0250;
import java.util.HashMap;
/**
 * @author Cesar
 * @author Cristobal
 */
public class Barrio {
    
    //se usa la estructura arbórea HashMapa
    static HashMap<String, Casa> casasBarrio = new HashMap();
    
    /**
     * Metodo Ligero para la costruccion de una casa
     * @param mat Material con el que se construye la casa
     * @param area Area de la casa
     * @return Objeto del tipo Casa
     */
    public static Construccion getCasa(String mat,int area){
        Casa casa = casasBarrio.get(mat);
        if(casa == (null)){
            casa = new Casa(mat,area);
            casasBarrio.put(mat, casa);
            System.out.println("Construyendo casa");
        }
        return casa;
    }
}
