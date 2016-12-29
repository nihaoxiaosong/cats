# cats
初始帐密:admin/admin

项目部署步骤:
1. 下载安装jdk1.8(其他版本也可以,1.7以上), 配置完后在终端命令java –version能显示java版本信息就OK了
  jdk下载地址: www.oracle.com/technetwork/java/javase/downloads/index.html;
2. 下载安装maven3.3.9(其他版本也可以), 配置完后在终端命mvn –v能显示maven和java的版本信息就OK了
  maven下载地址: http://maven.apache.org/download.cgi;
3. 下载安装tomcat8.9.5(其他版本也可以,7以上), 配置完后在终端输入startup.sh启动tomcat, 然后进浏览器输入localhost:8080显示tomcat主页就OK了
  tomcat下载地址: http://tomcat.apache.org/;
4. 下载安装eclipse Neon.1a Release (4.6.1)(其他版本也可以),安装配置了jdk就能打开eclipse
  下载地址: www.eclipse.org/downloads/
5. 配置eclipse
  1> 配置jdk, 在preferences中选择java, installed jres, add - standard vm, 选择jdk的安装目录
  2> 配置tomcat, 在window-show view选择other, 输入server回车, 然后点击这行字, 选择apache tomcat v8.5 server, 选择tomcat的解压目录和刚配置的jdk,finish
  3> 配置maven, 先进入maven解压目录, 在conf中打开settings.xml, 新增jar包默认存放地址, 和国内的阿里云镜像, 保存后关闭
    jar包存放目录:
    <localRepository>D:/apache-maven-3.3.9/.m2/repository</localRepository>
   	 镜像配置:
    <mirror>
        <id>nexus-aliyun</id>
        <mirrorOf>*</mirrorOf>
        <name>Nexus aliyun</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public</url>
    </mirror> 
	然后在maven - installations中新增自己下载的 maven
	然后在maven - user settings 中加载 conf 中的 settings 文件
6. 配置启动服务, 在 server 中右键add and remove, 将项目 add 到右边
7. 右键 server, start or debug
