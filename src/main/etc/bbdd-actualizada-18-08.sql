CREATE DATABASE  IF NOT EXISTS `javaagil` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `javaagil`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: javaagil
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `cargos`
--

DROP TABLE IF EXISTS `cargos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargos` (
  `idcargo` int NOT NULL AUTO_INCREMENT,
  `cargo` varchar(100) NOT NULL,
  PRIMARY KEY (`idcargo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargos`
--

LOCK TABLES `cargos` WRITE;
/*!40000 ALTER TABLE `cargos` DISABLE KEYS */;
INSERT INTO `cargos` VALUES (1,'Experto en arquitectura del software'),(2,'Responsable de SaaS'),(3,'Director de ventas'),(4,'Desarrolladora web y Scrum master '),(5,'Responsable de RRHH');
/*!40000 ALTER TABLE `cargos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `logo` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Generation Spain','Generation es un proyecto global enfocado en empoderar a las personas para que puedan alcanzar carreras sostenibles y de impacto.','/img/generation.jpg'),(2,'Everis','grupo multinacional que cree por encima de todo en las personas y en su desarrollo integral, apuesta por el mejor talento, y consigue un alto rendimiento profesional al crear un contexto de libertad responsable.','/img/everis.jpg'),(3,'Grupo Laeras','Empresa gaditana que lleva más de 20 años trabajando para ofrecer la mejor selección de pescados y mariscos de calidad, así como una cuidada atención diaria y personalizada.','/img/laeras.jpg');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipo` (
  `idpersona` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `resumen` varchar(512) NOT NULL,
  `foto` varchar(128) NOT NULL,
  `cargo` int NOT NULL,
  PRIMARY KEY (`idpersona`),
  KEY `fk_cargos_equipo_idx` (`cargo`),
  CONSTRAINT `fk_cargos_equipo` FOREIGN KEY (`cargo`) REFERENCES `cargos` (`idcargo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES (1,'Pedro','Barrantes','Administrador de sistemas y desarrollador weby','pedro.png',1),(2,'Jin','Mun','Software como servicio','jin.png',2),(3,'Francisco','Rayo','Dedicación exclusiva a los clientes y sus necesidades','rayo.png',3),(4,'Rocío','Jiménez','Amante del diseño y entusiasta de las nuevas tecnologías','rocio.png',4);
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mensajes` (
  `idmensaje` int NOT NULL AUTO_INCREMENT,
  `from` varchar(100) NOT NULL,
  `fecha` timestamp NULL DEFAULT NULL,
  `subject` varchar(100) DEFAULT NULL,
  `mensaje` varchar(512) DEFAULT NULL,
  `respuesta` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`idmensaje`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensajes`
--

LOCK TABLES `mensajes` WRITE;
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
INSERT INTO `mensajes` VALUES (1,'Maria Martinez','2021-05-09 22:00:00','Presupuesto landing ','Buenas tardes, me pongo en contacto con vosotros en relación al presupuesto de nuestra landing page para que me comenteis si ya lo teneis finalizado. Espero vuestra respuesta lo más rápido posible. Un cordial saludo. Maria Martinez.',NULL);
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyectos` (
  `idproyecto` int NOT NULL AUTO_INCREMENT,
  `proyecto` varchar(45) NOT NULL,
  `fechafin` varchar(45) NOT NULL,
  `resumen` varchar(200) NOT NULL,
  `descripcion` varchar(1024) NOT NULL,
  `imagen` varchar(128) DEFAULT NULL,
  `empresa` int NOT NULL,
  PRIMARY KEY (`idproyecto`),
  KEY `fk_proyecto_clientes__idx` (`empresa`),
  CONSTRAINT `fk_proyecto_clientes_` FOREIGN KEY (`empresa`) REFERENCES `clientes` (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyectos`
--

LOCK TABLES `proyectos` WRITE;
/*!40000 ALTER TABLE `proyectos` DISABLE KEYS */;
INSERT INTO `proyectos` VALUES (5,'MovieFlix','Marzo 2021','Digital - Proyecto 1','Desarrollo de la gestión de un sistema de vídeo streaming mediante el cual los socios podrán acceder a un catálogo de películas agrupadas en diferentes categorías como policíaca, románticas, aventuras, comedia, animación y thriller.','movieflix.jpg',1),(6,'Generation Landing Page','Finales Marzo 2021','Digital - Proyecto 2','Desarrollo de una landing para nuestro proyecto de empresa para dar visibilidad a nuestro negocio mostrando nuestra visión de negocio, prodctos, ideas, servicios, etc que ayude a aumentar los leds.','landing.jpg',1),(7,'Juego Preguntas y Respuestas','Abril 2021','Digital - Proyecto 3','Desarrollo de un juego de preguntas y respuestas desarrollado mediante JavaScript en el que se muestran aleeatoriamente un número de preguntas elegidas por el usuario y finalmente se muestra el número de preguntas acertadas correctamente, así como los records conseguidos ','quiz.jpg',1);
/*!40000 ALTER TABLE `proyectos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-18 13:01:52
