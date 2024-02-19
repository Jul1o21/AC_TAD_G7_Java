
package Controlador;

import Modelo.Mensaje;
import Vista.vPasarMayusculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class cPasarMayusculas {

    private vPasarMayusculas vista;

    public cPasarMayusculas() {
        this.vista = new vPasarMayusculas();

        this.vista.btn_convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pasarMayusculas();

            }
        });

    }

    public void mostrarVista() {
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.setResizable(false);

    }

    private void pasarMayusculas() {
        String texto = this.vista.txtfa_textarea.getText();
        Mensaje mensaje = new Mensaje(texto);
        mensaje.convertirMayusculas();
        this.vista.txtfa_textarea.setText(mensaje.getTexto());

    }

}
