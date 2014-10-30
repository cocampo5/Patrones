package eafit.dis.st0250;

/**
 * @author Cesar
 * @author Cristobal
 * 
 * Casa extediende o implementa de @Construccion y hereda el metodo construir
 */
public class Casa implements Construccion{
    
    private String material;
    private int area;
    
    /**
     * Constructor de @Casa recibe dos parametros:
     * @param mat Material con el que se construye la casa
     * @param area Area de la casa
     */
    public Casa(String mat,int area){
        this.area = area;
        this.material = mat;
    }
    @Override
    /**
     * Metodo heredado de @Construccion
     */
    public  void construir (String mat,int area){
        System.out.println("Los materiales son:\n"+mat+"\n"+"El area es:\n"+area);
    }
}
