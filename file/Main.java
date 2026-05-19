public class Main {
    public static void main(String[] args) {
        ///si usa il gioco medievale
        /// 
        ///
        GameFactory medievalFactory= new MedievalFactory();
        Game medievalGame= new Game(medievalFactory);

        medievalGame.play();

        System.out.println();

        ///si usa il gioco scifi
        /// 
        ///
        GameFactory sciFiFactory= new SciFiFactory();
        Game sciFiGame= new Game(sciFiFactory);

        sciFiGame.play();

    }
}
