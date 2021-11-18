create table posts
(
    id          serial primary key,
    name        varchar(2000),
    description text,
    created     timestamp without time zone not null default now(),
    user_id     int not null,
    FOREIGN KEY (user_id) REFERENCES users (id)
);