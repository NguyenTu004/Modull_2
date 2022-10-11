public class StopWatch {
    private long starTime ;
    private long stopTime = 0;
    public StopWatch(){
        starTime = System.currentTimeMillis();
    }
    public void star(){
        starTime = System.currentTimeMillis();
    }
    public void stop (){
        stopTime=System.currentTimeMillis();
        System.out.println(getElapsedTime() + " milliseconds.");
        System.out.println(getElapsedTimeSecs() + " seconds.");
    }
    public long getElapsedTime(){
        return stopTime-starTime;
    }
    public double getElapsedTimeSecs(){
       return  ((double)(stopTime-starTime))/1000;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int[] arr = new int[100000];
        for (int i=0;i<arr.length;i++){
                arr[i] = (int)(Math.random()*100);
        }
        watch.star();
        for (int j=0;j<arr.length;j++){
            for (int l=j+1;l<arr.length;l++){
                if (arr[j] > arr[l]){
                    int test = arr[j];
                    arr[j] = arr[l];
                    arr[l] = test;
                }
            }

        }
        watch.stop();
    }
}
