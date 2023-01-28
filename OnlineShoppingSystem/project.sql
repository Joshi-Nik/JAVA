-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2022 at 07:28 AM
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
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbladmin`
--

CREATE TABLE `tbladmin` (
  `id` bigint(20) NOT NULL,
  `added_date` datetime NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbladmin`
--

INSERT INTO `tbladmin` (`id`, `added_date`, `email`, `password`, `name`) VALUES
(1, '2022-04-15 08:16:08', 'joshinikhil404@gmail.com', 'Nikhil@1408', 'Nik');

-- --------------------------------------------------------

--
-- Table structure for table `tblcart`
--

CREATE TABLE `tblcart` (
  `id` bigint(20) NOT NULL,
  `discount_price` varchar(200) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `total_price` varchar(200) DEFAULT NULL,
  `customer_id` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `mrp_price` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tblcustomer`
--

CREATE TABLE `tblcustomer` (
  `id` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `added_date` timestamp NULL DEFAULT current_timestamp(),
  `email` varchar(100) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `phone` varchar(200) NOT NULL,
  `pin_code` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblcustomer`
--

INSERT INTO `tblcustomer` (`id`, `address`, `added_date`, `email`, `gender`, `name`, `password`, `phone`, `pin_code`) VALUES
(5, 'patan', '2022-04-07 17:10:48', 'kunal@gmail.com', 'Male', 'kunal hinduja', '1234', '8140881182', '362268'),
(6, 'porbandar', '2022-04-13 06:24:20', 'satish2121@gmail.com', 'Male', 'satish', 'satish001', '9087889900', '344343'),
(7, 'Jamnagar', '2022-04-15 06:39:32', 'hitu1212@gmail.com', 'Female', 'hitakshi', 'hitu001', '9316444481', '363645');

-- --------------------------------------------------------

--
-- Table structure for table `tblorders`
--

CREATE TABLE `tblorders` (
  `id` int(11) NOT NULL,
  `order_no` int(11) DEFAULT NULL,
  `customer_name` varchar(200) DEFAULT NULL,
  `mobile_number` varchar(100) DEFAULT NULL,
  `email_id` varchar(100) DEFAULT NULL,
  `address` varchar(400) DEFAULT NULL,
  `address_type` varchar(100) DEFAULT NULL,
  `pincode` varchar(100) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL,
  `product_name` varchar(400) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `product_price` varchar(100) DEFAULT NULL,
  `product_selling_price` varchar(100) DEFAULT NULL,
  `product_total_price` varchar(100) DEFAULT NULL,
  `order_status` varchar(100) DEFAULT NULL,
  `order_date` timestamp NULL DEFAULT current_timestamp(),
  `payment_mode` varchar(100) DEFAULT NULL,
  `payment_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblorders`
--

INSERT INTO `tblorders` (`id`, `order_no`, `customer_name`, `mobile_number`, `email_id`, `address`, `address_type`, `pincode`, `image`, `product_name`, `quantity`, `product_price`, `product_selling_price`, `product_total_price`, `order_status`, `order_date`, `payment_mode`, `payment_id`) VALUES
(5, 1001, 'satish', '9087889900', 'satish2121@gmail.com', 'porbandar', 'Home', '344343', 'Ring.jpg', 'Ring', 1, '20000', '20000', '20000', 'Deliver', '2022-04-13 06:46:18', 'COD', 1),
(6, 1002, 'satish', '9087889900', 'satish2121@gmail.com', 'porbandar', 'Home', '344343', 'Ring.jpg', 'Ring', 1, '20000', '20000', '20000', 'Deliver', '2022-04-13 06:46:18', 'COD', 1),
(7, 1003, 'satish', '9087889900', 'satish2121@gmail.com', 'porbandar', 'Home', '344343', 'silver.jpg', 'silver', 1, '30000', '25000', '25000', 'Deliver', '2022-04-13 06:46:18', 'COD', 1),
(8, 2004, 'satish', '9087889900', 'satish2121@gmail.com', 'porbandar', 'Home', '344343', 'kundan.jpg', 'kundan', 1, '40000', '35000', '35000.0', 'Pending', '2022-04-15 06:36:53', 'COD', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tblproduct`
--

CREATE TABLE `tblproduct` (
  `id` bigint(20) NOT NULL,
  `active` varchar(100) DEFAULT NULL,
  `code` varchar(5) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `description` varchar(255) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `image_name` varchar(400) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `price` varchar(200) DEFAULT NULL,
  `mrp_price` varchar(200) DEFAULT NULL,
  `product_category` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblproduct`
--

INSERT INTO `tblproduct` (`id`, `active`, `code`, `create_date`, `description`, `image`, `image_name`, `name`, `price`, `mrp_price`, `product_category`) VALUES
(1, 'Active', 'A3S', '2022-04-13 03:12:45', 'Gold', 'C:UsersharshDesktopOnlineShoppingSystemwebimagesgg.jpg', 'gg.jpg', 'Gold', '40500', '45000', 'Female'),
(2, 'Active', 'B9S', '2022-04-07 17:12:05', 'ring', 'C:UsersJUGALDownloadsonline-shopping-system-java-codeOnlineShoppingSystemwebuploadsRing.jpg', 'Ring.jpg', 'Ring', '20000', '20000', 'female'),
(5, 'Active', 'EWY', '2022-04-13 06:33:20', 'silver', 'C:UsersharshDesktopOnlineShoppingSystemwebuploadssilver.jpg', 'silver.jpg', 'silver', '25000', '30000', 'female'),
(6, 'Active', 'NPG', '2022-04-15 06:35:28', 'kundan ', 'C:UsersharshDesktopOnlineShoppingSystemwebuploadskundan.jpg', 'kundan.jpg', 'kundan', '35000', '40000', 'female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbladmin`
--
ALTER TABLE `tbladmin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblcart`
--
ALTER TABLE `tblcart`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblcustomer`
--
ALTER TABLE `tblcustomer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblorders`
--
ALTER TABLE `tblorders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblproduct`
--
ALTER TABLE `tblproduct`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbladmin`
--
ALTER TABLE `tbladmin`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tblcart`
--
ALTER TABLE `tblcart`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tblcustomer`
--
ALTER TABLE `tblcustomer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tblorders`
--
ALTER TABLE `tblorders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tblproduct`
--
ALTER TABLE `tblproduct`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
