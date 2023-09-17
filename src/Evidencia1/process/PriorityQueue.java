package Evidencia1.process;

import java.util.Random;

public class PriorityQueue {
    private int minArrivalTime;
    private int maxArrivalTime;
    private int minServiceTime;
    private int maxServiceTime;

    public static int queueTopAction (int top){
        return top;
    }

    //Establecer el rango de tiempo de llegada de los elementos.
    public void setAndRunArrivalTime(int maxArrivalTime, int minArrivalTime){

        // Validación de qué sí sean correctos los tiempos
        if (minArrivalTime >= maxArrivalTime) {
            throw new IllegalArgumentException("El tiempo mínimo debe ser menor que el tiempo máximo");
        }
        // Validación de que no esté en ceros
        if (minArrivalTime == 0 || maxArrivalTime == 0) {
            throw new IllegalStateException("El rango de tiempo de llegada aún no ha sido establecido");
        }

        this.minArrivalTime = minArrivalTime;
        this.maxArrivalTime = maxArrivalTime;

        Random rand = new Random();
        int arrivalTime = rand.nextInt(maxArrivalTime - minArrivalTime + 1) + minArrivalTime;

        try {
            Thread.sleep(arrivalTime * 1000); //Milisegundos que simulan la espera
            // AGREGAR ELEMENTOS
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void setAndRunServiceTime(int minServiceTime, int maxServiceTime){
        if (minServiceTime >= maxServiceTime) {
            throw new IllegalArgumentException("El tiempo mínimo debe ser menor que el tiempo máximo");
        }

        if(minServiceTime == 0 || maxServiceTime == 0){
            throw new IllegalArgumentException("El rango de tiempo aún no ha sido establecido");
        }
        this.minServiceTime = minServiceTime;
        this.maxServiceTime = maxServiceTime;

        Random rand = new Random();
        int serviceTime = rand.nextInt(maxServiceTime - minServiceTime + 1) + minServiceTime;

        try {
            Thread.sleep(serviceTime * 1000); //Milisegundos que simulan la espera
            // ELIMINAR ELEMENTOS
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }







    public void serviceTimeAction(int maxServiceTime, int minServiceTime){
        Random rand = new Random();
        this.serviceTime = rand.nextInt(maxServiceTime - minServiceTime + 1) + minServiceTime;

    }
    public static void startSimulationAction(){

    }


}
