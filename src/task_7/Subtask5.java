package task_7;

public class Subtask5 {
    public static class ProcessString implements StringUtil{
        public static void main(String[] args) {
            String test = "String test StringUtil";

            System.out.println(StringUtil.howManyChars(test));
            System.out.println(StringUtil.oddChars(test));
        }
    }

    public interface StringUtil {
        static int howManyChars(String string) {
            return string.length();
        }

        static String oddChars(String string) {
            StringBuilder stringBuilder = new StringBuilder(string);

            for(int i = 0; i < stringBuilder.length(); i++) {
                if(i % 2 != 0) {
                    stringBuilder.deleteCharAt(i);
                }
            }

            return stringBuilder.toString();
        }
    }
}
