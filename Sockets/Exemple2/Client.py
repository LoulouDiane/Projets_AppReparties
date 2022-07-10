# coding: utf-8

import socket
s=socket.socket()
port = 5000
s.connect(('127.0.0.1', port))
input_string=input("Entrer les donnees a envoyer >")
s.sendall(input_string.encode())
print (s.recv(1024))
s.close ()

