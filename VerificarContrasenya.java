public class VerificarContrasenya {
    static boolean verificar(String cadena){
        boolean valido = false;
        int contNum = 0;
        int contEsp = 0;
        int contMayus = 0;
        int cont=0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isDigit(caracter)) {
                contNum++;
            }
            if (!Character.isLetterOrDigit(caracter)){
                contEsp++;
            }
            if (Character.isUpperCase(caracter)){
                contMayus++;
            }
        }

        if (cadena.length()>=8){
            cont++;
        } else {
            System.err.println("La contrasenya ha de tenir almenys 8 caràcters");
        }

        if (contMayus>=1){
            cont++;
        } else {
            System.err.println("La contrasenya ha de contenir almenys una lletra majúscula");
        }

        if (contEsp>=1){
            cont++;
        } else {
            System.err.println("La contrasenya ha de contenir almenys un caràcter especial");
        }

        if (contNum>=2){
            cont++;
        } else {
            System.err.println("La contrasenya ha de contenir almenys 2 números");
        }
        if (cont==4){
            valido = true;
        }
        return valido;
    }
}
