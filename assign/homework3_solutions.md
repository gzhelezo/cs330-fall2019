---
layout: default
course_number: CS330
title: "Assignment 4: Chapter 4 Solutions"
---

# Chapter 4 Homework Solutions 

### Problem 1 (10 pts)
What is the difference between routing and forwarding?
#### Solution: 
The key differences between routing and forwarding is that forwarding is a router’s local action of transferring packets from its input interfaces to its output interfaces and forwarding takes place at very short timescales (typically a few nanoseconds), and thus is typically implemented in hardware. Routing refers to the network-wide process that determines the end-to-end paths that packets take from sources to destinations. Routing takes place on much longer timescales (typically seconds) and is often implemented in software.

### Problem 2 (10 pts)
Visit a host that uses DHCP to obtain its IP address, network mask, default router, and IP address of its local DNS server. List these values.
#### Solution: 
*This will vary:*
- IPv4 Address: 192.168.1.69
- Subnet Mask: 255.255.255.0
- Default Gateway: 192.168.1.1
- DHCP Server: 192.168.1.1
- DNS Servers: 192.168.1.1

### Problem 3 (10 pts) 
Suppose Host A sends Host B a TCP segment encapsulated in an IP datagram. When Host B receives the datagram, how does the network layer in Host B know it should pass the segment (that is, the payload of the datagram) to TCP rather than to UDP or to something else?
#### Solution: 
The 8-bit protocol field in the IP datagram contains information about which transport layer protocol the destination host should pass the segment to.

### Problem 4 (10 pts)
Compare and contrast the IPv4 and the IPv6 header fields. Do they have any fields in common?

#### Solution:
IPv6 has a fixed length header, which does not include most of the options an IPv4 header can include. Even though the IPv6 header contains two 128-bit addresses (source and destination IP address) the whole header has a fixed length of 40 bytes only. Several of the fields are similar in spirit. Traffic class, payload length, next header and hop limit in IPv6 are respectively like type of service, datagram length, upper-layer protocol and time to live in IPv4.

### Problem 5 (10 pts)
Consider sending a 2400-byte datagram into a link that has an MTU of 700 bytes. Suppose the original datagram is stamped with the identification number 422. How many fragments are generated? What are the values in the various fields in the IP datagram(s) generated related to fragmentation? 

#### Solution: 
4 required fragments, since 2400 - 20 bytes for IP header => (2400-20)/680 = 4. The max size of data field in each fragment will be 680 bytes, since the IP header is 20 bytes. Each fragment, except the last one will be 700 bytes. Last fragment will be 360 bytes (including the 20 bytes IP header). The 4 offsets are 0, 85, 170, 255. First 3 flags are 1, last one is 0. 
