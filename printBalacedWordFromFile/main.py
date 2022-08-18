#input.txt
#   I shall be telling this with a sigh
#   somewhere ages and ages hence:
#   Two roads diverged in a wood, and I --
#   I took the one less traveled by,
#   And that has made all the difference.

#output
# I be this with a sigh 
# ages and ages 
# Two roads in a and I -- 
# I the one by, 
# And has made the 


with open('frost.txt') as file:
    lines = file.readlines()#read lines
    
    for line in lines:# traverse over lines
        li=line.split()# split line into list of words
        for word in li:#traverse over list of words
            freq={}#initialize dict
            for i in range(len(word)):#traverse over word and find freq of each character
                if word[i] in freq:
                    freq[word[i]]+=1
                else:
                    freq[word[i]]=1
            value=freq[word[0]]
            flag=0
            for k in freq.keys():# if any key has different value just break loop
                if freq[k]!=value:
                    flag=1
                    break;
            if flag==0:#balanced word found print it
                print(word,end=" ")
        print()
    
    
           

        
