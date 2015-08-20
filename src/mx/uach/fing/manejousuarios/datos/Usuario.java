
 
package mx.uach.fing.manejousuarios.datos;

/**
 *
 * Clase que se encarga de manejar los usuarios del sistema.
 * 
 * @author Alejandro Rodriguez Gonzalez 
 * @version 1.0
 * 
 * see: para ver referencias.
 * Serial: serializar una clase a texto
 * version: identificador unico a la clase
 */


public class Usuario {
    
    //atributos en cualquier modelado deben ser privado
    
private Integer id;
private String name;
private String primerApellido;
private Integer edad;

    /**
     * Metodo que regresa el identificador unico de cada usuario.
     * @throws NullPointerException cuando no exista usario en la base de datos.
     * @return the id (numero entero).
     */
    public Integer getId() throws NullPointerException{
        if( this.id == null){
            /*throw  new NullPointerException( todo esto se ejecuta mas lento.
                    "El usuario"+ this.name +
                            " no a sido guardado en la base de datos.");*/
            throw new NullPointerException(String.format( 
                    "El usuario %s No existe", this.name));
        }
        return id;
    }

    /**
     * @param id que se asignara al usuario al ser guardado en la base de datos.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}
