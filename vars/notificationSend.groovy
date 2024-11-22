def call(String currentBuild){
    if (currentBuild == "SUCCESS"){
          emailext (subject: "SUCCESSFUL: Job ${env.JOB_NAME}", 
                     body: """<html> 
                                <body>
                                    <p> Job ${env.JOB_NAME}  with ${env.BUILD_NUMBER} has finished succesfully </p> 
                                    <p>This is the job: ${env.JOB_URL}</p>
                                </body>
                            </html>
                        """, 
                     to: "salimovanusher6@gmail.com",
                     mimeType: 'text/html')
    }
    else {
            emailext (body: "Job ${env.JOB_NAME} with ${env.BUILD_NUMBER} attempts has failed", 
                subject: "SUCCESSFUL: Job ${env.JOB_NAME}", 
                to: "salimovanusher6@gmail.com")
    }
}