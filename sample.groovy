library 'sharedfile1'
node
{
  stage('checkout')
  {
    code_checkout()
  }
  stage('build')
  {
    code_build()
  }
  stage('upload')
  {
   nexus_upload() 
  }
  
}
