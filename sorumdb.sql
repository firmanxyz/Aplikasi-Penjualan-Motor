-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2022 at 09:57 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sorumdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `motordb`
--

CREATE TABLE `motordb` (
  `idmotor` varchar(50) NOT NULL,
  `merek` varchar(50) NOT NULL,
  `tipe` varchar(50) NOT NULL,
  `warna` varchar(50) NOT NULL,
  `kapasitas` varchar(50) NOT NULL,
  `harga` varchar(50) NOT NULL,
  `tersedia` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `motordb`
--

INSERT INTO `motordb` (`idmotor`, `merek`, `tipe`, `warna`, `kapasitas`, `harga`, `tersedia`) VALUES
('1', 'Honda Beats', 'Matic', 'Biru', '120cc', '12.000.000', 'Terjual'),
('2', 'Suzuki', 'Matic', 'Putih', '160cc', '51.000.000', 'Terjual'),
('3', 'Yamaha', 'Matic', 'Merah', '155cc', '30.000.000', 'Terjual'),
('5', 'mio', 'matic', 'hijau', '100cc', '9.000.000', 'Terjual');

-- --------------------------------------------------------

--
-- Table structure for table `transaksidb`
--

CREATE TABLE `transaksidb` (
  `idmotor` varchar(50) NOT NULL,
  `total_harga` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nomor_hp` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `status_pembayaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksidb`
--

INSERT INTO `transaksidb` (`idmotor`, `total_harga`, `nama`, `nomor_hp`, `alamat`, `status_pembayaran`) VALUES
('1', '12.000.000', 'Malik', '087855252440', 'Bekasi', 'Cash'),
('2', '51.000.000', 'Firman', '087812345678', 'Bekasi', 'Kredit'),
('3', '30.000.000', 'Ferdi', '087823456789', 'Jakarta', 'Cash');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `motordb`
--
ALTER TABLE `motordb`
  ADD PRIMARY KEY (`idmotor`);

--
-- Indexes for table `transaksidb`
--
ALTER TABLE `transaksidb`
  ADD PRIMARY KEY (`idmotor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
