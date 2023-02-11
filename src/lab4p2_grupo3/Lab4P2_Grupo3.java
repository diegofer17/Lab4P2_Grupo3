package lab4p2_grupo3;

import java.util.Scanner;

public class Lab4P2_Grupo3 {

    static Scanner leer = new Scanner(System.in);
    static Object[][] tablero = new Object[9][9];

    public static void main(String[] args) {

        System.out.println("Juego de ajedrez\n"
                + "\n");
        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        String jugador1 = leer.next();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        String jugador2 = leer.next();

        System.out.println("Tablero");
        System.out.println("\n");
        llenarMatriz(tablero, jugador1, jugador2);
        imprimir(tablero);
    }

    public Object[][] creartablero(int filas, int cols) {
        Object[][] temporal = new Object[filas][cols];

        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                if (i == 2) {

                }
            }
        }

        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                if (temporal[i][j] == null) {
                    temporal[i][j] = "[ ]";
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

        for (int i = 0; i < tablero.length; i += 1) {
            System.out.println("");
            for (int j = 0; j < tablero[i].length; j += 1) {
                System.out.print("| " + tablero[i][j] + " ");
                if (j == tablero[i].length - 1) {
                    System.out.print("|" + i);
                }
            }
        }

        System.out.println();
    }//Fin metodo imprimir

    public static Object[][] llenarMatriz(Object[][] tablero, String jugador1, String jugador2) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Torre t = new Torre(0, 0, 1, "R");
                tablero[0][0] = t;

                Torre t2 = new Torre(0, 0, 1, "R");
                tablero[0][7] = t2;
            
                Torre t3 = new Torre(0, 0, 2, "r");
                tablero[7][0] = t3;
            
                Torre t4 = new Torre(0, 0, 1, "r");
                tablero[7][7] = t4;
           
                Caballo c = new Caballo(0, 0, 1, "N");
                tablero[0][1] = c;
            
                Caballo c1 = new Caballo(0, 0, 1, "N");
                tablero[0][6] = c1;
            
                Caballo c2 = new Caballo(0, 0, 2, "n");
                tablero[7][1] = c2;
            
                Caballo c3 = new Caballo(0, 0, 2, "n");
                tablero[7][6] = c3;
            
                Alfil a = new Alfil(0, 0, 1, "B");
                tablero[0][2] = a;
            
                Alfil a2 = new Alfil(0, 0, 1, "B");
                tablero[0][5] = a2;
            
                Alfil a3 = new Alfil(0, 0, 2, "b");
                tablero[7][2] = a3;
            
                Alfil a5 = new Alfil(0, 0, 2, "b");
                tablero[7][5] = a5;
            
                Rey r = new Rey(0, 0, 1, "K");
                tablero[0][4] = r;
            
                Rey r1 = new Rey(0, 0, 2, "k");
                tablero[7][4] = r1;
            
                Dama r2 = new Dama(0, 0, 1, "Q");
                tablero[0][3] = r2;
            
                Dama r3 = new Dama(0, 0, 2, "q");
                tablero[7][3] = r3;
                
                Peon p1 = new Peon(0, 0, 1, "P");
                tablero[2][1] = p1;
                Peon p2 = new Peon(0, 0, 1, "P");
                tablero[2][2] = p2;
                Peon p3 = new Peon(0, 0, 1, "P");
                tablero[2][3] = p3;
                Peon p4 = new Peon(0, 0, 1, "P");
                tablero[2][4] = p4;
                Peon p5 = new Peon(0, 0, 1, "P");
                tablero[2][5] = p5;
                Peon p6 = new Peon(0, 0, 1, "P");
                tablero[2][6] = p6;
                Peon p7 = new Peon(0, 0, 1, "P");
                tablero[2][7] = p7;
                Peon p8 = new Peon(0, 0, 1, "P");
                tablero[2][8] = p8;
                
                Peon p11 = new Peon(0, 0, 2, "p");
                tablero[7][1] = p11;
                Peon p22 = new Peon(0, 0, 2, "p");
                tablero[7][2] = p22;
                Peon p33 = new Peon(0, 0, 2, "p");
                tablero[7][3] = p33;
                Peon p44 = new Peon(0, 0, 2, "p");
                tablero[7][4] = p44;
                Peon p55 = new Peon(0, 0, 2, "p");
                tablero[7][5] = p55;
                Peon p66 = new Peon(0, 0, 2, "p");
                tablero[7][6] = p66;
                Peon p77 = new Peon(0, 0, 2, "p");
                tablero[7][7] = p77;
                Peon p88 = new Peon(0, 0, 2, "p");
                tablero[7][8] = p88;
                
            }

            
        }
        return tablero;
    }
}
