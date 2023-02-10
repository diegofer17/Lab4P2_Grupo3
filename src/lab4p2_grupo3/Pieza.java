package lab4p2_grupo3;

public class Pieza {
    protected int coordenadaXmover;
    protected int coordenadaYmover;
    protected boolean color;
    protected String representacion;
    
    public Pieza() {
    }

    public Pieza(int coordenadaXmover, int coordenadaYmover, boolean color, String representacion) {
        this.coordenadaXmover = coordenadaXmover;
        this.coordenadaYmover = coordenadaYmover;
        this.color = color;
        this.representacion = representacion;
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

    public int getCoordenadaXmover() {
        return coordenadaXmover;
    }

    public void setCoordenadaXmover(int coordenadaXmover) {
        this.coordenadaXmover = coordenadaXmover;
    }

    public int getCoordenadaYmover() {
        return coordenadaYmover;
    }

    public void setCoordenadaYmover(int coordenadaYmover) {
        this.coordenadaYmover = coordenadaYmover;
    }
    
    public boolean movimiento(int X1, int Y1, int X2, int Y2, Object [][] tablero){
        boolean validez;
        
        if (X2 < 0 || X2 >8 || Y2 < 0 || Y2 > 8){
            validez = false;
        }else{
            validez = true;
        }
        
        return validez;
    }
    
}
