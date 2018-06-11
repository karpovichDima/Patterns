import java.util.Date;

public class FactoryMethodApp {
    public static void main(String []args){
        WatchMaker maker = new RomeWatchMaker(); // new DigitalWatchMaker
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}

interface Watch{
    void showTime();
}

class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}

interface WatchMaker{
    Watch createWatch();
}

class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}

class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

