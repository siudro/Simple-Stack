/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author KHELLO
 */
public class Stack {

    private int maxStack;
    private int emptyStack;
    private int top;
    private char[] items;

    public Stack(int size) {
        maxStack = size;
        emptyStack = -1;
        top = emptyStack;
        items = new char[maxStack];
    }

    public void push(char c) {
        items[++top] = c;
    }

    public char pop() {
        return items[top--];
    }

    public boolean isFull() {
        return top + 1 == maxStack;
    }

    public boolean isEmpty() {
        return top == emptyStack;
    }
}

public class StackMain {

    final static int STACK_SIZE = 10;

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        Stack s = new Stack(STACK_SIZE); // 10 chars 
        char ch;
        System.out.println("Enter 10 characters:");
        for (int i = 0; i < STACK_SIZE; i++) {
            ch = read.next().charAt(0);
            if (!s.isFull()) {
                s.push(ch);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
        System.out.println();
    }
}
