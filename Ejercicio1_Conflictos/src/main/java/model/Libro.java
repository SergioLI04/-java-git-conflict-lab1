package model;

public class Libro {
    private String isbn;
    private String titulo;
    private int reservasActivas;
    private boolean disponible;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return reservasActivas == 0;
    }

    public void setDisponible(int reservasActivas) {
        this.reservasActivas = reservasActivas;
    }
    public void incrementarReservas() {
        reservasActivas++;
    }

    @Override
    public String toString() {
        return titulo + " (" + isbn + ") - " +
               "Reservas Activas: " + reservasActivas;
    }
}
