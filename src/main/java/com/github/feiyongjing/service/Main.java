package com.github.feiyongjing.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> questionsAndAnswers = new HashMap<>();
//        questionsAndAnswers.put("查看磁盘空间的使用情况", "df [-h]");
//        questionsAndAnswers.put("显示指定的目录或文件所占用的磁盘空间", "du [-h] [targetDir]");
//        questionsAndAnswers.put("查看目录下的详细信息", "ls [-althi] [targetDir]");
//        questionsAndAnswers.put("切换到d盘", "cd /d");
//        questionsAndAnswers.put("显示工作目录的绝对路径名称", "pwd");

//        questionsAndAnswers.put("创建目录", "mkdir [-p] [targetDir]");
//        questionsAndAnswers.put("创建文件", "touch [targetFile]");
//        questionsAndAnswers.put("删除空目录", "rmdir [targetDir]");
//        questionsAndAnswers.put("删除目录或文件", "rm [-rf] [targetDir]");
//        questionsAndAnswers.put("拷贝文件", "cp [-rp] [sourceDir] [targetDir]");
//        questionsAndAnswers.put("剪切文件或改名", "mv [sourceDir] [targetDir]");
//        questionsAndAnswers.put("查看文件内容", "cat [-n] [targetFile]");
//        questionsAndAnswers.put("分页显示文件内容", "more [targetFile] | less [targetFile]");
//        questionsAndAnswers.put("显示文件前20行内容", "head [-n] [20] [targetFile]");
//        questionsAndAnswers.put("显示文件后20行内容", "tail [-n] [20] [targetFile]");
//        questionsAndAnswers.put("倒立显示文件内容", "tac [targetFile]");
//        questionsAndAnswers.put("创建文件的软连接", "ln [-s] [sourceDir] [targetDir]");
//        questionsAndAnswers.put("创建文件的硬连接", "ln [sourceFile] [targetFile]");

//        questionsAndAnswers.put("修改目录或文件的所有者", "sudo chown [userName] [targetDir]");
//        questionsAndAnswers.put("修改目录或文件的所属组", "sudo chgrp [groupName] [targetDir]");
//        questionsAndAnswers.put("显示新建目录默认权限", "umask [-S]");

//        questionsAndAnswers.put("根据文件名进行查找目录", "find [sourceDir] [-name searchDirName]");
//        questionsAndAnswers.put("根据文件i节点123进行查找目录", "find [sourceDir] [-inum 123]");
//        questionsAndAnswers.put("根据文件名进行查找特定类型文件(目录或软链接)", "find [sourceDir] [-type f | d | l]");
//        questionsAndAnswers.put("根据文件名进行查找文件同时对结果集合继续其他命令如查看命令", "find [sourceDir] [-name pom.xml] [-type f] [[-exec | -ok] [cat pom.xml] {} \\;]");
//        questionsAndAnswers.put("根据文件大小进行查找，搜索大于1k的文件", "find [sourceDir] [-size +2]");
//        questionsAndAnswers.put("根据文件大小进行查找，搜索大于1k的文件并且小于10k的文件(适用于其他条件)", "find [sourceDir] [-size +2 -a -size -20]");
//        questionsAndAnswers.put("根据文件大小进行查找，搜索小于1k的文件或大于10k的文件(适用于其他条件)", "find [sourceDir] [-size -2 -o -size +20]");
//        questionsAndAnswers.put("根据用户名查找用户拥有的所有目录和文件", "find [sourceDir] [-user userName]");
//        questionsAndAnswers.put("根据用户组名查找用户组拥有的所有目录和文件", "find [sourceDir] [-group groupName]");
//        questionsAndAnswers.put("在目标目录下5分钟内被读取过的目录或文件", "find [sourceDir] [-amin -5]");
//        questionsAndAnswers.put("在目标目录下5分钟内被修改属性的目录或文件", "find [sourceDir] [-cmin -5]");
//        questionsAndAnswers.put("在目标目录下5分钟内被修改内容的目录或文件", "find [sourceDir] [-mmin -5]");

