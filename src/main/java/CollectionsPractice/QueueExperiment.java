package CollectionsPractice;

import java.util.Arrays;

public class QueueExperiment {
    private String[] stringQueue;
    private Integer queueSize;
    private Integer front = 0;
    private Integer back = 0;
    private Integer numberOfItems = 0;

    public QueueExperiment(Integer size){
        queueSize = size;
        stringQueue = new String[size];
        Arrays.fill(stringQueue, "empty");
    }

    public void  insert(String input){
        if (numberOfItems + 1 <=  queueSize){
            stringQueue[back] = input;
            back++;
            numberOfItems++;
            System.out.println("Insert" + input + "Was added to queue");
        } else {
            System.out.println("Queue if full. Can't Insert :(");
        }
    }
    public static void main(String[] args) {

    }
}
