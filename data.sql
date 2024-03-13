INSERT INTO `Category` (`name`) VALUES
('Categoria1'),
('Categoria2'),
('Categoria3'),
('Categoria4'),
('Categoria5');

INSERT INTO `Status` (`name`) VALUES
('Status1'),
('Status2'),
('Status3'),
('Status4'),
('Status5');


INSERT INTO `Kind` (`name`) VALUES
('Kind1'),
('Kind2'),
('Kind3'),
('Kind4'),
('Kind5');


INSERT INTO `Priority` (`name`) VALUES
('Priority1'),
('Priority2'),
('Priority3'),
('Priority4'),
('Priority5');


INSERT INTO `Project` (`name`, `description`) VALUES
('Proyecto1', 'Descripcion1'),
('Proyecto2', 'Descripcion2'),
('Proyecto3', 'Descripcion3'),
('Proyecto4', 'Descripcion4'),
('Proyecto5', 'Descripcion5');

INSERT INTO `User` (`username`, `name`, `lastname`, `email`, `password`, `is_active`, `kind`, `created_at`) VALUES
('usuario1', 'Nombre1', 'Apellido1', 'correo1@example.com', 'contrasena1', 1, 1, NOW()),
('usuario2', 'Nombre2', 'Apellido2', 'correo2@example.com', 'contrasena2', 1, 2, NOW()),
('usuario3', 'Nombre3', 'Apellido3', 'correo3@example.com', 'contrasena3', 1, 3, NOW()),
('usuario4', 'Nombre4', 'Apellido4', 'correo4@example.com', 'contrasena4', 1, 4, NOW()),
('usuario5', 'Nombre5', 'Apellido5', 'correo5@example.com', 'contrasena5', 1, 5, NOW());

SELECT*FROM USER;

INSERT INTO `Ticket` (`title`, `description`, `kind_id`, `user_id`, `asigned_id`, `project_id`, `category_id`, `priority_id`, `status_id`) VALUES
('Titulo1', 'Descripcion1', 1, 1, NULL, 1, 1, 1, 1),
('Titulo2', 'Descripcion2', 2, 2, NULL, 2, 2, 2, 2),
('Titulo3', 'Descripcion3', 3, 3, NULL, 3, 3, 3, 3),
('Titulo4', 'Descripcion4', 4, 4, NULL, 4, 4, 4, 4),
('Titulo5', 'Descripcion5', 5, 5, NULL, 5, 5, 5, 5);