//        questionsAndAnswers.put("根据文件名进行快速查找(临时文件等失效)", "locate [targetDir]");
//        questionsAndAnswers.put("更新文件资料库(用于更新后快速查找)", "updatedb");
//        questionsAndAnswers.put("查看命令的路径,如ls命令", "which [ls]");
//        questionsAndAnswers.put("查看命令的路径和帮助文档路径,如ls命令", "whereis [ls]");
//        questionsAndAnswers.put("查看命令的简短信息,如ls命令", "whatis [ls]");
//        questionsAndAnswers.put("查看配置文件的简短信息", "apropos [fileName]");
//        questionsAndAnswers.put("查看命令或配置文件的帮助文档,如date命令(Shell内置命令除外)", "man [1 | 5] [date | fileName]");
//        questionsAndAnswers.put("查看Shell内置命令,如cd命令", "help [cd]");
//        questionsAndAnswers.put("查找文件的内容中指定字符串", "grep [-irvn] [string] [targetFile]");
//
//        questionsAndAnswers.put("文件与目录压缩为zip格式", "zip [-r] [targetFile] [sourceFile]");
//        questionsAndAnswers.put("将.zip格式文件解压缩", "unzip [sourceFile]");
//        questionsAndAnswers.put("文件压缩为.bz2格式", "bzip2 [-k] [sourceFile]");
//        questionsAndAnswers.put("将.bz2格式文件解压缩", "bunzip2 [-k] [sourceFile]");
//        questionsAndAnswers.put("将目录压缩为.tar.bz2格式(打包为.tar然后压缩成.bx2)", "tar [-cvfj] [targetFile] [sourceDir]");
//        questionsAndAnswers.put("将.tar.bz2格式文件解压缩", "tar [-xvfj] [sourceFile]");
//        questionsAndAnswers.put("将文件压缩为.gz格式", "gzip [sourceFile]");
//        questionsAndAnswers.put("将.gz文件解压缩", "gunzip [sourceFile] | gzip [-d] [sourceFile]");
//        questionsAndAnswers.put("将目录压缩为.tar.gz格式(打包为.tar然后压缩成.gz)", "tar [-cvfz] [targetFile] [sourceDir]");
//        questionsAndAnswers.put("将.tar.gz格式文件解压缩", "tar [-xvfz] [sourceFile]");
//
//        questionsAndAnswers.put("查看当前登录的用户名", "whoami | id [-un]");
//        questionsAndAnswers.put("查看当前主机登录的用户信息", "w | who");
//        questionsAndAnswers.put("创建新用户", "sudo useradd [-u UID] [-g initialGroup] [-G attachGroup] [-s /bin/shell] [userName]");
//        questionsAndAnswers.put("设置用户密码", "sudo passwd [userName] | passwd");
////        questionsAndAnswers.put("设置用户密码", "sudo echo [\"password\"] | passwd --stdin [userName]");
//        questionsAndAnswers.put("查询用户的密码状态", "sudo passwd [-S] [userName]");
//        questionsAndAnswers.put("锁定用户", "sudo passwd [-l] [userName] | sudo usermod [-L] [userName]");
//        questionsAndAnswers.put("解锁用户", "sudo passwd [-u] [userName] | sudo usermod [-U] [userName]");
//        questionsAndAnswers.put("修改以存在的用户信息", "sudo usermod [-u UID] [-g initialGroup] [-G attachGroup] [-s /bin/shell] [userName]");
//        questionsAndAnswers.put("删除用户", "sudo userdel [-r] [userName]");
//
//        questionsAndAnswers.put("列出用户的详细密码状态", "chage [-l]");
//        questionsAndAnswers.put("修改密码的最后一次更改日期(1970年1月1日之后第几天)", "chage [-d] [10000]");
//        questionsAndAnswers.put("修改两次密码的时间间隔", "chage [-m] [10]");
//        questionsAndAnswers.put("修改密码的有效期", "chage [-M] [100]");
//        questionsAndAnswers.put("修改密码过期前的警告天数", "chage [-W] [7]");
//        questionsAndAnswers.put("修改密码过期后的宽限天数", "chage [-I] [5]");
//        questionsAndAnswers.put("修改账号失效日期", "chage [-E] [2025-08-08]");
//        questionsAndAnswers.put("创建用户组", "groupadd [-g GID] [groupName]");
//        questionsAndAnswers.put("修改用户组信息", "groupmod [-g GID] [-n newGroupName] [groupName]");
//        questionsAndAnswers.put("删除用户组", "groupdel [groupName]");
//        questionsAndAnswers.put("将用户添加的用户组", "gpasswd [-a userName] [groupName]");
//        questionsAndAnswers.put("将用户从用户组删除", "gpasswd [-d userName] [groupName]");

