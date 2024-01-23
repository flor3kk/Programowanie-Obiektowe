-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2023 at 05:39 PM
-- Wersja serwera: 10.4.32-MariaDB
-- Wersja PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cars`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `samochod`
--

CREATE TABLE `samochod` (
  `ID` int(11) NOT NULL,
  `MARKA` varchar(50) NOT NULL,
  `MODEL` text NOT NULL,
  `NADWOZIE` varchar(25) NOT NULL,
  `SILNIK` float NOT NULL,
  `KM` int(4) NOT NULL,
  `ROCZNIK` int(4) NOT NULL,
  `LICZNIK` int(11) NOT NULL,
  `CZY_WYPOZYCZONY` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `samochod`
--

INSERT INTO `samochod` (`ID`, `MARKA`, `MODEL`, `NADWOZIE`, `SILNIK`, `KM`, `ROCZNIK`, `LICZNIK`, `CZY_WYPOZYCZONY`) VALUES
(1, 'CHEVROLET', 'CRUZE', 'sedan', 2, 141, 2011, 143000, 1),
(2, 'AUDI', 'A5', 'KOMBI', 3, 255, 2017, 15000, 0),
(4, 'DODGE', 'DURANGO', 'VAN', 2.1, 190, 2015, 17400, 0),
(5, 'CITROEN', 'C3', 'COUPE', 1.4, 126, 2014, 74300, 0),
(6, 'dodge', 'challanger hellcat', 'sport', 3.6, 365, 2020, 15000, 0),
(7, 'koenigsegg', 'regera', 'hypercar', 4.8, 660, 2021, 20000, 1);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `samochod`
--
ALTER TABLE `samochod`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `samochod`
--
ALTER TABLE `samochod`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
