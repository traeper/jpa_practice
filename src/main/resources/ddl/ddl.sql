CREATE TABLE person
(
    `id`       bigint(20)  NOT NULL AUTO_INCREMENT,
    `name`     varchar(25) NOT NULL,
    `employed` tinyint(1)  NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE doctor
(
    `id`    bigint(20)   NOT NULL,
    `major` varchar(255) not null,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE student
(
    `id`             bigint(20)   NOT NULL,
    `credit_average` varchar(255) not null,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;