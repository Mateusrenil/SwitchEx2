public class SwitchEx2 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                // break; // Removido
            case 'B':
                System.out.println("Good");
                // break; // Removido
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

