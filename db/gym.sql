-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 11, 2023 at 11:29 AM
-- Server version: 8.0.30
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gym`
--

-- --------------------------------------------------------

--
-- Table structure for table `absensi`
--

CREATE TABLE `absensi` (
  `id_presensi` varchar(50) NOT NULL,
  `id_member` int NOT NULL,
  `hari_masuk` enum('Senin','Selasa','Rabu','Kamis','Jumat','Sabtu','Minggu') NOT NULL,
  `jam_masuk` varchar(50) NOT NULL,
  `tgl_masuk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `absensi`
--

INSERT INTO `absensi` (`id_presensi`, `id_member`, `hari_masuk`, `jam_masuk`, `tgl_masuk`) VALUES
('PRE001', 1, 'Senin', '08:00', '2022-01-03'),
('PRE002', 2, 'Selasa', '09:30', '2022-01-04'),
('PRE003', 3, 'Rabu', '10:45', '2022-01-05'),
('PRE004', 4, 'Kamis', '11:15', '2022-01-06'),
('PRE005', 5, 'Jumat', '08:30', '2022-01-07'),
('PRE006', 6, 'Senin', '09:15', '2022-01-10'),
('PRE007', 7, 'Selasa', '08:45', '2022-01-11'),
('PRE008', 8, 'Rabu', '10:00', '2022-01-12'),
('PRE009', 9, 'Kamis', '11:30', '2022-01-13'),
('PRE010', 10, 'Jumat', '09:00', '2022-01-14');

-- --------------------------------------------------------

--
-- Table structure for table `alat_gym`
--

