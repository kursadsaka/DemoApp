This a homework project to become familiar with the code repository with continuous integration and deployment. We have a function taking four parameters and doing computation on them.

# fall2019-hw1

**BIL 481 - HW 1: **

Code repository, continuous integration, and continuous deployment

** Goals:**

  ●	 Becoming familiar with all the components of a realistic working environment for a software engineer.

  ●	Gaining experience on working on the terminal

  ●	Gaining experience on making progress when exposed to many unfamiliar technologies

**Summary:**
Set up a code repository with continuous integration and deployment.

**Total Points:
4 / 100**

**Specification:**
Set up a git repository in your github account. Follow the set up command instructions carefully:
[Instructions for this hw](docs/Instructions.pdf)

The repository must satisfy the following criteria:
1.	It must contain an App.java file which has a simple static method implementation:
a.	The method should accept at least 4 parameters.
b.	At least two of these parameters must be
i.	Integer [ ] or
ii.	ArrayList<Integer>.
c.	The method should perform a meaningful computation on the set of strings and return a result.
2.	It must contain a AppTest.java file that implements unit tests for your algorithm implementation.
a.	The file must contain at least 5 meaningful unit tests covering your method
3.	It must contain a pom.xml file.
4.	It must have a continuous integration setup with https://travis-ci.org site.
5.	It must have an auto deployment setup with https://www.heroku.com/ site.
a.	The web application should have a UI similar to the shown during the class. For each parameter requested from the user, the UI should have a separate form.
b.	When the submit button is pressed, the inputs should be given to the algorithm and the result should be shown to the user on the web page.
c.	The web page should have a description of the algorithm, the input format and the output.
6.	It must have a README.md file describing what your project is about.  In addition,
a.	the file must contain a green marker from travis-ci showing the current build is passing;
b.	the file must contain a demo site address to the corresponding heroku application.

**IMPORTANT NOTICE:**
Make sure that your github repository shows a meaningful commit history distributed over time. In other words, we should NOT see that you committed all the files all at once because otherwise this clearly showed that you actually did not follow the instructions properly.

**Notes:**
1.	Add a screenshot of your travis page showing the latest build (see an example below) to your GitHub page
2.	Add a screenshot of the overview page of your heroku app (see an example below) GitHub page

Make sure the heroku app is running until the grading is done (unless you manually delete the app from heroku, it will stay running). If the demo site does not work, we will assume you have not completed the heroku setup.

**Example screenshots:**
1.	Example look of github repository
2.	Example Travis screenshot (It must have the repository address visible)
3.	Example heroku screenshot (It must have the github repository address visible)
4.	Example webapp screenshot


 
**Example look of github repository**

 ![alt text](https://github.com/TOBB-ETU-BIL481/fall2019-hw1/blob/master/example_screenshots/git.jpg)

 
**Example Travis screenshot (It must have the repository address visible, in this case: “cagdasgerede/myDemoApp”)**
 

![alt text](https://github.com/TOBB-ETU-BIL481/fall2019-hw1/blob/master/example_screenshots/travis.jpg)

 
**Example heroku screenshot (It must have the github repository address visible)**
 

![alt text](https://github.com/TOBB-ETU-BIL481/fall2019-hw1/blob/master/example_screenshots/heroku.jpg)
 


**Example webapp screenshot 
(In your case, you will have as many text areas as the number of parameters of your static method) **

![alt text](https://github.com/TOBB-ETU-BIL481/fall2019-hw1/blob/master/example_screenshots/webapp.jpg)
