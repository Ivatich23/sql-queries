package com.epam.rd.tasks.sqlqueries;


import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;

/**
 * Implement sql queries like described
 */

public class SqlQueries {

    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT id, lastname, salary FROM EMPLOYEE ORDER BY lastname";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT id, lastname, salary FROM EMPLOYEE WHERE lastname like '_____' OR lastname like '____' " +
            " OR lastname like '___' OR lastname like '__' OR lastname like '_' ORDER BY lastname";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT id, lastname, salary FROM EMPLOYEE WHERE salary BETWEEN 2000 AND 3000";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT id, lastname, salary  FROM EMPLOYEE WHERE salary <=2000 OR salary >=3000 ";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 = "SELECT e.lastname , salary, d.name name FROM EMPLOYEE e  JOIN department d" +
            " ON e.department=d.id ORDER BY d.name ";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "SELECT  lastname, salary,  d.name depname FROM EMPLOYEE e LEFT JOIN department d " +
            " ON e.department = d.id ";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT sum(salary) total FROM EMPLOYEE ";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 = "SELECT  d.name depname ,count(e.lastname) staff_size FROM employee e JOIN" +
            " department d ON e.department=d.id" +
            " GROUP BY d.name  ";

    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "SELECT d.name depname,sum(salary) total,avg(salary) average FROM DEPARTMENT d JOIN EMPLOYEE e " +
            "ON e.department = d.id GROUP BY depname ";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "SELECT e1.lastname employee, e2.lastname manager FROM EMPLOYEE e1 LEFT JOIN EMPLOYEE e2 " +
            "ON e1.manager=e2.id";


}
