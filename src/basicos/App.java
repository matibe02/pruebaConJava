package basicos;
public class App {
    public static void main(String[] args) throws Exception {
        String texto = "Esto es un texto cualquiera, estoy probando";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println("La longitud del texto es: " + longitud);

        char caracter = texto.charAt(5);
        System.out.println("Caracter de index 4: " + caracter);

        String subcadena = texto.substring(29, 43);
        System.out.println("Subcadena: " + subcadena);

        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int indice = texto.indexOf("texto");
        System.out.println("Indice de \"texto\":" + indice);

        String reemplazo = texto.replace("texto", "string");
        System.out.println(reemplazo);

        boolean contiene = texto.contains("cualquiera");
        System.out.println("La cadena contiene la palabra \"contiene\"?: " + contiene);
        
    }
}
