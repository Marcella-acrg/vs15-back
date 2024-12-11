-- CRIAR TABELA ESTUDANTE
CREATE TABLE VEM_SER.ESTUDANTE (
id_estudante NUMBER NOT NULL,
nome VARCHAR2(200) NOT NULL,
data_nascimento DATE NOT NULL,
nr_matricula NUMBER(10) UNIQUE NOT NULL,
ativo CHAR(1) CHECK (ativo IN ('S', 'N')) NOT NULL, 
PRIMARY KEY(id_estudante)
);


-- CRIAR SEQUENCE PARA A TABELA ESTUDANTE
CREATE SEQUENCE VEM_SER.SEQ_ESTUDANTE
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

-- CRIAR OS INSERTS NA TABELA ESTUDANTE
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'João Silva', TO_DATE('2000-01-15', 'YYYY-MM-DD'), 1000000001, 'S');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Maria Oliveira', TO_DATE('1999-05-22', 'YYYY-MM-DD'), 1000000002, 'N');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Carlos Souza', TO_DATE('2001-11-10', 'YYYY-MM-DD'), 1000000003, 'S');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Ana Santos', TO_DATE('1998-07-25', 'YYYY-MM-DD'), 1000000004, 'S');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Luiz Almeida', TO_DATE('2002-03-18', 'YYYY-MM-DD'), 1000000005, 'N');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Fernanda Lima', TO_DATE('2000-09-30', 'YYYY-MM-DD'), 1000000006, 'S');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Rafael Costa', TO_DATE('1997-12-05', 'YYYY-MM-DD'), 1000000007, 'N');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Cláudia Mendes', TO_DATE('2001-06-20', 'YYYY-MM-DD'), 1000000008, 'S');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Pedro Rocha', TO_DATE('1999-10-14', 'YYYY-MM-DD'), 1000000009, 'N');

INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo) 
VALUES (VEM_SER.SEQ_ESTUDANTE.nextval, 'Juliana Martins', TO_DATE('2003-02-27', 'YYYY-MM-DD'), 1000000010, 'S');


-- SELECIONAR DADOS DA TABELA ESTUDANTE
SELECT * FROM VEM_SER.ESTUDANTE;