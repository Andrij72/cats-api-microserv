
create table if not exists cat (
id varchar(40) PRIMARY KEY NOT NULL,
nameCat varchar(255) NOT NULL,
birth_day date NOT NULL,
created_at TIMESTAMP NOT NULL
);