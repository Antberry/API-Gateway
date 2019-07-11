

package API.Gateway;


public class Library {

    public static void main(String[] args) {
        String sentence = repeatedWord("This is the sentence with the words");
        System.out.println(sentence);
    }

    public static String repeatedWord(String str){
        String dupWord = "";
        str = str.toLowerCase();

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    dupWord = words[j];
                    return dupWord;
                }
            }
        }
        return dupWord;
    }
}
