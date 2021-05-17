package AkilliCihaz;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject {
    public List<IObserver> subscribers=new ArrayList<>();

    @Override
    public void attach(IObserver subs) {
        subscribers.add(subs);
    }

    @Override
    public void detach(IObserver subs) {
        subscribers.remove(subs);
    }

    @Override
    public void notify(String message) {
        for(IObserver subscriber:subscribers) {
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            subscriber.update(message);
        }


    }

}
