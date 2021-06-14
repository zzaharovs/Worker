package ru.netology;

public class Worker {

    private Main.OnTaskDoneListener callback;
    private Main.OnTaskErrorListener errorCallback;

    public Worker (Main.OnTaskDoneListener callback, Main.OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {

        for (int i = 0; i < 100; i++) {

            if (i == 33) {
                errorCallback.onError("Task " + i + " not completed");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }

    }


}
