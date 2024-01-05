public class RemoveNegativeInterests {

    public static String removeNegativeInterests(String interests) {

        String[] splitinterests = interests.split(", ");

        StringBuilder newinterests = new StringBuilder();

        for (String interest : splitinterests) {

            if (!interest.toLowerCase().contains("όχι")) {

                newinterests.append(interest).append(", ");

            }

        }

        // Αφαίρεση του τελευταίου ", "
        if (newinterests.length() > 0) {

            newinterests.setLength(newinterests.length() - 2);

        }

        return newinterests.toString();

    }

}
