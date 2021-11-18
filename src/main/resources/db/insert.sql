insert into authorities (authority)
values ('ROLE_USER');
insert into authorities (authority)
values ('ROLE_ADMIN');

insert into users (username, enabled, password, authority_id)
values ('admin', true, '$2a$10$WUL/4IYyHS77EiU/xRE8Ju9xBV8Q81Y2T4ERU8tgFatkCrv61pfYG',
        (select id from authorities where authority = 'ROLE_ADMIN'));

insert into posts (name, description, user_id)
values ('О чем этот форум?', 'Описание форума', 1);
insert into posts (name, description, user_id)
values ('Правила форума.', 'Описание правил форума', 1);