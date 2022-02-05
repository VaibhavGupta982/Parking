-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.33-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema parking
--

CREATE DATABASE IF NOT EXISTS parking;
USE parking;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` int(10) unsigned NOT NULL auto_increment,
  `adminname` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `picture` varchar(45) NOT NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminid`,`adminname`,`password`,`picture`) VALUES 
 (100,'Ravi Kumar','123','ravi.jpg'),
 (200,'Harry Singh','123','harry.jpg');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `cities`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE `cities` (
  `Stateid` int(10) unsigned NOT NULL,
  `Cityid` int(10) unsigned NOT NULL,
  `Cityname` varchar(45) NOT NULL,
  PRIMARY KEY  (`Cityid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` (`Stateid`,`Cityid`,`Cityname`) VALUES 
 (1,1,'gwalior'),
 (1,2,'indore'),
 (2,3,'agra'),
 (2,4,'jhansi');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;


--
-- Definition of table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `Employeeid` int(10) unsigned NOT NULL auto_increment,
  `Employeename` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Dob` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `State` varchar(45) NOT NULL,
  `City` varchar(45) NOT NULL,
  `Designation` varchar(45) NOT NULL,
  `Salary` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Mobileno` varchar(45) NOT NULL,
  `Picture` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY  (`Employeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` (`Employeeid`,`Employeename`,`Gender`,`Dob`,`Address`,`State`,`City`,`Designation`,`Salary`,`Email`,`Mobileno`,`Picture`,`Password`) VALUES 
 (4,'raman','Male','2018-10-04','sda','2','4','Andorra','32424','avdesh.cool28@gmail.com','6264518467','1.jpg','12345'),
 (5,'Rahul','Male','1998-02-19','Laxniganj','1','1','Managaer','10000','r@gg.com','7772902044','6.jpg','12345');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;


--
-- Definition of table `exitvehicles`
--

DROP TABLE IF EXISTS `exitvehicles`;
CREATE TABLE `exitvehicles` (
  `transactionid` int(10) unsigned NOT NULL auto_increment,
  `vehicleid` int(10) unsigned NOT NULL,
  `exitdate` varchar(45) NOT NULL,
  `exittime` varchar(45) NOT NULL,
  `employeeid` varchar(45) NOT NULL,
  PRIMARY KEY  (`transactionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exitvehicles`
--

/*!40000 ALTER TABLE `exitvehicles` DISABLE KEYS */;
INSERT INTO `exitvehicles` (`transactionid`,`vehicleid`,`exitdate`,`exittime`,`employeeid`) VALUES 
 (1,5,'2018/10/4','9:23:6','4'),
 (2,6,'2018/10/17','18:15:41','4');
/*!40000 ALTER TABLE `exitvehicles` ENABLE KEYS */;


--
-- Definition of table `floors`
--

DROP TABLE IF EXISTS `floors`;
CREATE TABLE `floors` (
  `floorno` int(10) unsigned NOT NULL auto_increment,
  `floorname` varchar(45) NOT NULL,
  `totalspace` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`floorno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `floors`
--

/*!40000 ALTER TABLE `floors` DISABLE KEYS */;
INSERT INTO `floors` (`floorno`,`floorname`,`totalspace`) VALUES 
 (1,'B1',150),
 (2,'B2',150),
 (3,'B3',200);
/*!40000 ALTER TABLE `floors` ENABLE KEYS */;


--
-- Definition of table `rfid`
--

DROP TABLE IF EXISTS `rfid`;
CREATE TABLE `rfid` (
  `rfidno` varchar(45) NOT NULL,
  PRIMARY KEY  (`rfidno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rfid`
--

/*!40000 ALTER TABLE `rfid` DISABLE KEYS */;
INSERT INTO `rfid` (`rfidno`) VALUES 
 (''),
 ('19004B350265');
/*!40000 ALTER TABLE `rfid` ENABLE KEYS */;


--
-- Definition of table `states`
--

DROP TABLE IF EXISTS `states`;
CREATE TABLE `states` (
  `Stateid` int(10) unsigned NOT NULL auto_increment,
  `Statename` varchar(45) NOT NULL,
  PRIMARY KEY  (`Stateid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `states`
--

/*!40000 ALTER TABLE `states` DISABLE KEYS */;
INSERT INTO `states` (`Stateid`,`Statename`) VALUES 
 (1,'mp'),
 (2,'up');
/*!40000 ALTER TABLE `states` ENABLE KEYS */;


--
-- Definition of table `vehicles`
--

DROP TABLE IF EXISTS `vehicles`;
CREATE TABLE `vehicles` (
  `employeeid` int(10) unsigned NOT NULL,
  `vehicleid` int(10) unsigned NOT NULL auto_increment,
  `referenceid` varchar(45) NOT NULL,
  `mobileno` varchar(45) NOT NULL,
  `currentdate` date NOT NULL,
  `currenttime` time NOT NULL,
  `amount` int(10) unsigned NOT NULL,
  `time` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `floorno` int(10) unsigned NOT NULL,
  `registrationno` varchar(45) NOT NULL,
  PRIMARY KEY  (`vehicleid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicles`
--

/*!40000 ALTER TABLE `vehicles` DISABLE KEYS */;
INSERT INTO `vehicles` (`employeeid`,`vehicleid`,`referenceid`,`mobileno`,`currentdate`,`currenttime`,`amount`,`time`,`status`,`floorno`,`registrationno`) VALUES 
 (5,2,'123','7772902044','2018-01-01','00:00:00',30,'3','in',1,''),
 (5,3,'2323','7354520372','2018-10-05','06:10:00',30,'3','in',2,''),
 (1,4,'1','1','2018-10-10','11:11:00',30,'3','in',1,''),
 (4,5,'444','45345','2018-11-01','06:15:55',30,'3','out',1,''),
 (4,6,'19004B350265','44556677','2018-11-17','06:08:12',30,'3','out',1,'MP 07 CD 9999');
/*!40000 ALTER TABLE `vehicles` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
