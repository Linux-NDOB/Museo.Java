package prehistoria;
 
//Este import nos permitira hacer uso de los famosos
//JOptionPane
import javax.swing.*;

//Primero declaramos las variables relacionadas

public class Clase{

    private String Nombre;
    private  float Peso;
    private  float Longitud;

    // Luego declaramos el metodo constructor inicializando
    // las variables en "ceros"
    public Clase() {

        Nombre = "";

        Peso = 0;

        Longitud = 0;

    }

    // Luego los metodos set y get

    public String getNombre() {

        return Nombre;

    }

    public float getPeso() {

        return Peso;
    }

    public float getLongitud() {

        return Longitud;

    }

    public void setNombre(String nombre) {

        Nombre = nombre;

    }

    public void setPeso(float peso) {

        Peso = peso;

    }

    public void setLongitud(float longitud) {

        Longitud = longitud;

    }

//Ahora procedemos con el metodo que nos permita hacer la conversion
// de forma correcta 

public void Conversiones( ){

    //Primero preguntemos su nombre

    Nombre = JOptionPane.showInputDialog(null, "Porfavor ingrese el  nombre \n"
                                        + " del dinosaurio");

    //Lo que hacemos es  preguntar el numero de libras y pies
    // que posee cada dinosaurio con JOptionPane

    Peso = Float.parseFloat(JOptionPane.showInputDialog(null, 
                           "Porfavor ingrese su peso en Libras"));


    Longitud = Float.parseFloat(JOptionPane.showInputDialog(null, "Porfavor ingrese la longitud\n "
                                                            + "del dinosaurio en pies"));

    //Ahora viene  lo mas importante : la Conversion
    //Declaramos variables locales para definir los valores 
    //de kilogramos y pies
    float kilogramos; 
    float metros ;

    //Los numeros entre los cuales debemos hacer la conversion
    //son reconocidos como double y no como float por tanto se agrega 
    //(float) delante de los numeros y que asi se pueda hacer la conversion
    //sin problemas

    kilogramos = (float)2.205;

    metros = (float)3.281;
     
    
    //Ahora calcularemos la conversion de L a Kg y Pies a M
    float LaKg = 0;

    LaKg= (Peso/kilogramos);

    float PaM = 0;

    PaM = (Longitud/metros);

    //Luego mostraremos por pantalla un mensaje que nos devuelva
    //la informacion que hemos introducido convertida a kg y m

    JOptionPane.showMessageDialog(null, "Conversion realizada con exito\n"
                                         +"Nombre del dinosaurio: " + Nombre + "\n"
                                         +"Peso del dinosaurio(Kg): " + LaKg+"\n"
                                         +"Longitud de dinosaurio(M): " + PaM);
    
}

}

