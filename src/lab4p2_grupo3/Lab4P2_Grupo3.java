package lab4p2_grupo3;

import java.util.Scanner;

public class Lab4P2_Grupo3 {
    
    static Scanner leer = new Scanner(System.in);
    static Object [][] tablero = new Object[8][8];
    public static void main(String[] args) {
        
        
        System.out.println("Juego de ajedrez\n"
                + "\n");
        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        String jugador1 = leer.next();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        String jugador2 = leer.next();
        
        System.out.println("Tablero");
        System.out.println("\n");
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
                if (i == 1){
                    temporal [i][j] = new Pieza(0, 0, true, "p");
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
        String cadena = "";
        
        System.out.println("[ ][A][B][C][D][E][F][G][H]");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                cadena += "["+tablero[i][j]+"]" + " ";
            }
            cadena += "\n";
        }
    }//Fin metodo imprimir
}
