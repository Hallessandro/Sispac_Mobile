-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: db_sispac
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_professor`
--

DROP TABLE IF EXISTS `tbl_professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_professor` (
  `id_professor` int(11) NOT NULL AUTO_INCREMENT,
  `matricula_professor` varchar(45) DEFAULT NULL,
  `nome_professor` varchar(255) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_professor`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_professor`
--

LOCK TABLES `tbl_professor` WRITE;
/*!40000 ALTER TABLE `tbl_professor` DISABLE KEYS */;
INSERT INTO `tbl_professor` VALUES (1,'123','Alberto Alexandre ','123'),(2,'321','Alvaro Hermano da Silva','888'),(3,'234','Antônio Henrique',NULL),(4,'432','Arlindo Lopes Barbosa',NULL),(5,'345','Carlos Negreiro',NULL),(6,'543','Jurandy Soares',NULL),(7,'456','Marcelo Varela',NULL),(8,'654','Valdemiro Severiano Júnior ',NULL),(9,'829','Credson Isaac',NULL),(10,'930','Eduardo Sérgio ',NULL),(11,'929','Alison Batista',NULL),(12,'940','Irapuan Medeiros',NULL),(13,'666','Antonio André',NULL),(14,'929','Carlos Magno',NULL),(15,'488','Ricardo Cesar',NULL),(16,'382','Romero Tertulino',NULL),(17,'881','Priscila Seabra',NULL),(18,'375','Karina Ramalho',NULL),(19,'918','Frank Vitor',NULL),(20,'773','Fabia Meneses',NULL),(21,'388','Rogério Alves',NULL),(22,'388','Lúcia de Fátima ',NULL),(23,'935','Andréa Pereira ',NULL),(24,'2488','Maíra Medeiros',NULL),(25,'111','Givanaldo Rocha',NULL),(26,'999','Luiz Ricardo',NULL),(27,'177','Jaciana Silva',NULL),(28,'654','Emídio Gomes',NULL),(29,'444','Jefferson Doolan ',NULL),(30,'5665','Carlos Eduardo',NULL),(31,'311','Glenda Marques',NULL),(32,'933','Fábio Procópio ',NULL),(33,'3113','Valerio Gutemberg',NULL),(34,'333','Bruno Emerson',NULL),(35,'4771','Raphael Siqueira',NULL),(36,'495','Washington Luiz',NULL),(37,'395','Maria Aparecida ',NULL),(38,'491','Airton Araújo',NULL),(39,'399','Ricardo Fernandes',NULL),(40,'134','Eduardo Galvão ',NULL),(41,'294','Carlos Henrique',NULL),(42,'299','Diego Bacatela ',NULL),(43,'211','Rosineide',NULL),(44,'888','Rodrigo Siqueira ',NULL),(45,'2991','Tiago Costa ',NULL),(46,'211','Zulmar Jofli',NULL),(47,'455','Aline Gomes',NULL),(48,'944','João Mesquita ',NULL),(49,'381','Felipe Campos',NULL),(50,'3884','Gustavo Fernandes','Batman'),(51,'1121','Paulo VItor',NULL),(52,'2931','Thayse Azevedo',NULL),(53,'1234','Wigna Costa',NULL),(54,'223','Raoni Souza',NULL),(55,'942','Aylana Raquel',NULL),(56,'2211','Filipe Quintaes',NULL),(57,'11231','Xênia Brandão ',NULL),(58,'299','Kleber Araújo ',NULL),(59,'256','Tadeu Ferreira Oliveira',NULL),(60,'381','Victor Costa ',NULL),(61,'1941','João Nascimento','111'),(62,'211','André Gustavo',NULL),(63,'229','Demóstenes Sena ',NULL),(65,'123','Gustavo Fontoura','123');
/*!40000 ALTER TABLE `tbl_professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_registro_frequencia`
--

DROP TABLE IF EXISTS `tbl_registro_frequencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_registro_frequencia` (
  `id_registro_frequencia` int(11) NOT NULL,
  `horario` varchar(45) DEFAULT NULL,
  `tbl_sala_id_sala` int(11) NOT NULL,
  `tbl_professor_id_professor` int(11) NOT NULL,
  `tbl_usuario_id_usuario` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  PRIMARY KEY (`id_registro_frequencia`),
  KEY `fk_tbl_registro_frequencia_tbl_sala1_idx` (`tbl_sala_id_sala`),
  KEY `fk_tbl_registro_frequencia_tbl_professor1_idx` (`tbl_professor_id_professor`),
  KEY `fk_tbl_registro_frequencia_tbl_usuario1_idx` (`tbl_usuario_id_usuario`),
  CONSTRAINT `fk_tbl_registro_frequencia_tbl_professor1` FOREIGN KEY (`tbl_professor_id_professor`) REFERENCES `tbl_professor` (`id_professor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_registro_frequencia_tbl_sala1` FOREIGN KEY (`tbl_sala_id_sala`) REFERENCES `tbl_sala` (`id_sala`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_registro_frequencia_tbl_usuario1` FOREIGN KEY (`tbl_usuario_id_usuario`) REFERENCES `tbl_usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_registro_frequencia`
