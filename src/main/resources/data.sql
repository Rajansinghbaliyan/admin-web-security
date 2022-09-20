INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Acme', 'Wylie Coyote', 'wcoyote@acme.com', 'password', '1-515-555-2348');
INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Spacely Space Sprockets', 'George Jettson', 'gjettson@spacely.com', 'password', '1-515-555-2350');
INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Callahan Auto', 'Thomas Callhan', 'tcallahan@callhhanauto.com', 'password', '1-515-555-2333');
INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Dundler Mifflin Inc', 'Michael Scott', 'mscott@dundlermifflin.com', 'password', '1-515-555-2320');
INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Stark Industries', 'Tony Stark', 'tstark@stark.com', 'password', '1-515-555-7777');
INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Initech', 'Peter Gibbons', 'pgibbons@initec.com', 'password', '1-515-555-0666');
INSERT INTO customers (name, contact_name, email, password_hash, phone) values ('Wayne Enterprises', 'Bruce Wayne', 'bwayne@wayne.com', 'password', '1-515-555-1111');

INSERT INTO orders (customer_id, order_info) values ((SELECT customer_id FROM customers where name = 'Acme'), '1500 Widgets');
INSERT INTO orders (customer_id, order_info) values ((SELECT customer_id FROM customers where name = 'Acme'), '3000 Widgets');
INSERT INTO orders (customer_id, order_info) values ((SELECT customer_id FROM customers where name = 'Callahan Auto'), '200 Widgets');