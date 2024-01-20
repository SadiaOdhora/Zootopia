CREATE TABLE ANIMALS(
ANIMAL_ID INT identity(220104,1)PRIMARY KEY,
ANIMAL_NAME VARCHAR(50) NOT NULL,
SPECIES VARCHAR(50) NOT NULL,
GENDER VARCHAR(10) NOT NULL,
COUNTRY_OF_BIRTH VARCHAR(20) NOT NULL,
WEIGHT INT NOT NULL,
CELL_NO int  NULL FOREIGN KEY REFERENCES ENCLOSURE (CELL_NO),
)

SELECT *FROM ANIMALS
CREATE TABLE ENCLOSURE(
CELL_NO INT PRIMARY KEY,
EMPLOYEE_ID INT NULL,
TOTAL_ANIMAL INT NULL,
CELL_TYPE VARCHAR(20) NULL,
LOCATION VARCHAR(50)  NULL,
)
DROP TABLE ANIMALS


create  table emplo(
eid int identity(1,1) Primary Key,
username varchar(50),
password varchar(50),


)

create table AnimF(

foodid int primary key,
species varchar(50),
quantity int,
food_name varchar(50),
feed_time time


)
Drop Table Expense

create table employe_info(


  emp_id int primary key,
  name varchar(50),
  address varchar(50),
  email  varchar(50),
  salary int,
  gender varchar(50),
  age int,
  hire_date date,
  joining_date date,

)
create table Animal_Medicine
(
  Med_Order_Id int identity(1,1) primary key,
  Animal_Id int foreign key references Animals(Animal_Id),
  Medicine_Brand varchar(50),
  Species_Med varchar(50),
  Med_Quantity int,
  Received_Date date
)
select * from Animal_Medicine
insert into Animal_Medicine values(1,'s','m',2,'2022-08-15')



create table Import
(
  Import_Id int identity(1,1) primary key,
  Animal_Id int foreign key references Animals(Animal_Id),
  Animal_Name varchar(50),
  Entry_ varchar(50),
  Import_Cost money,
  Age_During_Import int
)
select * from Import
insert into Import values(1,'X','Y','12,000',4)

create table Expense
(
  Expense_Id int identity(1,1) primary key,
  Food_Type_Id int foreign key references AnimF(foodid),
  Food_Cost int ,
  Med_Order_Id int foreign key references Animal_Medicine(Med_Order_Id),
  Medicine_Cost int,
  Cleaning_Cost decimal,
  Total_Cost int Null
)
select * from Expense
insert into Expense values(1,1,2000)

create table Vet
(
  Vet_Id int identity(1,1) primary key,
  Emplyoee_Id int foreign key references employe_info(emp_id),
  Vet_Name varchar(50),
  Head_Vet varchar(50),
  Speciality varchar(50),
  Veternity_Experience varchar(50)
)
select * from Vet
insert into Vet values(1,'P','J','N','Noob')


create table Employee
(
  Emplyoee_Id int identity(1,1) primary key,
  Employee_Name varchar(50),
  Hire_Date date,
  Employee_Address varchar(50),
  phone_Number int,
  Gender varchar(50),
  Salary int,
  Age int
)
Select Expense_Id,
 (Select Sum(Total_Cost)
  From (Values (Food_Cost), (Medicine_Cost), (Cleaning_Cost)) As tblSum(Total_Cost))As Total_Cost
From Expense

