import java.util.Scanner;

public class MusicBoxProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available music types are Classical, Pop, and Country.\n" +
                "Please enter the music type:");


        String[] classicalSongs = {"Four Seasons", "Fur Elise", "Finlandia", "Vocalise", "The Planets"};
        String[] popSongs = {"Bad guy", "Talk", "Please Me", "7 Ring", "Without Me"};
        String[] countrySongs = {"Meant to Be", "Heaven", "Simple", "One Number Away", "Get Along"};

        int classicalPrice = 2;
        int popPrice = 4;
        int countryPrice = 3;

        String[] availableTypes = {"Classical", "Pop", "Country"};

        while (true) {
            String musicType = scanner.nextLine().trim();

            if (!isValidType(musicType, availableTypes)) {
                System.out.println(musicType + " music category is not available.");
                continue;
            }

            String[] songs = getSongsForType(musicType, classicalSongs, popSongs, countrySongs);
            System.out.println(String.join(", ", songs) + " is available songs under " + musicType + " music.");
            System.out.print("Which one do you want to listen? ");
            String songName = scanner.nextLine().trim();

            while (!isValidSong(songName, songs)) {
                System.out.println(songName + " is not available song.");
                System.out.print("Which one do you want to listen? ");
                songName = scanner.nextLine().trim();
            }

            int requiredPrice = getPriceForType(musicType, classicalPrice, popPrice, countryPrice);
            while (true) {
                System.out.print("Please enter the " + requiredPrice + "$ for this song: ");
                int enteredPrice = Integer.parseInt(scanner.nextLine().trim());

                if (enteredPrice < requiredPrice) {
                    System.out.println(enteredPrice + "$ is not enough. Please try later.");
                } else if (enteredPrice == requiredPrice) {
                    System.out.println(songName + " is playing. Enjoy with the song!");
                    break;
                } else {
                    System.out.println("You have entered " + (enteredPrice - requiredPrice) + " dollar more. Please wait for change.");
                    System.out.println(songName + " is playing. Enjoy with the song!");
                    break;
                }
            }

            break;
        }

    }

    private static boolean isValidType(String type, String[] availableTypes) {
        for (String availableType : availableTypes) {
            if (availableType.equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    private static String[] getSongsForType(String type, String[] classicalSongs, String[] popSongs, String[] countrySongs) {
        if (type.equalsIgnoreCase("Classical")) {
            return classicalSongs;
        } else if (type.equalsIgnoreCase("Pop")) {
            return popSongs;
        } else if (type.equalsIgnoreCase("Country")) {
            return countrySongs;
        }
        return new String[]{};
    }

    private static boolean isValidSong(String song, String[] songs) {
        for (String s : songs) {
            if (s.equalsIgnoreCase(song)) {
                return true;
            }
        }
        return false;
    }

    private static int getPriceForType(String type, int classicalPrice, int popPrice, int countryPrice) {
        if (type.equalsIgnoreCase("Classical")) {
            return classicalPrice;
        } else if (type.equalsIgnoreCase("Pop")) {
            return popPrice;
        } else if (type.equalsIgnoreCase("Country")) {
            return countryPrice;
        }
        return 0;
    }
}
