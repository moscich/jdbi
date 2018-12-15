CREATE SEQUENCE users_id_seq;

create table users (
  id integer DEFAULT nextval('users_id_seq'::regclass) PRIMARY KEY,
  name varchar,
  last_name varchar,
  phone varchar
);