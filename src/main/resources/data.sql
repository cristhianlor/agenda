insert into tb_contato (id, nome, sbnome, apelido) values (null, 'Cristiano', 'A de Assis', 'Gigante');
insert into tb_contato (id, nome, sbnome, apelido) values (null, 'Darlene', 'Ap Machado', 'Brava');
insert into tb_contato (id, nome, sbnome, apelido) values (null, 'Lorenzo', 'M de Assis', 'Loro');

insert into tb_endereco (id, tipo_endereco, logradouro, numero, complemento, contato_id) values (null, 'R', 'Rua Augusta', 100, 'ap 96', 1);
insert into tb_endereco (id, tipo_endereco, logradouro, numero, complemento, contato_id) values (null, 'C', 'Rua Bueno', 150, 'ap 85', 2);
insert into tb_endereco (id, tipo_endereco, logradouro, numero, complemento, contato_id) values (null, 'R', 'Rua Alex', 101, 'ap 65', 3);

insert into tb_email (id, tipo_email, email, contato_id) values (null, 'PESSOAL', 'cristiano.aa@gmail.com', 1);
insert into tb_email (id, tipo_email, email, contato_id) values (null, 'PESSOAL', 'daam@gmail.com', 2);
insert into tb_email (id, tipo_email, email, contato_id) values (null, 'PESSOAL', 'loro@gmail.com', 3);

insert into tb_telefone (id, tipo_telefone, cd_area, num_tel, contato_id) values (null, 'RESIDENCIAL', 011, 32313072, 1);
insert into tb_telefone (id, tipo_telefone, cd_area, num_tel, contato_id) values (null, 'CELULAR', 011, 980115310, 1);
insert into tb_telefone (id, tipo_telefone, cd_area, num_tel, contato_id) values (null, 'CELULAR', 011, 989525310, 2);
insert into tb_telefone (id, tipo_telefone, cd_area, num_tel, contato_id) values (null, 'CELULAR', 011, 985525389, 3);