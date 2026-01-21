class Foo {

    static Semaphore sem1 = new Semaphore(0); // bloqueado
    static Semaphore sem2 = new Semaphore(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        printFirst.run();
        Foo.sem1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        Foo.sem1.acquire();
        printSecond.run();
        Foo.sem2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        Foo.sem2.acquire();
        printThird.run();

    }
}