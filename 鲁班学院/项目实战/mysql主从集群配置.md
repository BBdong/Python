# 1.mysql安装

官网下载地址：https://dev.mysql.com/downloads/repo/yum/

## 1.下载RPM包并上传至linux

## 2.yum localinstall ....        RPM包名

## 3.cat /etc/yum.repos.d/mysql-community.repo

### 	3.1  可以修改你要下载mysql的版本

### 	3.2  下载的版本是   enabled=1的

## 4.yum install mysql-community-server

## 5.service mysqld status   查看状态   

## 6.service mysqld start    启动

## 7.查看密码

### 	7.1   cat /etc/my.cnf  -->log-error=/var/log/mysqld.log

### 	7.2  cat /var/log/mysqld.log   查找password这行  最后的就是密码

## 8.登录mysql   修改密码验证（可选，学习阶段为了方便，不然要设置一个很复杂的密码）

​	show variables like '%password%';

### 	8.1  set global validate_password_policy=0;

### 	8.2  set global validate_password_length=1;

## 9.修改密码  

## alter user 'root'@'localhost' identified by '123456';





# 2.mysql主从复制

## 1.1主节点

### 1.1.1创建用户

create user 'taibai'@'192.168.204.%' identified by '123456';

### 1.1.2赋予权限

```
grant replication slave on *.* to 'taibai'@'192.168.204.%' identified by '123456';
```

如果创建要通用权限用户

```
create user 'taibai'  identified by '123456';

grant all  on *.* to 'taibai'@'%' identified by '123456';        

```



### 1.1.3启动binlog日志（my.cnf配置文件中加入）

server-id=1    //随便指定一个id  不能与其他主机冲突
log-bin=/var/lib/mysql/mysql-bin

### 1.1.4重启

service mysqld restart



## 1.2从节点

### 1.2.1my.cnf配置文件中加入

server-id=2
relay-log=/var/lib/mysql/relay-bin
relay-log-index=/var/lib/mysql/relay-bin.index

### 1.2.2登录mysql执行（建立关系）

change master to master_host='192.168.204.101',master_port=3306,master_user='repl',master_password='123456',master_log_file='mysql-bin.000001',master_log_pos=0;

注意：master_log_file='mysql-bin.000001',master_log_pos=0;这两个值有时需要根据master的信息写

查看命令：show master status

### 1.2.3开始复制

start slave; 

### 1.2.4查看状态

show slave status\G  

搭建注意点：

1.关闭防火墙或开放端口
2.修改 /var/lib/mysql/auto.cnf文件  将uuid随便修改一下（如果是克隆虚拟机的话，会出现要UUID一致的情况）3.修改配置文件重启





# 3.主主复制

## 1.修改从节点

### 1.1添加配置 

log-bin=/var/lib/mysql/mysql-bin

### 1.2重启  

service mysqld restart

show variables like '%log_bin%';   //查看是否开启命令

### 1.3创建用户

create user 'taibai'@'192.168.204.%' identified by '123456';

### 1.4赋予权限

grant replication slave on *.* to 'taibai'@'192.168.204.%' identified by '123456';

show master status;   //查看master状态

## 2.修改主节点

### 1.1建立连接

change master to master_host='192.168.204.100',master_port=3306,master_user='taibai',master_password='123456',master_log_file='mysql-bin.000001',master_log_pos=716;
注意,master_log_file,master_log_pos是偏移量

## 1.2开始复制 查看状态

show slave status;
start slave;

## 注意：低版本中可能会出现主键问题

配置文件中加入  
auto_increment_increment=2       //你有几个节点  （步长）
auto_increment_offset=1     //两个节点   岔开   一个指定为1  一个指定为2



# 4.mycat

官网地址： http://www.mycat.io/

## 1.安装（liunx上要安装好jdk，mycat是java写的，所以依赖jdk）

### 1.1 官网下载安装包并上传至liunx

### 1.2 解压

### 1.3 修改/mycat/conf/wrapper.conf文件(学习环境修改，不然会因内存报错)

wrapper.java.additional.10=-Xmx1G
wrapper.java.additional.11=-Xms256M

### 1.4启动与停止











