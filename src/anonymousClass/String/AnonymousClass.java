package anonymousClass.String;

public class AnonymousClass {

	public static void main(String[] args) {
		
		StringOperation operation = new StringOperation() {

            @Override
            public void reverseString(String str) {

                String reverse = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                    reverse = reverse + str.charAt(i);
                }

                System.out.println("Original String : " + str);
                System.out.println("Reverse String  : " + reverse);
            }

            @Override
            public void countVowels(String str) {

                int count = 0;

                for (int i = 0; i < str.length(); i++) {

                    char ch = Character.toLowerCase(str.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {

                        count++;
                    }
                }

                System.out.println("Vowel Count     : " + count);
            }

            @Override
            public void countCharacters(String str) {

                int count = 0;

                for (int i = 0; i < str.length(); i++) {

                    if (str.charAt(i) != ' ') {
                        count++;
                    }
                }

                System.out.println("Character Count : " + count);
            }
        };

        operation.reverseString("Automation");

        System.out.println("=======================");

        operation.countVowels("Automation");

        System.out.println("=======================");

        operation.countCharacters("Automation Testing");
    


	}

}
