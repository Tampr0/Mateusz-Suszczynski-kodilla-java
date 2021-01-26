create table stats 
(stat_id int(11) auto_increment primary key,
stat_date datetime not null,
stat varchar(20) not null,
value int(11) not null);

create view bestsellers_count as
select sum(bestseller) as number_ofBestsellers from books;

use kodilla_course;
select * from bestsellers_count;

delimiter $$
create event update_bestsellers 
on schedule every 1 minute
do begin
	call UpdateBestsellers();
    insert into stats(stat_date, stat, value)
    select curtime(), "BESTSELLSERS", number_ofBestsellers from bestsellers_count;
end $$
delimiter ;

