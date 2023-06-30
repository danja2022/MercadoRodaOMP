-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: retaguarda
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bairro`
--

DROP TABLE IF EXISTS `bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bairro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `classe`
--

DROP TABLE IF EXISTS `classe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classe` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `fone1` varchar(15) NOT NULL,
  `fone2` varchar(15) NOT NULL,
  `complementoEndereco` varchar(100) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `dataCadastro` date NOT NULL,
  `observacao` varchar(45) DEFAULT NULL,
  `status` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `cpf` varchar(14) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `rg` varchar(9) NOT NULL,
  `dataNascimento` date DEFAULT NULL,
  `endereco_id` int NOT NULL,
  `sexo` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cliente_endereco1_idx` (`endereco_id`),
  CONSTRAINT `fk_clientEndereco` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colaborador` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `fone1` varchar(15) NOT NULL,
  `fone2` varchar(15) NOT NULL,
  `complementoEndereco` varchar(100) NOT NULL,
  `email` varchar(45) NOT NULL,
  `dataCadastro` date NOT NULL,
  `observacao` varchar(45) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `login` varchar(40) DEFAULT NULL,
  `senha` varchar(10) NOT NULL,
  `endereco_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_colaborador_endereco1_idx` (`endereco_id`),
  CONSTRAINT `fk_colaboradorEndereco` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataCompra` date NOT NULL,
  `horaCompra` time NOT NULL,
  `numeroNF` varchar(45) NOT NULL,
  `tipoNF` varchar(45) NOT NULL,
  `valorDesconto` float NOT NULL,
  `valorAcrescimo` float NOT NULL,
  `totalNF` float NOT NULL,
  `status` char(1) NOT NULL,
  `fornecedor_id` int NOT NULL,
  `condicaoPagamento_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_compra_fornecedor1_idx` (`fornecedor_id`),
  KEY `fk_compra_condicaoPagamento1_idx` (`condicaoPagamento_id`),
  CONSTRAINT `fk_compra_condPagamento` FOREIGN KEY (`condicaoPagamento_id`) REFERENCES `condicaopagamento` (`id`),
  CONSTRAINT `fk_compraFornecedor` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `condicaopagamento`
--

DROP TABLE IF EXISTS `condicaopagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `condicaopagamento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricaoCondicao` varchar(45) NOT NULL,
  `numeroParcelas` int NOT NULL,
  `diaPrimeiraParcela` int DEFAULT NULL,
  `diaEntreParcela` int NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cupomfiscal`
--

DROP TABLE IF EXISTS `cupomfiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cupomfiscal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataVenda` date NOT NULL,
  `horaVenda` time NOT NULL,
  `valorDesconto` float NOT NULL,
  `valorAcrescimo` float NOT NULL,
  `totalCupom` float NOT NULL,
  `status` varchar(1) NOT NULL,
  `colaborador_id` int NOT NULL,
  `cliente_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cupomFiscal_colaborador1_idx` (`colaborador_id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `cupomfiscal_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `fk_cupomFiscalColaborador` FOREIGN KEY (`colaborador_id`) REFERENCES `colaborador` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id` int NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(100) NOT NULL,
  `cep` varchar(11) DEFAULT NULL,
  `bairro_id` int NOT NULL,
  `cidade_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_endereco_bairro_idx` (`bairro_id`),
  KEY `fk_endereco_cidade1_idx` (`cidade_id`),
  CONSTRAINT `fk_enderecoBairro` FOREIGN KEY (`bairro_id`) REFERENCES `bairro` (`id`),
  CONSTRAINT `fk_enderecoCidade` FOREIGN KEY (`cidade_id`) REFERENCES `cidade` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `fone1` varchar(15) NOT NULL,
  `fone2` varchar(15) NOT NULL,
  `complementoEndereco` varchar(100) NOT NULL,
  `email` varchar(45) NOT NULL,
  `dataCadastro` date NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `cnpj` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `inscEstadual` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `contato` varchar(45) NOT NULL,
  `razaoSocial` varchar(60) NOT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `rg` varchar(15) DEFAULT NULL,
  `endereco_id` int NOT NULL,
  `observacao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_fornecedor_endereco1_idx` (`endereco_id`),
  CONSTRAINT `fk_forneEndereco` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `historicomovimentacao`
