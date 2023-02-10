package lab4p2_grupo3;

public class Pieza {
    protected int coordenadaXpos;
    protected int coordenadaYpos;
    protected boolean color;
    protected String representacion;
    
    public Pieza() {
    }

    public Pieza(int coordenadaXpos, int coordenadaYpos, boolean color, String representacion) {
        this.coordenadaXpos = coordenadaXpos;
        this.coordenadaYpos = coordenadaYpos;
        this.color = color;
        this.representacion = representacion;
    }

    public int getCoordenadaXpos() {
        return coordenadaXpos;
    }

    public void setCoordenadaXpos(int coordenadaXpos) {
        this.coordenadaXpos = coordenadaXpos;
    }

    public int getCoordenadaYpos() {
        return coordenadaYpos;
    }

    public void setCoordenadaYpos(int coordenadaYpos) {
        this.coordenadaYpos = coordenadaYpos;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getRepresentacion() {
        return representacion;
    }

    public void setRepresentacion(String representacion) {
        this.representacion = representacion;
    }

    @Override
    public String toString() {
        return "Pieza{" + "coordenadaXpos=" + coordenadaXpos + ", coordenadaYpos=" + coordenadaYpos + ", color=" + color + ", representacion=" + representacion + '}';
    }
    
    public static Object imprimir(Object[][]tablero) {
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if()
            }
            cadena += "\n";
        }
        return cadena;
    }//Fin metodo imprimir
}
