---
layout: default
course_number: CS330
title: "Lab 1 - Network Footprinting"
---

# Lab 1 - Network Footprint  

This lab exercise will provide the students hands on experience working with basic tools to carryout network reconnaissance (called network footprinting). A short report will be prepared describing the results of exercise and what the student learned from the lab.

### Task 1: nslookup

```nslookup``` is a network administration command-line tool available for many computer operating systems for querying the Domain Name System to obtain domain name or IP address mapping or for any other specific DNS record.

1. In Windows, open a command prompt.
2. Type ```nslookup www.github.com``` and then press Enter.
3. What information is displayed? Take a screenshot for your report.
4. Now type in the IP address and see what is displayed. Record your findings.
5. Repeat steps 1-3 for the following URLs:<br>
    a. ```www.google.com```<br>
    b. ```www.yahoo.com```<br>
    c. ```www.facebook.com```<br>
6. How useful is this tool?

### Task 2: ping

```ping``` is a computer network administration software utility used to test the reachability of a host on an Internet Protocol network. 

1. In Windows, open a command prompt.
2. Type ```ping www.github.com``` and then press Enter.
3. Note the responses back. Make sure the IP address or URL is reachable by getting a
response. Note the response provides information on the number of packets generated
and received, along with the time expired between the transmission and reception of
each. It also provides basics statistics on the minimum, maximum, and average packet
times.
4. Record your findings and take a screenshot for your report.
5. Repeat steps 1-4 for the following URLs:<br>
    a. ```www.yahoo.com```<br>
    b. ```www.google.com```<br>
    c. ```www.facebook.com```<br>
6. How useful is this tool?

### Task 3: tracert

```traceroute``` is a computer network diagnostic tool for displaying the route and measuring transit delays of packets across an Internet Protocol network.

1. In Windows, go to the command prompt.
2. Type ```tracert``` and the IP address of a remote host used in the earlier task then press Enter.
3. Note the level of information provided. Not only the domain name address of each intermediate node presented, but the corresponding IP address as well.
4. Record your findings and take a screenshot for your report.
5. How useful is this tool?

### Task 4: whois

```whois``` performs the registration record for the domain name or IP address that you specify. Microsoft makes a WHOIS tool available as part of the Windows Sysinternals toolkit, a suite of tools for server and network administrators. You can find ```whois``` [here](https://docs.microsoft.com/en-us/sysinternals/downloads/whois). Linux and Mac users have ```whois``` included with their OS.

1. In Windows, go to the command prompt.
2. Type ```whois``` and ```www.github.com``` then press Enter.
3. Note the level of information provided. Note the domain name servers and other information.
4. Record your findings and take a screenshot for your report.
5. How useful is this tool?
6. Open your favorite browser and go to [https://whois.icann.org/en](https://whois.icann.org/en). Enter the domain you entered earlier. Did you get any additional information? 

### Questions
- What was the most interesting task you did?
- What was the least interesting task?
- How useful can these tasks be to an attacker?
- What did you learn from this lab?


### Grading

Post your report in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus. Your grade for this lab will be composed of:
- 70% - Answering the questions
- 30% - Presenting the results and screenshots 

