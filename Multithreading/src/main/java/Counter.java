class Counter {
    int c =0;
    public synchronized void add() {
        c++;
    }
}