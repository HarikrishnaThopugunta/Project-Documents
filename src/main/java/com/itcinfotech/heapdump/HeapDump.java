package heapdump;

import java.util.ArrayList;
import java.util.List;

public class HeapDump {
    public static void main(String[] args) {
        List numbers = new ArrayList<>();
        try {
            while (true) {
                numbers.add(10);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred!");
        }
    }
}