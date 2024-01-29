package edu.upvictoria.fpoo;

import ProblemaCatorce.EjercicioCatorce;
import ProblemaCinco.EjercicioCinco;
import ProblemaCuatro.EjercicioCuatro;
import ProblemaDiecinueve.EjercicioDiecinueve;
import ProblemaDieciocho.EjercicioDieciocho;
import ProblemaDieciseis.EjercicioDieciseis;
import ProblemaDiecisiete.EjercicioDiecisiete;
import ProblemaDiez.EjercicioDiez;
import ProblemaDoce.EjercicioDoce;
import ProblemaDos.EjercicioDos;
import ProblemaNueve.EjercicioNueve;
import ProblemaOnce.EjercicioOnce;
import ProblemaQuince.EjercicioQuince;
import ProblemaSeis.EjercicioSeis;
import ProblemaSiete.EjercicioSiete;
import ProblemaTrece.EjercicioTrece;
import ProblemaTres.EjercicioTres;
import ProblemaUno.EjercicioUno;
import ProblemaVeinte.EjercicioVeinte;
import ProblemaVeinticinco.EjercicioVeinticinco;
import ProblemaVeinticuatro.EjercicioVeinticuatro;
import ProblemaVeintidos.EjercicioVeintidos;
import ProblemaVeintitres.EjercicioVeintitres;
import ProblemaVeintiuno.EjercicioVeintiuno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Menu {

    /**
     * Prints the main menu
     * */
    public void printMenu() {
        System.out.println("---------------------------------------------------------");
        System.out.println("------------------Seleccione una opción------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Suma de dos números");
        System.out.println("2. Cálculo de promedios de exámen");
        System.out.println("3. Área de un rectángulo");
        System.out.println("4. Área de una circunferencia");
        System.out.println("5. Área de un terreno con forma irregular");
        System.out.println("6. Área de la figura con forma de cono de nieve");
        System.out.println("7. Producción de leche");
        System.out.println("8. Distancia entre dos puntos en el plano cartesiano");
        System.out.println("9. Sueldo semanal de un trabajador");
        System.out.println("10. Modista");
        System.out.println("11. Conagua");
        System.out.println("12. Área de un triángulo");
        System.out.println("13. Conversiones de peso a dolar");
        System.out.println("14. Edad del personal");
        System.out.println("15. Estacionamiento");
        System.out.println("16. Pinturas");
        System.out.println("17. Hipotenusa");
        System.out.println("18. Autobuses \"La curva loca\"");
        System.out.println("19. Tiempo en bicicleta");
        System.out.println("20. Costo de llamada telefónica");
        System.out.println("21. CONAGUA");
        System.out.println("22. Compañía de luz y sombras CLS");
        System.out.println("23. Descuento e IVA");
        System.out.println("24. Ahorro");
        System.out.println("25. Cheques");
        System.out.println("26. Concepto de monto");
        System.out.println("27. Salir");
    }

    /**
     * Prints the welcome menu
     * */
    public void printWelcome() {
        System.out.println("-------------------------------------");
        System.out.println("----Bienvenido al problemario uno----");
        System.out.println("-------------------------------------");
    }

    public void selectOpc () throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int opc = 0;
            printMenu();
            try {
                opc = Integer.parseInt(scanner.readLine());
            } catch (InputMismatchException | IOException e) {
                System.out.println();
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("---------OPCIÓN NO VÁLIDA---------");
                System.out.println("--------INTÉNTALO DE NUEVO--------");
                System.out.println("----------------------------------");
                System.out.println();
                System.out.println();
            }

            if (opc >= 1 && opc <= 27) {
                if (opc == 1) {
                    EjercicioUno uno = new EjercicioUno();
                }
                if (opc == 2) {
                    EjercicioDos dos = new EjercicioDos();
                }
                if (opc == 3) {
                    EjercicioTres tres = new EjercicioTres();
                }
                if (opc == 4) {
                    EjercicioCuatro cuatro = new EjercicioCuatro();
                }
                if (opc == 5) {
                    EjercicioCinco cinco = new EjercicioCinco();
                }
                if (opc == 6) {
                    EjercicioSeis seis = new EjercicioSeis();
                }
                if (opc == 7) {
                    EjercicioSiete siete = new EjercicioSiete();
                }
                if (opc == 9) {
                    EjercicioNueve nueve = new EjercicioNueve();
                }
                if (opc == 10) {
                    EjercicioDiez diez = new EjercicioDiez();
                }
                if (opc == 11) {
                    EjercicioOnce once = new EjercicioOnce();
                }
                if (opc == 12) {
                    EjercicioDoce doce = new EjercicioDoce();
                }
                if (opc == 13) {
                    EjercicioTrece trece = new EjercicioTrece();
                }
                if (opc == 14) {
                    EjercicioCatorce catorce = new EjercicioCatorce();
                }
                if (opc == 15) {
                    EjercicioQuince quince = new EjercicioQuince();
                }
                if (opc == 16) {
                    EjercicioDieciseis dieciseis = new EjercicioDieciseis();
                }
                if (opc == 17) {
                    EjercicioDiecisiete diecisiete = new EjercicioDiecisiete();
                }
                if (opc == 18) {
                    EjercicioDieciocho dieciocho = new EjercicioDieciocho();
                }
                if (opc == 19) {
                    EjercicioDiecinueve diecinueve = new EjercicioDiecinueve();
                }
                if (opc == 20) {
                    EjercicioVeinte veinte = new EjercicioVeinte();
                }
                if (opc == 21) {
                    EjercicioVeintiuno veintuno = new EjercicioVeintiuno();
                }
                if (opc == 22) {
                    EjercicioVeintidos veintidos = new EjercicioVeintidos();
                }
                if (opc == 23) {
                    EjercicioVeintitres veintitres = new EjercicioVeintitres();
                }
                if (opc == 24) {
                    EjercicioVeinticuatro veinticuatro = new EjercicioVeinticuatro();
                }
                if (opc == 25) {
                    EjercicioVeinticinco veinticinco = new EjercicioVeinticinco();
                }
                if (opc == 26) System.out.println("solo se modifico el ejercic");
                if (opc == 27) break;
            }
        }
    }
}