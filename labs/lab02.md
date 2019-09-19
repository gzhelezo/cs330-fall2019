---
layout: default
course_number: CS330
title: "Lab 2 - Socket Introduction"
---

# Lab 2 - Socket Introduction   

### Download and compile the following:
  - TCPClient.java 
  - UDPClient.java
  - TCPServer.java
  - UDPServer.java
 
### We use the following simple client/server applications do demonstrate UDP and TCP socket programming. 
  - A client reads a line from its standard input and sends the line out its socket to the server.
  - The server reads a line from its socket. 
  - The server converts the line to uppercase.
  - The server sends the modified line out its socket to the client. 
  - The client reads the modified line through its socket and prints the line on its standard output.

###  Run the applications and answer the following questions: 
  - Suppose you run TCPClient before you run TCPServer. 
    - What happens? 
    - Why?
  - Suppose you run UDPClient before you run UDPServer. 
    - What happens? 
    - Why? 
  - What happens if you use different port numbers for the UDP client and UDP server sides?
  - What happens if you use different port numbers for the TCP client and TCP server sides?
  - Run UDPServer and UDPClient – send a message. Run UDPClinet again (while UDPServer is still running), but this time with a shorter message. 
    - What happens? 
    - Why?
    - Extra Credit: Can if you fix it?    
  - Update TCPClient, UDPClient, TCPServer and UDPServer to accept the port number as a user input.
  - Change the receiveData in UDPClient to allocate 1 byte instead of 1024. Run the UDPClient and the UDPServer – send a message with length more than 1. 
    - What happens? 
    - Why?
  - Change the allocation size of sendData in UDPClient to 1 and rerun the client. 
    - What do you expect will happen?
    - What happens?  
    - Why? 
    - Is this a bug? And if it is, can you fix it?
