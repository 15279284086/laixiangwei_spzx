pipeline {
    agent any
    stages {
        // 1. Maven 编译打包阶段（确保生成 jar 包）
        stage('Maven 编译打包') {
            steps {
                echo '==== 开始编译打包 ===='
                // 如果你的 Jenkins 节点配好了 maven 环境
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('查看 Jar 包位置') {
            steps {
                // 1. 打印当前工作目录的绝对路径
                sh 'pwd'

                // 2. 递归查找当前目录下所有生成的 jar 包
                sh 'find . -name "*.jar"'
            }
        }

        stage('部署') {

            steps {

                sh '''
                scp spzx-app/target/*.jar \
                lxw@192.168.60.129:/opt/apps/spzx/spzx-app.jar
                '''

            }
        }


        stage('启动应用') {

            steps {

                sh '''
                ssh lxw@192.168.60.129 \
                "/opt/apps/spzx/start.sh"
                '''

            }
        }
    }
}