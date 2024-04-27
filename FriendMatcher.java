import java.util.*;

public class FriendMatcher {
    public static void main(String[] args) {
        // Define preferences and friends
        String[] preferences = {"sport", "cooking", "reading", "coding", "drawing", "music"};
        String[] friends = {"Ana", "Blerta", "Rita", "Tringa"};

        // Create a map to store friends and their preferences
        Map<String, List<String>> friendPreferences = new HashMap<>();

        // Initialize the random object
        Random random = new Random();

        // Assign random preferences to each friend
        for (String friend : friends) {
            List<String> friendPref = new ArrayList<>();
            List<String> tempPref = new ArrayList<>(Arrays.asList(preferences));
            for (int i = 0; i < 3; i++) {
                int index = random.nextInt(tempPref.size());
                friendPref.add(tempPref.get(index));
                tempPref.remove(index);
            }
            friendPreferences.put(friend, friendPref);
        }

        // Print out friends and their preferences
        System.out.println("Friends and their preferences:");
        for (String friend : friendPreferences.keySet()) {
            System.out.println(friend + ": " + friendPreferences.get(friend));
        }

        // Ask user for their preferences
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your preferences (separated by commas):");
        String input = scanner.nextLine();
        String[] userPrefs = input.split(",");

        // Find matching friends
        List<String> matchingFriends = new ArrayList<>();
        for (String friend : friendPreferences.keySet()) {
            List<String> friendPrefs = friendPreferences.get(friend);
            for (String pref : userPrefs) {
                if (friendPrefs.contains(pref.trim())) {
                    matchingFriends.add(friend);
                    break;
                }
            }
        }

        // Print out matching friends
        if (matchingFriends.isEmpty()) {
            System.out.println("\nSorry, no matching friends found.");
        } else {
            System.out.println("\nMatching friends:");
            for (String friend : matchingFriends) {
                System.out.println(friend);
            }
        }
    }
}
