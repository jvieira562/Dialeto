-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: sql10.freemysqlhosting.net    Database: sql10417786
-- ------------------------------------------------------
-- Server version	5.5.62-0ubuntu0.14.04.1

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
-- Table structure for table `tb_aulas`
--

DROP TABLE IF EXISTS `tb_aulas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_aulas` (
  `id_aula` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `status` varchar(1) NOT NULL,
  `nivel` int(11) NOT NULL,
  `data_hora` datetime NOT NULL,
  PRIMARY KEY (`id_aula`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_aulas`
--

LOCK TABLES `tb_aulas` WRITE;
/*!40000 ALTER TABLE `tb_aulas` DISABLE KEYS */;
INSERT INTO `tb_aulas` VALUES (1,'Aula 1','a',1,'2021-06-08 21:08:41');
/*!40000 ALTER TABLE `tb_aulas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_aulas_conteudos`
--

DROP TABLE IF EXISTS `tb_aulas_conteudos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_aulas_conteudos` (
  `id_conteudo` int(11) NOT NULL AUTO_INCREMENT,
  `id_aula` int(11) NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `status` varchar(1) NOT NULL,
  `link_conteudo` varchar(500) NOT NULL,
  `data_hora` datetime NOT NULL,
  PRIMARY KEY (`id_conteudo`),
  KEY `tb_aulas_conteudos_fk_1` (`id_aula`),
  CONSTRAINT `tb_aulas_conteudos_fk_1` FOREIGN KEY (`id_aula`) REFERENCES `tb_aulas` (`id_aula`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_aulas_conteudos`
--

LOCK TABLES `tb_aulas_conteudos` WRITE;
/*!40000 ALTER TABLE `tb_aulas_conteudos` DISABLE KEYS */;
INSERT INTO `tb_aulas_conteudos` VALUES (2,1,'Conteudo ABC','a','http://linka','2021-06-08 21:11:16'),(3,1,'Conteudo DEF','a','http://linkb','2021-06-08 21:11:40'),(4,1,'Conteudo HIJ','a','http://linkc','2021-06-08 21:11:51');
/*!40000 ALTER TABLE `tb_aulas_conteudos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_aulas_exercicios`
--

DROP TABLE IF EXISTS `tb_aulas_exercicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_aulas_exercicios` (
  `id_exercicio` int(11) NOT NULL,
  `id_aula` int(11) NOT NULL,
  `datahora` datetime NOT NULL,
  KEY `tb_aulas_exercicios_fk_1` (`id_exercicio`),
  KEY `tb_aulas_exercicios_fk_2` (`id_aula`),
  CONSTRAINT `tb_aulas_exercicios_fk_1` FOREIGN KEY (`id_exercicio`) REFERENCES `tb_exercicios` (`id_exercicio`),
  CONSTRAINT `tb_aulas_exercicios_fk_2` FOREIGN KEY (`id_aula`) REFERENCES `tb_aulas` (`id_aula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_aulas_exercicios`
--

LOCK TABLES `tb_aulas_exercicios` WRITE;
/*!40000 ALTER TABLE `tb_aulas_exercicios` DISABLE KEYS */;
INSERT INTO `tb_aulas_exercicios` VALUES (1,1,'2021-06-08 21:16:43'),(2,1,'2021-06-08 21:16:47'),(3,1,'2021-06-08 21:16:49'),(4,1,'2021-06-08 21:16:43');
/*!40000 ALTER TABLE `tb_aulas_exercicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_aulas_usuarios`
--

DROP TABLE IF EXISTS `tb_aulas_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_aulas_usuarios` (
  `id_aula` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `duvidas` varchar(255) DEFAULT NULL,
  `data_hora` datetime NOT NULL,
  KEY `tb_aula_usuario_fk_1` (`id_aula`),
  KEY `tb_aula_usuario_fk_2` (`id_usuario`),
  CONSTRAINT `tb_aula_usuario_fk_1` FOREIGN KEY (`id_aula`) REFERENCES `tb_aulas` (`id_aula`),
  CONSTRAINT `tb_aula_usuario_fk_2` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_aulas_usuarios`
--

LOCK TABLES `tb_aulas_usuarios` WRITE;
/*!40000 ALTER TABLE `tb_aulas_usuarios` DISABLE KEYS */;
INSERT INTO `tb_aulas_usuarios` VALUES (1,1,'','2021-06-08 21:18:40');
/*!40000 ALTER TABLE `tb_aulas_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_exercicios`
--

DROP TABLE IF EXISTS `tb_exercicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_exercicios` (
  `id_exercicio` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `pontos` float(8,2) NOT NULL,
  `nivel` int(11) NOT NULL,
  `datahora` datetime NOT NULL,
  PRIMARY KEY (`id_exercicio`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_exercicios`
--

LOCK TABLES `tb_exercicios` WRITE;
/*!40000 ALTER TABLE `tb_exercicios` DISABLE KEYS */;
INSERT INTO `tb_exercicios` VALUES (1,'Exercicio 1','Quizz',10.00,1,'2021-06-08 21:15:11'),(2,'Exercicio 2','Quizz',15.00,2,'2021-06-08 21:15:25'),(3,'Exercicio 3','Forca',40.00,5,'2021-06-08 21:15:38'),(4,'Exercicio 4','Caça Palavras',50.00,1,'2021-06-08 21:15:11');
/*!40000 ALTER TABLE `tb_exercicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_exercicios_alunos`
--

DROP TABLE IF EXISTS `tb_exercicios_alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_exercicios_alunos` (
  `id_exercicio` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `status` varchar(1) NOT NULL,
  `datahora` datetime NOT NULL,
  KEY `tb_exercicios_alunos_fk_1` (`id_exercicio`),
  KEY `tb_exercicios_alunos_fk_2` (`id_usuario`),
  CONSTRAINT `tb_exercicios_alunos_fk_1` FOREIGN KEY (`id_exercicio`) REFERENCES `tb_exercicios` (`id_exercicio`),
  CONSTRAINT `tb_exercicios_alunos_fk_2` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_exercicios_alunos`
--

LOCK TABLES `tb_exercicios_alunos` WRITE;
/*!40000 ALTER TABLE `tb_exercicios_alunos` DISABLE KEYS */;
INSERT INTO `tb_exercicios_alunos` VALUES (1,1,'s','2021-06-08 21:19:34'),(2,1,'s','2021-06-08 21:19:40'),(3,1,'e','2021-06-08 21:19:45'),(4,1,'s','2021-06-08 21:19:34');
/*!40000 ALTER TABLE `tb_exercicios_alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuarios`
--

DROP TABLE IF EXISTS `tb_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `data_nascimento` date NOT NULL,
  `formacao_escolar` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `cpf` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `login` varchar(25) NOT NULL,
  `resumo` varchar(300) DEFAULT NULL,
  `tipo_usuario` varchar(1) NOT NULL,
  `status` varchar(1) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuarios`
--

LOCK TABLES `tb_usuarios` WRITE;
/*!40000 ALTER TABLE `tb_usuarios` DISABLE KEYS */;
INSERT INTO `tb_usuarios` VALUES (1,'Diego','Santos','2002-04-10','Ensino Medio Completo','diego@teste.com.br','1111111','323212231','123','diegosantos',NULL,'a','a');
/*!40000 ALTER TABLE `tb_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sql10417786'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-08 21:33:38
