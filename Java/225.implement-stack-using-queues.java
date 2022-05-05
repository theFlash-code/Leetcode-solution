/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
class MyStack {
    List<Integer> list;
    int top;

    public MyStack() {
        list = new ArrayList<>();
        top = -1;
    }

    public void push(int x) {
        top++;
        list.add(top, x);
    }

    public int pop() {
        top--;
        return list.get(top + 1);
    }

    public int top() {
        return list.get(top);
    }

    public boolean empty() {
        if (top == -1)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
