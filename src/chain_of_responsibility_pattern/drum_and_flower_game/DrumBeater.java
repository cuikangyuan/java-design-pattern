package chain_of_responsibility_pattern.drum_and_flower_game;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cuikangyuan on 2017/7/11.
 */
public class DrumBeater {

    private Timer timer;
    private static Player firstPlayer;
    public static boolean stopped = false;


    public static void main(String[] args) {
        DrumBeater drumBeater = new DrumBeater();
        A a = new A();
        a.setSuccessor(new B(new C(new D(new E(a)))));

        drumBeater.startBeating(1);

        firstPlayer = a;
        firstPlayer.handle();
    }

    private void startBeating(int time) {
        timer = new Timer();
        timer.schedule(new MyTimerTask(), time * 11);
    }

    private class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            stopped = true;
            timer.cancel();
        }
    }
}
