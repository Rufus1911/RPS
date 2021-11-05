public class RPS {
    enum choice {
        ROCK,
        PAPER,
        SCISSORS
    }

    public static void shoot(choice p1, choice p2){
        int victor = 0;
        if (p1 == p2){
            System.out.println("TIE");
        }
        else {
            switch (p1) {
                case ROCK:
                    if (p2 == choice.PAPER){
                        victor = 2;
                    }
                    else {
                        victor = 1;
                    }
                    break;
                case PAPER:
                    if (p2 == choice.SCISSORS){
                        victor = 2;
                    }
                    else {
                        victor = 1;
                    }
                    break;
                case SCISSORS:
                    if (p2 == choice.ROCK){
                        victor = 2;
                    }
                    else {
                        victor = 1;
                    }
                    break;
            }
            System.out.printf("\nPlayer %d has won!\n", victor);
        }
    }

}

