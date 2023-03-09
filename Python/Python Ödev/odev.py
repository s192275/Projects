a=[[1,'a',['cat'],2],[[[3]],'dog'],4,5]
c=[]
def duzlestir(a):
    for i in a:
        if(isinstance(i,list)):
            duzlestir(i)
        else:
          c.append(i)
    return c

print(duzlestir(a))


b = [[1, 2], [3, 4], [5, 6, 7]]
def Ters(b):
  for i in range(len(b)):
     b.reverse()
  return b
print(Ters(b))