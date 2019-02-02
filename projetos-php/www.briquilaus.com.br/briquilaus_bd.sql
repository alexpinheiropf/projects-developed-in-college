-- phpMyAdmin SQL Dump
-- version 4.2.10
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 26-Out-2015 às 21:09
-- Versão do servidor: 5.5.39
-- PHP Version: 5.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `briquilaus_bd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente_cad`
--

CREATE TABLE IF NOT EXISTS `cliente_cad` (
`codigo` bigint(20) unsigned NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente_cad`
--

INSERT INTO `cliente_cad` (`codigo`, `nome`, `email`) VALUES
(4, 'Brizola', 'tiobriza@gmail.com'),
(5, 'Marcos Santos', 'marcos1003@hotmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto_cad`
--

CREATE TABLE IF NOT EXISTS `produto_cad` (
`codigo` bigint(20) unsigned NOT NULL,
  `produto` varchar(100) NOT NULL,
  `unidademedida` varchar(3) NOT NULL,
  `valor` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario_cad`
--

CREATE TABLE IF NOT EXISTS `usuario_cad` (
`codigo` bigint(20) unsigned NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario_cad`
--

INSERT INTO `usuario_cad` (`codigo`, `usuario`, `senha`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda_cad`
--

CREATE TABLE IF NOT EXISTS `venda_cad` (
`codigo` bigint(20) unsigned NOT NULL,
  `codigocliente` int(11) NOT NULL,
  `codigoproduto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente_cad`
--
ALTER TABLE `cliente_cad`
 ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indexes for table `produto_cad`
--
ALTER TABLE `produto_cad`
 ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indexes for table `usuario_cad`
--
ALTER TABLE `usuario_cad`
 ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indexes for table `venda_cad`
--
ALTER TABLE `venda_cad`
 ADD PRIMARY KEY (`codigo`), ADD UNIQUE KEY `codigo` (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente_cad`
--
ALTER TABLE `cliente_cad`
MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `produto_cad`
--
ALTER TABLE `produto_cad`
MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario_cad`
--
ALTER TABLE `usuario_cad`
MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `venda_cad`
--
ALTER TABLE `venda_cad`
MODIFY `codigo` bigint(20) unsigned NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