//        questionsAndAnswers.put("切换用户", "switch [userName] | su [-userName]");
//
//        questionsAndAnswers.put("终端窗口清除", "clear");
//        questionsAndAnswers.put("查看命令历史", "history");

//        #
//        questionsAndAnswers.put("对在线的目标用户进行编写信息(编写完成后Ctrl+D发送)", "write [userName]");
//        questionsAndAnswers.put("对目标用户进行编写信息(编写完成后Ctrl+D发送邮件)", "mail [userName]");
//        questionsAndAnswers.put("查看邮箱", "mail");
//        questionsAndAnswers.put("对所有的在线用户进行发送信息", "wall [massage]");
//        questionsAndAnswers.put("对目标主机发送3次数据包(用于检测目标主机的网络状态)", "ping [-c 3] [targetIp]");
//        questionsAndAnswers.put("显示网络设备信息", "ifconfig");
//        questionsAndAnswers.put("显示当前主机最近登录信息", "last");
//        questionsAndAnswers.put("显示当前主机最后登录的信息", "lastlog");
//        questionsAndAnswers.put("显示数据包到目标主机间的路径", "traceroute [targetIp]");
//        questionsAndAnswers.put("显示网络状态与服务端口等", "netstat [-atrn]");
//        questionsAndAnswers.put("设置公用程序(可能没有)", "sudo setup");
//        questionsAndAnswers.put("挂载外界设备", "mount [sourceDir] [targetDir]");
//        questionsAndAnswers.put("卸载已挂载的外界设备(在挂载目录之下无法卸载)", "umount [sourceDir]");
//        questionsAndAnswers.put("重启网络服务", "service network restart");

