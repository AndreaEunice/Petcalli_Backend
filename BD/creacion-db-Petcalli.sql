-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: Petcalli_v1
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coupons`
--

LOCK TABLES `coupons` WRITE;
/*!40000 ALTER TABLE `coupons` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pettype`
--

LOCK TABLES `pettype` WRITE;
/*!40000 ALTER TABLE `pettype` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productscategory`
--

LOCK TABLES `productscategory` WRITE;
/*!40000 ALTER TABLE `productscategory` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor`
--

LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'Petcalli_v1'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-08 21:34:57
