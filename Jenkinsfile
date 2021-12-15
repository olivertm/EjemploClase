pipeline {
  agent { label 'master'}

  stages {

    stage ('test') {
      steps {
        sh "mvn clean compile test"
      }
    }

    stage ('Construir aplicacion') {
      steps {
        sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"
      }
    }

    stage ('Pasamos a produccion') {
      steps {
        echo "Movemos al servidor y lo ponemos en producción"
      }
    }

  }
}