//        questionsAndAnswers.put("关机重启", "shutdown [-chr] [now | 20:00] | init [0 | 6]");
//        questionsAndAnswers.put("退出登录", "logout");
//        questionsAndAnswers.put("查看和修改系统运行级别", "runlevel & vi [/etc/inittab]");
//
//        questionsAndAnswers.put("编辑指定文(不存在就创建)", "vi [targetFile]");
//        questionsAndAnswers.put("命令模式进入插入模式", "[aioAIO]");
//        questionsAndAnswers.put("命令模式进入底线命令模式", "[:]");
//        questionsAndAnswers.put("底线命令模式和插入模式进入命令模式", "[Esc]");
//
//        questionsAndAnswers.put("设置行号或取消行号", "[:set number] | [:set nonumber]");
//        questionsAndAnswers.put("取消上一步操作", "[u]");
//
//        questionsAndAnswers.put("光标移到第一行(最后一行或第n行)", "[gg] | [G] | [nG | :n]");
//        questionsAndAnswers.put("光标移到当前行行或行尾", "[0] | [$]");
//
//        questionsAndAnswers.put("导入其他文件内容", "[:r fileName]");
//        questionsAndAnswers.put("导入命令", "[:!command]");
//        questionsAndAnswers.put("导入命令执行结果", "[:r !command]");
//
//        questionsAndAnswers.put("删除光标所在处的字符或之后的n个字符", "[x] | [nx]");
//        questionsAndAnswers.put("删除光标所在处行或之后的n行", "[dd] | [ndd]");
//        questionsAndAnswers.put("删除光标到文件末尾", "[dG]");
//        questionsAndAnswers.put("删除光标到所在行的末尾", "[D]");
//        questionsAndAnswers.put("删除指定范围(n1到n2)的行", "[:n1.n2d]");
//
//        questionsAndAnswers.put("复制光标所在处行或之后的n行", "[yy] | [nyy]");
//        questionsAndAnswers.put("剪切光标所在处行或之后的n行", "[dd] | [ndd]");
//        questionsAndAnswers.put("粘贴在光标所在行的之上或之下", "[P] | [p]");
//        questionsAndAnswers.put("替换光标所在处的字符", "[r]");
//        questionsAndAnswers.put("进入替换模式", "[R]");
//
//        questionsAndAnswers.put("搜索指定字符串", "[/sourceString]");
//        questionsAndAnswers.put("全文替换指定字符串", "[:%s/sourceString/targetString/[c | g]]");
//        questionsAndAnswers.put("指定范围行(n1到n2)替换指定字符串", "[:n1.n2s/sourceString/targetString/[c | g]]");
//
//        questionsAndAnswers.put("保存并退出", "[:wq] | [ZZ]");
//        questionsAndAnswers.put("不保存直接退出", "[:q!]");
//        questionsAndAnswers.put("另存为其他文件", "[:w new-fileName]");
//        questionsAndAnswers.put("强制保存并退出(只有文件所有者和root可以做)", "[:wq!]");
//
//
//        questionsAndAnswers.put("rpm包的手工安装(需要包全名)", "rpm [-ivh] [packageName]");
//        questionsAndAnswers.put("rpm包的升级(需要包全名)", "rpm [-Uvh] [packageName]");
//        questionsAndAnswers.put("rpm包的卸载", "rpm [-e] [packageName]");
//
//        questionsAndAnswers.put("查询是否安装指定rpm包", "rpm [-q] [packageName]");
//        questionsAndAnswers.put("查询所有已安装的rpm包", "rpm [-aq]");
//        questionsAndAnswers.put("查询已安装指定rpm包的信息", "rpm [-qi] [packageName]");
//        questionsAndAnswers.put("查询未安装指定rpm包的信息(需要包全名)", "rpm [-qip] [packageName]");
//        questionsAndAnswers.put("查询已安装指定rpm包中文件的安装路径", "rpm [-ql] [packageName]");
//        questionsAndAnswers.put("查询未安装指定rpm包中文件准备的安装路径(需要包全名)", "rpm [-qlp] [packageName]");
//        questionsAndAnswers.put("查询系统文件属于那个rpm包的信息", "rpm [-qf] [systemFileName]");
//        questionsAndAnswers.put("查询已安装指定rpm包的依赖信息", "rpm [-qR] [packageName]");
//        questionsAndAnswers.put("查询未安装指定rpm包的依赖信息(需要包全名)", "rpm [-qRp] [packageName]");
//
//        questionsAndAnswers.put("检查已安装的rpm包是否修改过", "rpm [-V] [packageName]");
//        questionsAndAnswers.put("提取rpm包转换成cpio格式,将指定文件提取到指定目录", "rpm2cpio [packageName] | cpio [-idv] [targetDir]");

