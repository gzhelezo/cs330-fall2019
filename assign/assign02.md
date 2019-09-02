---
layout: default
course_number: CS330
title: "Assignment 2: Chapter 1"
---

### Chapter 1 Homework

### P2. 
Equation 1.1 gives a formula for the end-to-end delay of sending one packet of length <i>L</i> over </i>N</i> links of transmission rate <i>R</i>. Generalize this formula for sending <i>P</i> such packets back-to-back over the <i>N</i> links.

### P6. 
This elementary problem begins to explore propagation delay and transmission delay, two central concepts in data networking. Consider two hosts, A and B, connected by a single link of rate <i>R</i> bps. Suppose that the two hosts are separated by <i>m</i> meters, and suppose the propagation speed along the link is <i>s</i> meters/sec. Host A is to send a packet of size <i>L</i> bits to Host B. 
  - Express the propagation delay, <i>d<sub>prop</sub></i>, in terms of <i>m</i> and <i>s</i>. 
  - Determine the transmission time of the packet, <i>d<sub>trans</sub></i>, in terms of <i>L</i> and <i>R</i>. 
  - Ignoring processing and queuing delays, obtain an expression for the end-to-end delay. 
  - Suppose Host A begins to transmit the packet at time _t_ = 0. At time _t = d<sub>trans</sub>_, where is the last bit of the packet? 
  - Suppose _d<sub>prop</sub>_ is greater than _d<sub>trans</sub>_. At time *t = d<sub>trans</sub>*, where is the first bit of the packet? 
  - Suppose _d<sub>prop</sub>_ is less than _d<sub>trans</sub>_. At time _t = d<sub>trans</sub>_, where is the first bit of the packet? 
  - Suppose *s* = 2.5 · 10<sup>8</sup>, *L* = 120 bits, and *R* = 56 kbps. Find the distance *m* so that _d<sub>prop</sub>_ equals _d<sub>trans</sub>_.

### P15. 
Let a denote the rate of packets arriving at a link in packets/sec, and let _μ_ denote the link’s transmission rate in packets/sec. Based on the formula for the total delay (i.e., the queuing delay plus the transmission delay) derived in the previous problem, derive a formula for the total delay in terms of <i>a</i> and <i>μ</i>.

### R22. 
List five tasks that a layer can perform. Is it possible that one (or more) of these tasks could be performed by two (or more) layers?

### Submit 

Post your solutions in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus. 
