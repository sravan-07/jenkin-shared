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
  
}