CREATE TABLE `alat_gym` (
  `kode_alat_gym` varchar(10) NOT NULL,
  `nama_alat` varchar(70) NOT NULL,
  `jenis_alat` varchar(70) NOT NULL,
  `kegunaan` varchar(70) NOT NULL,
  `harga_beli` int NOT NULL,
  `stok` int NOT NULL,
  `tgl_beli` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `alat_gym`
--

INSERT INTO `alat_gym` (`kode_alat_gym`, `nama_alat`, `jenis_alat`, `kegunaan`, `harga_beli`, `stok`, `tgl_beli`) VALUES
('ALT001', 'Treadmill Elektrik', 'Cardio', 'Melakukan latihan lari dan jalan di tempat', 5000000, 5, '2022-01-01'),
('ALT002', 'Dumbbell Set 10kg', 'Angkat Beban', 'Melakukan latihan angkat beban', 1000000, 10, '2022-02-15'),
('ALT003', 'Bench Press', 'Angkat Beban', 'Melakukan latihan angkat beban untuk dada dan trisep', 2000000, 3, '2022-03-10'),
('ALT004', 'Stationary Bike', 'Cardio', 'Melakukan latihan sepeda diam di tempat', 3000000, 7, '2022-04-20'),
('ALT005', 'Leg Press Machine', 'Angkat Beban', 'Melakukan latihan angkat beban untuk kaki', 4000000, 4, '2022-05-05'),
('ALT006', 'Elliptical Trainer', 'Cardio', 'Melakukan latihan elips untuk seluruh tubuh', 4500000, 6, '2022-06-25'),
('ALT007', 'Cable Crossover', 'Angkat Beban', 'Melakukan latihan angkat beban untuk otot dada dan bahu', 3500000, 5, '2022-07-12'),
('ALT008', 'Rowing Machine', 'Cardio', 'Melakukan latihan dayung untuk seluruh tubuh', 4000000, 3, '2022-08-08'),
('ALT009', 'Pull-Up Bar', 'Angkat Beban', 'Melakukan latihan pull-up untuk otot punggung dan lengan', 500000, 8, '2022-09-18'),
('ALT010', 'Stepper Machine', 'Cardio', 'Melakukan latihan langkah naik untuk kardio', 2500000, 2, '2022-10-30');

-- --------------------------------------------------------

--
-- Table structure for table `instruktur`
--

CREATE TABLE `instruktur` (
  `id_instruktur` varchar(30) NOT NULL,
  `nama_instruktur` varchar(50) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `bidang` varchar(50) NOT NULL,
  `email` varchar(70) NOT NULL,
  `tanggal_join` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `instruktur`
--

INSERT INTO `instruktur` (`id_instruktur`, `nama_instruktur`, `no_telp`, `jenis_kelamin`, `bidang`, `email`, `tanggal_join`) VALUES
('INS0263009', 'Maya Sari', '090123456789', 'Perempuan', 'Pilates', 'mayasari@example.com', '2022-10-30'),
('INS0443772', 'Agus Pratama', '083456789012', 'Laki-laki', 'Pilates', 'aguspratama@example.com', '2022-03-10'),
('INS0515434', 'Dewi Wulandari', '084567890123', 'Perempuan', 'Zumba', 'dewiwulandari@example.com', '2022-04-20'),
('INS1245852', 'Joko Purnomo', '085678901234', 'Laki-laki', 'Boxing', 'jokopurnomo@example.com', '2022-05-05'),
('INS2655012', 'Anton Nugroho', '089012345678', 'Laki-laki', 'Martial Arts', 'antonugroho@example.com', '2022-09-18'),
('INS4337350', 'Wulan Kusuma', '088901234567', 'Perempuan', 'Cycling', 'wulankusuma@example.com', '2022-08-08'),
('INS4682960', 'Linda Setiawan', '086789012345', 'Perempuan', 'Dance', 'lindasetiawan@example.com', '2022-06-25'),
('INS7234475', 'Siti Rahayu', '082345678901', 'Perempuan', 'Yoga', 'sitirahayu@example.com', '2022-02-15'),
('INS8576201', 'Budi Santoso', '081234567890', 'Laki-laki', 'Fitness', 'budisantoso@example.com', '2022-01-01'),
('INS9677246', 'Rudi Hartono', '087890123456', 'Laki-laki', 'Swimming', 'rudihartono@example.com', '2022-07-12');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` int NOT NULL,
  `nama_karyawan` varchar(80) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `jabatan` varchar(60) NOT NULL,
  `email` varchar(70) NOT NULL,
  `tgl_bekerja` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `no_telp`, `jenis_kelamin`, `jabatan`, `email`, `tgl_bekerja`) VALUES
(1, 'Andi Wijaya', '081234567890', 'Laki-laki', 'Manager', 'andi.wijaya@example.com', '2022-01-01'),
(2, 'Rina Dewi', '082345678901', 'Perempuan', 'Supervisor', 'rina.dewi@example.com', '2022-02-15'),
(3, 'Budi Susanto', '083456789012', 'Laki-laki', 'Staff', 'budi.susanto@example.com', '2022-03-10'),
(4, 'Siti Rahayu', '084567890123', 'Perempuan', 'Staff', 'siti.rahayu@example.com', '2022-04-20'),
(5, 'aep', '0822', 'Laki-laki', 'Kasir', 'aep@gmail.com', '2023-06-06'),
(6, 'Linda Setiawan', '086789012345', 'Perempuan', 'Staff', 'linda.setiawan@example.com', '2022-06-25'),
(7, 'Rudi Hartono', '087890123456', 'Laki-laki', 'Staff', 'rudi.hartono@example.com', '2022-07-12'),
(8, 'Wulan Kusuma', '088901234567', 'Perempuan', 'Manager', 'wulan.kusuma@example.com', '2022-08-08'),
(9, 'Anton Nugroho', '089012345678', 'Laki-laki', 'Staff', 'anton.nugroho@example.com', '2022-09-18'),
(10, 'Maya Sari', '090123456789', 'Perempuan', 'Supervisor', 'maya.sari@example.com', '2022-10-30'),
(11, 'Joko Pratama', '085678901234', 'Laki-laki', 'Supervisor', 'joko.pratama@example.com', '2022-05-05');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` int NOT NULL,
  `nama_member` varchar(100) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `jenis_member` enum('Silver','Gold','Platinum') NOT NULL,
  `tgl_daftar` date NOT NULL,
  `habis_member` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `no_telp`, `jenis_kelamin`, `jenis_member`, `tgl_daftar`, `habis_member`) VALUES
(1, 'John Doe', '081234567890', 'Laki-laki', 'Silver', '2022-01-01', '2022-12-31'),
(2, 'Jane Smith', '082345678901', 'Perempuan', 'Gold', '2022-02-15', '2023-02-14'),
(3, 'David Johnson', '083456789012', 'Laki-laki', 'Platinum', '2022-03-10', '2023-03-09'),
(4, 'Emily Brown', '084567890123', 'Perempuan', 'Silver', '2022-04-20', '2023-04-19'),
(5, 'aep', '0822', 'Laki-laki', 'Silver', '2023-06-02', '2023-07-03'),
(6, 'Sophia Anderson', '086789012345', 'Perempuan', 'Platinum', '2022-06-25', '2023-06-24'),
(7, 'Matthew Martinez', '087890123456', 'Laki-laki', 'Silver', '2022-07-12', '2023-07-11'),
(8, 'Olivia Taylor', '088901234567', 'Perempuan', 'Gold', '2022-08-08', '2023-08-07'),
(9, 'Daniel Thomas', '089012345678', 'Laki-laki', 'Platinum', '2022-09-18', '2023-09-17'),
(10, 'Michael Wilson', '085678901234', 'Laki-laki', 'Gold', '2022-05-05', '2023-05-04'),
(11, 'Ava Lee', '090123456789', 'Perempuan', 'Silver', '2022-10-30', '2023-10-29');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_transaksi` varchar(50) NOT NULL,
  `id_member` int NOT NULL,
  `biaya_admin` int NOT NULL,
  `biaya_bulanan` int NOT NULL,
  `total_biaya` int NOT NULL,
  `cash` int NOT NULL,
  `kembalian` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_transaksi`, `id_member`, `biaya_admin`, `biaya_bulanan`, `total_biaya`, `cash`, `kembalian`) VALUES
