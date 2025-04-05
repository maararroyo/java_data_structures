
package cuenta;

public class Cuenta {

    private String nombre; 
    
    //Método para establecer el nombre en el objeto
    public void establecerNombre(String nombre) {
        this.nombre = nombre;//almacenar el nombre
    }
    
    //Método para obtener el nombre del objeto
    public String obtenerNombre(){
        return nombre;
    }
    
}
