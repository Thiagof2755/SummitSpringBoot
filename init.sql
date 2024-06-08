CREATE DOMAIN dm_descricao VARCHAR(255);

CREATE TABLE image(
                      id INT NOT NULL,
                      file BYTEA,
                      PRIMARY KEY (id)
);

CREATE TABLE category(
                         id INT NOT NULL,
                         name dm_descricao,
                         PRIMARY KEY (id)
);

CREATE TABLE eventaddres(
                            id INT NOT NULL,
                            number INT,
                            uf VARCHAR(2),
                            place dm_descricao,
                            district dm_descricao,
                            city dm_descricao,
                            complement dm_descricao,
                            zipCode dm_descricao,
                            PRIMARY KEY (id)
);

CREATE TABLE person(
                       id INT NOT NULL,
                       imageid INT,
                       username dm_descricao,
                       profile dm_descricao,
                       birthdate DATE,
                       email dm_descricao,
                       password dm_descricao,
                       displayname dm_descricao,
                       PRIMARY KEY (id),
                       FOREIGN KEY (imageid) REFERENCES image (id)
);

CREATE TABLE event(
                      id INT NOT NULL,
                      categoryid INT,
                      eventaddressid INT,
                      name dm_descricao,
                      initialdate TIMESTAMP,
                      enddate TIMESTAMP,
                      observation dm_descricao,
                      status dm_descricao,
                      PRIMARY KEY (id),
                      FOREIGN KEY (categoryid) REFERENCES category (id),
                      FOREIGN KEY (eventaddressid) REFERENCES eventaddres (id)
);

CREATE TABLE eventimage(
                           eventid INT,
                           imageid INT,
                           FOREIGN KEY (eventid) REFERENCES event (id),
                           FOREIGN KEY (imageid) REFERENCES image (id)
);
