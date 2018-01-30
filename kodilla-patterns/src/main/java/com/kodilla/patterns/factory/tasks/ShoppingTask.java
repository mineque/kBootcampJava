package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    boolean isTaskExecuted = false;
    double quantity;

    ShoppingTask(String taskName, String whatToBuy, double quantity){
    this.taskName = taskName;
    this.whatToBuy = whatToBuy;
    this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        this.isTaskExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
