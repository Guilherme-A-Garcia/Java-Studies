// Flow Management - Building a countdown timer with Timer/TimerTask

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Class65 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        int response;
        
        System.out.println("Java Countdown Timer\n");
        
        System.out.print("Enter an amount of seconds to countdown from: ");
        response = scanner.nextInt();
        
        TimerTask task = new TimerTask() {
            int count = response;
            @Override
            public void run(){
                System.out.println(count);
                count--;

                if(count < 0){
                    System.out.println("The time is up!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // (task, delay, period)

        scanner.close();
    }
}


