package konrad.dataformats.core;

public class Time {
    private long start;

    void start() {
        start = System.currentTimeMillis();
    }

    void stopAndLog(String message) {
        long stop = System.currentTimeMillis();
        System.out.println(message + " took " + (stop - start) + " ms");
    }
}
