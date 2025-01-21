# springBoot_azure
a basic spring boot java app using gradle

in application.properties file(src/main/resources), change

    server.port = 8080

to

    server.port = 80 

before uploading

Then update the  build.gradle file to point to a webapp you have on the portal.

    azurewebapp 
    {
    subscription = 'yourSubscriptionId'
    appName = 'WebAppName'  // works with already Existing app
    resourceGroup = 'resourceGroupName'
    region = 'westus2'  //eastus, centralus,, etc
    pricingTier = 'F1'  // F1 for free
    
        runtime 
        {
            os = 'Linux'
            webContainer = 'Java SE'
            javaVersion = 'Java 21'
        }
    

    }

then use

gradle azureWebAppDeploy