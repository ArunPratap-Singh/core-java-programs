package lamdaExpression.Vowel;

public class LamdaClass {

	public static void main(String[] args) {
		
		VowelCounter vowel = str -> {

            int count = 0;

            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' ||
                    ch == 'u') {

                    count++;
                }
            }

            return count;
		};
		
		int result = vowel.countVowels("Automation Testing");

        System.out.println("Number of Vowels = " + result);
	}

}
