#### Spike on Database Tool.

* Description
	
	* The spike is about the selection of database tool. 


* Findings

	* Mysql community version is suitable to our requirement because of the below reseasons. 

		* Our timesheet template data is structured.

		* It doesn't need a heavy using right now, community version can do.

		* Mysql is open-source and cross platforms.

		* Mysql works well with JDBC/Hibernate.


	* [H2 database](http://www.h2database.com/html/main.html)

		* Pure Java

		* Fulltext search

		* Encryption of Data since Timesheet template data is sensitive.

		* embedded DB engine. faster and easier connection. 

	* [Comparision with Mysql on Performance](http://www.jpab.org/Hibernate/H2/server/Hibernate/MySQL/server.html)

	* JDBC with Mysql

		* download mysql-connector/J 

		* add mysql-connector-java-ver-bin.jar to project library.

		* use com.mysql.jdbc.Driver as parameter for Class.forName()

		* establish a connection with local url jdbc:mysql://127.0.0.1:3306/DATABASE (replace DATABASE)

	* JDBC with H2


	* Hibernate with Mysql







		

* notes

	* JPA: The Java Persistence API, sometimes referred to as JPA, is a Java programming language framework managing relational data in applications using Java Platform, Standard Edition and Java Platform, Enterprise Edition.



