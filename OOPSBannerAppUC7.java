public class OOPSBannerUC7 {

    /**
     * Inner static class to store a character and its banner pattern.
     */
    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         * @param character Character to display
         * @param pattern 7-line banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** 
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to build 'O' pattern
     * @return 7-line pattern of O
     */
    private static String[] getOPattern() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    /**
     * Utility method to build 'P' pattern
     * @return 7-line pattern of P
     */
    private static String[] getPPattern() {
        return new String[]{
            "****",
            "*   *",
            "*   *",
            "****",
            "*",
            "*",
            "*"
        };
    }

    /**
     * Utility method to build 'S' pattern
     * @return 7-line pattern of S
     */
    private static String[] getSPattern() {
        return new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }

    /**
     * Main method to display OOPS banner
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap objects for O, P, S
        CharacterPatternMap O = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap P = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap S = new CharacterPatternMap('S', getSPattern());

        // Assemble banner for "OOPS"
        CharacterPatternMap[] word = {O, O, P, S};

        // Print each line of the banner
        for (int i = 0; i < 7; i++) { // 7 lines for each character
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cpm : word) {
                line.append(cpm.getPattern()[i]).append(" ");
            }
            System.out.println(line.toString().trim());
        }
    }
}