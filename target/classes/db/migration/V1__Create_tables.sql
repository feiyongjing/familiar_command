create table FILE_MANAGE          #文件与目录管理
(
    questions varchar(100),
    answers   varchar(100)
);

create table DOCUMENT_EDITING     #文档编辑
(
    questions varchar(100),
    answers   varchar(100)
);

create table FILE_TRANSFER        #文件传输
(
    questions varchar(100),
    answers   varchar(100)
) DEFAULT CHARSET = utf8mb4;

create table DISK_MANAGE          #磁盘管理
(
    questions varchar(100),
    answers   varchar(100)
);

create table DISK_MAINTENANCE     #磁盘维护
(
    questions varchar(100),
    answers   varchar(100)
);

create table NETWORK_COMMUNICATION  #网络通讯
(
    questions varchar(100),
    answers   varchar(100)
) DEFAULT CHARSET = utf8mb4;

create table SYSTEM_MANAGE          #系统管理
(
    questions varchar(100),
    answers   varchar(100)
);

create table SYSTEM_SETTINGS        #系统设置
(
    questions varchar(100),
    answers   varchar(100)
);

create table BACKUP_COMPRESSION     #备份压缩
(
    questions varchar(100),
    answers   varchar(100)
) DEFAULT CHARSET = utf8mb4;

create table EQUIPMENT_MANAGE       #设备管理
(
    questions varchar(100),
    answers   varchar(100)
) DEFAULT CHARSET = utf8mb4;
