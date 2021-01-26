create table books_aud (
  event_id int NOT NULL AUTO_INCREMENT,
  event_date datetime NOT NULL,
  event_type varchar(10) NOT NULL,
  book_id int NOT NULL,
  old_title varchar(255), 
  new_title varchar(255),
  old_pubyear int,
  new_pubyear int,
  old_bestseller bool,
  new_bestseller bool,
  PRIMARY KEY (`event_id`)
  );

create table readers_aud (
  event_id int NOT NULL AUTO_INCREMENT,
  event_date datetime NOT NULL,
  event_type varchar(10) NOT NULL,
  reader_id int NOT NULL,
  old_firstname varchar(255), 
  new_firstname varchar(255),
  old_lastname varchar(255),
  new_lastname varchar(255),
  old_peselid varchar(11),
  new_peselid varchar(11),
  old_vip_level varchar(20),
  new_vip_level varchar(20),
  PRIMARY KEY (`event_id`)
  );
  
delimiter $$ 
create trigger books_insert after insert on books
for each row
begin
	insert into books_aud(event_date, event_type, book_id, new_title, new_pubyear, new_bestseller)
    values(curtime(), "INSERT", new.book_id, new.title, new.pubyear, new.bestseller);
end $$ 

create trigger books_delete after delete on books
for each row
begin
	insert into books_aud(event_date, event_type, book_id)
    values(curtime(), "DELETE", old.book_id);
end $$

create trigger books_update after update on books
for each row
begin
	insert into books_aud(event_date, event_type, book_id, new_title, new_pubyear, new_bestseller,
		old_title, old_pubyear, old_bestseller)
	values(curtime(), "UPDATE", new.book_id, new.title, new.pubyear, new.bestseller, old.title, 
		old.pubyear, old.bestseller);
end $$

create trigger readers_insert after insert on readers
for each row
begin
	insert into readers_aud(event_date, event_type, reader_id, new_firstname, new_lastname, 
		new_peselid, new_vip_level)
    values(curtime(), "INSERT", new.reader_id, new.firstname, new.lastname, new.peselid, new.vip_level);
end $$

create trigger readers_delete after delete on readers
for each row
begin
	insert into readers_aud(event_date, event_type, reader_id)
    values(curtime(), "DELETE", old.reader_id);
end $$

create trigger readers_update after update on readers
for each row
begin
	insert into readers_aud(event_date, event_type, reader_id, new_firstname, new_lastname, new_peselid,
		new_vip_level, old_firstname, old_lastname, old_peselid, old_vip_level)
	values(curtime(), "UPDATE", new.reader_id, new.firstname, new.lastname, new.peselid, new.vip_level,
		old.firstname, old.lastname, old.peselid, old.vip_level);
end &&
delimiter ;
	

