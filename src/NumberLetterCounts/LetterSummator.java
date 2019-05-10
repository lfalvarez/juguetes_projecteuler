package NumberLetterCounts;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PowFinder{

        public static int find(int number) {
            String stringNumber = Integer.toString(number);
            int numberLength = stringNumber.length() - 1;
            return numberLength;
        }
}


class Teleporter{
    private Map<Integer, String> words = Stream.of(new Object[][]{
            {0, ""},
            {1, "one"},
            {2, "two"},
            {3, "three"},
            {4, "four"},
            {5, "five"},
            {6, "six"},
            {7, "seven"},
            {8, "eight"},
            {9, "nine"},
            {10, "ten"},
            {11, "eleven"},
            {12, "twelve"},
            {13, "thirteen"},
            {14, "fourteen"},
            {15, "fifteen"},
            {16, "sixteen"},
            {17, "seventeen"},
            {18, "eighteen"},
            {19, "nineteen"},
            {20, "twenty"},
            {30, "thirty"},
            {40, "forty"},
            {50, "fifty"},
            {60, "sixty"},
            {70, "seventy"},
            {80, "eighty"},
            {90, "ninety"},
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

    private Map<Integer, String> pows = Stream.of(new Object[][]{
            {100, "hundred"},
            {1000, "thousand"},

    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

    public String getStringFor(int number) {
        String result = "";


        if(this.words.containsKey(number)){
            return this.words.get(number);
        }
        int pow = PowFinder.find(number);
        int tenToThePow = (int) Math.pow(10, pow);
        int resto = number % tenToThePow;

        int remainer = number/tenToThePow;
        String leftOverNumber = "";
        
        if (this.words.containsKey(number - resto)) {
            return getRoundNumber(number, resto);
        }
        else {
            leftOverNumber = this.getStringFor(resto);
            String finished = this.words.get(remainer) + this.pows.get(tenToThePow);
            if(pow == 2 && resto >0){
                finished += "and";
            }
            return finished + leftOverNumber;
        }
    }

    private String getRoundNumber(int number, int resto) {
        String leftOverNumber;
        leftOverNumber = this.words.get(number - resto);
        return leftOverNumber + this.getStringFor(resto);
    }
}

public class LetterSummator {
    private int max;

    public LetterSummator(int i) {
        max = i;
    }

    public Object lettersCount() {
        int sum = 0;
        Teleporter teleporter = new Teleporter();
        for (int i = 1; i <= this.max; i++) {
            sum += teleporter.getStringFor(i).length();
        }
        return sum;
    }
}