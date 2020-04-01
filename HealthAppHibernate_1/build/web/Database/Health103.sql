DROP DATABASE IF EXISTS Health104;
CREATE DATABASE Health104;
USE Health104;


CREATE TABLE tblMembers (
  MemID VARCHAR(30) NOT NULL,
  FirstName VARCHAR(30),
  Weight double,
  Height INT,
  Age INT,
  MemDt DATE,
  Gender boolean default 0,
  tourCommplete boolean default 0,	
 
  Password VARCHAR(30),
  Steps INT,
  Counter INT,
  Counter2 INT,
  StartDate VARCHAR(30),
  TORF1 boolean default 1, 
  TORF2 boolean default 0, 
  TORF3 boolean default 0, 
  TORF4 boolean default 0, 
  TORF5 boolean default 0, 
  TORF6 boolean default 0, 
  TORF7 boolean default 0, 
  TORF8 boolean default 0, 
  TORF9 boolean default 0, 
  TORF10 boolean default 0, 
  TORF11 boolean default 0, 
  TORF12 boolean default 0, 
  TORF13 boolean default 0, 
  TORF14 boolean default 0, 
  TORF15 boolean default 0, 
  TORF16 boolean default 0, 
  TORF17 boolean default 0, 
  TORF18  boolean default 0, 
  TORF19 boolean default 0, 
  TORF20 boolean default 0, 
  TORF21 boolean default 0, 
  TORF22 boolean default 0, 
  TORF23 boolean default 0, 
  TORF24 boolean default 0, 
  TORF25 boolean default 0, 
  TORF26 boolean default 0, 
  TORF27 boolean default 0, 
  TORF28 boolean default 0, 

  
  TORF1a boolean default 1, 
  TORF2a boolean default 0, 
  TORF3a boolean default 0, 
  TORF4a boolean default 0, 
  TORF5a boolean default 0, 
  TORF6a boolean default 0, 
  TORF7a boolean default 0, 
  TORF8a boolean default 0, 
  TORF9a boolean default 0, 
  TORF10a boolean default 0, 
  TORF11a boolean default 0, 
  TORF12a boolean default 0, 
  TORF13a boolean default 0, 
  TORF14a boolean default 0, 
  TORF15a boolean default 0, 
  TORF16a boolean default 0, 
  TORF17a boolean default 0, 
  TORF18a  boolean default 0, 
  TORF19a boolean default 0, 
  TORF20a boolean default 0, 
  TORF21a boolean default 0, 
  TORF22a boolean default 0, 
  TORF23a boolean default 0, 
  Calories double default 0.0,
  totalCalories double default 0.0,
  PRIMARY KEY(MemID)
  

  
  
  
);



CREATE TABLE tblroutewithsteps (
  
  
  LocID int not null DEFAULT 0,
  LOCATION varchar(60) not null default '',
  ADDRESS varchar(60) not null default '',
  MILES double not null default 0.0,
  STEPS_TO_GET_TO_LOCATION int not null default 0,
  TOTAL_STEPS int not null default 0,
  UNLOCKED_LOCATION  varchar(5),
  
  
  
  PRIMARY KEY(LocID) 
);



