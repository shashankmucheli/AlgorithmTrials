package algorithmtrials;

import static java.lang.System.exit;
import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String time,pm,am;
        try{
        Scanner in = new Scanner(System.in);
        time = in.next();
        pm = "PM";
        am = "AM";
        String[] str = time.split(":");
            for (String str1 : str) {
                //System.out.println(str[i]);
            }
            String st;
            st = str[2].replaceAll("\\D+","");
            int hh = Integer.parseInt(str[0]);
            int mm = Integer.parseInt(str[1]);
            int ss = Integer.parseInt(st);
            if (hh > 12 || mm > 60 || ss > 60) { System.out.println("Incorrect AM/PM Format: "+hh+":"+mm+":"+st); exit(0);}
            if (time.contains(pm)){
                if(hh != 12){
                    int tmp = (hh+12);
                    str[0] = String.valueOf(tmp);
                }
                System.out.println(str[0]+":"+str[1]+":"+st);
            }
            if (time.contains(am)){
                if(hh == 12){str[0]="00";}
                System.out.println(str[0]+":"+str[1]+":"+st);
            }
           
        }
         catch (Exception e){
            e.printStackTrace();
        }
    }
}