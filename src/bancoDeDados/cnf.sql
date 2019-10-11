-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Out-2019 às 15:51
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cnf`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `codigo_disciplina` int(11) NOT NULL,
  `nome_disciplina` varchar(100) NOT NULL,
  `carga_horaria_disciplina` int(11) NOT NULL,
  `fk_codigo_faculdade` int(11) NOT NULL,
  `status_disciplina` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`codigo_disciplina`, `nome_disciplina`, `carga_horaria_disciplina`, `fk_codigo_faculdade`, `status_disciplina`) VALUES
(1, 'Estrutura de dados', 80, 5, 0),
(2, 'Estatistica', 60, 2, 1),
(3, 'Redes Neurais', 65, 4, 0),
(4, 'teste', 60, 3, 1),
(5, 'Matematica basica', 60, 8, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `faculdade`
--

CREATE TABLE `faculdade` (
  `codigo_faculdade` int(11) NOT NULL,
  `nome_faculdade` varchar(500) NOT NULL,
  `status_faculdade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `faculdade`
--

INSERT INTO `faculdade` (`codigo_faculdade`, `nome_faculdade`, `status_faculdade`) VALUES
(1, 'Universidade de Rio Verde(Uni Rv)', 1),
(2, 'Universidade Federal Uberaba', 0),
(3, 'Instituto Federal Goiano (IFG)', 0),
(4, 'Universidade de Brasilia (UNB)', 0),
(5, 'ITA', 1),
(6, 'Instituto Federal do Acre (Ifac)', 0),
(7, 'União Educacional do Norte (Uninorte)', 0),
(8, 'Faculdade Diocesana São José (Fadisi)', 0),
(9, 'Faculdade da Amazônia Ocidental (Faao)', 0),
(10, 'Faculdade Meta (Fameta)', 0),
(11, 'Faculdade Brasil Norte (FABRAN)', 0),
(12, 'Universidade Luterana do Brasil (ULBRA)', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `codigo_professor` int(11) NOT NULL,
  `nome_professor` varchar(200) NOT NULL,
  `cpf_professor` varchar(11) NOT NULL,
  `status_professor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`codigo_professor`, `nome_professor`, `cpf_professor`, `status_professor`) VALUES
(1, 'Joao Paraibaababa', '0295246101', 0),
(2, 'walter alves rezende', '9999999999', 1),
(3, 'jerferson guedes', '32432423', 1),
(4, 'jhonson do xesque', '45475754', 1),
(5, 'jaoao da cocada', '434734', 1),
(6, 'Clarissa Xavier', '7454554578', 0),
(7, 'vanessa Xavier', '4655456465', 0),
(8, 'Vanessa Marques', '489446545', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `codigo_usuario` int(11) NOT NULL,
  `status_usuario` int(11) NOT NULL,
  `senha_usuario` varchar(15) NOT NULL,
  `email_usuario` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo_usuario`, `status_usuario`, `senha_usuario`, `email_usuario`) VALUES
(1, 0, 'root', 'root@gmail.com'),
(2, 0, 'matanza10', 'walteralves27@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`codigo_disciplina`);

--
-- Indexes for table `faculdade`
--
ALTER TABLE `faculdade`
  ADD PRIMARY KEY (`codigo_faculdade`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`codigo_professor`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `disciplina`
--
ALTER TABLE `disciplina`
  MODIFY `codigo_disciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `faculdade`
--
ALTER TABLE `faculdade`
  MODIFY `codigo_faculdade` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `professor`
--
ALTER TABLE `professor`
  MODIFY `codigo_professor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
