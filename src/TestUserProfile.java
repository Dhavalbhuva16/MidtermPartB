import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;
// part of answer3
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display available genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println("Available Genres:");
        for (String genre : genres) {
            System.out.println("- " + genre);
        }

        // Prompt user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt user for favorite genre
        System.out.print("Choose your favorite genre: ");
        String favoriteGenre = input.nextLine();

        // Create user profile
        UserProfile userProfile = new UserProfile(name, favoriteGenre);

        // Display confirmation message
        System.out.println("Your user profile has been created!");
    }
}
