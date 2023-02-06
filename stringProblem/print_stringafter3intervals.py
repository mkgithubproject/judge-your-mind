inp=input() # read input string

index=0
count=0
while index<len(inp): # iterate till i is less than length of inp string
    print(inp[index],end="") # print ith char
    count=count+1 # increment count
    index=index+1 # increment index
    if count==3: # if three on pattern printed then incremented index by 3
        index=index+3
        count=0 
