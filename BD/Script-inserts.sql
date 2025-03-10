-- Aqui insertamos los datos 5 por cada tabla

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
 VALUES(1, "Mother & Babycat Comida Seca", "Royal Canin", 2,
 "https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress",
 610.00, "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
 1, "NA", "1.3 KG"), (2, "Mother & Babycat Comida Seca", "Royal Canin", 2,
"https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress",
855.00, "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
1, "NA", "2.6 KG"), (11, "Small Starter Mother & Babydog", "Royal Canin", 1, 
 "https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress",
 470.00, "Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.",
 1, "NA", "1.1 KG"), (12, "Small Starter Mother & Babydog", "Royal Canin", 1, 
 "https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress", 
 "1630.00", "Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.",
 1, "NA", "6.3 KG"), (45, "Bolas Rodadoras para Pequeñas Mascotas", "Oxbow", 3, 
 "https://www.petco.com.mx/medias/133191.jpg-300ftw?context=bWFzdGVyfHJvb3R8NjI5MTV8aW1hZ2UvanBlZ3xoYjcvaDVmLzk1NzU1MzcwNDk2MzAuanBnfDcxYTU3NmQ0Y2U4MzA2NjFiZGJmMGFlYTg5ODY0OTliZDJlNzFjOGU5YzJmMzRkYTVjZThlNTkxODYwZTMyNTA", 
 161.50, "Oxbow Enriched Life Bolas Rodadoras para Pequeñas Mascotas.", 
2, "NA", "NA");








