# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table systemUser (
  user_id                   integer not null,
  username                  varchar(255),
  password                  varchar(255),
  user_type                 varchar(255),
  special_discount          double,
  constraint pk_user primary key (user_id))
;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists systemUser;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;

