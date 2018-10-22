ALTER TABLE public.users
ADD CONSTRAINT users_to_addresses_fk
FOREIGN KEY (address_id) REFERENCES addresses (id);