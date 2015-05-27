# --- Created by Ebean DDL
#--To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table file_admin_user (
  username                  varchar(255) not null,
  password                  varchar(255),
  constraint pk_file_admin_user primary key (username))
;




# --- !Downs

drop table file_admin_user;

