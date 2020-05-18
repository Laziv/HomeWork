USE library;

INSERT INTO book_genres VALUE (NULL, 'Фантастика');
SET @genreId := LAST_INSERT_ID();
INSERT INTO authors VALUE (NULL, 'Джордж', 'Мартін', 'dmdsacvbg@gmail.com', 'Адреса 1', '1948-09-20');
SET @authorId := LAST_INSERT_ID();
INSERT INTO books VALUES 
(NULL, "Пісня льоду й полум'я. Книга 1. Гра престолів", NULL, 150, '978-966-948-271-6', @genreId),
(NULL, "Пісня льоду й полум'я. Книга 2. Битва королів", NULL, 155, '978-617-538-325-4', @genreId),
(NULL, "Пісня льоду й полум'я. Книга 3. Буря мечів", NULL, 165, '978-617-538-399-5', @genreId),
(NULL, "Пісня льоду й полум'я. Книга 4. Бенкет круків", NULL, 180, '978-617-7409-11-2', @genreId),
(NULL, "Пісня льоду й полум'я. Книга 5. Танок драконів", NULL, 170, '978-617-7535-75-0', @genreId);
INSERT INTO book_author VALUES 
(1, @authorId),
(2, @authorId),
(3, @authorId),
(4, @authorId),
(5, @authorId);

INSERT INTO book_genres VALUE (NULL, 'Жахи');
SET @genreId := LAST_INSERT_ID();
INSERT INTO authors VALUE (NULL, 'Стівен', 'Кінг', 'stfhdsadsaf@gmail.com', 'Адреса 2', '1947-09-21');
SET @authorId := LAST_INSERT_ID();
INSERT INTO books VALUES 
(NULL, 'Сяйво', NULL, 200, '978-617-12-7081-7', @genreId),
(NULL, 'Доктор Сон', NULL, 300, '978-617-12-6831-9', @genreId),
(NULL, 'Крістіна', NULL, 250, '978-617-12-2479-7', @genreId),
(NULL, 'Воно', NULL, 270, '978-617-12-6699-5', @genreId);
INSERT INTO book_author VALUES 
(6, @authorId),
(7, @authorId),
(8, @authorId),
(9, @authorId);
INSERT INTO authors VALUE (NULL, 'Тесс', 'Геррітсен', 'tesdfhnhg@gmail.com', 'Адреса 3', '1953-06-12');
SET @authorId := LAST_INSERT_ID();
INSERT INTO books VALUE (NULL, 'Двійник', NULL, 230, '978-617-12-4948-6', @genreId);
INSERT INTO book_author VALUE (10, @authorId);

SELECT books.name, books.price, book_genres.name genre
FROM book_genres 
INNER JOIN books ON book_genres.id = books.genre_id
WHERE price > 170
ORDER BY price;

SELECT  books.name FROM book_author
INNER JOIN books  ON books.id = book_author.book_id
WHERE book_author.author_id = 1;
     
SELECT authors.id, first_name, last_name, GROUP_CONCAT(books.name SEPARATOR ', ') books FROM authors
INNER JOIN book_author ON authors.id = book_author.author_id
INNER JOIN books ON books.id = book_author.book_id
GROUP BY authors.id;