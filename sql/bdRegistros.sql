DROP TABLE Resultado_Postulacion CASCADE
;
DROP SEQUENCE  Resultado_Postulacion_id_resultado_cargo_seq
;
DROP TABLE Detalle_Formacion_Academica CASCADE
;
DROP SEQUENCE  Detalle_Formacion_Academica_id_detalle_for_ac_seq
;
DROP TABLE Referencias_Personales CASCADE
;
DROP SEQUENCE  Referencias_Personales_id_referencias_seq
;
DROP TABLE Idiomas CASCADE
;
DROP SEQUENCE  Idiomas_id_idiomas_seq
;
DROP TABLE Conocimientos_Computacion CASCADE
;
DROP SEQUENCE  Conocimientos_Computacion_id_conocimientos_seq
;
DROP TABLE Experiencia_Docencia CASCADE
;
DROP SEQUENCE  Experiencia_Docencia_id_docencia_seq
;
DROP TABLE Experiencia_Laboral CASCADE
;
DROP SEQUENCE  Experiencia_Laboral_id_exp_laboral_seq
;
DROP TABLE Cursos_Actualizacion CASCADE
;
DROP SEQUENCE  Cursos_Actualizacion_id_curso_act_seq
;
DROP TABLE Formacion_Academica CASCADE
;
DROP SEQUENCE  Formacion_Academica_id_formacion_ac_seq
;
DROP TABLE Cargo_Postulacion CASCADE
;
DROP SEQUENCE  Cargo_Postulacion_id_cargo_postulacion_seq
;
DROP TABLE Postulante CASCADE
;
DROP SEQUENCE  Postulante_id_postulante_seq
;
DROP TABLE Usuario CASCADE
;
DROP SEQUENCE  Usuario_id_usuario_seq
;

CREATE SEQUENCE Resultado_Postulacion_id_resultado_cargo_seq INCREMENT 1 START 1
;

CREATE TABLE Resultado_Postulacion ( 
	id_resultado_cargo bigint DEFAULT nextval(('Resultado_Postulacion_id_resultado_cargo_seq'::text)::regclass) NOT NULL,
	id_cargo_postulacion bigint,
	resultado boolean,
	etapa integer,
	motivos text
)
;

CREATE SEQUENCE Detalle_Formacion_Academica_id_detalle_for_ac_seq INCREMENT 1 START 1
;

CREATE TABLE Detalle_Formacion_Academica ( 
	id_detalle_for_ac bigint DEFAULT nextval(('Detalle_Formacion_Academica_id_detalle_for_ac_seq'::text)::regclass) NOT NULL,
	desde timestamp NOT NULL,
	hasta timestamp NOT NULL,
	universidad text,
	nom_prog_estudios text,
	titulado boolean,
	tipo_formacion varchar(150),
	id_postulante bigint
)
;

CREATE SEQUENCE Referencias_Personales_id_referencias_seq INCREMENT 1 START 1
;

CREATE TABLE Referencias_Personales ( 
	id_referencias bigint DEFAULT nextval(('Referencias_Personales_id_referencias_seq'::text)::regclass) NOT NULL,
	nombres text,
	apellidos text,
	empresa text,
	cargo text,
	telefono integer,
	id_postulante bigint
)
;

CREATE SEQUENCE Idiomas_id_idiomas_seq INCREMENT 1 START 1
;

CREATE TABLE Idiomas ( 
	id_idiomas bigint DEFAULT nextval(('Idiomas_id_idiomas_seq'::text)::regclass) NOT NULL,
	idioma text,
	lee integer,
	habla integer,
	escribe integer,
	certificado boolean,
	id_postulante bigint
)
;

CREATE SEQUENCE Conocimientos_Computacion_id_conocimientos_seq INCREMENT 1 START 1
;

CREATE TABLE Conocimientos_Computacion ( 
	id_conocimientos bigint DEFAULT nextval(('Conocimientos_Computacion_id_conocimientos_seq'::text)::regclass) NOT NULL,
	paquetes text,
	certificado boolean,
	nivel_conocimiento integer,
	id_postulante bigint
)
;

CREATE SEQUENCE Experiencia_Docencia_id_docencia_seq INCREMENT 1 START 1
;

CREATE TABLE Experiencia_Docencia ( 
	id_docencia bigint DEFAULT nextval(('Experiencia_Docencia_id_docencia_seq'::text)::regclass) NOT NULL,
	materia text,
	titular boolean,
	suplente boolean,
	universidad text,
	semestre_contratacion text,
	desde timestamp,
	hasta timestamp,
	id_postulante bigint
)
;

CREATE SEQUENCE Experiencia_Laboral_id_exp_laboral_seq INCREMENT 1 START 1
;

CREATE TABLE Experiencia_Laboral ( 
	id_exp_laboral bigint DEFAULT nextval(('Experiencia_Laboral_id_exp_laboral_seq'::text)::regclass) NOT NULL,
	desde timestamp,
	hasta timestamp,
	empresa text,
	cargo_entrada text,
	cargo_salida text,
	funciones text,
	id_postulante bigint
)
;

CREATE SEQUENCE Cursos_Actualizacion_id_curso_act_seq INCREMENT 1 START 1
;

CREATE TABLE Cursos_Actualizacion ( 
	id_curso_act bigint DEFAULT nextval(('Cursos_Actualizacion_id_curso_act_seq'::text)::regclass) NOT NULL,
	desde timestamp,
	hasta timestamp,
	universidad text,
	nombre_curso text,
	num_horas integer,
	id_postulante bigint
)
;

