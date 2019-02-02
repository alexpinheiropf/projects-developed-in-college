-- phpMyAdmin SQL Dump
-- version 4.2.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 22-Nov-2015 às 23:17
-- Versão do servidor: 5.6.21-log
-- PHP Version: 5.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `coca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `etiqueta_cad`
--

CREATE TABLE IF NOT EXISTS `etiqueta_cad` (
`codigo` bigint(20) unsigned NOT NULL,
  `etiqueta_cod` int(6) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `etiqueta_cad`
--

INSERT INTO `etiqueta_cad` (`codigo`, `etiqueta_cod`) VALUES
(5, 654321),
(7, 123123),
(9, 789789),
(10, 123456);

-- --------------------------------------------------------

--
-- Estrutura da tabela `participante_cad`
--

CREATE TABLE IF NOT EXISTS `participante_cad` (
`codigo` bigint(20) unsigned NOT NULL,
  `nome` varchar(100) CHARACTER SET armscii8 NOT NULL,
  `fone` int(12) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `participante_cad`
--

INSERT INTO `participante_cad` (`codigo`, `nome`, `fone`) VALUES
(1, 'alex', 33111309),
(2, 'aelx', 33111309);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `etiqueta_cad`
--
ALTER TABLE `etiqueta_cad`
 ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indexes for table `participante_cad`
--
ALTER TABLE `participante_cad`
 ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `etiqueta_cad`
--
ALTER TABLE `etiqueta_cad`
MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `participante_cad`
--
ALTER TABLE `participante_cad`
MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
