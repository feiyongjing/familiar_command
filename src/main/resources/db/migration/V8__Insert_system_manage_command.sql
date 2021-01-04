#系统管理命令
INSERT INTO SYSTEM_MANAGE (questions, answers)
VALUES ('查看当前登录的用户名', 'whoami | id [-un]'),
       ('查看当前主机登录的用户形信息', 'w | who'),
       ('创建新用户', 'sudo useradd [userName]'),
       ('设置用户密码', 'sudo passwd [userName] | passwd'),
       ('切换用户', 'switch [userName]')
#        (''),
#        (''),
#        (''),
#        (''),
#        (''),
#        (''),
#        (''),
#        (''),
#        (''),
#        ('')