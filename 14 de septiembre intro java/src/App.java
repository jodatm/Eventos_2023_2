import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Perro perro = new Perro("Manchis",(byte)5,Razas.Labrador);
        System.out.println(perro.nombre);
        System.out.println(perro.edad);
        Perro perro2 = new Perro();
        Perro perro3 = new Perro("Juan",(byte)5,Razas.Pug);
        System.out.println(perro3.raza);
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        byte edad = scanner.nextByte();
        System.out.println("La edad es"+edad);        
        String razaIn = scanner.next();
        //System.out.println(Razas.valueOf(razaIn));
        Razas raza = Razas.SanBernardo;
        /*if(razaIn.equals(Razas.Pug.toString())){
            raza = Razas.Pug;
        }*/
        for(Razas raz:Razas.values()){
            if(razaIn.equals(raz.toString())){
                raza = raz;
            }
        }
        Perro perrito = new Perro(nombre, edad, raza);
        System.out.println(perrito.raza);

    }
}
