---
layout: default
course_number: CS330
title: "Assignment 3: Chapter 2 Solutions"
---

# Chapter 2 Homework Solutions

### R6 (10 pts). 
Suppose you wanted to do a transaction from a remote client to a server as fast as possible. Would you use UDP or TCP? Why?
  - You would use UDP. With UDP, the transaction can be completed in one roundtrip time (RTT) - the client sends the transaction request into a UDP socket, and the server sends the reply back to the client's UDP socket. With TCP, a minimum of two RTTs are needed - one to set-up the TCP connection, and another for the client to send the request, and for the server to send back the reply.

### R12 (15 pts). 
Consider an e-commerce site that wants to keep a purchase record for each of its customers. Describe how this can be done with cookies.
  - When the user first visits the site, the server creates a unique identification number, creates an entry in its back-end database, and returns this identification number as a cookie number. This cookie number is stored on the user’s host and is managed by the browser. During each subsequent visit (and purchase), the browser sends the cookie number back to the site. Thus, the site knows when this user (more precisely, this browser) is visiting the site.
 
### R19 (15 pts). 
Is it possible for an organization’s Web server and mail server to have exactly the same alias for a hostname (for example, foo.com)? What would be the type for the RR that contains the hostname of the mail server? 
  - Yes, an organization’s mail server and Web server can have the same alias for a host name. The MX record is used to map the mail server’s host name to its IP address.
 
### R26 (15 pts). 
In Section 2.7, the UDP server described needed only one socket, whereas the TCP server needed two sockets. Why? If the TCP server were to support _n_ simultaneous connections, each from a different client host, how many sockets would the TCP server need? 
  - With the UDP server, there is no welcoming socket, and all data from different clients enters the server through this one socket. With the TCP server, there is a welcoming socket, and each time a client initiates a connection to the server, a new socket is created. Thus, to support n simultaneous connections, the server would need _n+1_ socket.
 
### P3 (15 pts). 
Consider an HTTP client that wants to retrieve a Web document at a given URL. The IP address of the HTTP server is initially unknown. What transport and application-layer protocols besides HTTP are needed in this scenario? 
  - Application layer protocols: DNS and HTTP
  - Transport layer protocols: UDP for DNS; TCP for HTTP

### P20 (15 pts). 
Suppose you can access the caches in the local DNS servers of your department. Can you propose a way to roughly determine the Web servers (outside your department) that are most popular among the users in your department? Explain. 
  - We can periodically take a snapshot of the DNS caches in the local DNS servers. The Web server that appears most frequently in the DNS caches is the most popular server. This is because if more users are interested in a Web server, then DNS requests for that server are more frequently sent by users. Thus, that Web server will appear in the DNS caches more frequently. 
 
### P22 (15 pts). 
Consider distributing a file of _F =_ 15 Gbits to _N_ peers. The server has an upload rate of _u<sub>s</sub>_ = 30 Mbps, and each peer has a download rate of _d<sub>i</sub>_ = 2 Mbps and an upload rate of _u_. 
For _N_ = 10, 100, and 1,000 and _u_ = 300 Kbps, 700 Kbps, and 2 Mbps, prepare a **chart** giving the minimum distribution time for each of the combinations of _N_ and _u_ for both client-server distribution and P2P distribution. 
 -  Did in class
