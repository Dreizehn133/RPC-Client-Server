-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Des 2018 pada 16.16
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `becek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `baper`
--

CREATE TABLE `baper` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `stb` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `baper`
--

INSERT INTO `baper` (`id`, `nama`, `stb`, `status`) VALUES
(1, 'aaaa', 'aaaaaaa', 'aaaaaaaaaaaaa'),
(2, 'bbqqqqq', 'bbbbbb', 'bbbbbbbbbb'),
(5, 'www', 'wwwww', 'wwwwwwww');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `baper`
--
ALTER TABLE `baper`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `baper`
--
ALTER TABLE `baper`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
