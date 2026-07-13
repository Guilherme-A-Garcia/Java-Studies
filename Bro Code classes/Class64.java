// Flow Management - Timers/Timertasks

import java.util.Timer;
import java.util.TimerTask;

public class Class64{
    public static void main(String[] args){
        // (This is deprecated, use ScheduledExecutorService instead!)
        // Timer = Class that schedules tasks at specific times or periodically.
        // Useful for: sending notifications, schedule updates, repetitive actions, etc.

        // TimerTask = Represents the task that will be executed by the Timer.
        // You will extend the TimerTask class to define your task.
        // Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;
            @Override
            public void run(){
                System.out.println("Running!");
                count--;

                if(count <= 0){
                    System.out.println("Task complete!");
                    timer.cancel(); // Actually stopping the task
                }
            }
        };
        
        // Scheduling task.run():
        timer.schedule(task, 0, 3000);
    }
}