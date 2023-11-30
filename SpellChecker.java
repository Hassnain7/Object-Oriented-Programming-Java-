
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SpellChecker {
    DictReader r1 = new DictReader("C:\\Users\\User\\IdeaProjects\\Spelling\\src\\words.txt");

    public int numberOfWords() {
        return r1.getDictionary().size();
    }

    public boolean isKnownWord(String word) {
        if (r1.getDictionary().contains(word))
            return true;
        else
            return false;
    }

    public boolean allKnown(ArrayList<String> words) {
        Iterator<String> i1 = words.iterator();
        while (i1.hasNext()) {
            i1.next();
        }
        return true;
    }
    public ArrayList<String>wordsStartingWith(String prefix)
    {
        //Iterator i1=wordsStartingWith(prefix).iterator();
        ArrayList<String>start=new ArrayList<>();
for(String t:r1.getDictionary())
{
    if(t.toLowerCase().startsWith(prefix.toLowerCase()))
    {
        start.add(t);
    }
}
        return start;
    }
    public ArrayList<String>wordsContaining(String text)
    {
        ArrayList<String>contain=new ArrayList<>();
        for(String g:r1.getDictionary())
        {
            if(g.toLowerCase().contains(text.toLowerCase()))
            {
                contain.add(g);
            }
        }
        return contain;
    }
    public void insert(String newWord)
    {
        if(r1.getDictionary().contains(newWord))
        {
            System.out.println("sorry word cannot be added");
        }
        else
        {
            r1.getDictionary().add(newWord);
            System.out.println("The new word "+" is added ");
        }
    }
    public boolean remove(String newWord)
    {
        if(r1.getDictionary().contains(newWord))
        {
            System.out.println("The word is removed");
            return true;
        }
        return false;
    }
    public void save()
    {
        r1.save(r1.getDictionary());
        System.out.println("Dictionary saved successfully");
        System.out.println(r1.getDictionary().size()+" size after saving");
    }
    public boolean isPalindrome(String word)
    {
       // ArrayList<String>pala=new ArrayList<>();
        String reverse="";
            for(int i=word.length()-1;i>=0;i--)
            {
                reverse=reverse+word.charAt(i);
            }
           if(r1.getDictionary().contains(word))
           {
            System.out.println(reverse+" is palindromed");
            return true;
           }


            return false;
    }
    public ArrayList<String>difference(ArrayList<String>dictionary) {
        ArrayList<String> diff = new ArrayList<>();
        for (String e : dictionary) {
            if (!r1.getDictionary().contains(e.toLowerCase())) {
                diff.add(e);
            }
        }
        return diff;
    }

    public ArrayList<String >Anagrams(String word)
    {
    // String s1="aba";
        char[]a1=word.toCharArray();
        char[]a2=word.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean Result=Arrays.equals(a1,a2);

        ArrayList<String>a=new ArrayList<>();
        for(String l:r1.getDictionary()) {
       // if(l.equals(Result))
           //{
          //      System.out.println("is anagram");
        //}
            //else
            //{
            //    System.out.println("not anagram");
           // }
        if(l.toLowerCase().contains(word.toLowerCase()))
            {
                a.add(l);

            }
        }
        return a;

    }

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
        newDict.add("ahmed");
        newDict.add("Pakistan");
        newDict.add("Turkiye");
        //s1.difference(s1.r1.getDictionary()).set(6,"namaste");
        System.out.println(s1.difference(newDict));
        // System.out.println(s1.difference(s1.r1.getDictionary()));
    }

}



