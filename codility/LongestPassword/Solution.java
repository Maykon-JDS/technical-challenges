// you can also use imports, for example:
// import java.util.*;
import java.util.*;
import java.util.regex.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {

        String[] words = this.getWords(S);

        return Arrays.stream(words)
            .filter(this::hasOnlyAlphanumericalCharacters)
            .filter(e -> countDigits(e) % 2 != 0)
            .filter(e -> countLetters(e) % 2 == 0)
            .map(String::length) // Converte para um Stream<Integer> com os tamanhos das palavras
            .max(Integer::compare) // Pega o maior tamanho
            .orElse(-1);

    }

    private String[] getWords(String S){

        String[] words = S.split("\\s+");

        return words;

    }

    private boolean hasOnlyAlphanumericalCharacters(String word){

        String regex = "[a-zA-Z0-9]*";

        boolean matches = Pattern.matches(regex, word);

        return matches;
    }

    private long countDigits(String word) {

        long count = word.chars().filter(Character::isDigit).count();

        return count;
    }

    private long countLetters(String word) {

        long count = word.chars().filter(Character::isLetter).count();

        return count;
    }

}