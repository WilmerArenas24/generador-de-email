package GeneratorEmails;

public class GeneratorEmails {
    public static void main(String[] args) {
        System.out.println("***GENERADOR DE EMAIL***");

        var nombreCompleto = "Valentina Casas Gonzales";
        var empresa = "Medtronic";
        var dominio = ".com.co";
        
        var nombreNormalizado = nombreCompleto.replace(" ",".").toLowerCase();
        var empresaNormalizado = empresa.toLowerCase();
        var correo = new StringBuffer();
        
        correo.append(nombreNormalizado).append('@').append(empresaNormalizado).append(dominio);

        System.out.println("correo = " + correo);
    }
}
