

--
-- create database
--
CREATE DATABASE tezfuerza;

--
-- Table structure for table centerlised_table
--
CREATE TABLE IF NOT EXISTS `centerlised_table` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `stud_group_id` int(99) NOT NULL,
  `stud_individual_id` varchar(11) NOT NULL,
  `name` varchar(99) NOT NULL,
  `year` int(99) NOT NULL,
  `department` varchar(99) NOT NULL,
  `mail_id` varchar(99) NOT NULL,
  `mobile_no` int(10) NOT NULL,
  `college` varchar(99) NOT NULL,
  `ppt` varchar(99) NOT NULL,
  `multimedia` varchar(99) NOT NULL,
  `technical_connection` varchar(99) NOT NULL,
  `technical_quiz` varchar(99) NOT NULL,
  `win_expert` varchar(99) NOT NULL,
  `code_buzz` varchar(99) NOT NULL,
  `date` varchar(99) NOT NULL,
  `payment_details` varchar(99) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `stud_individual_id` (`stud_individual_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- insert into the values
--

INSERT INTO `centerlised_table` (`id`, `stud_group_id`, `stud_individual_id`, `name`, `year`, `department`, `mail_id`, `mobile_no`, `college`, `ppt`, `multimedia`, `technical_connection`, `technical_quiz`, `win_expert`, `code_buzz`, `date`, `payment_details`) VALUES
(1, "3", "35", 'Ragu Balagi Karuppaiah', 3, 'CSE', 'ragubalagi.k@gmail.com',9786925892, 'sasurie', '*', '*', '*', '*', 'yes', '*', '16-02-2018', 'yes'),
(2, "3", "20", 'Karthick J', 3, 'CSE', 'karthick.j@gmail.com',8875853588, 'anna university', '*', '*', '*', '*', 'yes', '*', '16-02-2018', 'yes');


--
-- Table structure for table winexpertresult
--

CREATE TABLE IF NOT EXISTS `winexpert` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `stud_individual_id` varchar(99) NOT NULL,
  `total_mark` varchar(10) NOT NULL,
  `earned_mark` varchar(10) NOT NULL,
  `start_time` varchar(99) NOT NULL,
  `end_time` varchar(99) NOT NULL,
  `status` varchar(99) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Stud_individual-id` (`stud_individual_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- insert into the values for winexpert result
--



--
-- Table structure for table Question table
--

CREATE TABLE IF NOT EXISTS `winexpertques` (
  `SNo` int(5) NOT NULL AUTO_INCREMENT,
  `Que` varchar(500) DEFAULT NULL,
  `Ans` int(11) DEFAULT NULL,
  PRIMARY KEY (`SNo`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=76 ;


--
-- insert into questions and answers
--




INSERT INTO `winexpertques` (`SNo`, `Que`, `Ans`) VALUE
(1, 'What is the shortcut key for rename the selected item in ?', 113),
(2, 'What is the shortcut for delete ?', 127),
(3, 'What is the shortcut key for delete the selected item permanently without placing the item in the Recycle bin ?', 143),
(4, 'What is the shortcut for search for files or folder in Windows XP ?', 114),
(5, 'What is the shortcut for view the properties for selected item in Windows XP ?', 28),
(6, 'What is the shortcut for close the active item or quit the active program?', 133),
(7, 'What is the shortcut for close the active document in programs that enable you to have multiple documents open simultaneously ?', 132),
(8, 'What is the shortcut for display the properties of selected object ?', 28),
(9, 'What is the shortcut for paste in ?', 103),
(10, 'What is the shortcut for cycle through the item in the a windows or on the desktop ?', 117),
(11, 'What is the shortcut for display the address bar list my computer or windows explorer ?', 115),(12, 'What is the shortcut for display the shortcut menu for the selected item Windows XP ?', 137),(13, 'What is the shortcut for Active the menu bar in active program?', 121),
(14, 'What is the shortcut for select all ?', 82),
(15, 'What is the shortcut for update the active window?', 116),(16, 'What is the shortcut for view the folder one level up in my computer or windows explorer ?', 56),
(17, 'What is the shortcut for cancel the current task ?', 27),
(18, 'What is the shortcut key perform the command for the active option or button ?', 10),
(19, 'What is the shortcut key for select or clear the check box if the active option is a check box ?', 32),
(20, 'What is the shortcut key for display or hide the start menu ?', 87),
(21, 'What is the shortcut key for collapse the current selection if it is expanded or select the parent folder ?', 37),
(22, 'What is the shortcut key for display help', 112),(23, 'What is the shortcut key for open a folder one level up if a folder is selected in the save as or open dialog box ?', 8),
(24, 'What is the shortcut key for set focus on a notification ?', 153),
(25, 'What is the shortcut key for display the desktop ?', 155),
(26, 'What is the shortcut key for minimize all of the windows ?', 164),
(27, 'What is the shortcut key for restore minimize windows ?', 180),
(28, 'What is the shortcut key for open my computer ?', 156),
(29, 'What is the shortcut key for move beginning of the line ?', 36),
(30, 'What is the shortcut key for search for a file or a folder ?', 157),
(31, 'What is the shortcut key for search for computers ?', 174),
(32, 'What is the shortcut key for display windows help ?', 199),
(33, 'What is the shortcut key for lock the keyboard or logout ?', 163),
(34, 'What is the shortcut key for open the run dialog box ?', 169),
(35, 'What is the shortcut key for open utility manager ?', 172),
(36, 'What is the shortcut for cut ?', 105),
(37, 'What is the shortcut key for display the bottom of the active window ?', 35),
(38, 'What is the shortcut for undo ?', 107),
(39, 'What is the shortcut key for switch between enlarged and normal mode when a character is selected ?', 32),
(40, 'What is the shortcut key for display the top of the active window ?', 36),
(41, 'What is the shortcut key for redo ?', 106),
(42, 'What is the shortcut key for move up screen at a time ?', 34),
(43, 'What is the shortcut key for move down screen at a time ?', 33),
(44, 'What is the shortcut key for move end of the line ?', 35),
(45, 'What is the shortcut key for open the print dialog box ?', 97),
(46, 'What is the shortcut key for update the current web page ?', 99),
(47, 'What is the shortcut key for move to the first character ?', 53),
(48, 'What is the shortcut key for move to the end character ?', 52),
(49, 'What is the shortcut key for open a saved console ?', 96),
(50, 'What is the shortcut key for open a new console ?', 95),
(51, 'What is the shortcut key for save the open console ?', 100),
(52, 'What is the shortcut key for display the active menu ?', 83),
(53, 'What is the shortcut key for add or remove a console item ?', 94),
(54, 'What is the shortcut key for close the console ?', 133),
(55, 'What is the shortcut for copy ?', 84),
(56, 'What is the shortcut key for display the view menu ?', 104),
(57, 'What is the shortcut key for display the file menu ?', 88),
(58, 'What is the shortcut key for display the favorites menu ?', 97),
(59, 'What is the shortcut key for restore the active console windows ?', 133),
(60, 'What is the shortcut key for display the properties dialog box, if any, for the selected item ?', 28),
(61, 'What is the shortcut key for switch between programs from right to left ?', 52),
(62, 'What is the shortcut key for close the active console window when a console has only one console window, this shortcut closes the console ?', 132),
(63, 'What is the shortcut key for open the microsoft windows NT security dialog box?', 70),
(64, 'What is the shortcut key for switch between programs from left to right ?', 51),
(65, 'What is the shortcut key for cycle through the programs in most recently used order ?', 173),
(66, 'What is the shortcut key for display the start menu for remote desktop connection navigation ?', 54),
(67, 'What is the shortcut key for open the Organize Favorites dialog box ?', 83),
(68, 'What is the shortcut key for display the items in the active list', 115),
(69, 'What is the shortcut key for open the search bar ?', 86),
(70, 'What is the shortcut key for Start the Find utility ?', 87),
(71, 'What is the shortcut key for open the History bar ?', 89),
(72, 'What is the shortcut key for open the Favorites bar ?', 90),
(73, 'What is the shortcut key for Open the open dialog box ?', 93),
(74, 'What is the shortcut key for Start another instance of the browser with the same Web address ?', 95),
(75, 'What is the shortcut key for collapse the current selection if it is collapsed, or select the first subfolder ?', 38),
(76, 'What is the shortcut key for screen short ?', 154);




