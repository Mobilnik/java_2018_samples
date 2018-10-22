create table users
(
  id           bigint not null constraint users_pkey primary key,
  first_name   varchar(30),
  last_name    varchar(30),
  address_id   bigint,
  phone_number char(12)
);

create table addresses
(
  id bigint     not null constraint users_pkey primary key,
  address       varchar(100),
  city          varchar(30),
  postal_code   char(6)
);

