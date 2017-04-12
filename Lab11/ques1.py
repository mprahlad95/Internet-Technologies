def market(filename):
    fo = open(filename,"r")
    global str
    str = fo.read();
    #print "Read String is : ", str
    fo.close()
    #print filename
    
    return;
	
str1 = input("Enter your input: ");
market(str1)

class Farmer_Market:
   FMID=0
   market_name=0
   web_address=0
   street_address=0
   city=0
   state=0
   zipcode=0
   x=0
   y=0

   def display(self):
      g=str.split('\n')
      l=len(g)
      pri9nt ("hi")
      g1=g.split(';')
      print (g)
      print (g1)
      farmer[l]=Farmer_Market();
      farmer[0].FMID=g1[0]
      Farmer_Market.FMID=g[0];
      print (Farmer_Market.FMID)
      return;

b=str.split();
blen=len(b)
#print blen
objs = list()
far=list()
for i in range(3):
    objs.append(Farmer_Market())
g=str.split('\n')
#print g

m=0;

#print far
for n in range(3):
      m=0;
      far=g[n].split(';')
      print (far);
      objs[n].FMID=far[m];
      m=m+1;
      objs[n].market_name=far[m];
      m=m+1;
      objs[n].web_address=far[m];
      m=m+1;
      objs[n].street_address=far[m];
      m=m+1;
      objs[n].city=far[m];
      m=m+1;
      objs[n].state=far[m];
      m=m+1;
      objs[n].zipcode=far[m];
      m=m+1;
      objs[n].x=far[m];
      m=m+1;
      objs[n].y=far[m];
      print (n)
   
print (objs[1].FMID)
print (objs[2].FMID)
print (objs[0].market_name)
#print objs[3].FMID;
      #farmer1=Farmer_Market()
#farmer1.display()


