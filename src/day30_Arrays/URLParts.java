package day30_Arrays;

public class URLParts {

    public static void main(String[] args) {

        String str="https://learn.cydeo.com/courses/130";

      String[]arr= str.split("/");


        for(String each:arr){
            if(each.equals("")){
                continue;
            }
            System.out.println(each);
        }

    }
}

/*
URL Parts
Given a url as follows, print each section of the url separated by the
forward slash /
Example:
url = https://learn.cydeo.com/courses/130
output:
https:
learn.cydeo.com
courses
130
 */
