--все поля и все записи
select *
from users;

select first_name name, last_name surname
from  users;

select count(*)
from users;

select *
from users
where first_name = 'Иван';

select *
from users
where id > 2000;

select *
from users
where first_name like '%И%'