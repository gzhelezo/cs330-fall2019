---
layout: default
course_number: CS330
title: "Lab 1 - Network Footprinting"
---

# Lab 1 - Into to Network Footprining 

This lab exercise will provide the students hands on experience working with basic tools to carryout network reconnaissance (also called network footprinting). Network footprinting is the process of accumulating information regarding a specific network environment, typically for the purpose of finding ways to penetrate the environment.  A short report will be prepared describing the results of exercise and what the student learned from the lab. We will cover these tools in greater details throughout the semester. 

### Task 1: nslookup

```nslookup``` is a network administration command line tool available for most operating systems. It is used for querying the Domain Name System (DNS) to obtain domain name or IP address mapping information.

1. In Windows, open a command prompt.
2. Type ```nslookup www.ycpcs.github.io``` and then press Enter.
3. What information is displayed? Take a screenshot for your report.
4. Now type in the IP address and see what is displayed, e.g. ```nslookup 127.0.0.1```.  Record your findings. Can you find one that works?
5. Repeat steps 1-3 for the following URLs:<br>
    a. ```www.google.com```<br>
    b. ```www.amazon.com```<br>
    c. ```www.microsoft.com```<br>
6. How useful is this tool?

### Task 2: ping

```ping``` is a network administration software utility used to test the reachability of a host on an (IP) Internet Protocol network. Ping measures the round-trip time for messages sent between hosts.

1. In Windows, open a command prompt.
2. Type ```ping www.ycpcs.github.io``` and then press Enter.
3. Note the responses back. Make sure the IP address or URL is reachable by getting a
response. Note the response provides information on the number of packets generated
and received, along with the time expired between the transmission and reception of
each. It also provides basics statistics on the minimum, maximum, and average packet
times.
4. Record your findings and take a screenshot for your report.
5. Repeat steps 1-4 for the following URLs:<br>
    a. ```www.google.com```<br>
    b. ```www.amazon.com```<br>
    c. ```www.microsoft.com```<br>
6. How useful is this tool?

### Task 3: tracert

```traceroute``` is a network diagnostic tool for tracing the route that an Internet Protocol (IP) packet takes to its destination, and measuring transit delays of packets across an Internet Protocol network. 

1. In Windows, go to the command prompt.
2. Type ```tracert``` and the IP address of a remote host recordered in the earlier tasks then press Enter.
3. Note the level of information provided. Not only the domain name address of each intermediate node presented, but the corresponding IP address as well.
4. Record your findings and take a screenshot for your report.
5. How useful is this tool?

### Task 4: whois

```whois``` performs the registration record for the domain name or IP address that you specify. Microsoft makes a WHOIS tool available as part of the Windows Sysinternals toolkit, a suite of tools for server and network administrators. You can find ```whois``` [here](https://docs.microsoft.com/en-us/sysinternals/downloads/whois). Linux and Mac users have ```whois``` included with their OS.

1. In Windows, go to the command prompt. Ensure you are in the directory where ```whois`` is extracted. 
2. Type ```whois``` and ```www.github.com``` then press Enter.
3. Note the level of information provided. Note the domain name servers and other information. Are the information protected?
4. Record your findings and take a screenshot for your report.
5. Now type ```whois``` and ```www.ycp.edu``` then press Enter.
6. How is the information different?
7. How useful is this tool?
8. Open your favorite browser and go to [https://whois.icann.org/en](https://whois.icann.org/en). Enter the domains you entered earlier. Did you get any additional information? 

### Questions
- What was the most interesting task you did?
- What was the least interesting task?
- How useful can these tasks be to an attacker?
- What did you learn from this lab?

### Grading

Post your report in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus. Your grade for this lab will be composed of:
- 70% - Answering the questions
- 30% - Presenting the results and screenshots 

