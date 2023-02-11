package lab4p2_grupo3;

import java.util.Scanner;

public class Lab4P2_Grupo3 {

    static Scanner leer = new Scanner(System.in);
    static Object[][] tablero = new Object[9][9];

    public static void main(String[] args) {

        System.out.println("Juego de ajedrez\n"
                + "");

        System.out.println("Tablero");

        imprimir(creartablero(9, 9));

        System.out.println("");
        System.out.print("Ingrese el nombre del jugador de piezas blancas: ");
        String jugador1 = leer.next();
        System.out.print("Ingrese el nombre del jugador de piezas negras: ");
        String jugador2 = leer.next();

        boolean ganar = true;

        do {
            int col = 0;
            int colFinal = 0;
            System.out.println("Ingrese la posicion de Columna de la pieza a mover: ");
            String colLeer = leer.next();
            switch (colLeer) {
                case "A" -> {
                    col = 1;
                }
                case "B" -> {
                    col = 2;
                }
                case "C" -> {
                    col = 3;
                }
                case "D" -> {
                    col = 4;
                }
                case "E" -> {
                    col = 5;
                }
                case "F" -> {
                    col = 6;
                }
                case "G" -> {
                    col = 7;
                }
                case "gusabi" -> {
                    ganar = false;
                }
                default -> {
                    System.out.println("Ingrese una posicion valida.");
                }
            }
            System.out.println("Ingrese la posicion de fila de la pieza a mover: ");
            int fil = leer.nextInt();
            System.out.println("Ingrese la posicion de columna donde quiere moverla: ");
            String colLeer2 = leer.next();
            System.out.println("Ingrese la posicion de fila donde quiere moverla: ");
            int filFinal = leer.nextInt();
            switch (colLeer2) {
                case "A" -> {
                    colFinal = 1;
                }
                case "B" -> {
                    colFinal = 2;
                }
                case "C" -> {
                    colFinal = 3;
                }
                case "D" -> {
                    colFinal = 4;
                }
                case "E" -> {
                    colFinal = 5;
                }
                case "F" -> {
                    colFinal = 6;
                }
                case "G" -> {
                    colFinal = 7;
                }
                case "gusabi" -> {
                    ganar = false;
                }
                default -> {
                    System.out.println("Ingrese una posicion valida.");
                }

            }

            mover(tablero, col, fil, colFinal, filFinal);
            imprimir(creartablero(9, 9));

        } while (ganar);
    }

