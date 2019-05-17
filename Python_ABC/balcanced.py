op=['(','{','[']
cl=[')','}',']']

def bal(s):
    stack=[]
    for i in s:
        if i in op:
            stack.append(i)
        elif i in cl:
            pos=cl.index(i)
            if(len(stack)>0 and op[pos]==stack[len(stack)-1]):
                stack.pop()
            else:
                return "unbalanced"
    else:
        return "balanced"
string = "[{}{})(]"
print(bal(string))