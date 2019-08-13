USE todo;

CREATE TABLE tasks(
id INT AUTO_INCREMENT PRIMARY KEY,
task VARCHAR(100),
priority ENUM('low', 'medium', 'high'),
status ENUM ('done', 'not done'),
dueTo DATE);

INSERT INTO tasks(task, priority, status, dueTo) VALUES
('Homework', 'medium', 'not done', '2019-08-15'),
('Sleep', 'high', 'not done', '2019-08-15'),
('Training', 'medium', 'not done', '2019-08-15');

SELECT * FROM tasks;
