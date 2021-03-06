package variable;

import org.testng.annotations.Test;

public class VariablePracticeTest {

    @Test
    public void practiceOne() {
        String name = "John Miller";
        int age = 32;
        String username = "john.miller";
        String password = "StrongPass123!";
        boolean isOnline = true;
        int numOfFollowers = 1230;
        int numOfFollowing = 245;
        double likeScoreAvg = 13.4;


        System.out.println("\n\n");
        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current Username: \t" + username);
        System.out.println("Current Password: \t" + password);
        System.out.println("Currently Online: \t" + isOnline);
        System.out.println("Number of followers: \t" + numOfFollowers);
        System.out.println("Number of followings: \t" + numOfFollowing);
        System.out.println("Like score average: \t" + likeScoreAvg);

        System.out.println("\n\n");
        // Simulation of state change
        age = 36;
        username = "johnm134";
        password = "amd23Pass123!";
        isOnline = false;
        numOfFollowers = 3230;
        numOfFollowing = 1234;
        likeScoreAvg = 23.4;

        // User profile info output
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("Current Username: \t" + username);
        System.out.println("Current Password: \t" + password);
        System.out.println("Currently Online: \t" + isOnline);
        System.out.println("Number of followers: \t" + numOfFollowers);
        System.out.println("Number of followings: \t" + numOfFollowing);
        System.out.println("Like score average: \t" + likeScoreAvg);


    }
        @Test
                public void practiceTwo(){
                // ---Test Data
                String siteUrl ="https://trello.com";
                String expectedBanner = "Trello helps teams move work forward.";
                String loginButtonText ="Log in";
                String fakeUserEmail="fake@gmai.l.com";
                String fakeUserPass="FakePass123!";
                boolean expectedErrorDisplay =true;

                // ---- Test Step ( User usage simulation )

        }
    }

