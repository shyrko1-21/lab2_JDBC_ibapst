-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               8.0.28 - MySQL Community Server - GPL
-- Операционная система:         Win64
-- HeidiSQL Версия:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Дамп структуры базы данных ibapst
CREATE DATABASE IF NOT EXISTS `ibapst` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ibapst`;

-- Дамп структуры для таблица ibapst.exam
CREATE TABLE IF NOT EXISTS `exam` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `subject` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `teacher` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Дамп данных таблицы ibapst.exam: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` (`id`, `subject`, `teacher`, `date`) VALUES
	(1, 'Math', 'Ivanov', '2000-05-05'),
	(2, 'Prog', 'Ivanov', '2000-05-10'),
	(3, 'OBJ', 'Petrov', '2000-05-15');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;

-- Дамп структуры для таблица ibapst.student
CREATE TABLE IF NOT EXISTS `student` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `address` varchar(80) DEFAULT NULL,
  `mobile_no` varchar(12) DEFAULT NULL,
  `email_id` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `designation` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `add_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile_no` (`mobile_no`),
  UNIQUE KEY `email_id` (`email_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Дамп данных таблицы ibapst.student: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `fname`, `lname`, `address`, `mobile_no`, `email_id`, `city`, `designation`, `dob`, `doj`, `salary`, `add_date`) VALUES
	(1, 'qwe', 'qw', 'q', 'qwer', 'w', 'e', 'r', '2022-01-29', '2022-01-29', 123.00, '2022-01-29 11:38:14'),
	(3, 'z', 'x', 'c', 'v', 'b', 'n', 'm', '2021-12-14', '2022-01-15', 12234.00, '2022-01-29 13:04:57'),
	(4, 't', 'y', 'u', 'i', 'o', 'p', '[', '2021-12-25', '2022-01-15', 200.00, '2022-01-30 10:16:29'),
	(5, 'Alex', 'Bolduin', 'NY', '3222332', 'qq', 'NY', 'actor', '1980-02-01', '2000-05-05', 1000.00, '2022-02-07 21:19:44');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
