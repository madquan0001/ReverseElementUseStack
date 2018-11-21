package com.company;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    Stack(){
        stack = new LinkedList<>();
    }

    public void push(int element){
        stack.addFirst(element);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}