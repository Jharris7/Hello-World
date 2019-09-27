public class Game {

    Player p1,p2,p3;
    void StartGame(){

        int targetNum = (int) (Math.random() * 10);
        Player[] pArray = new Player[3];
        for (int x = 0; x < 3; x++) {

            pArray[x] = new Player();
            pArray[x].Guess();
        }
        for (int x = 0; x < 3; x++){

            if (pArray[x].guess  == targetNum){

                System.out.println("Player"+(x+1)+" is correct!");

            }
            else {

                System.out.println("Player"+(x+1)+" is incorrect!");

            }

        }

    }

}
