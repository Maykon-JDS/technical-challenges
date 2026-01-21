import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ZywOo {

  public static String warnTheSheep(String[] array) {

    List<String> queue = new ArrayList<>(Arrays.asList(array));

    if(isWolfFirstPosition(queue)){

      return "Pls go away and stop eating my sheep";

    }

    return recusiveVerify(queue, 0);

  }

  public static boolean isWolfFirstPosition(List<String> queue){

    if(queue.get(queue.size() - 1).equals("wolf")){

      return true;

    }

    return false;

  }

  public static String recusiveVerify(List queue ,int position){

    // Base Case
    if (isWolfFirstPosition(queue)){

      return "Oi! Sheep number " + (position)  + "! You are about to be eaten by a wolf!";

    }

    queue.remove(queue.size() - 1);

    // Recursive Case
    return recusiveVerify(queue, ++position);
  }


}
