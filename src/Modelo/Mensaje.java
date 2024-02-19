
package Modelo;

public class Mensaje {

    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public void convertirMayusculas() {

        this.texto = this.texto.toUpperCase();
    }

}
