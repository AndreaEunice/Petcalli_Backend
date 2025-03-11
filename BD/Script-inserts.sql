-- Aqui insertamos los datos 5 por cada tabla
-- Productscategory

INSERT INTO productscategory(id,name) 
VALUES
(1, 'Accesorios'),
(2, 'Ropa'),
(3, 'Alimento'),
(4, 'Juguetes'),
(5, 'Medicamento');

-- Esta es la seccion de insercion  usuarios deacuerdo a el orden de inserción de README.md

INSERT INTO users (name, lastName, email, telephone, password) 
    VALUES 
        ('Cesar', 'Millan', 'cesar.millan@pets.com', '123-456-7890', 'DogW!sp1'), 
        ('Jackson', 'Galaxy', 'jackson.galaxy@pets.com', '987-654-3210', 'CatD@ddy2'), 
        ('Temple', 'Grandin', 'temple.grandin@pets.com', '555-678-1234', 'An!m4lB3'), 
        ('Juan', 'Villalobos', 'juan.villalobos@pets.com', '444-222-5678', 'Perr!t05'), 
        ('Jane', 'Goodall', 'jane.goodall@pets.com', '666-999-0000', 'ChimpR$8'), 
        ('José', 'Ernesto', 'jose.ernesto@pets.com', '111-333-2222', 'Ec0l0g!a'), 
        ('Carlos', 'Rodríguez', 'carlos.rodriguez@pets.com', '777-888-9999', 'VetL0v#9');

-- Products
INSERT INTO products(id, title, brand, fk_id_petType, image, price, description, fk_id_category, color, size)
 VALUES
    (1, "Mother & Babycat Comida Seca", "Royal Canin", 2,
 "https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress",
 610.00, "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
 3, "NA", "1.3 KG"), 
    (2, "Mother & Babycat Comida Seca", "Royal Canin", 2,
"https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress",
855.00, "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
3, "NA", "2.6 KG"), 
    (11, "Small Starter Mother & Babydog", "Royal Canin", 1, 
 "https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress",
 470.00, "Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.",
 3, "NA", "1.1 KG"), 
    (12, "Small Starter Mother & Babydog", "Royal Canin", 1, 
 "https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress", 
 "1630.00", "Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.",
 3, "NA", "6.3 KG"), 
    (45, "Bolas Rodadoras para Pequeñas Mascotas", "Oxbow", 3, 
 "https://www.petco.com.mx/medias/133191.jpg-300ftw?context=bWFzdGVyfHJvb3R8NjI5MTV8aW1hZ2UvanBlZ3xoYjcvaDVmLzk1NzU1MzcwNDk2MzAuanBnfDcxYTU3NmQ0Y2U4MzA2NjFiZGJmMGFlYTg5ODY0OTliZDJlNzFjOGU5YzJmMzRkYTVjZThlNTkxODYwZTMyNTA", 
 161.50, "Oxbow Enriched Life Bolas Rodadoras para Pequeñas Mascotas.", 
4, "NA", "NA");

-- PetType
INSERT INTO petType(id,pet_type,description) 
VALUES(1,"Perros","Descubre todo sobre los perros, nuestros fieles compañeros. Desde razas, cuidados, alimentación y entrenamiento hasta consejos para su bienestar y salud. Encuentra información útil para brindarles una vida feliz y saludable."),
	  (2,"Gatos","Explora el fascinante mundo de los gatos. Encuentra información sobre razas, cuidados, alimentación, comportamiento y salud felina. Descubre consejos para mejorar su bienestar y fortalecer el vínculo con tu minino."),
      (3,"Conejos","Aprende todo sobre los conejos, adorables y curiosas mascotas. Descubre sus cuidados, alimentación, hábitat, comportamiento y consejos para garantizar su bienestar. Encuentra información útil para brindarles una vida sana y feliz."),
      (4,"Aves","Descubre el maravilloso mundo de las aves. Encuentra información sobre especies, cuidados, alimentación, comportamiento y consejos para su bienestar. Aprende cómo proporcionarles un entorno adecuado y disfrutar de su compañía."),
      (5,"Otros","Explora información sobre una variedad de mascotas y animales exóticos. Desde roedores y reptiles hasta peces e invertebrados, descubre sus cuidados, alimentación y consejos para brindarles un hogar adecuado y saludable.");

