package com.sportium.testData;

import java.util.Random;

public class RegisterData {

    private static final String[] FIRST_NAMES = {"Juan", "María", "Pedro", "Ana", "Carlos", "Laura", "Luis", "Isabel"};
    private static final String[] FIRST_SURNAMES = {"Lopez", "Gomez", "Fernandez", "Rodriguez", "Martinez", "Garcia", "Perez", "Sanchez"};
    private static final String[] SECOND_SURNAMES = {"Gonzalez", "Torres", "Ruiz", "Romero", "Ramirez", "Diaz", "Vargas", "Morales"};

    private static Random random = new Random();

    // Genera un DNI válido para España
    public static String generarDNI() {
        Random random = new Random();
        StringBuilder dni = new StringBuilder();

        // Genera los 8 dígitos numéricos del DNI
        for (int i = 0; i < 8; i++) {
            dni.append(random.nextInt(10));
        }

        // Calcula el dígito de control (letra)
        int dniNumber = Integer.parseInt(dni.toString());
        int remainder = dniNumber % 23;
        char letter = obtenerLetraDNI(remainder);

        return dni.append(letter).toString();
    }

    // Genera un NIE (Número de Identificación de Extranjero) válido para España
    public static String generarNIE() {
        Random random = new Random();
        String[] niePrefixes = {"X", "Y", "Z"};
        StringBuilder nie = new StringBuilder();

        // Selecciona aleatoriamente un prefijo (X, Y o Z)
        String selectedPrefix = niePrefixes[random.nextInt(niePrefixes.length)];
        nie.append(selectedPrefix);

        // Genera los 7 dígitos numéricos del NIE
        for (int i = 0; i < 7; i++) {
            nie.append(random.nextInt(10));
        }

        // Calcula el dígito de control (letra)
        int nieNumber = Integer.parseInt(nie.substring(1));
        int remainder = nieNumber % 23;
        char letter = obtenerLetraDNI(remainder);

        return nie.append(letter).toString();
    }

    ////////////////////////////////////////////////////////
    // Genera un nombre aleatorio
    public static String generarNombreAleatorio() {
        int index = random.nextInt(FIRST_NAMES.length);
        return FIRST_NAMES[index];
    }

    // Genera un primer apellido aleatorio
    public static String generarPrimerApellidoAleatorio() {
        int index = random.nextInt(FIRST_SURNAMES.length);
        return FIRST_SURNAMES[index];
    }

    // Genera un segundo apellido aleatorio
    public static String generarSegundoApellidoAleatorio() {
        int index = random.nextInt(SECOND_SURNAMES.length);
        return SECOND_SURNAMES[index];
    }
/////////////////////////////////
// Genera un número aleatorio entre min (inclusive) y max (inclusive)
private static int generarNumeroAleatorio(int min, int max) {
    return random.nextInt(max - min + 1) + min;
}

    // Genera una fecha de nacimiento aleatoria
    public static String generarFechaNacimientoAleatoria() {
        int dia = generarNumeroAleatorio(1, 28);
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String mes = meses[random.nextInt(meses.length)];
        int anio = generarNumeroAleatorio(1970, 2005); // Rango de años de 1970 a 2005

        return dia + " " + mes + " " + anio;
    }


//////////////////
    // Calcula la letra correspondiente al dígito de control para el DNI o NIE
    private static char obtenerLetraDNI(int remainder) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(remainder);
    }


    /////
    // Genera una dirección aleatoria
    public static String generateRandomAddress() {
        String[] streetNames = {"Calle A", "Calle B", "Calle C", "Calle D", "Calle E"};
        String[] cities = {"Ciudad X", "Ciudad Y", "Ciudad Z"};
        String street = streetNames[random.nextInt(streetNames.length)];
        String city = cities[random.nextInt(cities.length)];
        return street + ", " + city;
    }

    // Genera una línea de dirección aleatoria
    public static String generateLineRandomAddress() {
        String[] addressLines = {"Alcalde Porqueres", "Gobernador Mioño", "Plaza Principal"};
        return addressLines[random.nextInt(addressLines.length)];
    }

    // Genera un código postal aleatorio
    public static String generateRandomPostalCode() {
        int postalCode = 10000 + random.nextInt(90000);
        return String.valueOf(postalCode);
    }

    // Genera un número de teléfono aleatorio
    public static String generateRandomTelephone() {
        long phoneNumber = 600000000 + random.nextInt(99999999);
        return String.valueOf(phoneNumber);
    }

    // Genera un nombre de usuario aleatorio (sin espacios)
    public static String generateRandomUserName() {
        String[] prefixes = {"User", "Vip", "Alpha", "Beta", "Test"};
        String[] suffixes = {"Miss", "Master", "Guru", "Pro"};
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String suffix = suffixes[random.nextInt(suffixes.length)];
        return prefix + suffix + "." + (random.nextInt(90) + 10); // Agregar un número aleatorio de 10 a 99
    }

    //CONTRASEÑA
    // Genera una contraseña aleatoria con los criterios especificados
    public static String generateRandomPassword() {
        String caracteresEspeciales = "!@#$%&*()_-+=.?";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String digitos = "0123456789";

        String caracteresPermitidos = caracteresEspeciales + mayusculas + minusculas + digitos;

        StringBuilder contrasenia = new StringBuilder();
        int longitudMinima = 8;
        int longitudMaxima = 10;
        int longitud = longitudMinima + random.nextInt(longitudMaxima - longitudMinima + 1);

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            contrasenia.append(caracteresPermitidos.charAt(index));
        }

        return contrasenia.toString();
    }

}
