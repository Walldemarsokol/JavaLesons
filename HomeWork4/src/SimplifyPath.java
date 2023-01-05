import java.util.Stack;
class SimplyPath{

}
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String str : arr) {
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!str.equals(".") && !str.isEmpty()) {
                stack.push(str);
            }
        }
        String res = "";
        if (stack.isEmpty()) return "/";
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        return res;
    }
}
