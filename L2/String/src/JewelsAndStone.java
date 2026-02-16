import java.util.*;

public class JewelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStone s = new JewelsAndStone();
        System.out.println(s.numJewelsInStones("aA", "aAAbbbb"));
    }
}
