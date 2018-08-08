/*
Navicat MySQL Data Transfer

Source Server         : ly
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : ssm-crud

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-08-03 15:42:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tab_info
-- ----------------------------
DROP TABLE IF EXISTS `tab_info`;
CREATE TABLE `tab_info` (
  `info_Id` int(20) NOT NULL AUTO_INCREMENT,
  `info_Name` varchar(255) DEFAULT NULL,
  `info_Sex` varchar(255) DEFAULT NULL,
  `info_Tel` varchar(255) DEFAULT '',
  `info_Email` varchar(255) DEFAULT NULL,
  `info_Qq` varchar(255) DEFAULT NULL,
  `info_Wechat` varchar(255) DEFAULT NULL,
  `info_Note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`info_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_info
-- ----------------------------
INSERT INTO `tab_info` VALUES ('13', '42aa3', 'M', '1001', '42aa3@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('14', 'f0024', 'M', '1001', 'f0024@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('15', '5c7b9', 'M', '1001', 'cccc@123.com', 'ffff', 'fff', 'ffff');
INSERT INTO `tab_info` VALUES ('16', 'd918a', 'M', '1001', 'd918a@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('17', '09419', 'M', '1001', '09419@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('18', 'b34fb', 'M', '1001', 'b34fb@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('19', '372e1', 'M', '1001', '372e1@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('20', '52a35', 'M', '1001', '52a35@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('21', 'd4c19', 'M', '1001', 'd4c19@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('22', '8777d', 'M', '1001', '8777d@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('23', '1cd00', 'M', '1001', '1cd00@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('24', '752ed', 'M', '1001', '752ed@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('25', 'f07be', 'M', '1001', 'f07be@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('26', 'cf3bf', 'M', '1001', 'cf3bf@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('27', '820b8', 'M', '1001', '820b8@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('28', '088e8', 'M', '1001', '088e8@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('29', '78afc', 'M', '1001', '78afc@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('30', '0fe84', 'M', '1001', '0fe84@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('31', '75cc7', 'M', '1001', '75cc7@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('32', '13b4f', 'M', '1001', '13b4f@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('33', 'afa3a', 'M', '1001', 'afa3a@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('34', 'c8298', 'M', '1001', 'c8298@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('35', '63c6a', 'M', '1001', '63c6a@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('36', 'aa67e', 'M', '1001', 'aa67e@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('37', '5fc0d', 'M', '1001', '5fc0d@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('38', '20e5c', 'M', '1001', '20e5c@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('39', '9f3be', 'M', '1001', '9f3be@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('40', '403f4', 'M', '1001', '403f4@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('41', 'd943c', 'M', '1001', 'd943c@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('42', 'c327a', 'M', '1001', 'c327a@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('43', 'feb9a', 'M', '1001', 'feb9a@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('44', 'd78fc', 'M', '1001', 'd78fc@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('45', '84ded', 'M', '1001', '84ded@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('46', '71e54', 'M', '1001', '71e54@1001', '1001', '1001', '1001');
INSERT INTO `tab_info` VALUES ('47', 'LY', 'M', '18871941615', '18871941615@163.com', 'fss a', 's fsd', 's fds');
INSERT INTO `tab_info` VALUES ('48', 'LY', 'M', '18871941615', '18871941615@163.com', '1690266766', '1690266766', '1690266766');
INSERT INTO `tab_info` VALUES ('49', 'LY', 'M', '18871941615', '18871941615@163.com', '1690266766', '1690266766', '1690266766');
INSERT INTO `tab_info` VALUES ('50', 'LY', 'M', '18871941615', '18871941615@163.com', '1690266766', '1690266766', '1690266766');
INSERT INTO `tab_info` VALUES ('51', 'LY', 'M', '18871941615', '18871941615@163.com', '1690266766', '1690266766', '1690266766');
INSERT INTO `tab_info` VALUES ('52', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('53', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('54', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('55', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('56', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('57', 'aa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('58', 'aa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('59', 'aa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('60', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('61', 'aa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('62', 'aa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('63', 'aa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('64', 'aaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('65', 'aaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('66', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('67', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('68', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('69', 'aaaaaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('70', 'aaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('71', 'aaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('72', 'aaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('73', 'aaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('74', 'aaa', 'M', 'aaa', 'aa@163.com', 'aa', 'aaa', 'aa');
INSERT INTO `tab_info` VALUES ('75', '', 'M', '', '', '', '', '');
INSERT INTO `tab_info` VALUES ('76', '', 'M', '', '', '', '', '');
INSERT INTO `tab_info` VALUES ('77', '', 'M', '', '', '', '', '');
INSERT INTO `tab_info` VALUES ('78', '', 'M', '', '', '', '', '');
INSERT INTO `tab_info` VALUES ('79', '', 'M', '', '', '', '', '');
INSERT INTO `tab_info` VALUES ('80', '', 'M', '', '', '', '', '');
INSERT INTO `tab_info` VALUES ('81', 'aaaaaa', 'M', '', 'aaa@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('82', 'aaaaaa', 'M', '', 'aaa@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('83', 'aaaaaa', 'M', '', 'aaa@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('84', 'bbbbbb', 'M', '', 'b@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('85', 'bbbbbb', 'M', '', 'b@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('86', 'dddddd', 'M', '', 'd@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('87', 'dddddd', 'M', '', 'ddd@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('88', 'dddddd', 'M', '', 'ddd@123.com', '', '', '');
INSERT INTO `tab_info` VALUES ('89', 'dddddd', 'M', '', 'a@121.com', '', '', '');
INSERT INTO `tab_info` VALUES ('90', 'aaaaaa', 'M', '', 'aa@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('91', 'aaaaaa', 'M', '', 'aa@123.com', '', '', '');
INSERT INTO `tab_info` VALUES ('92', 'a但是a', 'M', '', '', '爱的', '', '');
INSERT INTO `tab_info` VALUES ('93', 'a速度啊', 'M', '', '', 'a 打算', '', '');
INSERT INTO `tab_info` VALUES ('94', '1111', 'M', '', '1111', '', '', '');
INSERT INTO `tab_info` VALUES ('95', 'asasas', 'M', '', '1010@123.com', '', '', '');
INSERT INTO `tab_info` VALUES ('96', '111111', 'M', '', '110@123.com', '', '', '');
INSERT INTO `tab_info` VALUES ('97', 'asasad', 'M', '', 'asa@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('98', 'lllllyy', 'F', 'asda', 'adsad@123.com', 'asdsa', 'adsa', 'asda');
INSERT INTO `tab_info` VALUES ('99', 'llalfjoa', 'M', '', 'adop@163.com', '', '', '');
INSERT INTO `tab_info` VALUES ('100', 'fdfdfdf', 'M', '', 'fafaf@163.com', '', '', '');

-- ----------------------------
-- Table structure for tab_login
-- ----------------------------
DROP TABLE IF EXISTS `tab_login`;
CREATE TABLE `tab_login` (
  `username` int(255) DEFAULT NULL,
  `password` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_login
-- ----------------------------
INSERT INTO `tab_login` VALUES ('123', '123456');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userName` int(255) DEFAULT NULL,
  `password` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('123', '123456');
