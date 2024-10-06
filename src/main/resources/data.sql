--discussion thread seeding
insert into
    discussion_threads(title, subject)
values
    (
        'First Thread',
        'This is the first thread'
    );

insert into
    discussion_threads(title, subject)
values
    (
        'Second Thread',
        'This is the second thread'
    );

--post seeding
insert into
    posts(content, discussion_thread_id)
values
    (
        'This is the first post for thread 1',
        1
    ),
    (
        'This is the second post for thread 1',
        1
    ),
    (
        'This is the first post for thread 2',
        2
    ),
    (
        'This is the second post for thread 2',
        2
    ),
    (
        'This is the third post for thread 2',
        2
    );

--assignment seeding
insert into
    assignments(name, score, due_date)
values
    (
        'HW1',
        '0/100',
        '2024-10-14 23:59:59'
    );

insert into
    assignments(name, score, due_date)
values
    (
        'HW2',
        '0/100',
        '2024-10-21 23:59:59'
    );

insert into
    student_profile(nickname, major, phonenumber, email, employer, highschool, title, university, birthdate, goals, hobbies, books)
values
    (
        'Nick',
        'Christmas Studies',
        '123-456-789',
        'santa@northpole.org',
        'Test',
        'Test',
        'Santa Claus',
        'Depaul',
        '12-25-1234',
        'Giving presents to kids',
        'Hanging out with reindeer',
        'A Christmas Carol'
    ); 

insert into
    student_profile(nickname, major, phonenumber, email, employer, highschool, title, university, birthdate, goals, hobbies, books)
values
    (
        'Spiderman',
        'Fighting Crime',
        '123-456-789',
        'spiderman@gmail.com',
        ' ',
        ' ',
        'Friendly Neighborhood',
        'Depaul',
        '11-10-2014',
        'Stopping bad guys',
        ' ',
        'Charlottes web'
    ); 

    
insert into
    student(studentid, profile_id, courseid, first_name, last_name)
values
    (
        12348, 
        1,
        1990, 
        'Santa', 
        'Claus'
    );


insert into
    student(studentid, profile_id, courseid, first_name, last_name)
values
    (
        12349, 
        2,
        1990, 
        'Peter', 
        'Parker'
    );


