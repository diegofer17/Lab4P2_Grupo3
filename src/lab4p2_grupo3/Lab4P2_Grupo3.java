package lab4p2_grupo3;

import java.util.Scanner;

public class Lab4P2_Grupo3 {
    
    static Scanner leer = new Scanner(System.in);
    static Object [][] tablero = new Object[9][9];
    public static void main(String[] args) {
        
        
        System.out.println("Juego de ajedrez\n"
                + "\n");
        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        String jugador1 = leer.next();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        String jugador2 = leer.next();
        
        System.out.println("Tablero");
        System.out.println("\n");
        llenarMatriz(tablero);
        imprimir(tablero);
    }
    
    public Object [][] creartablero(int filas, int cols){
        Object [][] temporal = new Object [filas][cols];
        
        temporal[0][0]= new Pieza(0, 0, true, "r");
        temporal[0][1]= new Pieza(0, 1, true, "n");
        temporal[0][2]= new Pieza(0, 2, true, "b");
        temporal[0][3]= new Pieza(0, 3, true, "k");
        temporal[0][4]= new Pieza(0, 4, true, "q");
        temporal[0][5]= new Pieza(0, 5, true, "b");
        temporal[0][6]= new Pieza(0, 6, true, "n");
        temporal[0][7]= new Pieza(0, 7, true, "r");
        
        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                if (i == 2) {
                    
                }
            }
        }
        
        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                if(temporal[i][j]==null){
                    temporal [i][j]= "[ ]";
                }
            }
        }
        return temporal;
    }
    
    public static void imprimir(Object[][] tablero) {
        /*String cadena = "";
        
        System.out.println("[ ][A][B][C][D][E][F][G][H]");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                cadena += "["+tablero[i][j]+"]" + " ";
            }
            cadena += "\n";
        }*/
        System.out.println("");
        
        for(int i = 0; i < tablero.length; i += 1) {
            System.out.println("");
            System.out.println("---------------------");
            for(int j = 0; j < tablero[i].length; j += 1) {
                System.out.print("| " + tablero[i][j] + " ");
                if(j == tablero[i].length - 1) {
                    System.out.print("|"+i);
                }
            }
        }
        
        System.out.println();
    }//Fin metodo imprimir
    
    public static Object[][] llenarMatriz(Object[][] tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 1 && j == 0) {
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][0] = p;
                }else if(i == 1 && j == 1){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][1] = p;
                }else if(i == 1 && j == 2){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][2] = p;
                }else if(i == 1 && j == 3){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][3] = p;
                }else if(i == 1 && j == 4){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][4] = p;
                }else if(i == 1 && j == 5){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][5] = p;
                }else if(i == 1 && j == 6){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][6] = p;
                }else if(i == 1 && j == 7){
                    Peon p = new Peon(0,0,true,"p");
                    tablero[1][7] = p;
                }
            }
        }
        return tablero;
    }
}
