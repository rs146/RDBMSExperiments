The SQL file for the creation of the BIND database schema is in the folder 'database' 
and is named: BINDschema.sql. It was constructed to be as similar as possible to the
OO data model for BIND DNS that was designed in the Project Report. The SQL file can
be run on a MySQL server instance as this was the Relational database vendor used in
the experiments.

Maven was used as the building tool for this NetBeans Project. The advantage of 
using Maven is that the examiner does not have to download jar files or libraries.
To download all the relevant libraries, Right-click the Project in NetBeans and
choose the option 'Build with Dependencies'. This will download all relevant 
libraries that were used in these experiments. The 'pom.xml' file is contained
within this very directory and this outlines all the libraries used in these 
experiments.

The hibernate mapping files are in the folder:
'/src/main/java/resources/hibernatemappings'. 

All experiments were conducted as JUnit tests within the 'Test Packages' package 
folder. These java classes are in the folder: '/src/test/java'. Within this 
directory there are two sub-folders: 
1. hibernateexperiments - contains all JUnit experiments that were conducted using
                          hibernate and MySQL.
2. jdbcexperiments - contains all JUnit experiments that were conducted using 
                     embedded SQL with JDBC and a MySQL database. 

Both of these experiments used the same MySQL instance as their datasource.

The Java classes for each experiment are outlined as follows:
Experiment1 - Insertion tests.
Experiment2 - Retrieval tests for objects.
Experiment3 - Retrieval tests using SQL for obtaining primitive data.
Experiment4 - Update tests.
Experiment5 - Deletion tests.
Experiment6 - Join query tests.


