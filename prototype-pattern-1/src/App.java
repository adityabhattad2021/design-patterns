public class App {
    public static void main(String[] args) throws Exception {
        
        Prototype chess1 = new Chess("Chess 1", 1, 2);

        Chess chess2 = (Chess) chess1.clone();

        System.out.println(chess1);
        System.out.println(chess2);

        TicTacToe ticTacToe1 = new TicTacToe("TicTacToe 1", 3, 4);

        TicTacToe ticTacToe2 = (TicTacToe) ticTacToe1.clone();

        System.out.println(ticTacToe1);
        System.out.println(ticTacToe2);

    }
}
