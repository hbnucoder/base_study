开发环境
====================
代码的目录结构:
    ---build.bat
    ---build.sh
    ---pom.xml
    ---ide
         ---eclipse
         ---idea
    ---src
build.sh:类Linux的运行脚本
build.bat:window(window 7以上)运行脚本
pom.xml: 是Maven工具所需要的文件
src:源文件是根据maven生成的结构来的
ide:各种IDE环境所需要的配置文件
Window环境编译
-------------------------
1.进入ide/eclipse 的目录，把目录下的classpath和project拷贝到所要运行的根目录下
然后把名字改为.classpath和.project,目录为：
       ---build.sh
       ---build.bat
       ---ide
       ---.classpath
       ---.project
       ---pom.xml
       ---src
2. 打开eclipse ,文件-导入-已存在的JAVA工程
Linux 环境编译
------------------------