-- Oreders
INSERT INTO orders (id, fk_id_user, amount_products, date_time_order, total_price, payment_method)
VALUES
(2, 1, 1, "2025-02-18 05:37:11", 700.50, "tarjeta_de_debito");
INSERT INTO orders (id, fk_id_user, amount_products, date_time_order, total_price, payment_method)
VALUES
(1, 2, 5, "2025-02-23 05:10:43", 802.75, "tarjeta_de_credito");
SELECT * FROM orders;
INSERT INTO orders (id, fk_id_user, amount_products, date_time_order, total_price, payment_method)
VALUES
(3, 1, 1, "2025-02-26 10:23:15", 451.25, "tarjeta_de_debito");
INSERT INTO orders (id, fk_id_user, amount_products, date_time_order, total_price, payment_method)
VALUES
(4, 1, 3, "2025-02-15 08:11:32", 484.5, "tarjeta_de_credito");
INSERT INTO orders (id, fk_id_user, amount_products, date_time_order, total_price, payment_method)
VALUES
(5, 2, 2, "2025-02-22 11:05:28", 579.5, "tarjeta_de_debito");



-- Roles
INSERT INTO rol(id, client, vendor, guest, Description )
   VALUES (1, 0, 0, 1, "Invitado" ),
 (2, 1, 1, 0, "Cliente y vendedor"), 
 (3, 1, 0, 0, "Cliente");


/*Address*/

INSERT INTO address (fk_id_user, street, city, state, zip, country)
VALUES 
(1, 'Av. Revolucion', 'Monterrey', 'Nuevo León', 64000, 'México'),
(2, 'Calle Hidalgo 456', 'Guadalajara', 'Jalisco', 44100, 'México'),
(3, 'Av. Insurgentes Sur 798', 'Cuidad de México', 'Cuidad de México', 01000, 'Mexico'),
(4, 'Calle 5 de Mayo 321', 'Mérida', 'Yucatán', 97000, 'México'),
(5, 'Av. Benito Juárez 234', 'Puebla', 'Puebla', 72049, 'México'),
(6, 'Lázaro Cárdenas 868', 'Tijuana', 'Baja California', 22000, 'México'),
(7, 'Paseo de la Reforma 555', 'Cuidad de México', 'Cuidad de México', 06600, 'México');


/*Coupons*/

INSERT INTO coupons (start_valid_date, end_valid_date, code, purchase_limit, discount)
VALUES 
("2025-02-22", "2025-05-22", 456.12, 5000.00, 000.05),
("2025-03-02", "2025-06-02", 578.90, 1000.00, .25),
("2025-02-01", "2025-05-01", 456.67, 5000.00, .05),
("2025-03-10", "2025-06-10", 311.13, 500.00, .30),
("2025-01-29", "2025-04-29", 366.88, 3000, .10);

-- vendor
INSERT INTO vendor(users_id, name_store, rfc, url, store_description, terms_conditions_url)
VALUES
(1, 'Pet Paradise', 'RFC123456P', 'http://petparadise.com', 'The ultimate paradise for pet lovers.', 'http://petparadise.com/terms'),
(2, 'Happy Tails', 'RFC654321H', 'http://happytails.com', 'Where every tail wags with joy!', 'http://happytails.com/terms'),
(3, 'Furry Friends', 'RFC789123F', 'http://furryfriends.com', 'Your pet\'s best friend in town.', 'http://furryfriends.com/terms'),
(4, 'Paws & Claws', 'RFC321987C', 'http://pawsandclaws.com', 'Everything your pet needs under one roof.', 'http://pawsandclaws.com/terms'),
(5, 'The Pet Hub', 'RFC456789T', 'http://thepethub.com', 'Connecting you with top pet essentials.', 'http://thepethub.com/terms');