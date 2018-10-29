select *
from users
where first_name = ?;

select *
from users
where first_name = ? and last_name = ?;

select *
from users
where address_id = :address_id;