CREATE SEQUENCE Formacion_Academica_id_formacion_ac_seq INCREMENT 1 START 1
;

CREATE TABLE Formacion_Academica ( 
	id_formacion_ac bigint DEFAULT nextval(('Formacion_Academica_id_formacion_ac_seq'::text)::regclass) NOT NULL,
	nivel_academico varchar(150) NOT NULL,
	num_registro_prof text NOT NULL,
	universidad text,
	nom_programa_estudios text,
	id_postulante bigint
)
;

CREATE SEQUENCE Cargo_Postulacion_id_cargo_postulacion_seq INCREMENT 1 START 1
;

CREATE TABLE Cargo_Postulacion ( 
	id_cargo_postulacion bigint DEFAULT nextval(('Cargo_Postulacion_id_cargo_postulacion_seq'::text)::regclass) NOT NULL,
	num_referencia varchar(150) NOT NULL,
	nombre_cargo text NOT NULL,
	departamento_ciudad text NOT NULL,
	id_postulante bigint
)
;

CREATE SEQUENCE Postulante_id_postulante_seq INCREMENT 1 START 1
;

CREATE TABLE Postulante ( 
	id_postulante bigint DEFAULT nextval(('Postulante_id_postulante_seq'::text)::regclass) NOT NULL,
	apellido_paterno varchar(150),
	apellido_materno varchar(150),
	nombres varchar(250) NOT NULL,
	fecha_nac timestamp NOT NULL,
	nacionalidad varchar(150) NOT NULL,
	domicilio_actual text NOT NULL,
	ci varchar(50) NOT NULL,
	expedido varchar(2),
	telefono_domicilio integer,
	telefono_celular integer,
	sexo varchar(1),
	pretension_salarial decimal(15,2),
	ultimo_salario_mensual decimal(15,2),
	fecha_registro timestamp,
	id_usuario_registro bigint,
	fecha_modificacion timestamp,
	id_usuario_modificacion bigint
)
;

CREATE SEQUENCE Usuario_id_usuario_seq INCREMENT 1 START 1
;

CREATE TABLE Usuario ( 
	id_usuario bigint DEFAULT nextval(('Usuario_id_usuario_seq'::text)::regclass) NOT NULL,
	nombre_usuario text,
	apellido_usuario text,
	ci text,
	password text,
	rol integer,
	estado boolean
)
;


ALTER TABLE Resultado_Postulacion ADD CONSTRAINT PK_Resultado_Postulacion 
	PRIMARY KEY (id_resultado_cargo)
;


ALTER TABLE Detalle_Formacion_Academica ADD CONSTRAINT PK_Detalle_Formacion_Academica 
	PRIMARY KEY (id_detalle_for_ac)
;


ALTER TABLE Referencias_Personales ADD CONSTRAINT PK_Referencias_Personales 
	PRIMARY KEY (id_referencias)
;


ALTER TABLE Idiomas ADD CONSTRAINT PK_Idiomas 
	PRIMARY KEY (id_idiomas)
;


ALTER TABLE Conocimientos_Computacion ADD CONSTRAINT PK_Conocimientos_Computacion 
	PRIMARY KEY (id_conocimientos)
;


ALTER TABLE Experiencia_Docencia ADD CONSTRAINT PK_Experiencia_Docencia 
	PRIMARY KEY (id_docencia)
;


ALTER TABLE Experiencia_Laboral ADD CONSTRAINT PK_Experiencia_Laboral 
	PRIMARY KEY (id_exp_laboral)
;


ALTER TABLE Cursos_Actualizacion ADD CONSTRAINT PK_Cursos_Actualizacion 
	PRIMARY KEY (id_curso_act)
;


ALTER TABLE Formacion_Academica ADD CONSTRAINT PK_Formacion_Academica 
	PRIMARY KEY (id_formacion_ac)
;


ALTER TABLE Cargo_Postulacion ADD CONSTRAINT PK_Cargo_Postulacion 
	PRIMARY KEY (id_cargo_postulacion)
;


ALTER TABLE Postulante ADD CONSTRAINT PK_Postulante 
	PRIMARY KEY (id_postulante)
;


ALTER TABLE Usuario ADD CONSTRAINT PK_Usuario 
	PRIMARY KEY (id_usuario)
;




ALTER TABLE Resultado_Postulacion ADD CONSTRAINT FK_Resultado_Postulacion_Cargo_Postulacion 
	FOREIGN KEY (id_cargo_postulacion) REFERENCES Cargo_Postulacion (id_cargo_postulacion)
;

ALTER TABLE Detalle_Formacion_Academica ADD CONSTRAINT FK_Detalle_Formacion_Academica_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Referencias_Personales ADD CONSTRAINT FK_Referencias_Personales_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Idiomas ADD CONSTRAINT FK_Idiomas_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Conocimientos_Computacion ADD CONSTRAINT FK_Conocimientos_Computacion_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Experiencia_Docencia ADD CONSTRAINT FK_Experiencia_Docencia_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Experiencia_Laboral ADD CONSTRAINT FK_Experiencia_Laboral_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Cursos_Actualizacion ADD CONSTRAINT FK_Cursos_Actualizacion_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Formacion_Academica ADD CONSTRAINT FK_Formacion_Academica_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Cargo_Postulacion ADD CONSTRAINT FK_Cargo_Postulacion_Postulante 
	FOREIGN KEY (id_postulante) REFERENCES Postulante (id_postulante)
;

ALTER TABLE Postulante ADD CONSTRAINT FK_Postulante_Usuario 
	FOREIGN KEY (id_usuario_registro) REFERENCES Usuario (id_usuario)
;
