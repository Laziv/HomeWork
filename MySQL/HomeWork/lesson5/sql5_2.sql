USE cinema;

INSERT INTO movies(name, duration) VALUES 
('Інтерстеллар', '2:49'),
('Марсіянин', '2:31'),
('Початок', '2:28'),
('Джентльмени', '1:53'),
("Легенда Г'ю Гласса", '2:36');

INSERT INTO genres(name) VALUES 
('Бойовик'),
('Біографія'),
('Пригоди'),
('Драма'),
('Наукова фантастика'),
('Кримінал'),
('Триллер');

INSERT INTO movie_genre(movie_id, genre_id) VALUES
(1, 3),
(1, 4),
(1, 5),
(2, 3),
(2, 4),
(2, 5),
(3, 5),
(3, 7),
(4, 1),
(4, 6),
(5, 1),
(5, 2),
(5, 3),
(5, 4);

INSERT INTO cinema_halls(name) VALUES 
('Зал 1'),
('Зал 2'),
('Зал 3');

INSERT INTO movie_sessions(date_time, cinema_hall_id, movie_id ) VALUES 
('2020-05-18 08:00:00', 1, 1),
('2020-05-18 11:00:00', 1, 2),
('2020-05-18 14:00:00', 1, 3),
('2020-05-18 17:00:00', 1, 4),
('2020-05-18 20:00:00', 1, 5);

INSERT INTO places(cinema_hall_id, row__number, place_number ) VALUES
(1, 1, 1),
(1, 1, 2),
(1, 1, 3),
(1, 1, 4),
(1, 1, 5),
(1, 1, 6),
(1, 1, 7),
(1, 2, 1);

INSERT INTO tickets(price, is_sold, movie_session_id, place_id ) VALUES
(150, FALSE, 1, 1),
(100, FALSE, 2, 2),
(170, FALSE, 3, 3),
(200, TRUE, 4, 4),
(120, FALSE, 5, 5),
(120, FALSE, 5, 6),
(120, FALSE, 5, 7),
(120, FALSE, 5, 8);

SELECT movies.name,  GROUP_CONCAT(genres.name SEPARATOR ', ') genres FROM movie_genre mg
INNER JOIN movies ON movies.id = movie_id
INNER JOIN genres ON genres.id = genre_id
GROUP BY movies.name;

SELECT movies.name FROM movies
INNER JOIN movie_genre mg ON mg.movie_id = movies.id
INNER JOIN genres ON mg.genre_id = genres.id
WHERE genres.name = 'Наукова фантастика';

SELECT date_time, ch.name cinema_halls, m.name movie_title, duration movie_duration  FROM movie_sessions ms
INNER JOIN cinema_halls ch ON ch.id = ms.cinema_hall_id
INNER JOIN movies m ON m.id = ms.movie_id;

SELECT  date_time, m.name movie_title, t.price, GROUP_CONCAT( CONCAT(p.row__number, ',', p.place_number) SEPARATOR '; ') free_places 
FROM movie_sessions ms
INNER JOIN movies m ON m.id = ms.movie_id
INNER JOIN tickets t ON t.movie_session_id = ms.id
INNER JOIN places p ON p.id = t.place_id
WHERE date_time = '2020-05-18 20:00:00' AND t.is_sold = FALSE;