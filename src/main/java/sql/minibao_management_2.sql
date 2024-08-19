-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th8 16, 2024 lúc 12:16 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `minibao_management_2`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `import`
--

CREATE TABLE `import` (
  `import_id` char(10) NOT NULL,
  `create_time` date NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `import_detail`
--

CREATE TABLE `import_detail` (
  `import_id` char(10) NOT NULL,
  `product_id` char(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `uni_price` int(11) NOT NULL,
  `sub_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `product_id` char(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `quantity` int(11) NOT NULL,
  `uni_price` int(11) NOT NULL,
  `information` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `promotion`
--

CREATE TABLE `promotion` (
  `promotion_id` char(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `start_day` date NOT NULL,
  `end_day` date NOT NULL,
  `promotion_percent` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `recept`
--

CREATE TABLE `recept` (
  `recept_id` char(10) NOT NULL,
  `sub_total` int(11) NOT NULL,
  `promotion_id` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `recept_detail`
--

CREATE TABLE `recept_detail` (
  `recept_id` char(10) NOT NULL,
  `product_id` char(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `sub_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `import`
--
ALTER TABLE `import`
  ADD PRIMARY KEY (`import_id`);

--
-- Chỉ mục cho bảng `import_detail`
--
ALTER TABLE `import_detail`
  ADD PRIMARY KEY (`import_id`,`product_id`),
  ADD KEY `fk_importdetal_product` (`product_id`);

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);

--
-- Chỉ mục cho bảng `promotion`
--
ALTER TABLE `promotion`
  ADD PRIMARY KEY (`promotion_id`);

--
-- Chỉ mục cho bảng `recept`
--
ALTER TABLE `recept`
  ADD PRIMARY KEY (`recept_id`),
  ADD KEY `fk_recept_promotion` (`promotion_id`);

--
-- Chỉ mục cho bảng `recept_detail`
--
ALTER TABLE `recept_detail`
  ADD PRIMARY KEY (`recept_id`,`product_id`),
  ADD KEY `fk_recept_detail_product` (`product_id`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `import_detail`
--
ALTER TABLE `import_detail`
  ADD CONSTRAINT `fk_importdetal_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`);

--
-- Các ràng buộc cho bảng `recept`
--
ALTER TABLE `recept`
  ADD CONSTRAINT `fk_recept_promotion` FOREIGN KEY (`promotion_id`) REFERENCES `promotion` (`promotion_id`);

--
-- Các ràng buộc cho bảng `recept_detail`
--
ALTER TABLE `recept_detail`
  ADD CONSTRAINT `fk_recept_detail_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
