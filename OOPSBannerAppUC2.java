public class OOPSBannerAppUC2 {
    public static void main(String[] args) {

        // Letter O
        String[] O = {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };

        // Letter P
        String[] P = {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };

        // Letter S
        String[] S = {
            "  *****  ",
            " *       ",
            " *       ",
            "  *****  ",
            "       * ",
            "       * ",
            "  *****  "
        };

        // Print banner line by line
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + O[i] + P[i] + S[i]);  // OOPS
        }
    }
}