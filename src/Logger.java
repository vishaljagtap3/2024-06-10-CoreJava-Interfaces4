public class Logger {
    public static void printLog(Loggable loggable) {
        loggable.log();
        loggable.info();
        System.out.println("------------------");
    }
}
