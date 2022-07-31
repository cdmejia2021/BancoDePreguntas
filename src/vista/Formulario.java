/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        this.btnRegistrar.setEnabled(false);
        this.btnRegistrar1.setEnabled(false);
    }

    public void Habilitar() {
        if (!txtNumeroDocumento.getText().isEmpty() && !txtPrimerNombre.getText().isEmpty()
                && !txtPrimerApellido.getText().isEmpty() && !txtProfesion.getText().isEmpty()
                && !txtSegundoApellido.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !cbTipoIdentificacion.getSelectedItem().equals("Seleccione")
                && !txtID.getText().isEmpty() && !cbProyectoCurricular1.getSelectedItem().equals("Seleccione")) {
            btnRegistrar.setEnabled(true);
        } else {
            btnRegistrar.setEnabled(false);
        }
    }

    public void Habilitar2() {
        if (!txtTemaEspecifico.getText().isEmpty() && !txtMateria.getText().isEmpty()
                && !txtIdMateria.getText().isEmpty() && !txtPregunta1.getText().isEmpty()
                && !txtRespuesta5.getText().isEmpty() && !txtRespuesta6.getText().isEmpty()
                && !txtRespuesta7.getText().isEmpty() && !txtRespuesta8.getText().isEmpty()
                && !txtRespuestaCorrecta1.getText().isEmpty() && !txtIdPregunta.getText().isEmpty()) {
            btnRegistrar1.setEnabled(true);
        } else {
            btnRegistrar1.setEnabled(false);
        }
    }

    public void Validar() {
        if (txtTemaEspecifico.getText().isEmpty() && txtMateria.getText().isEmpty()
                && txtIdMateria.getText().isEmpty() && txtPregunta1.getText().isEmpty()
                && txtRespuesta5.getText().isEmpty() && txtRespuesta6.getText().isEmpty()
                && txtRespuesta7.getText().isEmpty() && txtRespuesta8.getText().isEmpty()
                && txtRespuestaCorrecta1.getText().isEmpty() && txtIdPregunta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Registro fallido", "Ventana 2", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registro exitoso", "Ventana 3", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public JTextField getTxtIDPreguntaActual() {
        return txtIDPreguntaActual;
    }

    public JButton getBtnActualizacion2() {
        return btnActualizacion2;
    }

    public JTextField getTxtActualizacionDocente() {
        return txtActualizacionDocente;
    }

    public JButton getBtnActualizar2() {
        return btnActualizar2;
    }

    public JTextField getTxtPC() {
        return txtPC;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JTextField getTxtIdPregunta() {
        return txtIdPregunta;
    }

    public JLabel getLblResultadoIdMateria() {
        return lblResultadoIdMateria;
    }

    public JLabel getLblResultadoM1() {
        return lblResultadoM1;
    }

    public JLabel getLblResultadoTE1() {
        return lblResultadoTE1;
    }

    public JTextField getTxtPregunta1() {
        return txtPregunta1;
    }

    public void setTxtPregunta1(JTextField txtPregunta1) {
        this.txtPregunta1 = txtPregunta1;
    }

    public JTextField getTxtRespuesta5() {
        return txtRespuesta5;
    }

    public void setTxtRespuesta5(JTextField txtRespuesta5) {
        this.txtRespuesta5 = txtRespuesta5;
    }

    public JTextField getTxtRespuesta6() {
        return txtRespuesta6;
    }

    public void setTxtRespuesta6(JTextField txtRespuesta6) {
        this.txtRespuesta6 = txtRespuesta6;
    }

    public JTextField getTxtRespuesta7() {
        return txtRespuesta7;
    }

    public void setTxtRespuesta7(JTextField txtRespuesta7) {
        this.txtRespuesta7 = txtRespuesta7;
    }

    public JTextField getTxtRespuesta8() {
        return txtRespuesta8;
    }

    public void setTxtRespuesta8(JTextField txtRespuesta8) {
        this.txtRespuesta8 = txtRespuesta8;
    }

    public JTextField getTxtRespuestaCorrecta1() {
        return txtRespuestaCorrecta1;
    }

    public void setTxtRespuestaCorrecta1(JTextField txtRespuestaCorrecta1) {
        this.txtRespuestaCorrecta1 = txtRespuestaCorrecta1;
    }

    public JTextField getTxtIdMateria() {
        return txtIdMateria;
    }

    public void setTxtIdMateria(JTextField txtIdMateria) {
        this.txtIdMateria = txtIdMateria;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public JComboBox<String> getCbProyectoCurricular1() {
        return cbProyectoCurricular1;
    }

    public JTextField getTxtMateria() {
        return txtMateria;
    }

    public JTextField getTxtTemaEspecifico() {
        return txtTemaEspecifico;
    }

    public JButton getBtnRegistrar1() {
        return btnRegistrar1;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public JTextField getTxtPrimerApellido() {
        return txtPrimerApellido;
    }

    public JTextField getTxtProfesion() {
        return txtProfesion;
    }

    public JTextField getTxtSegundoApellido() {
        return txtSegundoApellido;
    }

    public JComboBox<String> getCbTipoIdentificacion() {
        return cbTipoIdentificacion;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JLabel getLbTipoIdentificacion() {
        return lbTipoIdentificacion;
    }

    public JLabel getLblNumeroDocumento() {
        return lblNumeroDocumento;
    }

    public JLabel getLblPrimerNombre() {
        return lblPrimerNombre;
    }

    public JLabel getLblSegundoNombre() {
        return lblSegundoNombre;
    }

    public JTextField getTxtNumeroDocumento() {
        return txtNumeroDocumento;
    }

    public JTextField getTxtPrimerNombre() {
        return txtPrimerNombre;
    }

    public JTextField getTxtSegundoNombre() {
        return txtSegundoNombre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tpnPrueba = new javax.swing.JTabbedPane();
        pnlDatosDocente = new javax.swing.JPanel();
        lbTipoIdentificacion = new javax.swing.JLabel();
        cbTipoIdentificacion = new javax.swing.JComboBox<>();
        lblNumeroDocumento = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        lblPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        lblSegundoApellido = new javax.swing.JLabel();
        txtProfesion = new javax.swing.JTextField();
        lblProfesion = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblProyectoCurricular2 = new javax.swing.JLabel();
        cbProyectoCurricular1 = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblIDPC = new javax.swing.JLabel();
        txtPC = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        lblActualizacion = new javax.swing.JLabel();
        txtActualizacionDocente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblFormulario = new javax.swing.JTable();
        lblIcono = new javax.swing.JLabel();
        pnlProyectoCurricular = new javax.swing.JPanel();
        lblMateria = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        txtTemaEspecifico = new javax.swing.JTextField();
        btnRegistrar1 = new javax.swing.JButton();
        txtMateria = new javax.swing.JTextField();
        lblIdMateria = new javax.swing.JLabel();
        txtIdMateria = new javax.swing.JTextField();
        lblMateria2 = new javax.swing.JLabel();
        lblResultadoM1 = new javax.swing.JLabel();
        lblTema3 = new javax.swing.JLabel();
        lblResultadoTE1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblResultadoIdMateria = new javax.swing.JLabel();
        lblAnuncio1 = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        lblRespuesta4 = new javax.swing.JLabel();
        lblRespuesta5 = new javax.swing.JLabel();
        lblRespuesta6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPregunta1 = new javax.swing.JTextField();
        txtRespuesta5 = new javax.swing.JTextField();
        txtRespuesta6 = new javax.swing.JTextField();
        txtRespuesta7 = new javax.swing.JTextField();
        txtRespuesta8 = new javax.swing.JTextField();
        txtRespuestaCorrecta1 = new javax.swing.JTextField();
        lblIdPregunta = new javax.swing.JLabel();
        txtIdPregunta = new javax.swing.JTextField();
        lblIDPreguntaActual = new javax.swing.JLabel();
        txtIDPreguntaActual = new javax.swing.JTextField();
        btnActualizacion2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JmAcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTipoIdentificacion.setText("Tipo Identificacion:");

        cbTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CC", "CE" }));
        cbTipoIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbTipoIdentificacionKeyReleased(evt);
            }
        });

        lblNumeroDocumento.setText("Número de documento:");

        txtNumeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroDocumentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDocumentoKeyTyped(evt);
            }
        });

        lblPrimerNombre.setText("Primer Nombre:");

        txtPrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrimerNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerNombreKeyTyped(evt);
            }
        });

        lblSegundoNombre.setText("Segundo Nombre:");

        txtSegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoNombreKeyTyped(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar");

        lblPrimerApellido.setText("Primer Apellido:");

        txtPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrimerApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerApellidoKeyTyped(evt);
            }
        });

        lblSegundoApellido.setText("Segundo Apellido:");

        txtProfesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProfesionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProfesionKeyTyped(evt);
            }
        });

        lblProfesion.setText("Profesión:");

        txtSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoApellidoKeyTyped(evt);
            }
        });

        lblCorreo.setText("Correo:");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        lblProyectoCurricular2.setText("Proyecto Curricular");

        cbProyectoCurricular1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tecnología en Gestión de la Producción Industrial", "Tecnología Electronica por Ciclos Propedéuticos", "Tecnología en Construcciones Civiles por Ciclos Propedéuticos", "Tecnología en Sistemas Electricos de Media y Baja Tensión por Ciclos Propedéuticos", "Tecnología en Sistematización de Datos por Ciclos Propedéuticos", "Tecnología Mecánica por Ciclos Propedéuticos", "Tecnología Electrica por Ciclos Propedéuticos", "Ingeniería Eléctrica por Ciclos Propedéuticos", "Ingeniería en Control por Ciclos Propedéuticos", "Ingeniería en Telecomunicaciones por Ciclos Propedéuticos", "Ingeniería de Producción por Ciclos Propedéuticos", "Ingeniería en Telemática por Ciclos Propedéuticos", "Ingeniería Mecánica por Ciclos Propedéuticos" }));

        lblID.setText("ID Proyecto Curricular");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        lblIDPC.setText("Digite el ID del Proyecto Curricular que desea actualizar:");

        btnActualizar.setText("Actualizar Proyecto Curricular");

        btnActualizar2.setText("Actualizar Docente");

        lblActualizacion.setText("Ingrese el documento del docente que desea actualizar:");

        jtblFormulario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de Documento", "Nombre", "Profesion", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jtblFormulario);

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/26bf3b6d441dab35eb50c6348fc898ba.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlDatosDocenteLayout = new javax.swing.GroupLayout(pnlDatosDocente);
        pnlDatosDocente.setLayout(pnlDatosDocenteLayout);
        pnlDatosDocenteLayout.setHorizontalGroup(
            pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                .addComponent(lblProyectoCurricular2)
                                .addGap(18, 18, 18)
                                .addComponent(cbProyectoCurricular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar2)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar))
                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosDocenteLayout.createSequentialGroup()
                                    .addComponent(lblActualizacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtActualizacionDocente))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosDocenteLayout.createSequentialGroup()
                                    .addComponent(lblIDPC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                .addComponent(lbTipoIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSegundoNombre)
                            .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNumeroDocumento)
                                            .addComponent(lblPrimerNombre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSegundoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtPrimerNombre)))
                                    .addComponent(lblPrimerApellido))
                                .addGap(31, 31, 31)
                                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSegundoApellido)
                                    .addComponent(lblProfesion)
                                    .addComponent(lblCorreo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                        .addComponent(lblIcono)
                                        .addGap(40, 40, 40)))))))
                .addContainerGap())
        );
        pnlDatosDocenteLayout.setVerticalGroup(
            pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTipoIdentificacion)
                            .addComponent(cbTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroDocumento)
                            .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSegundoApellido)
                                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPrimerNombre)
                                .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProfesion))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosDocenteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSegundoNombre)
                            .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrimerApellido)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDPC)
                            .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblActualizacion)
                            .addComponent(txtActualizacionDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosDocenteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcono)
                        .addGap(18, 18, 18)))
                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbProyectoCurricular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProyectoCurricular2))
                .addGap(31, 31, 31)
                .addGroup(pnlDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnActualizar2)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tpnPrueba.addTab("Datos Docente", pnlDatosDocente);

        lblMateria.setText("Materia:");

        lblTema1.setText("Tema Especifico:");

        txtTemaEspecifico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTemaEspecificoKeyReleased(evt);
            }
        });

        btnRegistrar1.setText("Registrar");
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });

        txtMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMateriaKeyReleased(evt);
            }
        });

        lblIdMateria.setText("Id Materia:");

        txtIdMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdMateriaKeyTyped(evt);
            }
        });

        lblMateria2.setText("Materia:");

        lblResultadoM1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTema3.setText("Tema Especifico:");

        lblResultadoTE1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Id Materia:");

        lblResultadoIdMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAnuncio1.setText("POR FAVOR, REGISTRE MINIMO 5 PREGUNTAS POR MATERIA, Registrando una a una");

        lblPregunta2.setText("Pregunta:");

        lblRespuesta4.setText("Respuesta 1:");

        lblRespuesta5.setText("Respuesta 2:");

        lblRespuesta6.setText("Respuesta 3:");

        jLabel6.setText("Respuesta 4:");

        jLabel7.setText("Respuesta Correcta:");

        lblIdPregunta.setText("IdPregunta:");

        lblIDPreguntaActual.setText("Ingrese el ID de la pregunta que desea actualizar:");

        btnActualizacion2.setText("Actualizar Pregunta");

        javax.swing.GroupLayout pnlProyectoCurricularLayout = new javax.swing.GroupLayout(pnlProyectoCurricular);
        pnlProyectoCurricular.setLayout(pnlProyectoCurricularLayout);
        pnlProyectoCurricularLayout.setHorizontalGroup(
            pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemaEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblTema1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblMateria2))
                        .addGap(33, 33, 33)
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblResultadoIdMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(lblResultadoM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblTema3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultadoTE1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                        .addGap(70, 70, 70))))
            .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblPregunta2)
                        .addGap(62, 62, 62)
                        .addComponent(txtPregunta1))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblRespuesta4)
                        .addGap(46, 46, 46)
                        .addComponent(txtRespuesta5))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblRespuesta5)
                        .addGap(46, 46, 46)
                        .addComponent(txtRespuestaCorrecta1))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblRespuesta6)
                        .addGap(46, 46, 46)
                        .addComponent(txtRespuesta7))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46)
                        .addComponent(txtRespuesta8))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRespuesta6))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                                .addComponent(lblAnuncio1)
                                .addGap(18, 18, 18)
                                .addComponent(lblIdPregunta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                                .addComponent(lblIDPreguntaActual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDPreguntaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(btnRegistrar1)
                                .addGap(121, 121, 121)
                                .addComponent(btnActualizacion2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlProyectoCurricularLayout.setVerticalGroup(
            pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblResultadoIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addComponent(lblResultadoM1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTema3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResultadoTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlProyectoCurricularLayout.createSequentialGroup()
                        .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTemaEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTema1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnuncio1)
                    .addComponent(lblIdPregunta)
                    .addComponent(txtIdPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPregunta2)
                    .addComponent(txtPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespuesta4)
                    .addComponent(txtRespuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespuesta5)
                    .addComponent(txtRespuestaCorrecta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespuesta6)
                    .addComponent(txtRespuesta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRespuesta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRespuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDPreguntaActual)
                    .addComponent(txtIDPreguntaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnlProyectoCurricularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar1)
                    .addComponent(btnActualizacion2))
                .addGap(50, 50, 50))
        );

        tpnPrueba.addTab("Materia y Preguntas", pnlProyectoCurricular);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tpnPrueba)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tpnPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JmArchivo.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JmArchivo.add(jMenuItem1);

        jMenuBar1.add(JmArchivo);

        JmAcercaDe.setText("Acerca de");
        jMenuBar1.add(JmAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cbTipoIdentificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbTipoIdentificacionKeyReleased

    }//GEN-LAST:event_cbTipoIdentificacionKeyReleased

    private void txtNumeroDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocumentoKeyReleased
        Habilitar();
    }//GEN-LAST:event_txtNumeroDocumentoKeyReleased

    private void txtNumeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocumentoKeyTyped
        char c;
        c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroDocumentoKeyTyped

    private void txtPrimerNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerNombreKeyReleased
        Habilitar();
    }//GEN-LAST:event_txtPrimerNombreKeyReleased

    private void txtPrimerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerNombreKeyTyped
        char c;
        c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrimerNombreKeyTyped

    private void txtSegundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoNombreKeyTyped
        char c;
        c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSegundoNombreKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        JOptionPane.showMessageDialog(this, "Datos registrados exitosamente", "Ventana 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPrimerApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerApellidoKeyReleased
        Habilitar();
    }//GEN-LAST:event_txtPrimerApellidoKeyReleased

    private void txtPrimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerApellidoKeyTyped
        char c;
        c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrimerApellidoKeyTyped

    private void txtProfesionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfesionKeyReleased
        Habilitar();
    }//GEN-LAST:event_txtProfesionKeyReleased

    private void txtProfesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfesionKeyTyped
        char c;
        c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProfesionKeyTyped

    private void txtSegundoApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoKeyReleased
        Habilitar();
    }//GEN-LAST:event_txtSegundoApellidoKeyReleased

    private void txtSegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoApellidoKeyTyped
        char c;
        c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSegundoApellidoKeyTyped

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        Habilitar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtMateriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateriaKeyReleased
        Habilitar2();
    }//GEN-LAST:event_txtMateriaKeyReleased

    private void txtTemaEspecificoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemaEspecificoKeyReleased
        Habilitar2();
    }//GEN-LAST:event_txtTemaEspecificoKeyReleased

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        Validar();
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        char c;
        c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtIdMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdMateriaKeyTyped
        char c;
        c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdMateriaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmAcercaDe;
    private javax.swing.JMenu JmArchivo;
    private javax.swing.JButton btnActualizacion2;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JComboBox<String> cbProyectoCurricular1;
    private javax.swing.JComboBox<String> cbTipoIdentificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblFormulario;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JLabel lblActualizacion;
    private javax.swing.JLabel lblAnuncio1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDPC;
    private javax.swing.JLabel lblIDPreguntaActual;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIdMateria;
    private javax.swing.JLabel lblIdPregunta;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblMateria2;
    private javax.swing.JLabel lblNumeroDocumento;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblProfesion;
    private javax.swing.JLabel lblProyectoCurricular2;
    private javax.swing.JLabel lblRespuesta4;
    private javax.swing.JLabel lblRespuesta5;
    private javax.swing.JLabel lblRespuesta6;
    private javax.swing.JLabel lblResultadoIdMateria;
    private javax.swing.JLabel lblResultadoM1;
    private javax.swing.JLabel lblResultadoTE1;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JLabel lblTema3;
    private javax.swing.JPanel pnlDatosDocente;
    private javax.swing.JPanel pnlProyectoCurricular;
    private javax.swing.JTabbedPane tpnPrueba;
    private javax.swing.JTextField txtActualizacionDocente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDPreguntaActual;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtIdPregunta;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtPC;
    private javax.swing.JTextField txtPregunta1;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtRespuesta5;
    private javax.swing.JTextField txtRespuesta6;
    private javax.swing.JTextField txtRespuesta7;
    private javax.swing.JTextField txtRespuesta8;
    private javax.swing.JTextField txtRespuestaCorrecta1;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTemaEspecifico;
    // End of variables declaration//GEN-END:variables
}
