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
    student_profile(
        nickname,
        major,
        phonenumber,
        email,
        employer,
        highschool,
        title,
        university,
        birthdate,
        goals,
        hobbies,
        books
    )
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
    student_profile(
        nickname,
        major,
        phonenumber,
        email,
        employer,
        highschool,
        title,
        university,
        birthdate,
        goals,
        hobbies,
        books
    )
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
    courses(name, description, instructor)
values
    (
        'SE 452',
        'Object Oriented Enterprise Computing',
        'Ken Yu'
    );

insert into
    courses(name, description, instructor)
values
    (
        'CSC 461',
        'Optimized C++',
        'Ed Keenan'
    );

insert into
    student(studentid, profile_id, first_name, last_name)
values
    (
        12348,
        1,
        'Santa',
        'Claus'
    );

insert into
    student_enrollment(course_id, student_id)
values
    (1, 1);

insert into
    student_enrollment(course_id, student_id)
values
    (2, 1);

insert into
    student(studentid, profile_id, first_name, last_name)
values
    (
        12349,
        2,
        'Peter',
        'Parker'
    );

insert into
    student_enrollment(course_id, student_id)
values
    (1, 2);

insert into
    student_enrollment(course_id, student_id)
values
    (2, 2);

-- Inserting users into users table
INSERT INTO
    users (user_id, username, password)
VALUES
    (1, 'puneeth', 'puneeth123');

INSERT INTO
    users (user_id, username, password)
VALUES
    (2, 'john', 'john123');

INSERT INTO
    users (user_id, username, password)
VALUES
    (3, 'Leo', 'Leo123');

-- Inserting roles into user_roles table
INSERT INTO
    user_roles (role_id, authority)
VALUES
    (1, 'USER');

-- Inserting user-role associations into user_role_junction table
INSERT INTO
    user_role_junction (user_id, role_id)
VALUES
    (1, 1);

-- puneeth is a USER
INSERT INTO
    user_role_junction (user_id, role_id)
VALUES
    (2, 1);

-- john is a USER
INSERT INTO
    user_role_junction (user_id, role_id)
VALUES
    (3, 1);

--discussion thread seeding
insert into
    discussion_threads(title, subject, student_id)
values
    (
        'First Thread',
        'This is the first thread',
        1
    ),
    (
        'Second Thread',
        'This is the second thread',
        2
    );

--post seeding
insert into
    posts(content, discussion_thread_id, student_id)
values
    (
        'This is the first post for thread 1',
        1,
        2
    ),
    (
        'This is the second post for thread 1',
        1,
        1
    ),
    (
        'This is the first post for thread 2',
        2,
        1
    ),
    (
        'This is the second post for thread 2',
        2,
        2
    ),
    (
        'This is the third post for thread 2',
        2,
        1
    );
