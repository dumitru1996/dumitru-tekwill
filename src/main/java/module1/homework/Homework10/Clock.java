package module1.homework.Homework10;

import static java.lang.String.*;

public class Clock {
    private int hours;
    private int minutes;


    public String timeView(int time){
        if(time>=0 && time<10){
            return "0" +time;
        } else {
            return valueOf(time);
        }
    }


    public String next(){
        if(minutes>=60){
            return "maximum minutes value can be 59";
        } if (hours>=25){
            return "maxim value of hours can be 24";
        }

        minutes+=1;

        if(minutes==60){
            hours+=1;
            minutes=0;
        }
        if (hours==24){
            hours=0;
        }

        String hour = timeView(hours);
        String minute = timeView(minutes);

        return hour + ":" + minute;
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours =0;
        clock.minutes=4;
        System.out.println(clock.next());
    }
}
