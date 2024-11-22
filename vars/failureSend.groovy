def call(){
    emailext (body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} attempts has failed", 
                subject: "SUCCESSFUL: Job ${env.JOB_NAME}", 
                to: "salimovanusher6@gmail.com")
}
    