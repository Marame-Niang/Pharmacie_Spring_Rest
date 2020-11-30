-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : lun. 30 nov. 2020 à 23:25
-- Version du serveur :  10.4.13-MariaDB
-- Version de PHP : 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `TDSpringRest`
--

-- --------------------------------------------------------

--
-- Structure de la table `pharma`
--

CREATE TABLE `pharma` (
  `id` int(11) NOT NULL,
  `etat` int(11) DEFAULT NULL,
  `nom` varchar(200) DEFAULT NULL,
  `quartier` varchar(200) DEFAULT NULL,
  `ville` varchar(200) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `pharma`
--

INSERT INTO `pharma` (`id`, `etat`, `nom`, `quartier`, `ville`) VALUES
(1, 1, 'sante', 'Santhiaba', 'Thies'),
(3, 0, 'Lala', 'liberte', 'Dakar'),
(4, 1, 'Sante Yalla', 'Mbao', 'Pikine');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `pharma`
--
ALTER TABLE `pharma`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `pharma`
--
ALTER TABLE `pharma`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
