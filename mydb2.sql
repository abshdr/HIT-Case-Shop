-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.9-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for hitcaseshop
DROP DATABASE IF EXISTS `hitcaseshop`;
CREATE DATABASE IF NOT EXISTS `hitcaseshop` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `hitcaseshop`;

-- Dumping structure for table hitcaseshop.brand
DROP TABLE IF EXISTS `brand`;
CREATE TABLE IF NOT EXISTS `brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `logo` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Dumping data for table hitcaseshop.brand: ~3 rows (approximately)
DELETE FROM `brand`;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` (`id`, `name`, `logo`) VALUES
	(1, 'apple', ''),
	(8, 'Samsung', ''),
	(9, 'LG', '');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;

-- Dumping structure for table hitcaseshop.case
DROP TABLE IF EXISTS `case`;
CREATE TABLE IF NOT EXISTS `case` (
  `id` int(11) NOT NULL,
  `manufacturer` varchar(50) NOT NULL,
  `model_name` varchar(50) NOT NULL,
  `dimensions` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table hitcaseshop.case: ~5 rows (approximately)
DELETE FROM `case`;
/*!40000 ALTER TABLE `case` DISABLE KEYS */;
INSERT INTO `case` (`id`, `manufacturer`, `model_name`, `dimensions`) VALUES
	(18, 'nudient for iphone 6', 'iphone 6', '150 mm'),
	(19, 'nudient for iphone 7', 'iphone 7', '150 mm'),
	(20, 'nudient for iphone 8', 'iphone 8', '150 mm'),
	(21, 'hugoboss for iphone 12', 'iphone 12', '170 mm'),
	(22, 'Abbas case for iphone 13', 'iphone 13', '170 mm');
/*!40000 ALTER TABLE `case` ENABLE KEYS */;

-- Dumping structure for table hitcaseshop.model
DROP TABLE IF EXISTS `model`;
CREATE TABLE IF NOT EXISTS `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  `brand_id` int(11) NOT NULL DEFAULT 0,
  `img` varchar(50) DEFAULT '0',
  `height` varchar(50) DEFAULT '0',
  `width` varchar(50) DEFAULT '0',
  `dimensions` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table hitcaseshop.model: ~1 rows (approximately)
DELETE FROM `model`;
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` (`id`, `name`, `brand_id`, `img`, `height`, `width`, `dimensions`) VALUES
	(1, 'iphone 6', 1, NULL, '150 cm', '70 cm', '120 cm');
/*!40000 ALTER TABLE `model` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
