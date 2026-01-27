class Solution {

    /**
     * @param Integer $num
     * @return String
     */
    function intToRoman($num) {
        
        $result = "";
        $t = null;
        while($num > 0){
            if(!in_array(((string) $num)[0],["9","4"])) {
                $t = match(true) {
                    (($num - 1000) >= 0) => ["M", ($num - 1000)],
                    (($num - 500) >= 0) => ["D", ($num - 500)],
                    (($num - 100) >= 0) => ["C", ($num - 100)],
                    (($num - 50) >= 0) => ["L", ($num - 50)],
                    (($num - 10) >= 0) => ["X", ($num - 10)],
                    (($num - 5) >= 0) => ["V", ($num - 5)],
                    (($num - 1) >= 0) => ["I", ($num - 1)],
                };

                $num = $t[1];
                $result .= $t[0];
                continue;
            }

            $t = match(true) {
                ((strlen((string) $num) == 3) && ((string) $num)[0] == 9) => ["CM", ($num - 900)],
                ((strlen((string) $num) == 3) && ((string) $num)[0] == 4) => ["CD", ($num - 400)],
                ((strlen((string) $num) == 2) && ((string) $num)[0] == 9) => ["XC", ($num - 90)],
                ((strlen((string) $num) == 2) && ((string) $num)[0] == 4) => ["XL", ($num - 40)],
                ((strlen((string) $num) == 1) && ((string) $num)[0] == 9) => ["IX", ($num - 9)],
                ((strlen((string) $num) == 1) && ((string) $num)[0] == 4) => ["IV", ($num - 4)],
            };

            $num = $t[1];
            $result .= $t[0];
        }

        return $result;
    }
}