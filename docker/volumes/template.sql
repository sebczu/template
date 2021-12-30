CREATE SCHEMA IF NOT EXISTS template CHARACTER SET utf8 COLLATE utf8_bin;
CREATE USER IF NOT EXISTS 'template_user'@'%' IDENTIFIED BY 'template_pass';
GRANT ALL ON template.* TO 'template_user'@'%';