class Solution {
    public boolean isValid(String s) {
        char[] myArr = s.toCharArray();
        char popChar = ' ';
        Stack<Character> myStack = new Stack<>();
        if(myArr.length<2){
            return false;
        }
        for(int i = 0;i<myArr.length;i++){
            if(myArr[i] == '[' || myArr[i] == '{' || myArr[i] == '('){
                myStack.push(myArr[i]);
            }else if((myArr[i] == ']' || myArr[i] == '}' || myArr[i] == ')')){
                if(myStack.isEmpty()){
                    return false;
                }
                popChar = myStack.peek();
                 if(myArr[i] == ']' && popChar == '['){
                     myStack.pop();
                }
                else if(myArr[i] == '}' && popChar == '{'){
                     myStack.pop();
                }
                else if(myArr[i] == ')' && popChar == '('){
                     myStack.pop();
                }else{
                    return false;
                }
                
            }
                // return false;
        }
        if(myStack.isEmpty()){
            return true;
        }
        return false;
        
    }
}
