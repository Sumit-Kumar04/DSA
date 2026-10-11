
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n=1;
    private int counter=0;
    private int limit;

    public FizzBuzz(int n) {
        this.limit = n;
    }

    private void updateCounter() {
        if(n%3==0 && n%5==0){
            counter=1;
        }else if(n%3==0 && n%5!=0){
            counter=2;
        }else if(n%5==0 && n%3!=0){
            counter=3;
        }else{
            counter=0;
        }
    }

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while(n<=limit){
            while(n<=limit && counter!=2){
                wait();
            }
            if(n>limit) break;
            printFizz.run();
            n++;
            updateCounter();
            notifyAll();
        }
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printFizz) throws InterruptedException {
        while(n<=limit){
            while(n<=limit && counter!=3){
                wait();
            }
            if(n>limit) break;
            printFizz.run();
            n++;
            updateCounter();
            notifyAll();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(n<=limit){
            while(n<=limit && counter!=1){
                wait();
            }
            if(n>limit) break;
            printFizzBuzz.run();
            n++;
            updateCounter();
            notifyAll();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while(n<=limit){
            while(n<=limit && counter!=0){
                wait();
            }
            if(n>limit) break;
            printNumber.accept(n);
            n++;
            updateCounter();
            notifyAll();
        }
    }
}
