/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_ronyestrada;

import java.util.Date;

/**
 *
 * @author Reyn
 */
public class Libros {
    private String autor;
    private String titulo;
    private String genero;
    private String Editorial ;
    private String idioma;
    private Date fecha_creado;
    private String ISBN; // unico*******
    private Date año_ingresado;
    private String estadodellibro;
    private String nombredelapersonaprestado;// if not prestado -----
    private int numero_cuenta_prestado;//persona id if not 0000

    public Libros() {
    }

    public Libros(String autor, String titulo, String genero, String Editorial, String idioma, Date fecha_creado, String ISBN, Date año_ingresado, String estadodellibro, String nombredelapersonaprestado, int numero_cuenta_prestado) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.Editorial = Editorial;
        this.idioma = idioma;
        this.fecha_creado = fecha_creado;
        this.ISBN = ISBN;
        this.año_ingresado = año_ingresado;
        this.estadodellibro = estadodellibro;
        this.nombredelapersonaprestado = nombredelapersonaprestado;
        this.numero_cuenta_prestado = numero_cuenta_prestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFecha_creado() {
        return fecha_creado;
    }

    public void setFecha_creado(Date fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getAño_ingresado() {
        return año_ingresado;
    }

    public void setAño_ingresado(Date año_ingresado) {
        this.año_ingresado = año_ingresado;
    }

    public String getEstadodellibro() {
        return estadodellibro;
    }

    public void setEstadodellibro(String estadodellibro) {
        this.estadodellibro = estadodellibro;
    }

    public String getNombredelapersonaprestado() {
        return nombredelapersonaprestado;
    }

    public void setNombredelapersonaprestado(String nombredelapersonaprestado) {
        this.nombredelapersonaprestado = nombredelapersonaprestado;
    }

    public int getNumero_cuenta_prestado() {
        return numero_cuenta_prestado;
    }

    public void setNumero_cuenta_prestado(int numero_cuenta_prestado) {
        this.numero_cuenta_prestado = numero_cuenta_prestado;
    }

    @Override
    public String toString() {
        return "Libros{" + "autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", Editorial=" + Editorial + ", idioma=" + idioma + ", fecha_creado=" + fecha_creado + ", ISBN=" + ISBN + ", a\u00f1o_ingresado=" + año_ingresado + ", estadodellibro=" + estadodellibro + ", nombredelapersonaprestado=" + nombredelapersonaprestado + ", numero_cuenta_prestado=" + numero_cuenta_prestado + '}';
    }
    
}
