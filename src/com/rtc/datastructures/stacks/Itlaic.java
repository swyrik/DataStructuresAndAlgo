package com.rtc.datastructures.stacks;

public class Itlaic implements Command{
    @Override
    public void execute() {
        System.out.println("Execute Italics");
    }

    @Override
    public void undo() {
        System.out.println("Undo Italics");
    }
}
