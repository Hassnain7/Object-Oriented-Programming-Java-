import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        SpellChecker s1=new SpellChecker();
        System.out.println("--------The total number of words ----------");
        System.out.println(s1.numberOfWords());
        System.out.println("----------The word is present in dictionary-------");
        System.out.println(s1.isKnownWord("oop"));
        System.out.println("-----------The all words are present-------------");
        System.out.println(s1.allKnown(s1.r1.getDictionary()));
        System.out.println("-------Words starting with the prefix-------");
System.out.println(s1.wordsStartingWith("photo"));
System.out.println("--------------Words containing with---------");
System.out.println(s1.wordsContaining("PHOTO"));
System.out.println("-----------Adding the word---------------");
        s1.insert("aan");
        System.out.println("----------Removing the word--------------");
        System.out.println(s1.remove("navan"));
        System.out.println("----------Saving the dictionary--------");
        s1.save();
        System.out.println("-------Palandroming---------");
        System.out.println(s1.isPalindrome("oop"));
        System.out.println("---------Anagrams--------------");
        System.out.println(s1.Anagrams("oop"));
        System.out.println("------------Difference------------");
ArrayList<String>newDict=new ArrayList<>();
newDict.add("ali");
        //s1.difference(s1.r1.getDictionary()).set(6,"namaste");
       System.out.println(s1.difference(newDict));
       // System.out.println(s1.difference(s1.r1.getDictionary()));
    }
}
