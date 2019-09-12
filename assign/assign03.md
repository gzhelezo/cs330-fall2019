---
layout: default
course_number: CS330
title: "Programming Assignment 1: HTTP Server"
---

### My First Web Server 
We will revise the simple web server we created in class to serve up real content. In order to do so, you need to do the following: 

- Update your server so that can receive and parse HTTP requests.
- Extracts the file path from the URL. Remember the URL is the second token in the request line.   
- If the file in the request exists - return _200 OK_ and the file contents as the entity body in the HTTP response message.
- If file doesn’t exist, send a properly formatted _404 Not Found_ error message. The requested files can live in the _current directory_.

### Notes
- I will demo my version of the server before we go over the assignment.
- [WebServer](WebServer.java) - in case you couldn't finish the initial code at class.

### Extra Credit 
- Rewrite your server so that it can accept multiple connections (this allows the server to serve arbitrary number of clients). 
Hint: start a separate thread for every new client
- Append the thread name for each connection to the response headers.  

### References 
- [ServerSocket](https://docs.oracle.com/javase/8/docs/api/java/net/ServerSocket.html)
- [Socket](https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html)
- [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)

### Submit 

Post your source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus. I may ask you to demo your program to me.

### Hints
If you get stuck extracting the URL from the request line, [this](getfilename.txt) starting point may help.
