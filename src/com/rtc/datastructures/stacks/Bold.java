package com.rtc.datastructures.stacks;

public class Bold implements Command {
    @Override
    public void execute() {
        System.out.println("execute bold");
    }

    @Override
    public void undo() {
        System.out.println("execute bold");
    }
}