//        questionsAndAnswers.put("查看网络yum源的配置文件", "cat /etc/yum.repos.d/CentOS-Linux-BaseOS.repo");
//        questionsAndAnswers.put("查看可用软件包列表", "yum list");
//        questionsAndAnswers.put("yum方式查看和目标字符串相关的软件包", "yum search [targetString]");
//        questionsAndAnswers.put("yum方式安装软件包(不在需要包全名)", "yum [-y] install [packageName]");
//        questionsAndAnswers.put("yum方式升级软件包(不在需要包全名)", "yum [-y] update [packageName]");
//        questionsAndAnswers.put("yum方式卸载软件包(大概率会导致系统崩溃,尽量使用手工卸载)", "yum [-y] remove [packageName]");
//        questionsAndAnswers.put("查看可用软件组列表", "yum grouplist");
//        questionsAndAnswers.put("yum安装软件包组(需要全名)", "yum groupinstall [packageGroupName]");
//        questionsAndAnswers.put("yum卸载软件组(大概率会导致系统崩溃,尽量使用手工卸载)", "yum groupremove [packageGroupName]");

//        questionsAndAnswers.put("用户信息目录", "/etc/passwd");
//        questionsAndAnswers.put("影子文件目录", "/etc/shadow");
//
//        questionsAndAnswers.put("把时间戳换算成日期", "date [-d] [1970-01-01 10000 days]");
//        questionsAndAnswers.put("把日期换算成时间戳", "echo $(($date --date=\"1999/09/08\"+%s)/86400+1))\uFEFF\u200B");
//
//        questionsAndAnswers.put("修改目录或文件权限", "chmod [-R] [700] [targetDir]");
//        questionsAndAnswers.put("修改目录或文件特殊权限(setUID)", "chmod [u+s | 4711] [targetDir]");
//        questionsAndAnswers.put("修改目录或文件特殊权限(setGID)", "chmod [g+s | 2711] [targetDir]");
//        questionsAndAnswers.put("修改目录或文件特殊权限(sticky BIT)", "chmod [o+t | 1755] [targetDir]");
//        questionsAndAnswers.put("临时开启ACL分区权限", "mount [-o remount,acl] /");
//        questionsAndAnswers.put("永久开启ACL分区权限编辑那个配置文件(不推荐使用,编辑时请注意格式,否则系统崩溃)", "/etc/fstab");
//        questionsAndAnswers.put("查看目录的ACL权限", "getfacl [targetDir]");
//        questionsAndAnswers.put("对指定用户设置目录的ACL权限(与mask权限\"相与\"的权限才能设置成功)", "setfacl [-m u:userName:rwx] [targetDir]");
//        questionsAndAnswers.put("对指定用户组设置目录的ACL权限(与mask权限\"相与\"的权限才能设置成功)", "setfacl [-m g:groupName:rwx] [targetDir]");
//        questionsAndAnswers.put("设置目录的mask权限(mask权限指ACL权限的最大值)", "setfacl [-m m:rwx] [targetDir]");
//        questionsAndAnswers.put("对指定用户删除目录的ACL权限", "setfacl [-x u:userName] [targetDir]");
//        questionsAndAnswers.put("对指定用户组删除目录的ACL权限", "setfacl [-x g:groupName] [targetDir]");
//        questionsAndAnswers.put("对删除目录的所有ACL权限(包含用户和用户组)", "setfacl [-b] [targetDir]");
//        questionsAndAnswers.put("对指定用户递归设置目录的ACL权限", "setfacl [-m u:userName:rwx] [-R] [targetDir]");
//        questionsAndAnswers.put("对指定用户设置目录之下的新创建目录默认ACL权限", "setfacl [-m d:u:userName:rwx] [-R] [targetDir]");
//        questionsAndAnswers.put("修改文件的系统属性权限(无法对文件进行任何操作,即使是root用户)", "chattr [+i] [targetFile]");
//        questionsAndAnswers.put("修改目录的系统属性权限(只能修改目录下文件的内容,无法对目录进行其他操作,即使是root用户)", "chattr [+i] [targetDir]");
//        questionsAndAnswers.put("修改文件的系统属性权限(只能对文件的内容进行增加,无法对文件进行其他操作,即使是root用户)", "chattr [+a] [targetFile]");
//        questionsAndAnswers.put("修改文件的系统属性权限(在目录下可以创建和修改文件,但是不能删除文件,即使是root用户)", "chattr [+a] [targetDir]");
//        questionsAndAnswers.put("查看文件系统的属性(显示目录之下一级目录和文件或只显示指定目录)", "lsattr [-a | -d] [targetDir]");
//        questionsAndAnswers.put("root赋予其他用户对命令的root权限(通过修改文件)", "visudo | vi /etc/sudoers");
//        questionsAndAnswers.put("查看可以使用的sudo命令", "sudo [-l]");
//        questionsAndAnswers.put("普通用户执行sudo命令(command必须与可以使用的sudo命令完全一致)", "sudo [command]");

