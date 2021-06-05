DROP TABLE IF EXISTS tb_product;

CREATE TABLE tb_product
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(250) NOT NULL,
    manufacturer VARCHAR(250) NOT NULL,
    weight       INT          NOT NULL,
    price        DOUBLE
);

INSERT INTO tb_product (name, manufacturer, weight, price)
VALUES ('Xylitol Cytrus Mint Gum', 'Lotte', 21, 156),
       ('Ghana Milk Chocolate', 'Lotte', 50, 276),
       ('Super Rikigen', 'Kinyo Pharmaceutical', 50, 242);

CREATE SEQUENCE HIBERNATE_SEQUENCE
    START WITH 4
    INCREMENT BY 1;