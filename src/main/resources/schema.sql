CREATE TABLE `packager` (
  `id` varchar(20) NOT NULL,
  `receiver` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `weight` varchar(10) NOT NULL,
  `status`  varchar(20) DEFAULT NULL,
  `appointment`  varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
