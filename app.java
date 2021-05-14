import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class app {
        
    public static void main(String[] args) {
            System.out.println("Bienevenido a la segunda actividad de Java");
            Scanner s = new Scanner(System.in);
            boolean salir = false;
            int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1-Devolver 5 numeros en el mismo orden !");
            System.out.println("2-Devolver los numeros en orden inverso !");
            System.out.println("3-Media positiva, negativa y numero de 0");
            System.out.println("4-Cuenta el numero de caracteres de un texto !");
            System.out.println("5-Invierte el texto !");
            System.out.println("6-Elimina los espacios!");
            System.out.println("7-Junta dos textos");
            System.out.println("8-Sustituye las vocales de un texto");
            System.out.println("9-Pasa un texto a ASCII!");
            System.out.println("0-Cerrar el programa");
//Las opciones con ! están acabadas
            System.out.println("Elige una opcion");
            opcion = s.nextInt();

            switch(opcion) {
                case 1 :
                    metodo1();
                    
                    break;
                case 2 :
                    metodo2();
                    break;
                case 3 :
                    System.out.println("Has elegido la tercera opción");
                    break;
                case 4 :
                    metodo4();
                    break;
                case 5 :
                    metodo5();
                    break;
                case 6 :
                    metodo6();
                    break;
                case 7 :
                    metodo7();
                    break;
                case 8 :
                    metodo8();
                    break;
                case 9 :
                    metodo9();
                    break;
                case 0 :
                    salir = true;
                    break;
                default:
                    System.out.println("Las opciones son entre 0-9");


            }
        }    
    }



        private static void metodo1() {
        Scanner s = new Scanner(System.in);
        int [] lista1 = new int [5];
        System.out.println("Di los cinco numeros uno por uno");
        for (int i = 0; i<5;i++){
            
            lista1[i] =s.nextInt();
        }
        System.out.println(Arrays.toString(lista1));
    }
    
    private static void metodo2() {
        Scanner s = new Scanner(System.in);
        int [] lista1 = new int [5];
        System.out.println("Di los cinco numeros uno por uno");
        for (int i = 0; i<5;i++){
            
            lista1[i] =s.nextInt();
        }
        List<Integer> resultado = new ArrayList<>();
        for (int a = lista1.length; a >= 0; a--){
            int numero = (int) a;
            resultado.add(numero);
            
        }
        System.out.println(resultado.toString());
    }
    
    private static void metodo4() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        String texto1 = new String();
        System.out.println("Escribe el texto que quieres usar");
        texto1 = s.next();
        int textosinespacios = texto1.replace(" ", "").length();
        System.out.println("Numero de letras " + (textosinespacios-1));
    }

    private static void metodo5() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        String texto1 = new String();
        System.out.println("Escribe el texto que quieres usar");
        texto1 = s.next();

        byte[] strAsByteArray = texto1.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i=0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        System.out.println(new String (result));
    }

    private static void metodo6() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        String texto1 = new String();
        System.out.println("Escribe el texto que quieres usar");
        texto1 = s.next();
        System.out.println(texto1.replace(" ", ""));
    }

    private static void metodo7() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        String texto1 = new String();
        String texto2 = new String();
        System.out.println("Escribe la primera frase: ");
        texto1 = s.next();
        System.out.println("Escribe la segunda frase: ");
        texto2 = s.next();
        System.out.println(texto1+texto2); //no concatena las variables por algún motivo
    }

    private static void metodo8() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        String texto1 = new String();
        String vocal = new String();
        String str ;
        System.out.println("Escribe el texto que quieres usar");
        texto1 = s.next();
        System.out.println("Escribe la vocal que quieres");
        vocal= s.next();

        String textorenovado = texto1.replaceAll("[aeiou]", vocal);

        System.out.println(textorenovado);
        // Por algún motivo que no comprendo, pese a que la variable textorenovado está correcta cuando lo reviso en debug, printea bara (??)
    }

    private static void metodo9() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        String texto1 = new String();
        String str ;
        System.out.println("Escribe el texto que quieres usar");
        texto1 = s.next();

        byte[] bytes = texto1.getBytes(StandardCharsets.US_ASCII);

        List<Integer> resultado = new ArrayList<>();
        for (byte aByte : bytes) {
            int ascii = (int) aByte;
            resultado.add(ascii);
        }
        System.out.println(resultado.toString());
    }


}  