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
    
    data=data.decode()
    data =list(data)
    print(data)
    
    for i in range (0, len(data)):
        if (data[i] in "aeiouAEIOU"):
            data[i]="#"       
   
    if  data == None:
        break
    data="".join(data)
    c.sendall(data)
    c.close()
    
