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
