package com.rtc.datastructures.stacks;

public class Underline implements Command {
    @Override
    public void execute() {
        System.out.println("executes underline");
    }

    @Override
    public void undo() {
        System.out.println("undo underline");
    }
}
