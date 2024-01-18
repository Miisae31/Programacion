package damas;

public class Ficha {
    public enum Color {
        BLANCA,
        NEGRA
    }

    private Color color;

    public Ficha(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return (color == Color.BLANCA) ? "O" : "X";
    }
}
