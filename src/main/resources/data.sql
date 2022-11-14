-- insert query
insert into driver values('dr001','Ram','pune');
insert into driver values('dr002','Raj','mumbai');

insert into truck values('MH001','build001','dr001');
insert into truck values('MH002','build002','dr002');

insert into device values('de001','make2015','..','MH001');
insert into device values('de002','make2013','..','MH002');

-- insert into geo_location values('de001','50.4','30.6',CURRENT_TIMESTAMP);
-- insert into geo_location values('de002','60.4','50.6',CURRENT_TIMESTAMP);