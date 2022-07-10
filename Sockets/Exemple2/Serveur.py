import socket
s = socket.socket()
print("Socket cree avec succes")
port = 5000
s.bind(('0.0.0.0',port))
print("socket attache a %s" %(port))
s.listen(5)
print("socket en ecoute !!!")
while True:
    c, addr = s.accept()
    print('recpetion des donnees provenant de ', addr)
    data = c.recv(1024)
    

    for i in range (0, len(data)):
        if(data[i]=='a' or data [i]=='e' or data[i]=='i' or data[i]=='o' or data[i]=='u' or data[i]=='A' or data[i]=='E' or data[i]=='I' or data[i]=='o'):
            data= data.replace(i, '#')
        else:
            data=data+data[i]         
   
    if not data:
        break
    c.sendall(data)
    c.close()
    
