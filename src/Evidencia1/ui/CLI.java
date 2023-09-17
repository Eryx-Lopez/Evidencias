package Evidencia1.ui;

import Evidencia1.process.PriorityQueue;
import Evidencia1.utilsMenu.Menu;
import Evidencia1.utilsMenu.MenuAction;

import java.util.Scanner;

public class CLI {

    public static Menu menu = new Menu();


    public static String queueTopOption = "Establecer el tope de la cola.";
    public static String elementTimeOption = "Establecer el tiempo de llegada de los elementos";
    public static String serviceTimeOption = "Establecer el tiempo de servicio";
    public static String startSimulationOption = "Iniciar simulación";

    public static MenuAction queueTopAction = (scanner) -> {
        int top = 0;
        System.out.println();
        System.out.println("Ingrese el tope deseado de la cola.");
        Scanner scanner1 = new Scanner(System.in);
        top = scanner1.nextInt();
        PriorityQueue.queueTopAction(top);
    };
    public static MenuAction elementTimeAction = (scanner) -> {

    };
    public static MenuAction serviceTimeAction = (scanner) -> {

    };
    public static MenuAction startSimulationAction = (scanner) -> {

    };

    static{
        menu.addOption(queueTopOption, queueTopAction);
        menu.addOption(elementTimeOption, elementTimeAction);
        menu.addOption(serviceTimeOption, serviceTimeAction);
        menu.addOption(startSimulationOption, startSimulationAction);
    }


    public static void startSimulation(){
        System.out.println("Bienvenido al simulador.");
        do {
            menu.showMenu();
            var option = menu.readOption();
            menu.selectAndRunOption(option);
        } while (menu.isAlive());

    }
}
