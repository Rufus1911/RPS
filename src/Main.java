public class Main {
    public static void main(String [] args){
        RPS.choice playerOneChoice = RPS.choice.ROCK;
        RPS.choice playerTwoChoice = RPS.choice.ROCK;

        RPS.shoot(playerOneChoice, playerTwoChoice);
    }
}
