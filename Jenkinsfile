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
                   build 'Pipeline_Project'
                }
            }
        }    
    }
}
