#备份压缩命令
INSERT INTO BACKUP_COMPRESSION (questions, answers)
VALUES ('文件与目录压缩为zip格式', 'zip [-r] [targetFile] [sourceFile]'),
       ('将.zip格式文件解压缩', 'unzip [sourceFile]'),
       ('文件压缩为.bz2格式', 'bzip2 [-k] [sourceFile]'),
       ('将.bz2格式文件解压缩', 'bunzip2 [-k] [sourceFile]'),
       ('将目录压缩为.tar.bz2格式(打包为.tar然后压缩成.bx2)', 'tar [-cvfj] [targetFile] [sourceDir]'),
       ('将.tar.bz2格式文件解压缩', 'tar [-xvfj] [sourceFile]'),
       ('将文件压缩为.gz格式', 'gzip [sourceFile]'),
       ('将.gz文件解压缩', 'gunzip [sourceFile] | gzip [-d] [sourceFile]'),
       ('将目录压缩为.tar.gz格式(打包为.tar然后压缩成.gz)', 'tar [-cvfz] [targetFile] [sourceDir]'),
       ('将.tar.gz格式文件解压缩', 'tar [-xvfz] [sourceFile]')
#        (''),
#        (''),
#        (''),
#        (''),
#        ('')