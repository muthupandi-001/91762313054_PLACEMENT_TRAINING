public class LengthOfLastWord {
        public static void main(String[] args){
            String s ="Hello world";
            s = s.trim();
            int lastSpaceIndex = s.lastIndexOf(" ");
            System.out.println(s.length() - lastSpaceIndex - 1);
        }
    }

