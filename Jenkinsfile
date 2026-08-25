pipeline {
    agent any
    stages {
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