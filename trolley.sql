/*
 Navicat Premium Data Transfer

 Source Server         : staff
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 02/01/2020 14:18:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for trolley
-- ----------------------------
DROP TABLE IF EXISTS `trolley`;
CREATE TABLE `trolley`  (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_bin NULL DEFAULT NULL,
  `addess` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_bin NULL DEFAULT NULL,
  `addess2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_bin NULL DEFAULT NULL,
  `number` int(25) NULL DEFAULT NULL,
  `things` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_bin NULL DEFAULT NULL,
  PRIMARY KEY (`t_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of trolley
-- ----------------------------
INSERT INTO `trolley` VALUES (1, 'pzp', 'yi栋', '4679寝室', 1555545545, '快递代拿');

SET FOREIGN_KEY_CHECKS = 1;
