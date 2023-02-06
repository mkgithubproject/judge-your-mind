def findLocations(originalString,pattern):
    li=[] # initialzed empty list for holding locations\
    i=0 # i pointing to 0th char of originalString
    j=0 # i pointing to 0th char of pattern
    while i <len(originalString):
        if originalString[i]!=pattern[j]:
            j=0 # pattern not matched again do j=0
        else: # if current char matched
            j=j+1 #increment j
            if j==len(pattern): # if j reached at the end of pattern means pattern matched
                li.append(i-len(pattern)+1) # append location to list
                j=0 # again do j =0
        i=i+1
    return li

originalString=input() # read input string
pattern=input() # read pattern
print(findLocations(originalString,pattern)) # call function

            

  
        
        
    
