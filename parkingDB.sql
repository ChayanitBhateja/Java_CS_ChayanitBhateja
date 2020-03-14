CREATE DATABASE  IF NOT EXISTS `parkingDB` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `parkingDB`;
-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: parkingDB
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

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
-- Table structure for table `ownerTable`
--

DROP TABLE IF EXISTS `ownerTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ownerTable` (
  `ownerName` varchar(45) NOT NULL,
  `ownerAddress` varchar(45) DEFAULT NULL,
  `ownerEmail` varchar(45) DEFAULT NULL,
  `ownerMobileNo` bigint(45) DEFAULT NULL,
  `vNo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ownerName`),
  KEY `fk_ownerTable_1_idx` (`vNo`),
  CONSTRAINT `` FOREIGN KEY (`vNo`) REFERENCES `parkingTable` (`vehicleNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ownerTable`
--

LOCK TABLES `ownerTable` WRITE;
/*!40000 ALTER TABLE `ownerTable` DISABLE KEYS */;
/*!40000 ALTER TABLE `ownerTable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parkingTable`
--

DROP TABLE IF EXISTS `parkingTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parkingTable` (
  `vehicleNo` varchar(45) NOT NULL,
  `vehicleType` varchar(45) DEFAULT NULL,
  `slotNo` int(11) DEFAULT NULL,
  `timeStamp` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vehicleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parkingTable`
--

LOCK TABLES `parkingTable` WRITE;
/*!40000 ALTER TABLE `parkingTable` DISABLE KEYS */;
/*!40000 ALTER TABLE `parkingTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-14 11:17:17
