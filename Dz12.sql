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
-- Database: `Dz12`
--

-- --------------------------------------------------------

--
-- Table structure for table `smerovi`
--

CREATE TABLE `smerovi` (
  `id` int(11) NOT NULL,
  `naziv_smera` varchar(20) NOT NULL,
  `broj_espb_bodova` int(11) NOT NULL,
  `nivo_studija` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `smerovi`
--

INSERT INTO `smerovi` (`id`, `naziv_smera`, `broj_espb_bodova`, `nivo_studija`) VALUES
(1, 'SE', 240, 1),
(2, 'IT', 240, 1),
(3, 'RI', 240, 1);

-- --------------------------------------------------------

--
-- Table structure for table `studenti`
--

CREATE TABLE `studenti` (
  `br_indexa` int(11) NOT NULL,
  `id_smera` int(11) NOT NULL,
  `ime` varchar(15) NOT NULL,
  `prezime` varchar(20) NOT NULL,
  `broj_polozenih_espb` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenti`
--

INSERT INTO `studenti` (`br_indexa`, `id_smera`, `ime`, `prezime`, `broj_polozenih_espb`) VALUES
(2664, 1, 'Jovan', 'Jovanovic', 46),
(2929, 3, 'Marko', 'Markovic', 43),
(2934, 1, 'Nikola', 'Mitrovic', 10),
(2953, 2, 'Nikola', 'Nikolic', 50);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `smerovi`
--
ALTER TABLE `smerovi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studenti`
--
ALTER TABLE `studenti`
  ADD PRIMARY KEY (`br_indexa`),
  ADD KEY `id_smera` (`id_smera`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `smerovi`
--
ALTER TABLE `smerovi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `studenti`
--
ALTER TABLE `studenti`
  ADD CONSTRAINT `studenti_ibfk_1` FOREIGN KEY (`id_smera`) REFERENCES `smerovi` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
