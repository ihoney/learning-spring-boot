drop table players if exists;
create table players (
    id bigint auto_increment,
    name varchar(255) not null,
    number bigint not null,
    primary key (id)
);