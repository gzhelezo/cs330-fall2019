---
layout: default
course_number: CS330
title: "Lab 4 - Reliable Data Transfer Solutions"
---

# Lab 4 - Reliable Data Transfer Solutions   

###  R12. 
Visit the Go-Back-N Java applet at the companion [Web site](https://wps.pearsoned.com/ecs_kurose_compnetw_6/216/55463/14198702.cw/index.html).
- Have the source send five packets, and then pause the animation before any of the five packets reach the destination. Then kill the first packet and resume the animation. Describe what happens.
  - The packet loss caused a time out after which all the five packets were retransmitted.
- Repeat the experiment, but now let the first packet reach the destination and kill the first acknowledgment. Describe again what happens. 
  - Loss of an ACK didn’t trigger any retransmission as Go-Back-N uses cumulative acknowledgements.
- Finally, try sending six packets. What happens?
  - The sender was unable to send sixth packet as the send window size is fixed to 5.  

### R13. 
Repeat R12 (all questions), but now with the Selective Repeat Java applet. List how are Selective Repeat and Go-Back-N different?
- Have the source send five packets, and then pause the animation before any of the five packets reach the destination. Then kill the first packet and resume the animation. Describe what happens.
  - When the packet was lost, the received four packets are now buffered at the receiver. After the timeout, the sender host retransmits the lost packet and the receiver delivers the buffered packets to application [having the correct order].
- Repeat the experiment, but now let the first packet reach the destination and kill the first acknowledgment. Describe again what happens. 
  - Duplicate ACK is send by the receiver for the lost ACK.  
- Finally, try sending six packets. What happens?
  - The sender was unable to send sixth packet as the send window size is fixed to 5. 

List the difference? 
  - When a packet was lost, GO-Back-N retransmits all the packets whereas Selective Repeat retransmitted the lost packet only. In case of lost acknowledgment, selective repeat sent a duplicate ACK and as GO-Back-N uses cumulative acknowledgment, so that duplicate ACK is unnecessary.
