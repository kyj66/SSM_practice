CREATE TABLE product(
	id VARCHAR(6) PRIMARY KEY,
	productNum VARCHAR(50) NOT NULL,
	productName VARCHAR(50),
	cityName VARCHAR(50),
	departureTime TIMESTAMP,
	productPrice DECIMAL,
	productDesc VARCHAR(500),
	productStatus INT,
	CONSTRAINT product UNIQUE (id, productNum)
)

insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
values ('676C5BD1D35E429A8C2E114939C5685A', 'itcast-002', '北京三日游', '北京', '2020-03-10 14:23:40', 1200, '不错的旅行', 1);
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
values ('12B7ABF2A4C544568B0A7C69F36BF8B7', 'itcast-003', '上海五日游', '上海', now(), 1800, '魔都我来了', 0);
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
values ('9F71F01CB448476DAFB309AA6DF9497F', 'itcast-001', '北京三日游', '北京', now(), 1200, '不错的旅行', 1);
