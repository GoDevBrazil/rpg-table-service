CREATE TABLE accounts (
    id INTEGER(11) NOT NULL AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    avatar VARCHAR(100) DEFAULT 'default.png',
    birthdate DATETIME NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,

    PRIMARY KEY (id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;