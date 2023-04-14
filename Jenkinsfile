pipeline {
    agent any
    triggers { cron {"* * * * * *"}}

    stages {
        stage('Init') {
            steps {
                bat " git clone https://github.com/OumaymaSebbata/final-selinium-oumayma.git "

            }
        }
        stage('Run') {
            steps {
                 echo "Testing..."
            }
        }
    }

}