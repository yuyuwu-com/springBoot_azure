# springBoot_azure
a basic spring boot java app using gradle


Update the  build.gradle file to point to a webapp
you have on the portal or it will create a new one 
if you dont have one.

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

then login through command line with 

    az login
    
then use command

    gradle azureWebAppDeploy
