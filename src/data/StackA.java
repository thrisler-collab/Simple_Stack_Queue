package data;

import java.util.ArrayList;

public class StackA {
   private String[] stack = new String[10];
   private int pos; //ist die aktuell Position im Array
    public StackA() {

    }

    public StackA(int groesse){
        if(groesse > 1 && groesse < 100){
            stack = new String[groesse];
        } else {
            System.err.println("stackA eigene Größe: Dieser Wert ist ungültig");
        }
    }

    public void push(String x){
        if(pos > stack.length -1 || x == null){
            System.err.println("Array ist voll oder ungültig");
        } else {
            stack[pos] = x;
            pos++;
        }

    }

    public  String pop(){
        if(pos == 0){
            System.err.println("Der Array ist leer");
            return null;
        }else{
            String re = stack[pos -1];
            stack[pos -1] = null;
            pos--;
            return re;
        }
    }

    public String peek(){
        if(pos == 0){
            System.err.println("Das Array ist leer");
            return null;
        } else {
            return stack[pos -1];
        }

    }

    public void printAllElements(){
        if(pos == 0){
            System.err.println("Im Array ist kein Inhalt: Rückgabe vom printAllElements() Stack");
        } else{
            for(int i = 0; i < pos; i++){
                System.out.println("Position: " + i + " || Inhalt: " + stack[i]);
            }
        }

    }


}
