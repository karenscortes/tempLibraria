package utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDatos {
   
    Connection conexion;
    Statement manipularDB;
    public com.sun.jdi.connect.spi.Connection getConexion;
    
    public BaseDatos(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "livraria";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa.");
            
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void imprimirPersonas(){
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("nombres"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    
    /*
    public Persona[] extraerPersonas(){
        try {
            Persona arreglo [] = new Persona[100];
            String consulta = "SELECT * FROM personas";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    String documento = registros.getString("cedula");
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                    String direccion = registros.getString("direccion");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("email");
                    
                    arreglo[i] = new Persona(documento, nombres, apellidos,direccion, telefono, correo);
                    i++;
                }while(registros.next());
                
                return arreglo;
            }else{
                return arreglo;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }
    */
    
    public String[] consultaLogin(String correo){
        String arrayInfo[];
        try {
            String consulta = "SELECT * FROM usuario WHERE correo='"+correo+"'";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();       
            if (registros.getRow()==1) {
                String password = registros.getString("passwords");      
                arrayInfo = new String[]{correo,password};
                return  arrayInfo;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error al realizar la consulta: " + ex.getMessage());
            return null; 
        }
        
        return null;
    }
    
    public boolean insertarPersona(String correo, String nombre, String telefono,String tipoUsuario, String contrasenia){
        boolean respuesta = false;
        try {
            String consulta = "INSERT INTO usuario (correo,nombre,telefono,tipo,passwords) VALUES ('"+correo+"','"+nombre+"','"+telefono+"','"+tipoUsuario+"','"+contrasenia+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }
        return respuesta;
    }
    
    /*
     public Persona buscarPersona(String cedula){ //una funcion devuelve un solo tipo de dato
                                                                                
         Persona resultado = null; // NULL funcion de objetos que significa que exite, pero no hay nada
         
        try{
            String consulta = "SELECT * FROM personas WHERE cedula = '" +cedula+ "' "; //se crea la consulta sql donde cedula sea igual a cedula
            ResultSet registros = manipularDB.executeQuery(consulta); //se ejecuta la consulta y se almacena en ResultSet registros para preguntar si se puede ubicar en el primer registro
            registros.next(); // si se va por el else no existe el registro
            
            if(registros.getRow()==1){ // si encontró esa persona es igual a uno y se retornan los datos
                String documento = registros.getString("cedula");
                String nombres = registros.getString("nombres");
                String apellidos = registros.getString("apellidos");
                String direccion = registros.getString("direccion");
                String telefono = registros.getString("telefono");
                String correo = registros.getString("email");
                
                resultado = new Persona(documento, nombres, apellidos,direccion, telefono, correo); // se crea a la nueva persona con todos los datos
                return resultado; // retorna el resultado
            }else{
                return resultado;
            }    
        }catch (SQLException ex){
            System.out.println("Error al buscar registros: "+ex.getMessage());
            System.out.println(ex.getMessage());
            return null;
        }
        
    }
    
    public boolean actualizarPersona(String cedula, String nombres, String apellidos, String direccion, String telefono, String email){
        boolean respuesta = false;
        try {
            String consulta = "UPDATE personas SET nombres='"+nombres+"', apellidos='"+apellidos+"', direccion='"+direccion+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }
   
        
    */
    public boolean eliminarPersona(String cedula){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }
    
    
     public Connection getConexion(){
        return conexion;
    }
    
    public Statement getManipularDB(){
        return manipularDB;
    }
    
}