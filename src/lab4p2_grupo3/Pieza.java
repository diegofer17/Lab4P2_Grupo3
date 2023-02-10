package lab4p2_grupo3;

public abstract class  Pieza {
    protected int coordenadaXmover;
    protected int coordenadaYmover;
    protected int jugador;
    protected String representacion;
    
    public Pieza() {
    }

    public Pieza(int coordenadaXmover, int coordenadaYmover, int jugador, String representacion) {
        this.coordenadaXmover = coordenadaXmover;
        this.coordenadaYmover = coordenadaYmover;
        this.jugador = jugador;
        this.representacion = representacion;
    }
    
    public int setJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
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
    
    public abstract boolean movimiento(int X1, int Y1, int X2, int Y2, Object [][] tablero);
    
    
}
