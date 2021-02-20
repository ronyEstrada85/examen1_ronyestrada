/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_ronyestrada;

/**
 *
 * @author Reyn
 */
public class Idioma {
String Idioma;
    public Idioma(int i, String espanol) {
    }

    public Idioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    @Override
    public String toString() {
        return "Idioma{" + "Idioma=" + Idioma + '}';
    }
    
}