('INV001', 1, 5000, 100000, 105000, 110000, 5000),
('INV002', 2, 5000, 150000, 155000, 160000, 5000),
('INV003', 3, 5000, 200000, 205000, 210000, 5000),
('INV004', 4, 5000, 250000, 255000, 260000, 5000),
('INV005', 5, 5000, 300000, 305000, 310000, 5000),
('INV006', 6, 5000, 350000, 355000, 360000, 5000),
('INV007', 7, 5000, 400000, 405000, 410000, 5000),
('INV008', 8, 5000, 450000, 455000, 460000, 5000),
('INV009', 9, 5000, 500000, 505000, 510000, 5000),
('INV010', 10, 5000, 550000, 555000, 560000, 5000),
('INV011', 11, 5000, 600000, 605000, 610000, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `pemilihan`
--

CREATE TABLE `pemilihan` (
  `id_pemilihan` varchar(100) NOT NULL,
  `id_instruktur` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_member` int NOT NULL,
  `bidang` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('aep', 'aep');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absensi`
--
ALTER TABLE `absensi`
  ADD PRIMARY KEY (`id_presensi`);

--
-- Indexes for table `alat_gym`
--
ALTER TABLE `alat_gym`
  ADD PRIMARY KEY (`kode_alat_gym`);

--
-- Indexes for table `instruktur`
--
ALTER TABLE `instruktur`
  ADD PRIMARY KEY (`id_instruktur`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `pemilihan`
--
ALTER TABLE `pemilihan`
  ADD PRIMARY KEY (`id_pemilihan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id_karyawan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id_member` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
