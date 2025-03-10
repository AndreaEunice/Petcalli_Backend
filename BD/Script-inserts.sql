-- Aqui insertamos los datos 5 por cada tabla
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
        
INSERT INTO address(street, city, state, zip, country)
VALUES
("Av. Paseo de la Reforma 123", "Ciudad de México", "Ciudad de México", 06500, "México"),
("Calle Juárez 45", "Guadalajara", "Jalisco", 44100, "México"),
("Av. Hidalgo 678", "Monterrey", "Nuevo León", 64000, "México"),
("Calle Independencia 89", "Puebla", "Puebla", 72000, "México"),
("Av. Revolución 321", "Mérida", "Yucatán", 97000, "México");


INSERT INTO products(id, title, brand, fk_id_petType, image, price, description, fk_id_category, color, size)
 VALUES
    (1, "Mother & Babycat Comida Seca", "Royal Canin", 2,
 "https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress",
 610.00, "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
 1, "NA", "1.3 KG"), 
    (2, "Mother & Babycat Comida Seca", "Royal Canin", 2,
"https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress",
855.00, "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
1, "NA", "2.6 KG"), 
    (11, "Small Starter Mother & Babydog", "Royal Canin", 1, 
 "https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress",
 470.00, "Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.",
 1, "NA", "1.1 KG"), 
    (12, "Small Starter Mother & Babydog", "Royal Canin", 1, 
 "https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress", 
 "1630.00", "Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.",
 1, "NA", "6.3 KG"), 
    (45, "Bolas Rodadoras para Pequeñas Mascotas", "Oxbow", 3, 
 "https://www.petco.com.mx/medias/133191.jpg-300ftw?context=bWFzdGVyfHJvb3R8NjI5MTV8aW1hZ2UvanBlZ3xoYjcvaDVmLzk1NzU1MzcwNDk2MzAuanBnfDcxYTU3NmQ0Y2U4MzA2NjFiZGJmMGFlYTg5ODY0OTliZDJlNzFjOGU5YzJmMzRkYTVjZThlNTkxODYwZTMyNTA", 
 161.50, "Oxbow Enriched Life Bolas Rodadoras para Pequeñas Mascotas.", 
2, "NA", "NA");



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
INSERT INTO rol
      (id, client, vendor, guest, Description )
   VALUES (1, 0, 0,1, "Invitado" ),
		  (2, 1, 0, 0, "Cliente"),
          (3, 1, 0, 0, "Cliente"),
          (4, 1, 1, 0, "Cliente y Vendedor"),
          (5, 0, 1, 0, "Vendedor"),
          (6, 0, 0, 1, "Invitado");
          
-- SELECT * FROM rol;





