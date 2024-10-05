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
