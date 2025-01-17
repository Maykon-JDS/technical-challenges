import java.util.*;
import java.lang.Math;

public class Elevator {
    public static String call(int left, int right, int call){

      Map<String, Integer> distance = new HashMap<>();

      if(left == right){

        return "right";

      }

      distance.put("left", Math.abs(left - call));
      distance.put("right", Math.abs(right - call));

      if(distance.get("left") >= distance.get("right")){

        return "right";

      }

      return "left";
    }
}