def mindist(s1,s2):
    m=len(s1)
    n=len(s2)
    
    dp=[[0 for i in range(n+1)] for j in range(m+1)]
    
    for i in dp:
        print(i)
    print("******************************") 
    
    for i in range(m+1):
        for j in range(n+1):
            if i==0:
                dp[i][j]=j
            if j==0:
                dp[i][j]=i
                
    for i in dp:
        print(i)
    print("******************************")  
    
    for i in range(1,m+1):
        for j in range(1,n+1):
            if s1[i-1]==s2[j-1]:
                dp[i][j]=dp[i-1][j-1]
            else:
                dp[i][j]=min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j])+1
                
    for i in dp:
        print(i)  
    return dp[m][n]        
    
mini_dist=mindist("rashih","rakshith")

print("MinimumDistance=",mini_dist)
    
    