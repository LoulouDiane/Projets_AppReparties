import socket
s=socket.socket()
print ("Socket cree avec succes")
port = 5000
s.bind(('0.0.0.0',port))
print ("socket attache a %s" %(port))
s.listen(5)
print ("socket en ecoute !!!")
while True:
    c, addr = s.accept()
    print ('recpetion des donnees provenant de ', addr)
    data = c.recv(1024)
    data = data[::-1]

    if not data:
        break
    c.sendall(data)
    c.close()
