import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    /**
     * Build a map of characters to their banner patterns.
     * @return Map with character keys and 7-line String array as values
     */
    private static Map<Character, String[]> buildCharacterMap() {
        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        });

        charMap.put('P', new String[]{
            "****",
            "*   *",
            "*   *",
            "****",
            "*",
            "*",
            "*"
        });

        charMap.put('S', new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        });

        return charMap;
    }

    /**
     * Render a message in banner format using the character map.
     * @param message The string message to display
     * @param charMap Map containing character patterns
     */
    private static void renderBanner(String message, Map<Character, String[]> charMap) {
        int lines = 7; // 7 lines per character
        for (int i = 0; i < lines; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : message.toCharArray()) {
                String[] pattern = charMap.get(c);
                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }
            System.out.println(line.toString().trim());
        }
    }

    public static void main(String[] args) {
        // Build map of characters
        Map<Character, String[]> charMap = buildCharacterMap();

        // Render the word "OOPS"
        renderBanner("OOPS", charMap);
    }
}