INSERT INTO tblroutewithsteps VALUES (1, 'STLCC - Meramec campus','11333 Big Bend Rd, St. Louis, MO 63122
',0,0,0,'true');
INSERT INTO tblroutewithsteps VALUES (2, 'Museum of Transportation
','2933 Barrett Station Rd, St. Louis, MO 63122
',2.7,5702,5702,'false');

INSERT INTO tblroutewithsteps VALUES (3, "STLCC - Wildwood campus
",' 2645 Generations Dr, Grover, MO 63040
',12,25344,31046,'false');


INSERT INTO tblroutewithsteps VALUES (7, 'STLCC -Corporate College
',' 3221 McKelvey Rd, Bridgeton, MO 63044
',20,42240,73206,'false');

INSERT INTO tblroutewithsteps VALUES (8, 'St.Louis Lambert International Airport
','2645 Generations Dr, Grover, MO 63040
',4.4,9293,82579,'false');


INSERT INTO tblroutewithsteps VALUES (9, "Musick Park
",' 8617 Latty Ave, Hazelwood, MO 63042
',4.6,9715,92294,'false');

INSERT INTO tblroutewithsteps VALUES (10, "'Imo's Pizza
'",' 1939 Washington St, Florissant, MO 63033
',2.1,4435,96730,'false');

INSERT INTO tblroutewithsteps VALUES (11, 'STLCC - Florissant Valley'
,'3400 Pershall Rd, St. Louis, MO 63135',1.5,3168,99898,'false');

INSERT INTO tblroutewithsteps VALUES (12, 'Koeneman Park',
'8937 Lucas and Hunt, Jennings, MO 63136',4.9,10349,110246,'false');

INSERT INTO tblroutewithsteps VALUES (13, "'O'Fallon Park'",
'10701 Lambert International Blvd, St. Louis, MO 63145',
5, 10560,120806,'false');

INSERT INTO tblroutewithsteps VALUES (14, 'Griot Museum of Black History
',' 2505 St Louis Ave, St. Louis, MO 63106',
2.5, 5280,126086,'false');

INSERT INTO tblroutewithsteps VALUES (15, 'STLCC - Harrison Park',
' 3140 Cass Ave, St. Louis, MO 63106',1.1, 
'2323',128410,'false');

INSERT INTO tblroutewithsteps VALUES (16, 
'Contemporary Art',
' 3750 Washington Blvd, St. Louis, MO 63108',1.0,2112,130522,'false');

INSERT INTO tblroutewithsteps VALUES (17, "'Pappy's Smokehouse'",
'3106 Olive St, St. Louis, MO 63103',0.8,1690,132211,'false');

INSERT INTO tblroutewithsteps VALUES (18, 'Ikea',
'1 Ikea Way, St. Louis, MO 63110',1.4,2957,135168,'false');

INSERT INTO tblroutewithsteps VALUES (19, 'STLCC - Forest Park campus',
'5600 Oakland Ave, St. Louis, MO 63110',2.3,4858,140026,'false');

INSERT INTO tblroutewithsteps VALUES (20, 'St.Louis Zoo',
'Government Dr, St. Louis, MO 63110',1.6, 3379,143405,'false');

INSERT INTO tblroutewithsteps VALUES (21, "'Eat at Gus' Pretzels'",
'1820 Arsenal St, St. Louis, MO 63118',6.3,13306,156710,'false');

INSERT INTO tblroutewithsteps VALUES (22, "Ted Drewes",
'6726 Chippewa St, St. Louis, MO 63109',5.2,10982,167693,'false');

INSERT INTO tblroutewithsteps VALUES (23, 
'South County Center',
'18 S County Center Way, St. Louis, MO 63129',
7.2, 15206,182899,'false');

INSERT INTO tblroutewithsteps VALUES (24, 
'Pink Galleon Billiards and games',
'4010 Butler Hill Rd, St. Louis, MO 63129',
2.1, 4435,187334,'false');

INSERT INTO tblroutewithsteps VALUES (25, ' Concord Bowl and Recreation',
'11801 Tesson Ferry Rd, St. Louis, MO 63128',
3.2, 6758,194093,'false');

INSERT INTO tblroutewithsteps VALUES (26, 'Concord Plaza STL',
'91 Concord Plaza Shopping Center, St. Louis, MO 63128.
',0.3, 634,194726,'false');


INSERT INTO tblroutewithsteps VALUES (27, 'Laumeir Park',
'12580 Rott Rd, St. Louis, MO 63127'
,4.2, 8870,203579,'false');

INSERT INTO tblroutewithsteps VALUES (28, 'STLCC - Meramac',
'11333 Big Bend Rd, St. Louis, MO 63122',
1.1, 2323,205920,'false');




create table pictures(
image_id Bigint(100) NOT NULL auto_increment,

pictureName varchar(30),
image longblob,



PRIMARY KEY (image_id)
);
