package leetcode;

import java.util.LinkedList;

public class offer09 {
    public static void main(String[] args) {
        System.out.println("hh");
    }
    class CQueue {
        LinkedList<Integer> stack1;
        LinkedList<Integer> stack2;
        public CQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if(stack2.isEmpty()){
                if(stack1.isEmpty()){
                    return -1;
                }else{
                    while(!stack1.isEmpty()){
                        stack2.add(stack1.pop());
                    }
                    return stack2.pop();
                }
            }else{
                return stack2.pop();
            }
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
