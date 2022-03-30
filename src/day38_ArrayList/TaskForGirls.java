package day38_ArrayList;


public class TaskForGirls {


    public static int domain(String[] arr, String name) {
        int com = 0;


        for (String s : arr) {
            if (s.contains(".com")) {

                com++;


            }


        }
        return com;


    }

    public static int domain(String name1, String[] wd) {
        int org = 0;


        for (String s : wd) {

            if (s.contains(".org")) {
                org++;

            }


        }
        return org;

    }

    public static int domain1(String others, String... arr) {
        int other = 0;


        for (String s : arr) {
            if (!s.contains(".org") && !s.contains(".com")) {
                if (s.contains(others)) {
                    other++;
                }


            }


        }
        return other;
    }

    public static void main(String[] args) {
        String[] arr = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "ucla.edu"};
        System.out.println("Number of indicated domain: " + domain(arr, "com"));

        System.out.println("Number of indicated domain: " + domain("org", arr));

        System.out.println("Number of other domains: " + domain1(".edu", arr));
    }
}




/*
Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain

bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
comcast.net, tamu.edu, utexas.edu,
 */