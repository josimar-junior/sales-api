insert into customer (id, name) values (1, 'João da Silva');
insert into customer (id, name) values (2, 'Raimundo José');

insert into product (id, name, value) values (1, 'Celular', 1600.0);
insert into product (id, name, value) values (2, 'Notebook', 2700.0);
insert into product (id, name, value) values (3, 'Carregador', 500.0);

insert into sale (id, registration_date, customer_id, freight, total) values (1, sysdate(), 1, 15.0, 1615.0);

insert into item (id, sale_id, product_id, amount) values (2, 1, 1, 1);