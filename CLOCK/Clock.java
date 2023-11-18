public class Clock {
    private  Number hour=new Number();
    Number min=new Number();
    Number sec=new Number();
    Number con=new Number();

    void setTime(int m,int n,int z)
    {
        hour.setNumber(m);
        min.setNumber(n);
        sec.setNumber(z);
    }
    void Tick()
    {
        sec.increment();
        if(sec.getNumber()==0)
        {
            min.increment();
        }
        if(min.getNumber()==0)
        {
            hour.increment();
        }
    }
    String getTime()
    {
        return (hour.getTNumber()+":"+min.getTNumber()+":"+sec.getTNumber()+":"+con.getCondition());
    }
}
