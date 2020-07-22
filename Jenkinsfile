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
                   build 'Demo_Test_Deployment'
                }
            }
        }    
    }
}
