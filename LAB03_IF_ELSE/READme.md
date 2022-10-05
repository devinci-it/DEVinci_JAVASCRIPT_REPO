

<!--HTTPS://DAVINCI-IT.GITHUB.IO-->
<!--java-script-repository-->

---
# __IF - ELSE STATEMENT__
 ![image](https://img.shields.io/badge/Markdown-ffffff?style=for-the-badge&logo=markdown&logoColor=black)
![image](https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E)

---

<a href='https://github.com/davinci-it'> <img src="/assets/img/banner.png" alt=" banner" style="align=center"/>
</a>

---
### __CONNECT WITH ME:__
<p align='center'>
<a href='https://twitter.com/It_vince01'>
<img src="https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white" alt="twitter_link"/></a>
<a href='https://www.linkedin.com/in/vincent-de-torres-854612240/'>
<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="linkedin"/></a>
<a href='https://ko-fi.com/devinci'>
<img src="https://img.shields.io/badge/Ko--fi-F16061?style=for-the-badge&logo=ko-fi&logoColor=white" alt="kofi_link"/></a>
</p>

---

 #### __LAB DESCRIPTION__: 
---   
  - Calculate bill base on package type and hours used.  
  - Recommends better package type base on usage.

 
- __STEPS__ 

 		1. Take the package letter
 		2. Take the monthly usage

---
 #### __PSEUDOCODE__ 

```  
  	a. User input Package A
 		a.1 Check if the usage (in hours) is greater than 10 [min hour]
 			if so...
 				a.1.1 Compute the additional payment per hour (( number of hours - 10 )  $2.00 ))
 				a.1.2 Compute the total amount ($12.95 + excess usage payment [a.1.1])
 			else...
 				b.1.1 Display the base pay ( $ 12.95 ) 
 		
 		
 		a.2 Check if there is a better PACKAGE SUBSCRIPTION to recommend base on usage (solve how much the user 
 																						could be saving) 
 			a.2.1 if usage is >= 13 but < 17	- recommend Package B
 			a.2.2 if usage is >= 17				- recommend Package C
 
 
 	b. User input Package B
 		b.1 Check if the usage (in hours) is greater than 30 [ minimum hour]
 			if so...
 				b.1.1 Compute the additional payment per hour (( number of hours - 30 )  $1.00 ))
 				b.1.2 Compute the total amount ($17.95 + excess usage payment [b.1.1])
 			else...
 				b.1.1 Display the base pay ( $ 17.95 ) 
 		
 		
 		b.2 Check if there is a better PACKAGE SUBSCRIPTION to recommend base on usage (solve how much the user 
 																						could be saving) 
 			b.2.1 if usage is >= 1 but < 12 	- recommend Package A
 			b.2.2 if usage is >= 38 			- recommend Package C
 
  c. User input Package C
 		c.1 Check if the usage (in hours) is greater than 0 
 			if so...
 				c.1.1 Display base pay  ($25.95)
 			else...
 				c.1.2 Display error message 
 		
 		
 		c.2 Check if there is a better PACKAGE SUBSCRIPTION to recommend base on usage (solve how much the user 
 																						could be saving) 
 			b.2.1 if usage is >= 1 but <= 12 	- recommend Package A
 			b.2.2 if usage is >= 13 but <=37 	- recommend Package B
 
  d. User input neither of the three packages
 		d.1 Display error message
