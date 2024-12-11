CREATE TABLE VEM_SER.PAIS (
    id_pais NUMBER(38,0) NOT NULL,
    nome VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_pais PRIMARY KEY (id_pais)
);


CREATE TABLE VEM_SER.ESTADO (
    id_estado NUMBER(38,0) NOT NULL,
    id_pais NUMBER(38,0) NOT NULL,
    nome VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_estado PRIMARY KEY (id_estado),
    CONSTRAINT fk_estado_pais FOREIGN KEY (id_pais) REFERENCES VEM_SER.PAIS(id_pais)
);

CREATE TABLE VEM_SER.CIDADE (
    id_cidade NUMBER(38,0) NOT NULL,
    id_estado NUMBER(38,0) NOT NULL,
    nome VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_cidade_estado PRIMARY KEY (id_cidade, id_estado),
    CONSTRAINT fk_cidade_estado FOREIGN KEY (id_estado) REFERENCES VEM_SER.ESTADO(id_estado)
);


CREATE TABLE VEM_SER.BAIRRO ( 
    id_bairro NUMBER(38,0) NOT NULL, 
    id_cidade NUMBER(38,0) NOT NULL, 
    id_estado NUMBER(38,0) NOT NULL,
    nome VARCHAR2(50) NOT NULL,
    CONSTRAINT pk_bairro_cidade PRIMARY KEY (id_bairro, id_cidade),
    CONSTRAINT fk_bairro_cidade FOREIGN KEY (id_cidade, id_estado) REFERENCES VEM_SER.CIDADE (id_cidade, id_estado)
);


CREATE TABLE VEM_SER.ENDERECO (
    id_endereco NUMBER(38,0) NOT NULL,
    id_bairro NUMBER(38,0) NOT NULL,
    id_cidade NUMBER(38,0) NOT NULL,
    logradouro VARCHAR2(255), 
    numero NUMBER(38,0) NOT NULL,
    complemento VARCHAR2(100),
    cep CHAR(9),
    CONSTRAINT pk_endereco PRIMARY KEY (id_endereco),
    CONSTRAINT fk_endereco_bairro FOREIGN KEY (id_bairro, id_cidade) REFERENCES VEM_SER.BAIRRO (id_bairro, id_cidade)
   
);
