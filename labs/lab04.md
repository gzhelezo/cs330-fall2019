---
layout: default
course_number: CS330
title: "Programming Lab 3 - Simple Chat Server/Client"
---

# Programming Lab 3 - Simple Chat Server/Client   

### Intend
The intend of this exercise is to demonstrate how socket channels and buffers work together. 
We will be using simple client and server application to pass back and forth single line text messages. 
Specifically, you will create a simple version of a chat client handling flexible length messages.  

### Chat Server
The chat server was discussed and provided in class. 
A channel for stream oriented listening socket is open and bounded to a particular port on the host. 
The first while loop, controls the life cycle of our simple chat server. 
Once the connection is made, the server enters the server/client correspondence loop – second while loop. 
The server leaves the conversation when a special terminating keyword _ciao_ is entered by the user. 
The two methods used to read and write bytes from the channel are also provided.

### Tasks
- Your task is to create a simple chat client to communicate with the server. 
- Once a communication is made, the simple server prompts the user for a message to the client. 
- The client should wait until the message is received, and then will prompt its user for a reply message. 
- The reply message is sent send back to the server.
- The client leaves the conversation when a special terminating keyword _ciao_ is entered by the user or received by the server.

### Hints 
Your client _run_ method may follow the following flow:
```java

public void run() {
	// Create an IP socket address and a port number

	// open a socket channel to the provided IP socket address
	
	// Create an input stream scanner 

	// Enter the conversation loop
	
		// Receive message from the server
	
		// Prompts the user to enter a reply back
		
		// Check for terminating string
		
		// Send message to the server
}

```

### References 
- [SocketChannel](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/channels/SocketChannel.html)
- [ByteBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/ByteBuffer.html)

### Grading
Post your report including source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
