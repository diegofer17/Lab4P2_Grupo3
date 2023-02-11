package lab4p2_grupo3;

import java.util.Scanner;

public class Lab4P2_Grupo3 {

    static Scanner leer = new Scanner(System.in);
    static Object[][] tablero = new Object[9][9];

    public static void main(String[] args) {

        System.out.println("Juego de ajedrez\n"
                + "");

        System.out.println("Tablero");
        ;
        imprimir(creartablero(9,9));
        
        System.out.println("");
        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        String jugador1 = leer.next();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        String jugador2 = leer.next();
    }

    public static Object[][] creartablero(int filas, int cols) {
        Object[][] temporal = new Object[filas][cols];

        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                temporal[0][1]= "A";
                temporal[0][2]= "B";
                temporal[0][3]= "C";
                temporal[0][4]= "D";
                temporal[0][5]= "E";
                temporal[0][6]= "F";
                temporal[0][7]= "G";
                temporal[0][8]= "H";
                
                temporal[1][0]= "1";
                temporal[2][0]= "2";
                temporal[3][0]= "3";
                temporal[4][0]= "4";
                temporal[5][0]= "5";
                temporal[6][0]= "6";
                temporal[7][0]= "7";
                temporal[8][0]= "8";

                }
            }//Fin for
        
        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                

                Torre t1N = new Torre(0, 0, 1, "r");
                temporal[1][1] = t1N;
            
                Torre t2N = new Torre(0, 0, 1, "r");
                temporal[1][8] = t2N;
            
                Torre t1B = new Torre(0, 0, 2, "R");
                temporal[8][1] = t1B;
                
                Torre t2B = new Torre(0, 0, 2, "R");
                temporal[8][8] = t2B;
           
                Caballo c1N = new Caballo(0, 0, 1, "n");
                temporal[1][2] = c1N;
            
                Caballo c2N = new Caballo(0, 0, 1, "n");
                temporal[1][7] = c2N;
            
                Caballo c1B = new Caballo(0, 0, 2, "N");
                temporal[8][2] = c1B;
            
                Caballo c2B = new Caballo(0, 0, 2, "N");
                temporal[8][7] = c2B;
            
                Alfil a1N = new Alfil(0, 0, 1, "b");
                temporal[1][3] = a1N;
            
                Alfil a2N = new Alfil(0, 0, 1, "b");
                temporal[1][6] = a2N;
            
                Alfil a1B = new Alfil(0, 0, 2, "B");
                temporal[8][3] = a1B;
            
                Alfil a2B = new Alfil(0, 0, 2, "B");
                temporal[8][6] = a2B;
            
                Rey rN = new Rey(0, 0, 1, "k");
                temporal[1][5] = rN;
            
                Rey rB = new Rey(0, 0, 2, "K");
                temporal[8][4] = rB;
            
                Dama reinN = new Dama(0, 0, 1, "q");
                temporal[1][4] = reinN;
            
                Dama reinB = new Dama(0, 0, 2, "Q");
                temporal[8][5] = reinB;
                
                Peon p1 = new Peon(0, 0, 1, "p");
                temporal[2][1] = p1;
                Peon p2 = new Peon(0, 0, 1, "p");
                temporal[2][2] = p2;
                Peon p3 = new Peon(0, 0, 1, "p");
                temporal[2][3] = p3;
                Peon p4 = new Peon(0, 0, 1, "p");
                temporal[2][4] = p4;
                Peon p5 = new Peon(0, 0, 1, "p");
                temporal[2][5] = p5;
                Peon p6 = new Peon(0, 0, 1, "p");
                temporal[2][6] = p6;
                Peon p7 = new Peon(0, 0, 1, "p");
                temporal[2][7] = p7;
                Peon p8 = new Peon(0, 0, 1, "p");
                temporal[2][8] = p8;
                
                Peon p11 = new Peon(0, 0, 2, "P");
                temporal[7][1] = p11;
                Peon p22 = new Peon(0, 0, 2, "P");
                temporal[7][2] = p22;
                Peon p33 = new Peon(0, 0, 2, "P");
                temporal[7][3] = p33;
                Peon p44 = new Peon(0, 0, 2, "P");
                temporal[7][4] = p44;
                Peon p55 = new Peon(0, 0, 2, "P");
                temporal[7][5] = p55;
                Peon p66 = new Peon(0, 0, 2, "P");
                temporal[7][6] = p66;
                Peon p77 = new Peon(0, 0, 2, "P");
                temporal[7][7] = p77;
                Peon p88 = new Peon(0, 0, 2, "P");
                temporal[7][8] = p88;
                
            }
        }//Fin for
        return temporal;
    }

    public static void imprimir(Object[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print("[" + tablero[i][j] + "] ");
                } else{
                    System.out.print("[ ] ");
                }
                
            }
            System.out.println();
        }

    }//Fin metodo imprimir


}
