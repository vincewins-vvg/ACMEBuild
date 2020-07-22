pipeline{
    
    agent any
    
    stages{
        
        stage('Compile stage'){
            
            steps{
                bat 'mvn -version'
            }
      	}
        
        stage('Deploy'){
            
            steps{
                script{
                   build 'Selenium_Grid_Docker'
                }
            }
        }    
    }
}
