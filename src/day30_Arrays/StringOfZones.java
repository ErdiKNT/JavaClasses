package day30_Arrays;

public class StringOfZones {

    public static void main(String[] args) {
        String app="etsy";
        String zones="us-east-1,us-west-1,us-west-2,us-west-3";
        String[]arr=zones.split(",");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Deploying "+app+ " to "+arr[i]+"\nDeployment completed for "+arr[i]);

        }





    }
}
/*
AWS Zones
Given an app name and a String of zones in the following format
us-east-1,us-west-1,us-west-2,us-west-3
print the app deploying to each zone
Ex:
app = etsy
zones = us-east-1,us-west-2,us-west-1
output:
Deploying etsy to us-east-1...
Deployment completed for us-east-1
Deploying etsy to us-west-1...
Deployment completed for us-west-1
Deploying etsy to us-west-2...
Deployment completed for us-west-2
 */