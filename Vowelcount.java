public class Vowelcount {
    public static void main(String[] args){

        int vowelsCount =0;
        int consonantCount =0;

        String word= "baall";
        char[] vowel = {'A','a','E','e','I','i','O','o','U','u'} ;

        for (int i=0;i<word.length();i++)
        {
            for (int j=0;j<vowel.length;j++) {

                if (word.charAt(i) == vowel[j])
                {
                    vowelsCount++;
                    consonantCount--;
                }

            }
            consonantCount++;

        }




        System.out.println( "Vowels= "+ vowelsCount);
        System.out.println( "Consonants= "+ consonantCount);

    }
}
