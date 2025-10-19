INSERT INTO tb_book (id, title, author, synopsis, url_img, available)
VALUES
(UUID(), 'O Senhor dos Anéis: A Sociedade do Anel', 'J.R.R. Tolkien',
 'Um grupo improvável parte para destruir o Um Anel e salvar a Terra Média.',
 'https://m.media-amazon.com/images/I/81MZ8OjmQrL._SL1296_.jpg', 'AVAILABLE'),

(UUID(), '1984', 'George Orwell',
 'Uma distopia sobre vigilância e controle totalitário.',
 'https://m.media-amazon.com/images/I/71kxa1-0mfL.jpg', 'AVAILABLE'),

(UUID(), 'Dom Casmurro', 'Machado de Assis',
 'Bentinho narra sua vida e o ciúme de Capitu.',
 'https://m.media-amazon.com/images/I/61x1ZHomWUL._SL1200_.jpg', 'AVAILABLE'),

(UUID(), 'O Hobbit', 'J.R.R. Tolkien',
 'Bilbo Bolseiro embarca em uma jornada inesperada.',
 'https://m.media-amazon.com/images/I/91M9xPIf10L._SL1500_.jpg', 'AVAILABLE'),

(UUID(), 'A Revolução dos Bichos', 'George Orwell',
 'Uma alegoria política sobre uma fazenda controlada por animais.',
 'https://m.media-amazon.com/images/I/91BsZhxCRjL._SL1500_.jpg', 'NOT_AVAILABLE'),

(UUID(), 'Harry Potter e a Pedra Filosofal', 'J.K. Rowling',
 'Um jovem descobre que é um bruxo e vai para Hogwarts.',
 'https://m.media-amazon.com/images/I/81YOuOGFCJL.jpg', 'AVAILABLE');

INSERT INTO tb_reader(id,name,email) VALUES (UUID(),'Gustavo','email@email.com')