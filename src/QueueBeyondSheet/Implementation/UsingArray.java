package QueueBeyondSheet.Implementation;

public class UsingArray {
    static class Queue{
        private int[] arr = new int[4];
        private int size= arr.length;
        private int currentSize=0;
        private int start=0;
        private int end=0;

        void add(int val) throws Exception{
            if (currentSize == size) {
                throw new Exception("Queue is Full");
            }

            arr[end] = val;
            end = (end + 1) % size;
            currentSize++;
        }

        int peek() throws Exception{
            if(currentSize==0){
                throw new Exception("Queue is empty");
            }
            return arr[start];
        }

        int poll() throws Exception{
            if (currentSize == 0) {
                throw new Exception("Queue is empty");
            }

            int val = arr[start];
            start = (start + 1) % size;
            currentSize--;
            return val;
        }

        int sizeOf(){
            return currentSize;
        }
    }

    public static void main(String[] args) throws Exception {
        Queue queue= new Queue();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.sizeOf());
        queue.add(6);
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.sizeOf());
    }
}
