DROP TABLE IF EXISTS `sudheer`.`customer`;
CREATE TABLE  `sudheer`.`customer` (
  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `customer` (`CUST_ID`,`NAME`,`AGE`) VALUES 
 (1,'sudheer1',26),
 (2,'sudheer2',26),
 (3,'sudheer3',26);