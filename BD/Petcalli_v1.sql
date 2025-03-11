-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: petcalli_test_1
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fk_id_user` int NOT NULL,
  `street` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `zip` int NOT NULL,
  `country` varchar(100) NOT NULL,
  PRIMARY KEY (`id`,`fk_id_user`),
  KEY `fk_id_users_idx` (`fk_id_user`),
  CONSTRAINT `fk_id_users` FOREIGN KEY (`fk_id_user`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,1,'Av. Revolucion','Monterrey','Nuevo León',64000,'México'),(2,2,'Calle Hidalgo 456','Guadalajara','Jalisco',44100,'México'),(3,3,'Av. Insurgentes Sur 798','Cuidad de México','Cuidad de México',1000,'Mexico'),(4,4,'Calle 5 de Mayo 321','Mérida','Yucatán',97000,'México'),(5,5,'Av. Benito Juárez 234','Puebla','Puebla',72049,'México'),(6,6,'Lázaro Cárdenas 868','Tijuana','Baja California',22000,'México'),(7,7,'Paseo de la Reforma 555','Cuidad de México','Cuidad de México',6600,'México');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coupons`
--

DROP TABLE IF EXISTS `coupons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coupons` (
  `id` int NOT NULL AUTO_INCREMENT,
  `start_valid_date` date NOT NULL,
  `end_valid_date` date NOT NULL,
  `code` decimal(5,2) NOT NULL,
  `purchase_limit` decimal(10,2) NOT NULL,
  `discount` decimal(5,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coupons`
--

LOCK TABLES `coupons` WRITE;
/*!40000 ALTER TABLE `coupons` DISABLE KEYS */;
INSERT INTO `coupons` VALUES (1,'2025-02-22','2025-05-22',456.12,5000.00,0.05),(2,'2025-03-02','2025-06-02',578.90,1000.00,0.25),(3,'2025-02-01','2025-05-01',456.67,5000.00,0.05),(4,'2025-03-10','2025-06-10',311.13,500.00,0.30),(5,'2025-01-29','2025-04-29',366.88,3000.00,0.10);
/*!40000 ALTER TABLE `coupons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coupons_has_orders`
--

DROP TABLE IF EXISTS `coupons_has_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coupons_has_orders` (
  `id` int NOT NULL,
  `coupons_id` int NOT NULL,
  `orders_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_coupons_has_orders_coupons1_idx` (`coupons_id`),
  KEY `fk_coupons_has_orders_orders1_idx` (`orders_id`),
  CONSTRAINT `fk_coupons_has_orders_coupons1` FOREIGN KEY (`coupons_id`) REFERENCES `coupons` (`id`),
  CONSTRAINT `fk_coupons_has_orders_orders1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coupons_has_orders`
--

LOCK TABLES `coupons_has_orders` WRITE;
/*!40000 ALTER TABLE `coupons_has_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `coupons_has_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fk_id_user` int NOT NULL,
  `amount_products` int NOT NULL,
  `date_time_order` datetime NOT NULL,
  `total_price` decimal(10,2) NOT NULL,
  `payment_method` varchar(50) NOT NULL,
  PRIMARY KEY (`id`,`fk_id_user`),
  KEY `fk_id_user_idx` (`fk_id_user`),
  CONSTRAINT `fk_id_user` FOREIGN KEY (`fk_id_user`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,2,5,'2025-02-23 05:10:43',802.75,'tarjeta_de_credito'),(2,1,1,'2025-02-18 05:37:11',700.50,'tarjeta_de_debito'),(3,1,1,'2025-02-26 10:23:15',451.25,'tarjeta_de_debito'),(4,1,3,'2025-02-15 08:11:32',484.50,'tarjeta_de_credito'),(5,2,2,'2025-02-22 11:05:28',579.50,'tarjeta_de_debito');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pettype`
--

DROP TABLE IF EXISTS `pettype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pettype` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `pet_type` varchar(100) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pettype`
--

LOCK TABLES `pettype` WRITE;
/*!40000 ALTER TABLE `pettype` DISABLE KEYS */;
INSERT INTO `pettype` VALUES (1,'Perros','Descubre todo sobre los perros, nuestros fieles compañeros. Desde razas, cuidados, alimentación y entrenamiento hasta consejos para su bienestar y salud. Encuentra información útil para brindarles una vida feliz y saludable.'),(2,'Gatos','Explora el fascinante mundo de los gatos. Encuentra información sobre razas, cuidados, alimentación, comportamiento y salud felina. Descubre consejos para mejorar su bienestar y fortalecer el vínculo con tu minino.'),(3,'Conejos','Aprende todo sobre los conejos, adorables y curiosas mascotas. Descubre sus cuidados, alimentación, hábitat, comportamiento y consejos para garantizar su bienestar. Encuentra información útil para brindarles una vida sana y feliz.'),(4,'Aves','Descubre el maravilloso mundo de las aves. Encuentra información sobre especies, cuidados, alimentación, comportamiento y consejos para su bienestar. Aprende cómo proporcionarles un entorno adecuado y disfrutar de su compañía.'),(5,'Otros','Explora información sobre una variedad de mascotas y animales exóticos. Desde roedores y reptiles hasta peces e invertebrados, descubre sus cuidados, alimentación y consejos para brindarles un hogar adecuado y saludable.');
/*!40000 ALTER TABLE `pettype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `fk_id_petType` int NOT NULL,
  `image` varchar(300) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `description` varchar(500) NOT NULL,
  `fk_id_category` int NOT NULL,
  `color` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`,`fk_id_category`,`fk_id_petType`),
  KEY `fk_id_category_idx` (`fk_id_category`),
  KEY `fk_id_petType_idx` (`fk_id_petType`),
  CONSTRAINT `fk_id_category` FOREIGN KEY (`fk_id_category`) REFERENCES `productscategory` (`id`),
  CONSTRAINT `fk_id_petType` FOREIGN KEY (`fk_id_petType`) REFERENCES `pettype` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Mother & Babycat Comida Seca','Royal Canin',2,'https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress',610.00,'Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.',3,'NA','1.3 KG'),(2,'Mother & Babycat Comida Seca','Royal Canin',2,'https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress',855.00,'Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.',3,'NA','2.6 KG'),(11,'Small Starter Mother & Babydog','Royal Canin',1,'https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress',470.00,'Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.',3,'NA','1.1 KG'),(12,'Small Starter Mother & Babydog','Royal Canin',1,'https://cdn.royalcanin-weshare-online.io/f-fQTYcBaPOZra8qVPyg/v71/00030111445148-cf-gs1?w=640&fm=jpg&auto=format,compress',1630.00,'Nutrición completa y equilibrada para perros: para la madre pequeña (hasta 10 kg) y sus cachorros. Madre al final de la gestación y durante la lactancia. Cachorros en el destete hasta los 2 meses de edad.',3,'NA','6.3 KG'),(45,'Bolas Rodadoras para Pequeñas Mascotas','Oxbow',3,'https://www.petco.com.mx/medias/133191.jpg-300ftw?context=bWFzdGVyfHJvb3R8NjI5MTV8aW1hZ2UvanBlZ3xoYjcvaDVmLzk1NzU1MzcwNDk2MzAuanBnfDcxYTU3NmQ0Y2U4MzA2NjFiZGJmMGFlYTg5ODY0OTliZDJlNzFjOGU5YzJmMzRkYTVjZThlNTkxODYwZTMyNTA',161.50,'Oxbow Enriched Life Bolas Rodadoras para Pequeñas Mascotas.',4,'NA','NA');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products_has_orders`
--

DROP TABLE IF EXISTS `products_has_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products_has_orders` (
  `id` int NOT NULL,
  `fk_products_id` int NOT NULL,
  `fk_orders_id` int NOT NULL,
  PRIMARY KEY (`id`,`fk_orders_id`),
  KEY `fk_Products_has_orders_Products1_idx` (`fk_products_id`),
  KEY `fk_orders_id_idx` (`fk_orders_id`),
  CONSTRAINT `fk_orders_id` FOREIGN KEY (`fk_orders_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `fk_products_id` FOREIGN KEY (`fk_products_id`) REFERENCES `products` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products_has_orders`
--

LOCK TABLES `products_has_orders` WRITE;
/*!40000 ALTER TABLE `products_has_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `products_has_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productscategory`
--

DROP TABLE IF EXISTS `productscategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productscategory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productscategory`
--

LOCK TABLES `productscategory` WRITE;
/*!40000 ALTER TABLE `productscategory` DISABLE KEYS */;
INSERT INTO `productscategory` VALUES (1,'Accesorios'),(2,'Ropa'),(3,'Alimento'),(4,'Juguetes'),(5,'Medicamento');
/*!40000 ALTER TABLE `productscategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `id` int NOT NULL AUTO_INCREMENT,
  `client` tinyint NOT NULL,
  `vendor` bit(1) NOT NULL,
  `guest` tinyint NOT NULL,
  `Description` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,0,_binary '\0',1,'Invitado'),(2,1,_binary '',0,'Cliente y vendedor'),(3,1,_binary '\0',0,'Cliente');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user rol`
--

DROP TABLE IF EXISTS `user rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user rol` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fk_user_id` int NOT NULL,
  `fk_rol_id` int NOT NULL,
  PRIMARY KEY (`id`,`fk_user_id`),
  KEY `fk_user_id_idx` (`fk_user_id`),
  KEY `fk_rol_id_idx` (`fk_rol_id`),
  CONSTRAINT `fk_rol_id` FOREIGN KEY (`fk_rol_id`) REFERENCES `rol` (`id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`fk_user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user rol`
--

LOCK TABLES `user rol` WRITE;
/*!40000 ALTER TABLE `user rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `user rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telephone` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `userscol_UNIQUE` (`telephone`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Cesar','Millan','cesar.millan@pets.com','123-456-7890','DogW!sp1'),(2,'Jackson','Galaxy','jackson.galaxy@pets.com','987-654-3210','CatD@ddy2'),(3,'Temple','Grandin','temple.grandin@pets.com','555-678-1234','An!m4lB3'),(4,'Juan','Villalobos','juan.villalobos@pets.com','444-222-5678','Perr!t05'),(5,'Jane','Goodall','jane.goodall@pets.com','666-999-0000','ChimpR$8'),(6,'José','Ernesto','jose.ernesto@pets.com','111-333-2222','Ec0l0g!a'),(7,'Carlos','Rodríguez','carlos.rodriguez@pets.com','777-888-9999','VetL0v#9');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `users_id` int NOT NULL,
  `name_store` varchar(45) NOT NULL,
  `rfc` varchar(45) NOT NULL,
  `url` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `store_description` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `terms_conditions_url` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`id`,`users_id`),
  KEY `fk_Vendor_users1_idx` (`users_id`),
  CONSTRAINT `fk_Vendor_users1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor`
--

LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
INSERT INTO `vendor` VALUES (1,1,'Pet Paradise','RFC123456P','http://petparadise.com','The ultimate paradise for pet lovers.','http://petparadise.com/terms'),(2,2,'Happy Tails','RFC654321H','http://happytails.com','Where every tail wags with joy!','http://happytails.com/terms'),(3,3,'Furry Friends','RFC789123F','http://furryfriends.com','Your pet\'s best friend in town.','http://furryfriends.com/terms'),(4,4,'Paws & Claws','RFC321987C','http://pawsandclaws.com','Everything your pet needs under one roof.','http://pawsandclaws.com/terms'),(5,5,'The Pet Hub','RFC456789T','http://thepethub.com','Connecting you with top pet essentials.','http://thepethub.com/terms'),(6,1,'Pet Paradise','RFC123456P','http://petparadise.com','The ultimate paradise for pet lovers.','http://petparadise.com/terms'),(7,2,'Happy Tails','RFC654321H','http://happytails.com','Where every tail wags with joy!','http://happytails.com/terms'),(8,3,'Furry Friends','RFC789123F','http://furryfriends.com','Your pet\'s best friend in town.','http://furryfriends.com/terms'),(9,4,'Paws & Claws','RFC321987C','http://pawsandclaws.com','Everything your pet needs under one roof.','http://pawsandclaws.com/terms'),(10,5,'The Pet Hub','RFC456789T','http://thepethub.com','Connecting you with top pet essentials.','http://thepethub.com/terms');
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-10 19:56:35
