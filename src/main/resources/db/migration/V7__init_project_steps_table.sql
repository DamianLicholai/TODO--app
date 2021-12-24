create table project_steps
(
    id int primary key auto_increment,
    description varchar(100) not null,
    project_id int,
    days_to_deadline varchar(100)
);

alter table project_steps add foreign key (project_id) references projects (id);