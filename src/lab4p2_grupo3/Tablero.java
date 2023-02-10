package lab4p2_grupo3;

public class Tablero {
    private int posX;
    private int posY;

    public Tablero() {
    }

    public Tablero(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Tablero{" + "posX=" + posX + ", posY=" + posY + '}';
    }
    
    
}
