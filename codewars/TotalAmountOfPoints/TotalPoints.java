import java.util.*;

public class TotalPoints {

    public static int points(String[] games) {

      int result = 0;

      for (String game : games) {

        String[] points = game.split(":");

        if (Integer.parseInt(points[0]) > Integer.parseInt(points[1])){

          result += 3;

        }
        else if (Integer.parseInt(points[0]) < Integer.parseInt(points[1])){

          result += 0;

        }
        else{

          result += 1;

        }

      }

      return result;

    }
}