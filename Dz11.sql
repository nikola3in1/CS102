-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 03, 2017 at 12:00 AM
-- Server version: 5.7.18-0ubuntu0.16.04.1
-- PHP Version: 7.0.19-1+deb.sury.org~xenial+2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Dz11`
--

-- --------------------------------------------------------

--
-- Table structure for table `Restoran`
--

CREATE TABLE `Restoran` (
  `naziv` varchar(30) NOT NULL,
  `broj_telefona` varchar(11) NOT NULL,
  `radno_vreme` varchar(20) NOT NULL,
  `lokacija` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Restoran`
--

INSERT INTO `Restoran` (`naziv`, `broj_telefona`, `radno_vreme`, `lokacija`) VALUES
('Ciao', 'Ciao', 'a', '12314');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
