package CRT;

class PatternStar {
    public static void main(String[] args) {

        int width = 13;

        // Upper V shape
        for (int i = 1; i <= 3; i++) {
            for (int s = 1; s <= width; s++) {
                if (s == (8 - i * 2) || s == (8 + i * 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Middle horizontal line
        for (int i = 1; i <= 7; i++) {
            System.out.print("*  ");
        }
        System.out.println();

        // Lower vertical lines
        for (int i = 1; i <= 3; i++) {
            for (int s = 1; s <= width; s++) {
                if (s == 4 || s == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Bottom stars
        System.out.print("   ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("*  ");
        }
    }
}
