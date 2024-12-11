-- CRIAR SEQUENCES PARA AS TABELAS BAIRRO, CIDADE, ENDERECO, ESTADO E PAIS
CREATE SEQUENCE VEM_SER.SEQ_BAIRRO
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

CREATE SEQUENCE VEM_SER.SEQ_CIDADE
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

CREATE SEQUENCE VEM_SER.SEQ_ENDERECO
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

CREATE SEQUENCE VEM_SER.SEQ_ESTADO
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

CREATE SEQUENCE VEM_SER.SEQ_PAIS
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

-- CRIAR DOIS INSERTS PARA A TABELA PAIS 
INSERT INTO VEM_SER.PAIS (id_pais, nome)
VALUES(VEM_SER.SEQ_PAIS.nextval, 'Brasil'); 

INSERT INTO VEM_SER.PAIS (id_pais, nome)
VALUES(VEM_SER.SEQ_PAIS.nextval, 'EUA'); 

-- CRIAR QUATRO INSERTS PARA A TABELA ESTADO
INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome) 
VALUES(VEM_SER.SEQ_ESTADO.nextval, 1, 'Paraíba'); 

INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome) 
VALUES(VEM_SER.SEQ_ESTADO.nextval, 2, 'Califórnia'); 

INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome)
VALUES(VEM_SER.SEQ_ESTADO.nextval, 1, 'Rio Grande do Norte'); 

INSERT INTO VEM_SER.ESTADO (id_estado, id_pais, nome)
VALUES(VEM_SER.SEQ_ESTADO.nextval, 2, 'Nova York'); 

-- CONSULTANDO OS ESTADOS CADASTRADOS
SELECT * FROM VEM_SER.ESTADO 

-- CRIAR OITO INSERTS PARA A TABELA CIDADE
INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 1, 'João Pessoa'); 

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 2, 'Los Angeles'); 

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 1, 'Campina Grande'); 

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 3, 'Natal');

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 3, 'Mossoró');

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 2, 'San Francisco'); 

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 4, 'Buffalo');

INSERT INTO VEM_SER.CIDADE (id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_CIDADE.nextval, 4, 'Rochester');

-- CONSULTANDO AS CIDADES CADASTRADAS
SELECT * FROM VEM_SER.CIDADE 



-- CRIAR DEZESSEIS INSERTS PARA A TABELA BAIRRO
INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 1, 1, 'Jardim Oceania'); 

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 2, 2, 'Hollywood');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 1, 1, 'Cabo Branco'); 

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 8, 4, 'Park Avenue');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 8, 4, 'Corn Hill');


INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 2, 2, 'Beverly Hills');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 6, 2, 'Mission District');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 6, 2, 'Fisherman s Wharf');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 3, 1, 'Alto Branco');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 3, 1, 'Bodocongó');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 5, 3, 'Alto de São Manoel');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 5, 3, 'Abolição IV');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 4, 3, 'Ponta Negra');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 4, 3, 'Lagoa Nova');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 7, 4, 'Elmwood Village');

INSERT INTO VEM_SER.BAIRRO (id_bairro, id_cidade, id_estado, nome)
VALUES(VEM_SER.SEQ_BAIRRO.nextval, 7, 4, 'Allentown');

-- CONSULTANDO OS BAIRROS CADASTRADOS
SELECT * FROM VEM_SER.BAIRRO



-- CRIAR TRINTA E DOIS INSERTS PARA A TABELA ENDERECO 
-- Jardim Oceania
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 4, 1, 'Rua das Ondas', 123, 'Apartamento 401', '58037-030'); 

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 4, 1, 'Rua Praia Bela', 200, 'Apartamento 101', '58037-021');


-- Hollywood
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 5, 2, 'Sunset Boulevard', 742, 'Casa A', '90028'); 

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 5, 2, 'Mulholland Drive', 321, 'Apartamento 303', '90046');


-- Cabo Branco
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 7, 1, 'Rua Beira Mar', 10, 'Cobertura', '58045-010');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 7, 1, 'Avenida Cabo Branco', 230, 'Casa A', '58045-020');


-- Park Avenue
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 8, 8, 'Park Avenue', 101, 'Sala 2', '14607');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 8, 8, 'East Avenue', 77, 'Loft', '14610');

-- Corn Hill
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 9, 8, 'Corn Hill Place', 15, 'Casa 3', '14608');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 9, 8, 'South Plymouth Avenue', 202, 'Apartamento 201', '14608');


-- Beverly Hills
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 10, 2, 'Rodeo Drive', 300, 'Cobertura', '90210');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 10, 2, 'Wilshire Boulevard', 50, 'Casa 10', '90212');

-- Mission District
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 11, 6, 'Valencia Street', 240, 'Loja 5', '94110');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 11, 6, 'Mission Street', 80, 'Apartamento 104', '94110');

-- Fisherman's Wharf
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 12, 6, 'Jefferson Street', 300, 'Sala 2', '94133');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 12, 6, 'Taylor Street', 45, 'Casa 1', '94133');

-- Alto Branco
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 13, 3, 'Rua do Sol', 112, 'Apartamento 202', '58104-001');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 13, 3, 'Rua do Luar', 34, 'Casa B', '58104-002');

-- Bodocongó
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 14, 3, 'Rua dos Universitários', 500, 'Bloco C', '58109-100');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 14, 3, 'Rua do Estudante', 20, 'Casa D', '58109-101');

-- Alto de São Manoel
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 15, 5, 'Avenida São Manoel', 70, 'Sala 4', '59631-000');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 15, 5, 'Rua do Comércio', 450, 'Loja 1', '59631-001');


-- Abolição IV
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 16, 5, 'Rua Abolição', 102, 'Casa 4', '59632-000');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 16, 5, 'Rua da Liberdade', 54, 'Apartamento 2', '59632-001');

-- Ponta Negra
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 17, 4, 'Rua Praia de Ponta Negra', 25, 'Cobertura', '59090-001');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 17, 4, 'Rua do Farol', 88, 'Casa G', '59090-002');

-- Lagoa Nova
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 18, 4, 'Avenida Lima e Silva', 400, 'Apartamento 12', '59054-400');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 18, 4, 'Rua Jaguarari', 100, 'Casa F', '59054-410');

-- Elmwood Village
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 19, 7, 'Elmwood Avenue', 600, 'Loja 3', '14222');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 19, 7, 'Bidwell Parkway', 78, 'Apartamento 7', '14222');

-- Allentown
INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 20, 7, 'Allen Street', 50, 'Casa 3', '14201');

INSERT INTO VEM_SER.ENDERECO (id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(VEM_SER.SEQ_ENDERECO.nextval, 20, 7, 'Virginia Street', 90, 'Sala 1', '14202');


-- CONSULTANDO OS ENDEREÇOS CADASTRADOS
SELECT * FROM VEM_SER.ENDERECO 
