-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2018 at 06:21 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sih`
--

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `QID` int(11) NOT NULL,
  `QUESTION` text NOT NULL,
  `DESCRIPTION` text NOT NULL,
  `FORMAT` text NOT NULL,
  `TID` int(11) NOT NULL,
  `REQUIRED` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`QID`, `QUESTION`, `DESCRIPTION`, `FORMAT`, `TID`, `REQUIRED`) VALUES
(27, 'What is your gender', 'asking for gender', 'Radio Button', 5, 1),
(29, 'what is the name of the patient?', 'name', 'Text', 5, 0),
(31, 'What are the issues faced?', 'addressing issues', 'Multiple Choice', 5, 1),
(32, 'What is the next Visiting Date?', 'visiting date', 'Date', 5, 0),
(33, 'Select your age group.', 'age of the patient', 'Drop Down', 5, 0);

-- --------------------------------------------------------

--
-- Table structure for table `question_option`
--

CREATE TABLE `question_option` (
  `QID` int(11) NOT NULL,
  `QUES_OPTION` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question_option`
--

INSERT INTO `question_option` (`QID`, `QUES_OPTION`) VALUES
(27, 'Male'),
(27, 'Female'),
(27, 'Other'),
(31, 'Water issue'),
(31, 'Sanitation issue'),
(31, 'Cleanliness issue'),
(31, 'power shortage'),
(31, 'Health issue'),
(31, 'Lack of govt support'),
(33, '0 to 16'),
(33, '20 to 40'),
(33, '41 to 60'),
(33, '60 to 80');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`QID`);

--
-- Indexes for table `question_option`
--
ALTER TABLE `question_option`
  ADD KEY `QID_FOREIGN_KEY` (`QID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `QID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `question_option`
--
ALTER TABLE `question_option`
  ADD CONSTRAINT `QID_FOREIGN_KEY` FOREIGN KEY (`QID`) REFERENCES `question` (`QID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
