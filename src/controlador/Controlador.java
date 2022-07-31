/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {

    Formulario objFormulario = new Formulario();
    Docente objDocente;
    DocenteDAO objDocenteDAO;
    ProyectoCurricularDAO objProyectoCurricularDAO;
    PreguntaDAO objPreguntaDAO;

    public Controlador() {
        objFormulario.setVisible(true);
        objDocente = new Docente();
        objDocenteDAO = new DocenteDAO();
        objProyectoCurricularDAO = new ProyectoCurricularDAO();
        objPreguntaDAO = new PreguntaDAO();
        objFormulario.getBtnRegistrar().addActionListener(this);
        objFormulario.getjButton1().addActionListener(this);
        objFormulario.getBtnRegistrar1().addActionListener(this);
        objFormulario.getBtnActualizar().addActionListener(this);
        objFormulario.getBtnActualizar2().addActionListener(this);
        objFormulario.getBtnActualizacion2().addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        objFormulario.getBtnRegistrar1().setEnabled(false);
        if (ae.getSource() == this.objFormulario.getBtnRegistrar()) {
            objDocente.setTipoDocumento((String) objFormulario.getCbTipoIdentificacion().getSelectedItem());
            objDocente.setNumeroDocumento(objFormulario.getTxtNumeroDocumento().getText());
            objDocente.setPrimerNombre(objFormulario.getTxtPrimerNombre().getText());
            objDocente.setSegundoNombre(objFormulario.getTxtSegundoNombre().getText());
            objDocente.setPrimerApellido(objFormulario.getTxtPrimerApellido().getText());
            objDocente.setSegundoApellido(objFormulario.getTxtSegundoApellido().getText());
            objDocente.setProfesion(objFormulario.getTxtProfesion().getText());
            objDocente.setCorreo(objFormulario.getTxtCorreo().getText());

            //MYSQL
            String TipoDocumento = (String) objFormulario.getCbTipoIdentificacion().getSelectedItem();
            String Numero = objFormulario.getTxtNumeroDocumento().getText();
            String PrimerNombre = objFormulario.getTxtPrimerNombre().getText();
            String SegundoNombre = objFormulario.getTxtSegundoNombre().getText();
            String PrimerApellido = objFormulario.getTxtPrimerApellido().getText();
            String SegundoApellido = objFormulario.getTxtSegundoApellido().getText();
            String Profesion = objFormulario.getTxtProfesion().getText();
            String Correo = objFormulario.getTxtCorreo().getText();

            String IdProyecto = objFormulario.getTxtID().getText();
            String NombreProyecto = (String) objFormulario.getCbProyectoCurricular1().getSelectedItem();

            boolean rptaregistroP = objProyectoCurricularDAO.insertProyectoCurricular(IdProyecto, NombreProyecto);

            if (rptaregistroP != false) {
                JOptionPane.showMessageDialog(null, "Registro Correcto para el proyecto curricular", "Ventana 6", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registro Erroneo para el proyecto curricular", "Ventana 7", JOptionPane.ERROR_MESSAGE);
            }

            boolean rptaregistro = objDocenteDAO.insertDocente(Numero, TipoDocumento, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Profesion, Correo, IdProyecto);

            if (rptaregistro != false) {
                JOptionPane.showMessageDialog(null, "Registro Correcto para el docente", "Ventana 8", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registro Erroneo para el docente", "Ventana 9", JOptionPane.ERROR_MESSAGE);
            }

            objFormulario.getBtnRegistrar1().setEnabled(true);
        }
        if (ae.getSource() == this.objFormulario.getjButton1()) {
            
        }
        if (ae.getSource() == this.objFormulario.getBtnRegistrar1()) {
            Pregunta objPregunta = new Pregunta();
            objPregunta.setIdAsignatura(objFormulario.getTxtIdMateria().getText());
            objPregunta.setNombreAsignatura(objFormulario.getTxtMateria().getText());
            objPregunta.setTema(objFormulario.getTxtTemaEspecifico().getText());
            objPregunta.setTextoPregunta(objFormulario.getTxtPregunta1().getText());
            objPregunta.setOpcion1(objFormulario.getTxtRespuesta5().getText());
            objPregunta.setOpcion2(objFormulario.getTxtRespuesta6().getText());
            objPregunta.setOpcion3(objFormulario.getTxtRespuesta7().getText());
            objPregunta.setOpcion4(objFormulario.getTxtRespuesta8().getText());
            objPregunta.setRespuestaCorrecta(objFormulario.getTxtRespuestaCorrecta1().getText());
            objFormulario.getLblResultadoIdMateria().setText(objPregunta.getIdAsignatura());
            objFormulario.getLblResultadoM1().setText(objPregunta.getNombreAsignatura());
            objFormulario.getLblResultadoTE1().setText(objPregunta.getTema());

            //MYSQL
            String IdPregunta = objFormulario.getTxtIdPregunta().getText();
            String IdMateria = objFormulario.getTxtIdMateria().getText();
            String TemaE = objFormulario.getTxtTemaEspecifico().getText();
            String Materia = objFormulario.getTxtMateria().getText();
            String NombrePregunta = objFormulario.getTxtPregunta1().getText();
            String Opcion1 = objFormulario.getTxtRespuesta5().getText();
            String Opcion2 = objFormulario.getTxtRespuesta6().getText();
            String Opcion3 = objFormulario.getTxtRespuesta7().getText();
            String Opcion4 = objFormulario.getTxtRespuesta8().getText();
            String OpcionCorrecta = objFormulario.getTxtRespuestaCorrecta1().getText();

            boolean rptaRegistro4 = objPreguntaDAO.insertPregunta(IdPregunta, IdMateria, TemaE, Materia, NombrePregunta, Opcion1, Opcion2, Opcion3, Opcion4, OpcionCorrecta);
            if (rptaRegistro4 != false) {
                JOptionPane.showMessageDialog(null, "Registro Correcto para la pregunta", "Ventana 10", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registro Erroneo para la pregunta", "Ventana 11", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (ae.getSource() == objFormulario.getBtnActualizar()) {

            String dni = objFormulario.getTxtPC().getText();
            String nombre = (String) objFormulario.getCbProyectoCurricular1().getSelectedItem();

            boolean rptaregistro1 = objProyectoCurricularDAO.actualizarProyectoCurricular(dni, nombre);

            if (rptaregistro1 != false) {
                JOptionPane.showMessageDialog(null, "Registro correcto");
            } else {
                JOptionPane.showMessageDialog(null, "Registro erroneo");
            }
        }
    }
   }
    