    public static Object[][] creartablero(int filas, int cols) {
        Object[][] temporal = new Object[filas][cols];

        for (int i = 0; i < temporal.length; i++) {
            for (int j = 0; j < temporal[i].length; j++) {
                temporal[0][1] = "A";
                temporal[0][2] = "B";
                temporal[0][3] = "C";
                temporal[0][4] = "D";
                temporal[0][5] = "E";
                temporal[0][6] = "F";
                temporal[0][7] = "G";
                temporal[0][8] = "H";

                temporal[1][0] = "1";
                temporal[2][0] = "2";
                temporal[3][0] = "3";
                temporal[4][0] = "4";
                temporal[5][0] = "5";
                temporal[6][0] = "6";
                temporal[7][0] = "7";
                temporal[8][0] = "8";

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
                } else {
                    System.out.print("[ ] ");
                }

            }
            System.out.println();
        }

    }//Fin metodo imprimir

    public static void mover(Object[][] tablero, int col, int fil, int colFinal, int filFinal) {
        Object temp = tablero[col][fil];
        Object aux = tablero[colFinal][filFinal];
        if (tablero[col][fil] instanceof Peon) {
            if (((Peon) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                if (aux instanceof Peon) {
                    int t = ((Peon) aux).getJugador();
                    int t2 = ((Peon) temp).getJugador();
                    if ((t == 1) && t2 == 2 || t == 2 && t2 == 1) {
                        tablero[filFinal][colFinal] = temp;
                    } else {
                        System.out.println("Posicion no valida.");
                    }

                }
                if (aux instanceof Caballo) {
                    int t3 = ((Caballo) aux).getJugador();
                    int t4 = ((Caballo) temp).getJugador();
                    if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                        tablero[filFinal][colFinal] = temp;
                    } else {
                        System.out.println("Posicion no valida.");
                    }
                }
                if (aux instanceof Alfil) {
                    int t3 = ((Alfil) aux).getJugador();
                    int t4 = ((Alfil) temp).getJugador();
                    if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                        tablero[filFinal][colFinal] = temp;
                    } else {
                        System.out.println("Posicion no valida.");
                    }
                }
                if (aux instanceof Torre) {
                    int t3 = ((Torre) aux).getJugador();
                    int t4 = ((Torre) temp).getJugador();
                    if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                        tablero[filFinal][colFinal] = temp;
                    } else {
                        System.out.println("Posicion no valida.");
                    }
                }
                if (aux instanceof Rey) {
                    int t3 = ((Rey) aux).getJugador();
                    int t4 = ((Rey) temp).getJugador();
                    if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                        tablero[filFinal][colFinal] = temp;
                    } else {
                        System.out.println("Posicion no valida.");
                    }
                }
                if (aux instanceof Dama) {
                    int t3 = ((Dama) aux).getJugador();
                    int t4 = ((Dama) temp).getJugador();
                    if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                        tablero[filFinal][colFinal] = temp;
                    } else {
                        System.out.println("Posicion no valida.");
                    }
                } else {
                    tablero[fil][col] = " ";
                    tablero[filFinal][colFinal] = temp;
                }
            }
        } else if (tablero[col][fil] instanceof Caballo) {
            if (((Caballo) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
               
                if (((Peon) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                    if (aux instanceof Peon) {
                        int t = ((Peon) aux).getJugador();
                        int t2 = ((Peon) temp).getJugador();
                        if ((t == 1) && t2 == 2 || t == 2 && t2 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }

                    }
                    if (aux instanceof Caballo) {
                        int t3 = ((Caballo) aux).getJugador();
                        int t4 = ((Caballo) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Alfil) {
                        int t3 = ((Alfil) aux).getJugador();
                        int t4 = ((Alfil) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Torre) {
                        int t3 = ((Torre) aux).getJugador();
                        int t4 = ((Torre) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Rey) {
                        int t3 = ((Rey) aux).getJugador();
                        int t4 = ((Rey) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Dama) {
                        int t3 = ((Dama) aux).getJugador();
                        int t4 = ((Dama) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    } else {
                        tablero[fil][col] = " ";
                        tablero[filFinal][colFinal] = temp;
                    }
                }
            }
        } else if (tablero[col][fil] instanceof Alfil) {
            if (((Alfil) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                if (((Peon) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                    if (aux instanceof Peon) {
                        int t = ((Peon) aux).getJugador();
                        int t2 = ((Peon) temp).getJugador();
                        if ((t == 1) && t2 == 2 || t == 2 && t2 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }

                    }
                    if (aux instanceof Caballo) {
                        int t3 = ((Caballo) aux).getJugador();
                        int t4 = ((Caballo) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Alfil) {
                        int t3 = ((Alfil) aux).getJugador();
                        int t4 = ((Alfil) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Torre) {
                        int t3 = ((Torre) aux).getJugador();
                        int t4 = ((Torre) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Rey) {
                        int t3 = ((Rey) aux).getJugador();
                        int t4 = ((Rey) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Dama) {
                        int t3 = ((Dama) aux).getJugador();
                        int t4 = ((Dama) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    } else {
                        tablero[fil][col] = " ";
                        tablero[filFinal][colFinal] = temp;
                    }
                }
            }
        } else if (tablero[col][fil] instanceof Torre) {
            if (((Torre) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                if (((Peon) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                    if (aux instanceof Peon) {
                        int t = ((Peon) aux).getJugador();
                        int t2 = ((Peon) temp).getJugador();
                        if ((t == 1) && t2 == 2 || t == 2 && t2 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }

                    }
                    if (aux instanceof Caballo) {
                        int t3 = ((Caballo) aux).getJugador();
                        int t4 = ((Caballo) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Alfil) {
                        int t3 = ((Alfil) aux).getJugador();
                        int t4 = ((Alfil) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Torre) {
                        int t3 = ((Torre) aux).getJugador();
                        int t4 = ((Torre) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Rey) {
                        int t3 = ((Rey) aux).getJugador();
                        int t4 = ((Rey) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Dama) {
                        int t3 = ((Dama) aux).getJugador();
                        int t4 = ((Dama) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    } else {
                        tablero[fil][col] = " ";
                        tablero[filFinal][colFinal] = temp;
                    }
                }
            }
        } else if (tablero[col][fil] instanceof Rey) {
            if (((Rey) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                if (((Peon) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                    if (aux instanceof Peon) {
                        int t = ((Peon) aux).getJugador();
                        int t2 = ((Peon) temp).getJugador();
                        if ((t == 1) && t2 == 2 || t == 2 && t2 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }

                    }
                    if (aux instanceof Caballo) {
                        int t3 = ((Caballo) aux).getJugador();
                        int t4 = ((Caballo) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Alfil) {
                        int t3 = ((Alfil) aux).getJugador();
                        int t4 = ((Alfil) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Torre) {
                        int t3 = ((Torre) aux).getJugador();
                        int t4 = ((Torre) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Rey) {
                        int t3 = ((Rey) aux).getJugador();
                        int t4 = ((Rey) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Dama) {
                        int t3 = ((Dama) aux).getJugador();
                        int t4 = ((Dama) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    } else {
                        tablero[fil][col] = " ";
                        tablero[filFinal][colFinal] = temp;
                    }
                }
            }
        } else if (tablero[col][fil] instanceof Dama) {
            if (((Dama) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                if (((Peon) temp).movimiento(fil, col, filFinal, colFinal, tablero)) {
                    if (aux instanceof Peon) {
                        int t = ((Peon) aux).getJugador();
                        int t2 = ((Peon) temp).getJugador();
                        if ((t == 1) && t2 == 2 || t == 2 && t2 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }

                    }
                    if (aux instanceof Caballo) {
                        int t3 = ((Caballo) aux).getJugador();
                        int t4 = ((Caballo) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Alfil) {
                        int t3 = ((Alfil) aux).getJugador();
                        int t4 = ((Alfil) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Torre) {
                        int t3 = ((Torre) aux).getJugador();
                        int t4 = ((Torre) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Rey) {
                        int t3 = ((Rey) aux).getJugador();
                        int t4 = ((Rey) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    }
                    if (aux instanceof Dama) {
                        int t3 = ((Dama) aux).getJugador();
                        int t4 = ((Dama) temp).getJugador();
                        if ((t3 == 1) && t4 == 2 || t3 == 3 && t4 == 1) {
                            tablero[filFinal][colFinal] = temp;
                        } else {
                            System.out.println("Posicion no valida.");
                        }
                    } else {
                        tablero[fil][col] = " ";
                        tablero[filFinal][colFinal] = temp;
                    }
                }
            }
        }

    }

}
