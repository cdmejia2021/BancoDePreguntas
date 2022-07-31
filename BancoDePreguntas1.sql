create database if not exists Banco_de_preguntas1;
use  Banco_de_preguntas1;

create table Proyecto_curricular(
   id varchar (15) not null,
   nombre varchar (100),
   primary key (id)
); 

create table Docente(
    id varchar (15) not null,
    Tipo_id varchar (10),
    Primer_Nombre varchar (15),
    Segundo_Nombre varchar (15),
    Primer_Apellido varchar (15),
    Segundo_Apellido varchar (15),
    Profesion varchar (20),
    Correo varchar (20),
    id_proyecto varchar (15) not null,
    primary key (id),
    foreign key (id_proyecto) references Proyecto_curricular (id)
);

create table Pregunta (
     id_Pregunta varchar (10) not null,
     id_Asignatura varchar (15),
     Nombre_Tema varchar (100),
     Nombre_asignatura varchar(50),
     Texto_Pregunta varchar (200),
     ocp_1 varchar (100),
     ocp_2 varchar (100),
     opc_3 varchar (100),
     opc_4 varchar (100),
     opc_correcta varchar (30),
     primary key (id_Pregunta)
);

create table Docente_Pregunta(
  id_docente_fk varchar(15) not null,
  id_pregunta_fk varchar (10) not null,
  primary key(id_docente_fk, id_pregunta_fk),
  foreign key(id_docente_fk) references Docente(id),
  foreign key(id_pregunta_fk) references Pregunta(id_Pregunta)
);

select * from proyecto_curricular;
select * from docente;
select * from pregunta;
show tables

use Banco_de_preguntas1;
describe pregunta;