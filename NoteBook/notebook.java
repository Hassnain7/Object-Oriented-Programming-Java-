import java.util.ArrayList;
public class notebook
{
    String note;
    ArrayList<String>notes=new ArrayList<>();
    public void addNote(String note)
    {
        notes.add(note);
        System.out.println("note added successfully ");
    }
    public void DisplayNote()
    {
        if(notes.isEmpty())
        {
            System.out.println("invalid");
        }
        else
        {
            for(int i=0;i<notes.size();i++)
            {
                System.out.println((i+1)+"."+notes.get(i));
            }
        }
    }
    public void SearchNote(String note)
    {
        for(String n:notes)
        {
            if(n.contains(note))
            {
                System.out.println("The notes found:"+n);
            }
            else
            {
                System.out.println("no notes found");
            }
        }
    }
    public void deleteNote(int index)
    {
        if(index>0 &&index<=notes.size())
        {
            System.out.println("The notes deleted:"+notes.remove(index-1));
        }
        else
        {
            System.out.println("no notes deleted");
        }
    }
}