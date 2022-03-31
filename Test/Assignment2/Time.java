package Assignment2;

import java.util.Calendar;

public class Time {
    private Calendar t;
    private int y,m,d,hh,mm,ss;
    Time(){
        t=Calendar.getInstance();
        y=t.get(t.YEAR);
        m=t.get(t.MONTH)+1;
        d=t.get(t.DATE);
        hh=t.get(t.HOUR_OF_DAY);
        mm=t.get(t.MINUTE);
        ss=t.get(t.SECOND);
    }
    public String GetDate(){
        return y+"年"+m+"月"+d+"日";
    }
    public String GetTime(){
        return hh+"时"+mm+"分"+ss+"秒";
    }
}
