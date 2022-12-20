package data;

public class QueueA {

    private String[] queue = new String[10];
    private int posq; //ist die aktuell Position im Array

    public QueueA() {

    }

    public QueueA(int groesse){
        if(groesse > 1 && groesse < 100){
            queue = new String[groesse];
        } else {
            System.err.println("QueueA eigene Größe: Dieser Wert ist ungültig");
        }
    }

    public void put(String x){
        if(posq > queue.length -1 || x == null){
            System.err.println("Array ist voll oder ungültig put()");
        } else {
            queue[posq] = x;
            posq++;
        }

    }


    public String get(){
        if(posq == 0){
            System.err.println("Der Array ist leer bei get()");
            return null;
        } else {
            String req = queue[0];
            for(int i = 1; i < posq; i++){
                queue[i -1 ] = queue[i];
            }
            posq--;
            return req;
        }
    }

    public void printAllElementsq(){
        if(posq == 0){
            System.err.println("Im Array ist kein Inhalt: Rückgabe vom printAllElementsq() Queue");
        } else {
            for(int i = 0; i < posq; i++){
                System.out.println("Position: " + i + " || Inhalt: " + queue[i]);
            }
        }

    }



}