//        git command
        questionsAndAnswers.put("新建一个目录，将其初始化为Git代码库", "git init [targetDir]");
        questionsAndAnswers.put("添加指定文件到暂存区 ", "git add [targetDir]");
        questionsAndAnswers.put("指定文件从暂存区移除 ", "git reset HEAD [targetDir]");
        questionsAndAnswers.put("删除工作区文件，并且将这次删除放入暂存区", "git rm [-r targetDir]");
        questionsAndAnswers.put("停止指定文件的版本控制，但该文件会保留在工作区", "git rm --cached [targetDir]﻿​");
        questionsAndAnswers.put("改名文件，并且将这个改名放入暂存区", "git mv [sourceDir] [targetDir]");
        questionsAndAnswers.put("重做上一次commit，并包括指定文件的新变化", "git commit --amend﻿​ [targetDir]");
        questionsAndAnswers.put("将选择的文件提交到本地", "git commit [-m massage]");
        questionsAndAnswers.put("commit提交取消某一次commit文件产生的变化", "git revert [commitCode]");
        questionsAndAnswers.put("commit提交某一次commit提交的文件变化", "git cherry-pick [commitCode]");
        questionsAndAnswers.put("查看当下状态下所有被提交的文件", "git log");

        questionsAndAnswers.put("列出所有本地或远程分支﻿​", "git branch [-ar]");
        questionsAndAnswers.put("新建一个分支，但依然停留在当前分支", "git branch [newBranch]");
        questionsAndAnswers.put("建立追踪关系，在现有分支与指定的远程分支之间", "git branch --set-upstream [branch] [remote-branch]");
        questionsAndAnswers.put("删除分支", "git branch [-d branch]﻿​");
        questionsAndAnswers.put("新建一个分支，与指定的远程分支建立追踪关系", "git branch --track [branch] [remote-branch]﻿​");
        questionsAndAnswers.put("切换到上一个分支 ", "git checkout -");
        questionsAndAnswers.put("切换到指定分支或历史，并更新工作区", "git checkout [branch | historyCode]");
        questionsAndAnswers.put("新建一个分支，并切换到该分支", "git checkout [-b newBranch]");
        questionsAndAnswers.put("回退到指定历史(完全一致,会删除现有的暂存区和工作区)", "git reset --hard [historyCode]");
        questionsAndAnswers.put("回退到指定历史(会保留现有的暂存区和工作区，但是暂存区同时也有历史)", "git reset --soft [historyCode]");
        questionsAndAnswers.put("回退到指定历史(工作区会和历史混合,同时清除空现有的暂存区)", "git reset --mixed [historyCode]");
        questionsAndAnswers.put("基于历史新建一个分支，并切换到该分支", "git checkout [-b newBranch] [historyCode]");
        questionsAndAnswers.put("查看当前分支状态", "git status");

        questionsAndAnswers.put("合并指定分支到当前分支", "git merge [branch]");
        questionsAndAnswers.put("合并导致冲突在解决冲突后,继续合并分支", "git merge --continue");
        questionsAndAnswers.put("合并导致冲突后,停止合并分支回到合并之前的状态", "git merge --abort");
        questionsAndAnswers.put("合并导致冲突后,引起冲突的commits会被丢弃(不要使用)", "git merge --skip");
        questionsAndAnswers.put("指定分支的提交压扁后合并到当前分支", "git merge --squash [branch]");
        questionsAndAnswers.put("当前分支与指定分支历史的分叉之后的当前分支所有提交在指定分支的尖端全部重新提交一次", "git rebase [branch]");
        questionsAndAnswers.put("中断rebase操作并回到rebase之前的状态", "git rebase --abort");
        questionsAndAnswers.put("git rebase 发生冲突，冲突解决并git add 后继续进行rebase操作", "git rebase --continue");
        questionsAndAnswers.put("git rebase 导致冲突后,引起冲突的commits会被丢弃(不要使用)", "git rebase --skip");

        questionsAndAnswers.put("进入bisect模式进行debug", "git bisect start");
        questionsAndAnswers.put("退出bisect模式", "git bisect reset");
        questionsAndAnswers.put("当前状态是坏的", "git bisect bad");
        questionsAndAnswers.put("当前状态是好的", "git bisect good");
        questionsAndAnswers.put("当前状态不确定时,跳过当前状态", "git bisect skip");
        questionsAndAnswers.put("启动指定的shell脚本进行debug(注意要先进入bisect模式并确定好的与坏的之间的区间)", "git bisect run [shellFile]");

        questionsAndAnswers.put("列出所有tag", "git tag");
        questionsAndAnswers.put("新建一个tag在当前commit", "git tag [v1.0]");
        questionsAndAnswers.put("新建一个tag在当前commit并附加tag信息", "git tag [-a v1.0] [-m massage]");
        questionsAndAnswers.put("新建一个tag在指定commit", "git tag [v1.0] [commitCode]");
        questionsAndAnswers.put("删除本地tag", "git tag [-d v1.0]");
        questionsAndAnswers.put("删除远程tag", "git push origin :refs/tags/[v1.0]");
        questionsAndAnswers.put("查看指定tag信息", "git show [v1.0]");
        questionsAndAnswers.put("提交指定tag", "git push origin [v1.0]");
        questionsAndAnswers.put("提交全部的tag", "git push origin --tags");
        questionsAndAnswers.put("新建一个分支，指向某个tag", "git checkout -b [branch] [v1.0]");
        questionsAndAnswers.put("更新本地tag", "fetch --tags");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");

        questionsAndAnswers.put("下载一个项目和它的整个代码历史﻿​", "git clone [url]");
        questionsAndAnswers.put("下载远程仓库的所有变动﻿​", "git fetch");
        questionsAndAnswers.put("取回远程仓库的变化，并与本地分支合并", "git pull [origin] [branch]");
        questionsAndAnswers.put("上传本地指定分支到远程仓库 ", "git push [-u] [origin] [branch]");
        questionsAndAnswers.put("强行推送当前分支到远程仓库，即使有冲突", "git push [-f origin]");
        questionsAndAnswers.put("推送所有分支到远程仓库", "git push [origin] --all﻿​");
        questionsAndAnswers.put("显示所有远程仓库", "git remote -v");
        questionsAndAnswers.put("显示某个远程仓库的信息", "git remote show [remote-repository]");
        questionsAndAnswers.put("增加一个新的远程仓库，并命名", "git remote add [remoteName] [url]");

//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");
//        questionsAndAnswers.put("", "");

        Set<String> questions = questionsAndAnswers.keySet();

        int index = 1;
        int errorNum = 0;
        for (String question : questions) {
            System.out.println("第" + (index++) + "题");
            System.out.println(question);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String keyword = reader.readLine();

            if (Objects.equals(keyword, "下一题")) continue;

            if (Objects.equals(keyword, questionsAndAnswers.get(question))) {
                System.out.println("回答正确");
            } else {
                errorNum++;
                System.out.println("回答错误");
            }
            System.out.println("正确答案：" + questionsAndAnswers.get(question));
        }
        System.out.println("一共" + questionsAndAnswers.size() + "题");
        System.out.println("error Number:" + errorNum);
    }
}
