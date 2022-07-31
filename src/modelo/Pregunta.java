/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Pregunta{

    private String IdAsignatura;
    private String NombreAsignatura;
    private String Tema;
    private String IdPregunta;
    private String TextoPregunta;
    private String Opcion1;
    private String Opcion2;
    private String Opcion3;
    private String Opcion4;
    private String RespuestaCorrecta;

    public String getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(String IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    public void setNombreAsignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public String getIdPregunta() {
        return IdPregunta;
    }

    public void setIdPregunta(String IdPregunta) {
        this.IdPregunta = IdPregunta;
    }

    public String getTextoPregunta() {
        return TextoPregunta;
    }

    public void setTextoPregunta(String TextoPregunta) {
        this.TextoPregunta = TextoPregunta;
    }

    public String getOpcion1() {
        return Opcion1;
    }

    public void setOpcion1(String Opcion1) {
        this.Opcion1 = Opcion1;
    }

    public String getOpcion2() {
        return Opcion2;
    }

    public void setOpcion2(String Opcion2) {
        this.Opcion2 = Opcion2;
    }

    public String getOpcion3() {
        return Opcion3;
    }

    public void setOpcion3(String Opcion3) {
        this.Opcion3 = Opcion3;
    }

    public String getOpcion4() {
        return Opcion4;
    }

    public void setOpcion4(String Opcion4) {
        this.Opcion4 = Opcion4;
    }

    public String getRespuestaCorrecta() {
        return RespuestaCorrecta;
    }

    public void setRespuestaCorrecta(String RespuestaCorrecta) {
        this.RespuestaCorrecta = RespuestaCorrecta;
    }

}
