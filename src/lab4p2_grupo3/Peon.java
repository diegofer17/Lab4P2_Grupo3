/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_grupo3;

/**
 *
 * @author marcela
 */
public class Peon extends Pieza {

    public Peon() {
    }
    
    

    public Peon(int coordenadaXmover, int coordenadaYmover, boolean color, String representacion) {
        super(coordenadaXmover, coordenadaYmover, color, representacion);
    }
    
    

    @Override
    public boolean movimiento(int X1, int Y1, int X2, int Y2, Object[][] tablero) {
        boolean check = true;
        Object tab = tablero[X2][Y2];
        if (super.movimiento(X1, Y1, X2, Y2, tablero)) {
            if (X2 == X1 && Y2 != Y1 || X2 == X1 + 1) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }
    
    
    
}
