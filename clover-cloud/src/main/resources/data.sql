create schema if not exists clover_cloud;
use clover_cloud;

INSERT INTO employee (employee_id, first_name, last_name, email) VALUES
  (1, 'Brandon', 'Shankar','bs@bs.com'),
  (2, 'Selena', 'Singleton','ss@ss.com');
  (3,'Gina', 'Yi','gy@gy.com');
  (4,'Dan', 'Mueller','dm@dm.com');
  (5,'Trevor', 'Peterson','tp@tp.com');

 INSERT INTO project (project_id, project_name, hours_planned, project_status) VALUES
  (6,"Banana", 120, "Active");
  (7, "Cherry", 80, "Pending");
  (8, "Grape", 150, "Complete");
  (9, "Fig", 100, "Complete");

INSERT INTO log (log_id, project_id, category_name, employee_id, timestamp, time_spent) VALUES

   (10, 50, "Development", 2, '2021-06-23 14:30:35', 3.25)
   (11, 52, "Planning", 4, '2021-06-22 15:15:15', 4)
   (12, 54, "Research & Analysis", 16, '2021-06-22 09:40:20', 2.75)
   (13, 55, "Planning", 4, '2021-06-24 10:10:55', 2.5)
   (14, 56, "Information Gathering", 64, '2021-06-24 16:25:30', 3)


