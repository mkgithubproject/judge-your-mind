#   *
   ***
  * # *
 *  #  *
*********
 *  ^  *
  * ^ *
   *^*
    ^
    #

def printPattern(n):
    rows=1
    while rows<n:
        # print upper left portion
        spaces=n-rows
        while spaces>0:
            print(" ",end='')
            spaces=spaces-1
        symbol=rows
        print('*',end='')
        symbol=symbol-1
        if(symbol==1):
            print('*',end='')
        elif symbol>1:
            symbol=symbol-1
            while symbol>0:
                print(" ",end='')
                symbol=symbol-1
            print("#",end='')
        # print upper right portion
        symbol=rows-1
        #print spaces
        spaces=symbol-1
        while spaces>0:
            print(" ",end='')
            spaces=spaces-1
        if symbol>0:
          print("*",end='')
        print()#change line after evry rowth printing
        rows=rows+1
    #print last row
    lastRow=n*2-1
    while lastRow>0:
        print("*",end='')
        lastRow=lastRow-1
        
    
    #print lower left pattern
    print()#change line
    rows=1
    while rows<n-1:#number of rows
        #print coloumns
        spaces=rows
        while spaces>0:
            print(" ",end='')
            spaces=spaces-1
        symbol=n-rows
        print("*",end='')
        symbol=symbol-1
        while symbol-1>0:
            print(" ",end='')
            symbol=symbol-1
        print("^",end='')
        
        #print lower right pattern
        
        symbol=n-1-rows
        spaces=symbol-1
        while spaces>0:
            print(" ",end='')
            spaces=spaces-1
        print("*",end='')
        print()#change line after evry rowth printing
        rows=rows+1
    #print last rows
    spaces=n-1
    while spaces>0:
        print(" ",end='')
        spaces=spaces-1
    print("^",end='')
         
        
    
printPattern(10)
