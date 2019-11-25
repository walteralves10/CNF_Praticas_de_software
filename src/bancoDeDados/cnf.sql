-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 26-Nov-2019 às 00:29
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.1

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
  `status_disciplina` int(11) NOT NULL,
  `ultimaAtualizacao` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`codigo_disciplina`, `nome_disciplina`, `carga_horaria_disciplina`, `fk_codigo_faculdade`, `status_disciplina`, `ultimaAtualizacao`) VALUES
(1, 'Estrutura de dados', 80, 5, 0, '2019-11-03'),
(2, 'Matematica', 60, 2, 1, '2019-11-03'),
(3, 'persistencia', 70, 4, 1, '2019-11-03'),
(4, 'estrutura 2', 75, 4, 0, '2019-11-03'),
(5, 'estatistica', 80, 4, 0, '2019-11-03'),
(6, 'etica e moral - filosofia', 40, 2, 1, '2019-11-05'),
(7, 'pratica de todos os santos', 60, 7, 0, '2019-11-11'),
(8, 'testando disc', 10, 4, 0, '2019-11-07'),
(9, 'dale disc', 600, 6, 0, '2019-11-11');

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
(1, '-', 0),
(2, 'Universidade Federal Uberaba', 1),
(3, 'IF Goiano', 1),
(4, 'Guedes LTDA', 0),
(5, 'Oxford USA', 0),
(6, 'Universidade de Rio Verde(Uni Rv)', 0),
(7, 'ufggg joao matheus', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `codigo_professor` int(11) NOT NULL,
  `nome_professor` varchar(200) NOT NULL,
  `cpf_professor` varchar(15) NOT NULL,
  `status_professor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`codigo_professor`, `nome_professor`, `cpf_professor`, `status_professor`) VALUES
(1, 'Joao Paraibaababa', '02935246101', 0),
(2, 'walter alves rezende', '999999999', 0),
(3, 'jerferson gay', '32432423', 0),
(4, 'jhonson do xesque', '45475754', 1),
(5, 'jaoao da cocada', '434734', 1),
(6, 'livia ataide', '1111111111', 0),
(7, 'teste', '   .   .   -  ', 0),
(8, 'teste2', '029.352.461-01', 0),
(9, 'joao pe de serra', '111.111.111-11', 0);

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
(2, 0, 'lol', 'lol@gmail.com');

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
  MODIFY `codigo_disciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `faculdade`
--
ALTER TABLE `faculdade`
  MODIFY `codigo_faculdade` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `professor`
--
ALTER TABLE `professor`
  MODIFY `codigo_professor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