--

LOCK TABLES `tbl_registro_frequencia` WRITE;
/*!40000 ALTER TABLE `tbl_registro_frequencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_registro_frequencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_reserva_sala`
--

DROP TABLE IF EXISTS `tbl_reserva_sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_reserva_sala` (
  `id_reserva_sala` int(11) NOT NULL AUTO_INCREMENT,
  `data_reserva` date DEFAULT NULL,
  `horario_reserva` varchar(45) DEFAULT NULL,
  `tbl_professor_id_professor` int(11) NOT NULL,
  `tbl_sala_id_sala` int(11) NOT NULL,
  PRIMARY KEY (`id_reserva_sala`),
  KEY `fk_tbl_reserva_sala_tbl_professor_idx` (`tbl_professor_id_professor`),
  KEY `fk_tbl_reserva_sala_tbl_sala1_idx` (`tbl_sala_id_sala`),
  CONSTRAINT `fk_tbl_reserva_sala_tbl_professor` FOREIGN KEY (`tbl_professor_id_professor`) REFERENCES `tbl_professor` (`id_professor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_reserva_sala_tbl_sala1` FOREIGN KEY (`tbl_sala_id_sala`) REFERENCES `tbl_sala` (`id_sala`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_reserva_sala`
--

LOCK TABLES `tbl_reserva_sala` WRITE;
/*!40000 ALTER TABLE `tbl_reserva_sala` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_reserva_sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_sala`
--

DROP TABLE IF EXISTS `tbl_sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_sala` (
  `id_sala` int(11) NOT NULL AUTO_INCREMENT,
  `num_sala` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_sala`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_sala`
--

LOCK TABLES `tbl_sala` WRITE;
/*!40000 ALTER TABLE `tbl_sala` DISABLE KEYS */;
INSERT INTO `tbl_sala` VALUES (1,'Sala 01'),(2,'Sala 02'),(3,'Sala 03'),(4,'Sala 04'),(5,'Sala 05'),(6,'Sala 06'),(7,'Sala 07'),(8,'Sala 08'),(9,'Sala 09'),(10,'Sala 10'),(11,'Laboratório de Informática 1'),(12,'Laboratório de Informática 2'),(13,'Laboratório de Informática 3'),(14,'Laboratório de Informática 4'),(15,'Sala 1 A'),(16,'Sala 2 A'),(17,'Sala 3 A'),(18,'Sala 4 A'),(19,'Sala 5 A'),(20,'Sala 6 A'),(21,'Laboratório de Redes '),(22,'Laboratório de Manutenção'),(23,'Laboratório de Eletrônica'),(24,'Laboratório de Mecânica I'),(25,'Laboratório de Mecânica II'),(26,'Laboratório de Metrologia'),(27,'Laboratório de Instrumentação'),(28,'Laboratório de Robótica'),(29,'Laboratório de Soldagem'),(30,'Laboratório de Línguas'),(31,'Laboratório de Pneumática'),(32,'Laboratório de Acionamento de Máquinas');
/*!40000 ALTER TABLE `tbl_sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(255) DEFAULT NULL,
  `matricula_usuario` int(11) DEFAULT NULL,
  `nv_acesso` int(11) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (1,'Hallessandro',123,1,'777');
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-15 23:20:39
