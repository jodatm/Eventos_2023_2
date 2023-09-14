public class Perro {

    String nombre;
    Razas raza;
    byte edad;
    
    public Perro(String nombre,
    byte edad, Razas raza){
        this.nombre = nombre;
        this.edad = edad;
        if(raza != null){
            this.raza = raza;
        }else{
            this.raza = Razas.Pug;
        }
        
    }

    public Perro(){

    }

    /*private class Collar{

    }*/
}