--

DROP TABLE IF EXISTS `historicomovimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historicomovimentacao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  `tipo` char(1) NOT NULL,
  `quantidade` float NOT NULL,
  `status` char(1) NOT NULL,
  `itensCompra_id` int NOT NULL,
  `itemCupomFiscal_id` int DEFAULT NULL,
  `produto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_historicoMovimentacao_itensCompra1_idx` (`itensCompra_id`),
  KEY `itemCupomFiscal_id` (`itemCupomFiscal_id`),
  KEY `produto_id` (`produto_id`),
  CONSTRAINT `fk_historicoMovItensCompra` FOREIGN KEY (`itensCompra_id`) REFERENCES `itenscompra` (`id`),
  CONSTRAINT `historicomovimentacao_ibfk_1` FOREIGN KEY (`itemCupomFiscal_id`) REFERENCES `itenscupomfiscal` (`id`),
  CONSTRAINT `historicomovimentacao_ibfk_2` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `itenscompra`
--

DROP TABLE IF EXISTS `itenscompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itenscompra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quantidadeProduto` float NOT NULL,
  `valorUnitarioProduto` float NOT NULL,
  `status` char(1) NOT NULL,
  `compra_id` int NOT NULL,
  `produto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_itensCompra_compra1_idx` (`compra_id`),
  KEY `produto_id` (`produto_id`),
  CONSTRAINT `fk_itensCompraCompra` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`),
  CONSTRAINT `itensCompra_ibfk_1` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `itenscupomfiscal`
--

DROP TABLE IF EXISTS `itenscupomfiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itenscupomfiscal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quantidadeProduto` float NOT NULL,
  `valorUnitarioProduto` float NOT NULL,
  `status` char(1) NOT NULL,
  `cupomFiscal_id` int DEFAULT NULL,
  `produto_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cupomFiscal_id` (`cupomFiscal_id`),
  KEY `produto_id` (`produto_id`),
  CONSTRAINT `itensCupomFiscal_ibfk_1` FOREIGN KEY (`cupomFiscal_id`) REFERENCES `cupomfiscal` (`id`),
  CONSTRAINT `itensCupomFiscal_ibfk_2` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagamento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataPagamento` date NOT NULL,
  `horaPagamento` date NOT NULL,
  `valorDesconto` float NOT NULL,
  `valorAcrescimo` float NOT NULL,
  `valorPago` float NOT NULL,
  `status` char(1) NOT NULL,
  `Pagar_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Pagamento_Pagar1_idx` (`Pagar_id`),
  CONSTRAINT `fk_PagamentoPagar` FOREIGN KEY (`Pagar_id`) REFERENCES `pagar` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pagar`
--

DROP TABLE IF EXISTS `pagar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataEmissao` int NOT NULL,
  `horaEmissao` int NOT NULL,
  `dataVencimento` int NOT NULL,
  `valorPagar` int NOT NULL,
  `status` int NOT NULL,
  `compra_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Pagar_compra1_idx` (`compra_id`),
  CONSTRAINT `fk_PagarCompra` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(60) NOT NULL,
  `valorCompra` float NOT NULL,
  `valorVenda` float NOT NULL,
  `unidadeCompra` varchar(45) DEFAULT NULL,
  `unidadeVenda` varchar(45) DEFAULT NULL,
  `fatorConversao` int DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `barraEntrada` varchar(45) DEFAULT NULL,
  `barraSaida` varchar(45) DEFAULT NULL,
  `estoqueMinimo` float DEFAULT NULL,
  `estoqueMaximo` float DEFAULT NULL,
  `classe_id` int DEFAULT NULL,
  `marca_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `classe_id` (`classe_id`),
  KEY `marca_id` (`marca_id`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`classe_id`) REFERENCES `classe` (`id`),
  CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`marca_id`) REFERENCES `marca` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-29 21:46:51
