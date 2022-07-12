#!/usr / env python3
import paho.mqtt.client as mqtt
# This is the Subscriber

client = mqtt.Client()
client.connect("localhost",1883,60)
client.publish("topic/temperature","Bonjour");
print("J'ai publié un message")
client.disconnect();
    
    
