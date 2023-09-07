package lesson33;

import java.util.Arrays;

public class ComparableInterface {
    public static void main(String[] args) {

        int[] ints = {42, 2, 15, 0, 5,};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[]names={"John","Jack","Ann","Bill"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Player player=new Player(3,"Jack",21);
        Player player1=new Player(1,"Steve",19);
        Player player2=new Player(2,"Alex",24);

        Player[] team={player1,player2,player};

        Arrays.sort(team);
        System.out.println(Arrays.toString(team));

    }


}
